class Solution {
    public int minBitFlips(int start, int goal) {
        
        String startBinary = Integer.toBinaryString(start);
        String goalBinary = Integer.toBinaryString(goal);
        
        startBinary = "0".repeat(32 - startBinary.length()).concat(startBinary);
        goalBinary =  "0".repeat(32 - goalBinary.length()).concat(goalBinary);

        int count = 0;
        
        for(int i = 0 ; i < 32 ; i++)
        {
            if(startBinary.charAt(i) != goalBinary.charAt(i))
                count++;
        }

        return count;
    }
}