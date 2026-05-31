class MinStack {
    int i=-1;
    int[] l = new int[1000];

    public MinStack() {
        
    }
    
    public void push(int val) {
        i++;
        l[i]=val;
        
        
    }
    
    public void pop() {
        
        i--;
    }
    
    public int top() {
        return l[i];
    }
    
    public int getMin() {
        int m=0;
        for(int j=0; j<= i; j++){
            if(j==0){
                m=l[j];
            }
            else if(m>l[j]){
                m=l[j];
            }
        }
        return m;
    }
}
