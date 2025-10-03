public class Datatypes{
    public static void main(String args[])
    {
        // --- Integer Types ---
        byte x = 5; // 8-bit: -128 to 127
        short d = 30000; // 16-bit: -32,768 to 32,767
        int i = 9; // 32-bit
        int j = 0b101; // Binary number for 5.
        int k = 0x55; // Hexadecimal Number for 85.
        long l = 9999922321L; // 64-bit, note the 'L' suffix
        
        // --- Floating-Point Types ---
        float r = 2.5f; // 32-bit, note the 'f' suffix
        double s = 5.55; // 64-bit
        
        // --- Other Types ---
        char c = 'k'; // 16-bit Unicode character
        boolean b = true; // true or false
        
        System.out.println("byte x: " + x);
        System.out.println("short d: " + d);
        System.out.println("int i: " + i);
        System.out.println("int j (binary 0b101): " + j);
        System.out.println("int k (hex 0x55): " + k);
        System.out.println("long l: " + l);
        System.out.println("float r: " + r);
        System.out.println("double s: " + s);
        System.out.println("char c: " + c);
        System.out.println("boolean b: " + b);
    }
}