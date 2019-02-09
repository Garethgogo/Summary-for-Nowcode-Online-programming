import java.util.Stack;
public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0;i<tokens.length;i++){
            try{
                int num = Integer.parseInt(tokens[i]);
                stack.add(num);
            }catch(Exception e){
                int a = stack.pop();
                int b = stack.pop();
                stack.add(get(a,b,tokens[i]));
            }
            
        }
        return stack.pop();
    }
    private int get(int a,int b,String operator){
        switch (operator){
            case "+":
                return a+b;
            case "-":
                return b-a;
            case "*":
                return a*b;
            case "/":
                return b/a;
            default:
                return 0;
        }
    }
}
