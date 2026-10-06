import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        /*StackReferenceBased Stack = new StackReferenceBased();
        Stack.push("Hello");
        Stack.push("World");
        Stack.push("Programmed");
        Stack.push("To");
        Stack.push("Look");
        Stack.push("But");
        Stack.push("Not");
        Stack.push("To");
        Stack.push("Feel");
        
        Stack.displayStack();*/

        System.out.println(isBalanced(""));
        System.out.println(isBalanced("{"));
        System.out.println(isBalanced("}"));
        System.out.println(isBalanced("}{"));
        System.out.println(isBalanced("{}"));
    }

    //accepts a string as input and uses a Stack to check if the braces “{}“ in the String are balanced.
    private static boolean isBalanced(String testString){
        StackReferenceBased Stack = new StackReferenceBased();
        for(char c : testString.toCharArray()){
            switch(c){
                case '{':
                    Stack.push(Braces.OpenCurl);
                    break;
                case '}':
                    if(Stack.isEmpty()){
                        return false;
                    }else{
                        Stack.pop();
                    }
                    break;
            }
        }
        return Stack.isEmpty();
    }
}
