public class ArithmeticOperators {
    public static void main(String args[]) {
        // = is referred to as Assignment Operator
        // Main mathematical operators are (+), (-), (*), (/), (%)
        
        int num1 = 10;
        int num2 = 5;

        int sum = num1 + num2;        // Adds two numbers
        int difference = num1 - num2; // Subtracts two numbers
        int product = num1 * num2;    // Multiplies two numbers
        float divide = num1 / num2;   // Divides two numbers
        int mod = num1 % num2;        // Finds modulus (i.e. remainder when divided)

        System.out.println("Sum of two numbers = " + sum);
        System.out.println("Difference of two numbers = " + difference);
        System.out.println("Product of two numbers = " + product);
        System.out.println("Quotient of two numbers = " + divide);
        System.out.println("Modulus of two numbers = " + mod);
    }
}
