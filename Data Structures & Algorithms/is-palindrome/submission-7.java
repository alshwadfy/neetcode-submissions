

class Solution {
    public boolean isPalindrome(String s) {
        String noSpaces = "";
        boolean flag = true;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '||
            s.charAt(i) =='?'||
            s.charAt(i) ==','||
            s.charAt(i) =='\''||
            s.charAt(i)=='.'
            ||s.charAt(i)==':'
            ||s.charAt(i)=='!'){
                continue;
            }
            else
                noSpaces += s.charAt(i);        }
        int b =noSpaces.length() -1;
        int a =0;
       noSpaces= noSpaces.toLowerCase();
        while(a<b){
            if(noSpaces.charAt(a)==noSpaces.charAt(b)){
                flag =true;
                a++;
                b--;
            }
            else if(noSpaces.charAt(a)!=noSpaces.charAt(b)){
                flag =false;
                break;
            }


        }
        return flag;
    }
}
