class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> freq1 = new HashMap<>();
        HashMap<Character, Integer> freq2 = new HashMap<>();
        int c1=0;
        int c2=0;
        for(int i = 0; i< s.length(); i++){
            if(freq1.containsKey(s.charAt(i))){
                freq1.put(s.charAt(i), freq1.get(s.charAt(i))+1);
            }
            else{
                c1+=1;
                freq1.put(s.charAt(i),1);
            }
        }
        for(int i = 0; i< t.length(); i++){
            if(freq2.containsKey(t.charAt(i))){
                freq2.put(t.charAt(i), freq2.get(t.charAt(i))+1);
            }
            else{
                c2+=1;
                freq2.put(t.charAt(i),1);
            }
        }
        if(c2>c1){
            for(Character key: freq2.keySet()){
                System.out.println(freq1);
                System.out.println(freq2);
                if(freq1.get(key)!=freq2.get(key)){
                    return false;
                }
            }
        }
        else{
            for(Character key: freq1.keySet()){
                System.out.println(freq1);
                System.out.println(freq2);
                if(freq1.get(key)!=freq2.get(key)){
                    System.out.println(key);
                    System.out.println(freq2.get(key));
                    System.out.println(freq1.get(key));
                    return false;
                }
            }
        }
    
        return true;
    }
}
