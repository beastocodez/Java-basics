public class SwitchCase{
    public static void main(String[] args)
    {
        // Switch-Case statements are used to execute different code blocks based on different conditions
        // More efficient than multiple if-else statements when checking a single variable against multiple values
        // Main components: switch(expression), case value, break, and default
        
        int n = 3;
        System.out.println("n = " + n);
        System.out.println();
        
        // Example 1: Basic switch-case (Days of the week)
        // The switch expression (n) is compared with each case value
        // When a match is found, code after that case executes until break is encountered
        switch(n){
            case 1:  // if n == 1
                System.out.println("Example 1 - Monday");
                break;  // Exit switch block
            case 2:  // if n == 2
                System.out.println("Example 1 - Tuesday");
                break;
            case 3:  // if n == 3
                System.out.println("Example 1 - Wednesday");
                break;
            case 4:  // if n == 4
                System.out.println("Example 1 - Thursday");
                break;
            case 5:  // if n == 5
                System.out.println("Example 1 - Friday");
                break;
            case 6:  // if n == 6
                System.out.println("Example 1 - Saturday");
                break;
            case 7:  // if n == 7
                System.out.println("Example 1 - Sunday");
                break;
            default:  // If no case matches
                System.out.println("Example 1 - Invalid day");
        }
        
        System.out.println();
        
        // Example 2: Switch with character
        char grade = 'A';
        System.out.println("grade = " + grade);
        switch(grade) {
            case 'A':
                System.out.println("Example 2 - Excellent (90-100)");
                break;
            case 'B':
                System.out.println("Example 2 - Good (80-89)");
                break;
            case 'C':
                System.out.println("Example 2 - Average (70-79)");
                break;
            case 'D':
                System.out.println("Example 2 - Below Average (60-69)");
                break;
            case 'F':
                System.out.println("Example 2 - Failed (Below 60)");
                break;
            default:
                System.out.println("Example 2 - Invalid grade");
        }
        
        System.out.println();
        
        // Example 3: Switch with multiple operations per case
        int choice = 2;
        System.out.println("choice = " + choice);
        switch(choice) {
            case 1:
                System.out.println("Example 3 - You chose Option 1");
                System.out.println("Example 3 - Performing action 1");
                break;
            case 2:
                System.out.println("Example 3 - You chose Option 2");
                System.out.println("Example 3 - Performing action 2");
                break;
            case 3:
                System.out.println("Example 3 - You chose Option 3");
                System.out.println("Example 3 - Performing action 3");
                break;
            default:
                System.out.println("Example 3 - Invalid choice");
        }
        
        System.out.println();
        
        // Example 4: Switch with fall-through (without break)
        // When break is missing, execution continues to next case
        int month = 1;
        System.out.println("month = " + month);
        switch(month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Example 4 - Winter season");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Example 4 - Spring season");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Example 4 - Summer season");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Example 4 - Fall season");
                break;
            default:
                System.out.println("Example 4 - Invalid month");
        }
        
        System.out.println();
        
        // Example 5: Switch with String (Java 7+)
        String fruit = "Apple";
        System.out.println("fruit = " + fruit);
        switch(fruit) {
            case "Apple":
                System.out.println("Example 5 - Red fruit, sweet taste");
                break;
            case "Banana":
                System.out.println("Example 5 - Yellow fruit, soft texture");
                break;
            case "Orange":
                System.out.println("Example 5 - Orange fruit, citrus taste");
                break;
            case "Mango":
                System.out.println("Example 5 - King of fruits");
                break;
            default:
                System.out.println("Example 5 - Unknown fruit");
        }

    }
}
