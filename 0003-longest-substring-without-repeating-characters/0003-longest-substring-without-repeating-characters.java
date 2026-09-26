class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[128];
        Arrays.fill(last , -1);

        int left = 0;
        int length = 0;

        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);

            if(last[ch] >= left){
                left = last[ch] + 1;
            }
            last[ch] = right;

            length = Math.max(length, right -left +1);
        }
        return length;
    }
}