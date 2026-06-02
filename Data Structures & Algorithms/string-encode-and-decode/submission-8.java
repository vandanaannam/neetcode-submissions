class Solution {

    public String encode(List<String> strs) {
        String res = "";
        for(String s: strs){
            if(!res.isEmpty()){
                res = res + "##" + s.length() + s;
            }
            else{
                res = s.length() + s;
            }
        }
        return res;
    }

    public List<String> decode(String str) {
        if (str == null || str.isEmpty()) {
            return new ArrayList<>();
}
        String[] res = str.split("##");
        List<String> r = new ArrayList<>();
        for(String s : res){
            if(s.charAt(0)!=0){
                int i = 0;

                while (i < s.length() &&
                s.charAt(i) >= '0' &&
                s.charAt(i) <= '9') {
                    i++;
                }

                r.add(s.substring(i));
            }
            else{
                r.add("");
            }
        }
        
        return r;
    }
}
