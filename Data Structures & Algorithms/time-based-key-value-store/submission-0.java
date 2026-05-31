class TimeMap {
    Map<Integer, List<String>> s = new HashMap<>();

    public TimeMap() {
        
    }
    
    public void set(String key, String value, int timestamp) {
        s.put(timestamp, Arrays.asList(key,value));
    }
    
    public String get(String key, int timestamp) {
        while(timestamp>0){
            
            if(s.get(timestamp)!=null){
                return s.get(timestamp).get(1);
            }
            else{
                timestamp--;
            }
        }
        return "";
    }
}
