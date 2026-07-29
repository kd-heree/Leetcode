class Solution {
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<>();
        String[] arr = path.split("/");
        for(String str : arr){
            
            if(str.equals(".") || str.equals(""))
                continue;

            if(str.equals("..")){
                if(!s.isEmpty()){
                    s.pop();
                }
            }else{
                    s.push(str);
            }
        }
        StringBuilder sb = new StringBuilder();
            for(String dir : s){
                sb.append("/").append(dir);
            }
        return sb.length() == 0 ? "/" : sb.toString();
    }
}