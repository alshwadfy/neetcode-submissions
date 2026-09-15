

class Solution {

    public String encode(List<String> strs) {

        String str ="";

        for(String word : strs){
            int length = word.length();
             str =str+ new String(length+"#"+word);
        }
        return str;
    }

    public List<String> decode(String str) {
        int i  =0;
        int hashes = 0;
        List<String> res = new ArrayList<>();
        while (i<str.length()){
            int j = str.indexOf('#', i);
            int len = Integer.parseInt(str.substring(i,j));
            String word = str.substring(j+1,j+1+len);
            res.add(word);
            i= 1+j+len;

        }
        return res;

    }
}
