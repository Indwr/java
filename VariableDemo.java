import static java.lang.System.out;

public class VariableDemo {
    public static void main(String[] args){
        //int,float, double
        int i = 4; // 4 bytes -> 32 bits 
        short s = 4;  //2 bytes -> 16 bits -> -32768 to 32767 
        byte b = 5; // 1 byte -> 8 bits -> -128 to 127
        long l = 400000000l;  // 8 bytes
        float f = 10.5f;
        double d = 20.20;
        char c = 'A';
        c = 66; // American standard code for information interchange
        out.print(c);
         out.print('\n');
        double d1 = 5;  //implicit conversion
        // out.print(d1);
        int k = (int)5.5;
        out.print(k);
    }
}
