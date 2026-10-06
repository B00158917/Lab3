import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        
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
    private static void testDisplayStack(){
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
    private static void testIsBalanced(){
        System.out.println(isBalanced(""));
        System.out.println(isBalanced("{"));
        System.out.println(isBalanced("}"));
        System.out.println(isBalanced("}{"));
        System.out.println(isBalanced("{}"));
        System.out.println(isBalanced("public class StackReferenceBased implements StackInterface\r\n" + //
                        "{\r\n" + //
                        "  private Node top;\r\n" + //
                        "\r\n" + //
                        "  public StackReferenceBased()\r\n" + //
                        "  {\r\n" + //
                        "    top = null;\r\n" + //
                        "  }  // end default constructor\r\n" + //
                        "  //============================================================================\r\n" + //
                        "  //============================================================================\r\n" + //
                        "  //============================================================================\r\n" + //
                        "\r\n" + //
                        "  public boolean isEmpty()\r\n" + //
                        "  {\r\n" + //
                        "    return top ==  null;\r\n" + //
                        "  }  // end isEmpty\r\n" + //
                        "//============================================================================\r\n" + //
                        "//============================================================================\r\n" + //
                        "//============================================================================\r\n" + //
                        "\r\n" + //
                        "  public void push(Object newItem)\r\n" + //
                        "  {\r\n" + //
                        "    top = new Node(newItem, top);\r\n" + //
                        "  }  // end push\r\n" + //
                        "  //============================================================================\r\n" + //
                        "  //============================================================================\r\n" + //
                        "  //============================================================================\r\n" + //
                        "\r\n" + //
                        "  public Object pop() throws StackException\r\n" + //
                        "  {\r\n" + //
                        "    if (!isEmpty())\r\n" + //
                        "    {\r\n" + //
                        "      Node temp = top;\r\n" + //
                        "      top = top.getNext();\r\n" + //
                        "      return temp.getItem();\r\n" + //
                        "    }\r\n" + //
                        "    else\r\n" + //
                        "    {\r\n" + //
                        "      throw new StackException(\"StackException on \" + \"pop: stack empty\");\r\n" + //
                        "    }  // end if\r\n" + //
                        "  }  // end pop\r\n" + //
                        "  //============================================================================\r\n" + //
                        "  //============================================================================\r\n" + //
                        "  //============================================================================\r\n" + //
                        "\r\n" + //
                        "  public void popAll()\r\n" + //
                        "  {\r\n" + //
                        "    top = null;\r\n" + //
                        "  }  // end popAll\r\n" + //
                        "\r\n" + //
                        "//============================================================================\r\n" + //
                        "//============================================================================\r\n" + //
                        "//============================================================================\r\n" + //
                        "  public Object peek() throws StackException\r\n" + //
                        "  {\r\n" + //
                        "    if (!isEmpty())\r\n" + //
                        "    {\r\n" + //
                        "      return top.getItem();\r\n" + //
                        "    }\r\n" + //
                        "    else\r\n" + //
                        "    {\r\n" + //
                        "      throw new StackException(\"StackException on \" + \"peek: stack empty\");\r\n" + //
                        "    }  // end if\r\n" + //
                        "\r\n" + //
                        "  } // end peek\r\n" + //
                        "//============================================================================\r\n" + //
                        "//============================================================================\r\n" + //
                        "//============================================================================\r\n" + //
                        "\r\n" + //
                        "  //displays or prints out the stack vertically\r\n" + //
                        "  public void displayStack(){\r\n" + //
                        "    if(top != null){\r\n" + //
                        "      System.out.print(\"Top:\");\r\n" + //
                        "      for(Node n = top; n != null; n = n.getNext()){\r\n" + //
                        "        System.out.println(n.getItem());\r\n" + //
                        "      }\r\n" + //
                        "    }\r\n" + //
                        "  }\r\n" + //
                        "}  // end StackReferenceBased"));
    }
}
