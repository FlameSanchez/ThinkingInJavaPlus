package holding.c11.c11_15;

import net.mindview.util.Stack;

public class E15_Evaluator {

    private final static Stack<Character> stack =
            new Stack<Character>();
    private static void evaluate(String expr) {
        char data[] = expr.toCharArray();
        for(int i = 0; i < data.length;)
            switch(data[i++]) {
                case '+' : stack.push(data[i++]);
                    break;
                case '-' : System.out.print(stack.pop());
            }
    }
    public static void main(String[] args) {
        evaluate(
                "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---");
    }
}
