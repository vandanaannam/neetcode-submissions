class Solution {

    public String encode(List<String> strs) {
        String res = null;
        for(String s: strs){
            if(res!=null){
                res= res + '|' + s;
            }
            else{
                res = s;
            }
        }
        return res;
    }

    public List<String> decode(String str) {
        String[] res = str.split("\\|");
        return Arrays.asList(res);
    }
}
