// Last updated: 12/19/2025, 2:55:20 PM
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public boolean hasCycle(ListNode head) {
14        Set<ListNode> nodes = new HashSet<>();
15        ListNode currentNode = head;
16        while(currentNode != null){
17            if(nodes.contains(currentNode)){
18                return true;
19            }
20            nodes.add(currentNode);
21           currentNode = currentNode.next;
22        }
23        return false;
24    }
25}