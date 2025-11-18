public class Ternary{
    public static void main(String[] args)
    {
        // Ternary operator is a shorthand for if-else statements
        // Syntax: (condition) ? value_if_true : value_if_false
        // Returns different values based on a condition
        
        int a = 10;
        int b = 20;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println();
        
        // Example 1: Basic ternary operator
        // Finds the maximum of two numbers
        int max = (a > b) ? a : b;  // If a > b, max = a; otherwise max = b
        System.out.println("Example 1 - Maximum value: " + max);
        
        System.out.println();
        
        // Example 2: Ternary with String output
        // Prints whether a number is positive or negative
        int num = -5;
        System.out.println("num = " + num);
        String result = (num > 0) ? "Positive" : "Negative or Zero";
        System.out.println("Example 2 - " + result);
        
        System.out.println();
        
        // Example 3: Nested ternary operators
        // Finds the maximum of three numbers
        int x = 15, y = 25, z = 20;
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
        int maxThree = (x > y) ? ((x > z) ? x : z) : ((y > z) ? y : z);
        System.out.println("Example 3 - Maximum of three: " + maxThree);
        
        System.out.println();
        
        // Example 4: Ternary for age verification
        // Checks if person is eligible to vote
        int age = 18;
        System.out.println("age = " + age);
        String eligibility = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
        System.out.println("Example 4 - " + eligibility);
        
        System.out.println();
        
        // Example 5: Ternary in arithmetic expression
        // Calculates discount based on purchase amount
        double purchaseAmount = 150;
        System.out.println("purchaseAmount = $" + purchaseAmount);
        double discount = (purchaseAmount > 100) ? purchaseAmount * 0.1 : 0;
        double finalAmount = purchaseAmount - discount;
        System.out.println("Example 5 - Discount: $" + discount);
        System.out.println("Example 5 - Final Amount: $" + finalAmount);
        
    }
}
        
        