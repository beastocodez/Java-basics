public class DoWhile {
    public static void main(String[] args){
        // Do While loop is used when the first iteration of 
        // loop is needed to run even if it doesn't satisfy the condition.
        // Syntax : do {  block of code  }while(condition);

        int i = 5;

        do {
            System.out.println("Hello " +i);
            i++;
        }while(i<=4); // Prints "Hello 5" once even if the condition is not satisfied.
}
}
