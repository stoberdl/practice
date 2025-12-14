// Last updated: 12/14/2025, 5:56:10 PM
class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
            // for(int i =0; i <= (haystack.length() - needle.length()) ; i++){
            //     String haySub = haystack.substring(i, (i + needle.length()));
            //      if(needle.equals(haySub)){
            //         return i;
            //      }
            // }
            // return -1;
    }
}


/*
                //v2
                //start incrementing until length of needle
                //sliding window? move left bound and check every index the length of that substring 
                //substring(i, nIndex)? 
                // no, simpler
                Character hChar =  haystack.charAt(i);
                Character nChar =  needle.charAt(nIndex);

                if(hChar != nChar){
                     firstIndex = impossibleNum;
                     nIndex = 0;
                     continue;
                }
                 if(nIndex == 0){
                    firstIndex = i;
                 }
                //set firstg index?
                //ordering?
                    nIndex++;
                if(nIndex >= needle.length()){
                    return firstIndex;
                }
                //v1
                //get character from string haystack and needle 
                //if char's match continue iterating through needle . needleCounter++
                //if chars dont match, reset needleCounter
                //if needleend of length then return first index, save first index when starting search every time
                //if loop finishes no full catch, return -1
                */