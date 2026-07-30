class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> s = new Stack<>();
        for(int i = 2* n -1; i >= 0; i--){
            int idx = i % n;
            while(!s.empty() && s.peek() <= arr[idx]){
                s.pop();
            }
            if(i < n){
                if(s.empty()){
                    ans[idx] = -1;
                }else{
                    ans[idx] = s.peek();
                }
            }
            s.push(arr[idx]);
        }
        return ans;
    }
}