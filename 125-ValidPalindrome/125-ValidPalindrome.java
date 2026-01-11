// Last updated: 1/11/2026, 11:11:22 AM
1class Solution {
2    public boolean isPalindrome(String s) {
3        if (s.isEmpty()) {
4            return true;
5        }
6
7        //no , . 
8        //for more effiency analyze left and right side with two pointers since they should be equal
9        //just clean or skip if not alphanumeric
10        int left = 0;
11        int right = s.length() - 1;
12
13        while (left < right) {
14            char lChar = s.charAt(left);
15            char rChar = s.charAt(right);
16            if (!Character.isLetterOrDigit(lChar)) {
17                left++;
18                continue;
19            }
20            if (!Character.isLetterOrDigit(rChar)) {
21                right--;
22                continue;
23            }
24            if (Character.toLowerCase(lChar) != Character.toLowerCase(rChar)) {
25                return false;
26            }
27            left++;
28            right--;
29        }
30        return true;
31    }
32}