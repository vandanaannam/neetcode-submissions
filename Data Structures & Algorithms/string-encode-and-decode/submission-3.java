class Solution {

    public String encode(List<String> strs) {
        String res = null;
        for(String s: strs){
            if(res!=null){
                res = res + "##" + s.length() + s;
            }
            else{
                res = s.length() + s;
            }
        }
        return res;
    }

    public List<String> decode(String str) {
        String[] res = str.split("##");
        List<String> r = new ArrayList<>();
        for(String s : res){
            if(s.charAt(0)!=0){
                r.add(s.substring(1));
            }
            else{
                r.add("");
            }
        }
        return r;
    }
}
