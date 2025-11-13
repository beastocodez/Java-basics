public class LogicalOperators {
    public static void main(String[] args){
        int a = 2;
        int b = 5;
        int x = 7;
        int y = 9;

        boolean result;

        // AND Operator ; Represented as &&
        // Both the sub results should be true for the result to be true.
        result = a < b && x > y;  // true && false = false
        System.out.println("a < b AND x > y = " + result);

        // OR Operator ; Represented as ||
        // Only one of the sub results require to be true for the result to be true.
        result = a < b || x > y;  // true || false = true
        System.out.println("a < b OR x > y = " + result);

        // NOT Operator ; Represented as !
        // The NOT operator gives the opposite of the actual result.
        result = a < b;           // true
        System.out.println("!(a < b) = " + !result);  // NOT true = false
    }
}

// AND & OR operators are usually used in short circuit like this : && and ||
// This makes the program to give result by checking the first condition only if possible.