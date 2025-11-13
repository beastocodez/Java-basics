public class RelationalOperators {
    public static void main(String args[]){
        // Relational operators are used to compare two values
        // Main relational operators are (>), (<), (>=), (<=), (==), (!=)
        
        int num1 = 5;
        int num2 = 2;
        System.out.println("Num1 = " + num1);
        System.out.println("Num2 = " + num2);
        // Greater than (>)
        boolean greaterThan = num1 > num2;  // 5 > 2 = true
        System.out.println("num1 > num2: " + greaterThan);
        
        // Less than (<)
        boolean lessThan = num1 < num2;     // 5 < 2 = false
        System.out.println("num1 < num2: " + lessThan);
        
        // Greater than or equal to (>=)
        boolean greaterThanOrEqual = num1 >= num2;  // 5 >= 2 = true
        System.out.println("num1 >= num2: " + greaterThanOrEqual);
        
        // Less than or equal to (<=)
        boolean lessThanOrEqual = num1 <= num2;     // 5 <= 2 = false
        System.out.println("num1 <= num2: " + lessThanOrEqual);
        
        // Equal to (==)
        boolean equalTo = num1 == num2;    // 5 == 2 = false
        System.out.println("num1 == num2: " + equalTo);
        
        // Not equal to (!=)
        boolean notEqualTo = num1 != num2; // 5 != 2 = true
        System.out.println("num1 != num2: " + notEqualTo);

    }    
}