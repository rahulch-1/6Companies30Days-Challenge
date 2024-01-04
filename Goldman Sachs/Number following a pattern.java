class Solution{
    static String printMinNumberForPattern(String str){
        int n = str.length();
        if(str.charAt(0)=='D'&& n==1){
            return "21";
        }
        if(str.charAt(0)=='I'&&n==1){
            return "12";
        }
        Stack<Integer> s = new Stack<>();
     
        StringBuilder sb = new StringBuilder("");
        int curr =1;
       
        
        for(int i =0; i<n; i++){
            s.push(curr++);
            if(str.charAt(i)=='I'){
                while(!s.isEmpty()){
                    sb.append(s.pop());
                }
            }
        }
        s.push(curr++);
        while(!s.isEmpty()){
            sb.append(s.pop());
        }
        
        return sb.toString();
    }
}