public class Typecast { 
public static void main(String args[]){
    System.out.println("--- Widening Casting (Automatic) ---");
    // Widening casting is done automatically when passing a smaller size type to a larger size type.

    // byte -> int
    byte smallByte = 120;
    int bigInt = smallByte; // No explicit cast needed
    System.out.println("byte to int: " + bigInt);

    // float -> double
    // Note: The original float loses precision when declared.
    float myFloat = 2.59847289759838745937583458345873f;
    double myDouble = myFloat; // No explicit cast needed
    System.out.println("float to double: " + myDouble);


    // char -> int
    char myChar = 'A';
    int charValue = myChar; // Gets the ASCII/Unicode value
    System.out.println("char to int: " + charValue);
    // Narrowing casting must be done manually by placing the type in parentheses.
    // This can lead to data loss.


    // int -> byte (value out of range)
    int largeInt = 500; // A byte can only hold values from -128 to 127.
    byte tinyByte = (byte)largeInt;
    // The value wraps around. 500 % 256 = 244. In two's complement, this is -12.
    System.out.println("int (500) to byte: " + tinyByte);


    // double -> int (loses fractional part)
    double preciseDouble = 9.78;
    int truncatedInt = (int)preciseDouble; // The .78 is lost (truncated, not rounded).
    System.out.println("double (9.78) to int: " + truncatedInt);


    // float -> int (loses fractional part)
    float anotherFloat = 2.6f;
    int anotherInt = (int)anotherFloat; // The .6 is lost.
    System.out.println("float (2.6f) to int: " + anotherInt);

    
    // int -> char
    int anInt = 66;
    char aChar = (char)anInt; // Converts the int value to its corresponding ASCII/Unicode character.
    System.out.println("int (66) to char: " + aChar);


    // Type Promotion
    byte num1 = 30;
    byte num2 = 10;

    int Result = num1 * num2;
    System.out.println("Product of num1 * num2 = "+Result);
    // Here the product of 2 byte values is stored as an Int value, as the final ans is exceeding the byte datatype's range.
}
}
