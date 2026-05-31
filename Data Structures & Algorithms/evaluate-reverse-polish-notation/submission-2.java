class Solution {
    public int evalRPN(String[] tokens) {
        int sum=Integer.parseInt(tokens[0]);
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<tokens.length ; i++){
            if(!tokens[i].matches("[+\\-*/]")){
                stack.push(Integer.parseInt(tokens[i]));
            }else{
                int a = stack.pop();
                int b = stack.pop();
                String op = tokens[i];
                switch(op){
                    case "+": {
                        sum = a+b;
                        stack.push(sum);
                        break;
                    }
                    case "-": {
                        sum = b-a;
                        stack.push(sum);
                        break;
                    }
                    case "*": {
                        sum = a*b;
                        stack.push(sum);
                        break;
                    }
                    case "/": {
                        sum = b/a;
                        stack.push(sum);
                        break;
                    }
                    default: continue;
                }
            }
            
        }
        return sum;
    }
}
