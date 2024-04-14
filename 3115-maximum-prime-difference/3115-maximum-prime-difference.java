class Solution {
    public int maximumPrimeDifference(int[] nums) {
        
        int left = 0;
        int right = nums.length - 1;

        while(left <= right)
        {
            boolean b1 = isPrime(nums[left]);
            boolean b2 = isPrime(nums[right]);
            
            if(b1 == true && b2 == true)
                return right - left;
            else if(b1)
                right--;
            else
                left++;
        }

        return 0;
    }

    public boolean isPrime(int num)
    {
        if(num == 1)
            return false;
        
        for(int i = 2 ; i <= Math.sqrt(num) ; i++)
        {
            if(num % i == 0)    
                return false;
        }

        return true;
    }
}