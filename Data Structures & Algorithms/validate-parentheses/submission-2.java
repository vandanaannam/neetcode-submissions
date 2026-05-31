class Solution {
    public boolean isValid(String s) {
        Character[] stack = new Character[s.length()];
        Map<Character, Character> map = new HashMap<>();

        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        map.put(']', '0');
        map.put('}', '0');
        map.put(')', '0');
        int j=-1;
        for(int i=0; i<s.length(); i++){
            if(j >= 0 && map.get(stack[j]).equals(s.charAt(i)) ){
                j--;
            
            }
            else{
                j++;
                stack[j] = s.charAt(i);
            }
        }
        if(j==-1){
            return true;
        }
        else{
            return false;
        }
    }
}