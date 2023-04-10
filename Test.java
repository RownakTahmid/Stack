package teststack;

public class Test {
    public static void main(String[] args) {
    Stack<String> a = new Stack<>(5);
    a.push("rownak");
    a.push("abir");
    a.push("riad");
    a.printStack();
    System.out.println(a.peak());
    System.out.println(a.pop());
    a.printStack();
    a.pop();
    a.printStack();
    a.pop();
    a.printStack();
    a.pop();

    }
}
