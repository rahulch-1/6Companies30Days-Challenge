class GfG
 {
	String encode(String str)
	{
          //Your code here
        int length=str.length();
        String ans="";
        for(int i=0;i<length;i++) {
            int count = 1;
            while(i<length-1 && str.charAt(i)==str.charAt(i + 1)) {
                count++;
                i++;
            }
 
            ans=ans+(str.charAt(i) + "" + count);
	}
	return ans;
 }
 }