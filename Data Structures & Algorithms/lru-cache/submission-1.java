class LRUCache {
    Map<Integer,Integer> res = new HashMap<>();
    public LRUCache(int capacity) {
        
    }
    
    public int get(int key) {
        if(res.containsKey(key)){
            return res.get(key);}
        else{
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(res.size()<2){
            res.put(key,value);
        }
        else{
            for(int k: res.keySet()){
                res.remove(k);
                res.put(key,value);
                break;
            }
        }
    }
}
