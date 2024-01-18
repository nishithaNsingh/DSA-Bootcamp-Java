import java.util.Stack;

public class PostfixEvaluation {

    static boolean isOperator(char ch) {
        if (ch == '+' || ch == '-' || ch == '*' || ch == '/')
            return true;

        return false;
    }

    static void evaluatePostfix(String exp) {
        Stack postFix = new Stack(); // Create a non-generic Stack
        int n = exp.length();

        for (int i = 0; i < n; i++) {
            if (isOperator(exp.charAt(i))) {
                // Pop top 2 operands.
                int op1 = (int) postFix.pop();
                int op2 = (int) postFix.pop();

                // Evaluate in reverse order i.e. op2 operator op1.
                switch (exp.charAt(i)) {
                    case '+':
                        postFix.push(op2 + op1);
                        break;

                    case '-':
                        postFix.push(op2 - op1);
                        break;

                    case '*':
                        postFix.push(op2 * op1);
                        break;

                    case '/':
                        postFix.push(op2 / op1);
                        break;
                }

            } else {
                // Current Char is Operand, simply push into stack
                // Convert to integer
                int operand = exp.charAt(i) - '0';
                postFix.push(operand);
            }
        }

        // Stack at End will contain result.
        System.out.println(postFix.pop());
    }

    public static void main(String args[]) {
        String exp = "82*3+7/1-";
        System.out.print("The PostFix Evaluation for the Given Expression " + exp + " is: ");
        evaluatePostfix(exp);
    }
}
