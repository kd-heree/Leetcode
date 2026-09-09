class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int sum = 0;
        for(int i = 0; i < piles.length; i++){
            sum = Math.max(piles[i], sum);
        }
        int max = sum;
        int ans = -1;
        while( min <= max){
            int mid = min + (max - min)/2;
            if(isPossible(piles, h, mid)){
                ans = mid;
                max = mid -1;
            }else{
                min = mid + 1;
            }
        }
        return ans;
    }

    boolean isPossible(int[] piles, int h, int maxAllowed){
        long hours = 0;
        for(int i = 0; i < piles.length; i++){
 
            hours += (piles[i] + maxAllowed - 1) / maxAllowed;
              
        }
        return hours <= h ? true : false;

    }
}