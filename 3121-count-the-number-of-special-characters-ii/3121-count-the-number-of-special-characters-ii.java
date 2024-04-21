class Solution {
    public int numberOfSpecialChars(String word) {
        
        int count = 0;

        for(int i = 0 ; i < 26 ; i++)
        {
            char sm = (char) ('a' + i);
            char cap = (char) ('A' + i);

            if(word.contains(sm + "") && word.contains(cap + ""))
            {
                if(!(word.substring(word.indexOf(cap)).contains(sm + "")))
                    count++;
            }
        }

        return count;
    }
}