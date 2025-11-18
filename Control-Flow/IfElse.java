public class IfElse{
    public static void main(String[] args)
    {
        // If-Else statements are used to execute code based on conditions
        // Main conditional statements are if, else if, and else
        
        int x = 5;
        int y = 7;
        int z = 9;
        
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println();
        
        // Example 1: Simple if statement
        // Executes only if the condition is true
        if(x > y && x > z)
            System.out.println("Example 1 - X is Greatest");
        
        System.out.println();
        
        // Example 2: if-else statement
        // Executes one block if condition is true, another if false
        if(y > z) {
            System.out.println("Example 2 - y is greater than z");
        } else {
            System.out.println("Example 2 - z is greater than or equal to y");
        }
        
        System.out.println();
        
        // Example 3: if-else if-else statement
        // Checks multiple conditions in order
        if(x > y && x > z) {
            System.out.println("Example 3 - X is Greatest");
        } else if(y > x && y > z) {
            System.out.println("Example 3 - Y is Greatest");
        } else {
            System.out.println("Example 3 - Z is Greatest");
        }
        
        System.out.println();
        
        // Example 4: Nested if statements
        // if inside another if
        if(x < y) {  // 5 < 7 = true
            System.out.println("Example 4 - x is less than y");
            if(y < z) {  // 7 < 9 = true
                System.out.println("Example 4 - y is also less than z");
            }
        }
        
        System.out.println();
        
        // Example 5: if with single variable comparison
        int age = 18;
        if(age >= 18) {
            System.out.println("Example 5 - You are an adult");
        } else {
            System.out.println("Example 5 - You are a minor");
        }
        
        System.out.println();
        
        // Example 6: Multiple else if conditions
        int marks = 75;
        if(marks >= 90) {
            System.out.println("Example 6 - Grade: A");
        } else if(marks >= 80) {
            System.out.println("Example 6 - Grade: B");
        } else if(marks >= 70) {
            System.out.println("Example 6 - Grade: C");
        } else if(marks >= 60) {
            System.out.println("Example 6 - Grade: D");
        } else {
            System.out.println("Example 6 - Grade: F");
        }

    }
}
