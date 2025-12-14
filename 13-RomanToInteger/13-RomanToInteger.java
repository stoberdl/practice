// Last updated: 12/14/2025, 5:56:17 PM
class Solution {
    public int romanToInt(String s) {
        Integer convertedInt = 0;
        Map<Character, Integer> romanToInt = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000);

        for(int i = 0; i < s.length(); i++){
            Integer numeral = romanToInt.get(s.charAt(i));

            if(i + 1 == s.length()){
                convertedInt += numeral;
                break;
            }
            
            Integer nextNumeral = romanToInt.get(s.charAt(i+1));

            if(numeral < nextNumeral){
                convertedInt -= numeral;
            }else{
                 convertedInt += numeral;
            }

        }
        return convertedInt;

}
}