class PrefixTree {
    List<String> val = new ArrayList<>();
    public PrefixTree() {
         
    }

    public void insert(String word) {
        val.add(word);
    }

    public boolean search(String word) {
        for(String s: val){
            if(s.equals(word)){
                return true;
            }
        }
        return false;
    }

    public boolean startsWith(String prefix) {
        for(String s: val){
            int l = prefix.length();

            if((s.length() >= l) && (s.substring(0,l).equals(prefix))){
                return true;
            }
        }
        return false;
    }
}
