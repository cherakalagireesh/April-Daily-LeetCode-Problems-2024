class Solution {
    public boolean canMakeSquare(char[][] grid) {
        
        for(int i = 0 ; i < grid.length - 1; i++)
        {
            int wCount = 0;
            int bCount = 0;

            for(int j = 0 ; j < grid.length - 1; j++)
            {
                 for (int k = i; k <= i + 1; k++) {
                    for (int l = j; l <= j + 1; l++) {
                        if (grid[k][l] == 'W')
                            wCount++;
                        else
                            bCount++;
                    }
                }
                
                if(wCount != bCount)
                    return true;
            }


        }


        return false;
    }
}