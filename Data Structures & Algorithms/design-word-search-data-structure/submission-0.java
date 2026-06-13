class WordDictionary {
    List<String> val = new ArrayList<>();

    public WordDictionary() {

    }

    public void addWord(String word) {
        val.add(word);
    }

    public boolean search(String word) {
        for(String s:val){
            if(s.matches(word)){
                return true;
            }
        }
        return false;
    }
}
