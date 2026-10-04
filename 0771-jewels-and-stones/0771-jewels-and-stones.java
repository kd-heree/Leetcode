class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        boolean[] isJewel = new boolean[128];
        for (char ch : jewels.toCharArray()) {
            isJewel[ch] = true;
        }

        int ans = 0;
        for (char ch : stones.toCharArray()) {
            if (isJewel[ch]) {
                ans++;
            }
        }

        return ans;
    }
}