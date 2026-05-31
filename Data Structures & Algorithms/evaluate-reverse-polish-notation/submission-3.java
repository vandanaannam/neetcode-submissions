class Solution {
    public int evalRPN(String[] tokens) {
        int sum=Integer.parseInt(tokens[0]);
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<tokens.length ; i++){
            if(tokens[i].equals("+")){
                int a = stack.pop();
                int b = stack.pop();
                sum = a+b;
                stack.push(sum);
            }
            else if(tokens[i].equals("-")){
                int a = stack.pop();
                int b = stack.pop();
                sum = b-a;
                stack.push(sum);
            }
            else if(tokens[i].equals("*")){
                int a = stack.pop();
                int b = stack.pop();
                sum = a*b;
                stack.push(sum);
            }
            else if(tokens[i].equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                sum = b/a;
                stack.push(sum);
            }
            else{
                stack.push(Integer.parseInt(tokens[i]));
            }

            
        }
        return sum;
    }
}
