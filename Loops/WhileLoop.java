public class WhileLoop
{
    public static void main(String[] args)
    {
      
    // While loop : An function which repeats itself until the condition is satisfied.
    // Syntax : while(condtion) {  Block of code to be executed  }
        int i = 1;

        while(i<=5)
        {
            System.out.println("Hello " + i);
            i++;                              // Prints Hello 5 times with numbering
        }
        System.out.println("Bye " + i);

         // Nested While loop example

         int a = 1;

        while(a<=5)
            {
                System.out.println("Hello " + a);
            
                int b = 1;
                while(b<=3)             
                {
                    System.out.println("Heyyy ");
                    b++;
                }
                a++;                        // Prints Hello 5 times with numbering
                                            // and after each Hello, Heyyy is printed 3 times
            }

    }
}


