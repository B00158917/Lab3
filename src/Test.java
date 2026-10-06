public class Test {
    public static void main(String[] args) {
        StackReferenceBased Stack = new StackReferenceBased();
        Stack.push("Hello");
        Stack.push("World");
        Stack.push("Programmed");
        Stack.push("To");
        Stack.push("Look");
        Stack.push("But");
        Stack.push("Not");
        Stack.push("To");
        Stack.push("Feel");
        
        Stack.displayStack();
    }
}
