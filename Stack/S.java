package Stack;
import java.util.Stack;

class StackProblems {

    public static int[] prevSmaller(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>(  );
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty()&&stack.peek()>=arr[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {6,8,0,1,3};
        for (int x : prevSmaller(arr)) {
            System.out.print(x + " ");
        }
    }
}