package Assignment;

import java.util.Stack;

public class ArraySortUsingStacks {
	public static Stack<Integer> sortStack(Stack<Integer> inputStack) {
        Stack<Integer> tmpStack = new Stack<>();

        while (!inputStack.isEmpty()) {
            int tmp = inputStack.pop();

            while (!tmpStack.isEmpty() && tmpStack.peek() > tmp) {
                inputStack.push(tmpStack.pop());
            }

            tmpStack.push(tmp);
        }

        return tmpStack;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        Stack<Integer> inputStack = new Stack<>();

        for (int num : arr) {
            inputStack.push(num);
        }

        Stack<Integer> sortedStack = sortStack(inputStack);

        // Print the sorted elements from the sorted stack
        System.out.print("Sorted Array: ");
        while (!sortedStack.isEmpty()) {
            System.out.print(sortedStack.pop() + " ");
        }
    }
}

