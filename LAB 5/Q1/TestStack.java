public class TestStack {
    public static void main(String[] args) {
        // Integer stack
        MyStack<Integer> intStack = new MyStack<>();
        intStack.push(1);
        intStack.push(2);   
        intStack.push(3);

        // Character stack
        MyStack<Character> stack = new MyStack<>();
        stack.push('A');
        stack.push('B');
        stack.push('C');
        
        System.out.println(stack); // Stack: [A, B, C]

        System.out.println("Popped: " + stack.pop()); // C
        System.out.println(stack); // Stack: [A, B]

        System.out.println("Peek: " + stack.peek()); // B
        System.out.println(stack); // Stack: [A, B]

        System.out.println("Is Empty? " + stack.isEmpty()); // false
        System.out.println("Size: " + stack.getSize()); // 2

        stack.push('D');
        System.out.println(stack); // Stack: [A, B, D]

        System.out.println("Contains 'B'? " + stack.search('B')); // true
        System.out.println("Contains 'K'? " + stack.search('K')); // false

        System.out.print("Stack elements: ");
        for (int i = 0; i < intStack.getSize(); i++) {
            System.out.print(intStack.List.get(i) + " ");
        }
        System.out.println();

        boolean containsSix = intStack.List.contains(6);
        System.out.println("Does the stack contain 6? " + containsSix);
    }
}
