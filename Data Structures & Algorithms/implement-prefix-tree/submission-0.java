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
            if(s.substring(0,prefix.length()).equals(prefix)){
                return true;
            }
        }
        return false;
    }
}
