public class StackApp {

    public static void main(String[] args) {
        MyStack<Integer> stack =new MyStack<>();

        for (int i = 1; i <=20; i++) {

            stack.push(i);
        }

        System.out.println(stack.peek());

        for (int i = 1; i <= stack.size; i++) {
            System.out.println(stack.pop());
        }


    }
}