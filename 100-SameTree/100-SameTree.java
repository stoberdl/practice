// Last updated: 1/3/2026, 1:39:55 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public boolean isSameTree(TreeNode p, TreeNode q) {
18        if (p == null && q == null) {
19            return true;
20        }
21        if (p == null || q == null) {
22            return false;
23        }
24        Queue<TreeNode> pQueue = new LinkedList<>();
25        pQueue.offer(p);
26        Queue<TreeNode> qQueue = new LinkedList<>();
27        qQueue.offer(q);
28
29        while (!pQueue.isEmpty() || !qQueue.isEmpty()) {
30            TreeNode pNode = pQueue.poll();
31            TreeNode qNode = qQueue.poll();
32            if(pNode == null && qNode == null) continue;
33            if(pNode == null || qNode == null) return false;
34            if(pNode.val != qNode.val){//npe? on one side empty
35                return false;
36            }
37
38         //   if (pNode.left != null)
39                pQueue.offer(pNode.left);
40          //  if (pNode.right != null)
41                pQueue.offer(pNode.right);
42          //  if (qNode.left != null)
43                qQueue.offer(qNode.left);
44         //   if (qNode.right != null)
45                qQueue.offer(qNode.right);
46        }
47        return true;
48    }
49}