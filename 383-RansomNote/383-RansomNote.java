// Last updated: 12/14/2025, 5:55:51 PM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magToCharCountMap = new HashMap<>();
        for (Character ch : magazine.toCharArray()) {
            magToCharCountMap.put(ch, magToCharCountMap.getOrDefault(ch, 0) + 1);
        }
        for (Character c : ransomNote.toCharArray()) {
            int charCount = magToCharCountMap.getOrDefault(c, 0);
            if (charCount <= 0) {
                return false;
            }
             magToCharCountMap.put(c, charCount - 1);
        }
        return true;
    }
}