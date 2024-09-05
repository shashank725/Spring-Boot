import java.awt.*;
import java.util.Date;

public class DataTypes {
    public static void main(String[] args) {
        System.out.println("Primitive Type: for storing simple values");
//        Type   Bytes   Range
//        byte     1     [-128, 127]
//        short    2     [-32k, 32k]
//        int      4     [-2B, 2B]
//        long     8
//        float    4
//        double   8
//        char     2     A,B,C..
//        boolean  1     true, false
        byte age = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;

        // Reference Type don't store the actual value they store reference to an object somewhere in the memory
        System.out.println("Reference Type: for storing complex objects");
        Date now = new Date();
        System.out.println(now);
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
        // Strings are immutable in Java
        String message = "String is "+"Reference Type!";
        System.out.println(message+"; Len="+message.length());
        System.out.println(message.replace("!", "!!!"));
        System.out.println(message);        
        // Escape Sequences
        String msg1 = "Hey \"Shashank\"";
        System.out.println(msg1);
        String msg2 = "C:\\windows\\...";
        System.out.println(msg2);
        String msg3 = "C:\nwindows\\...";
        System.out.println(msg3);
        String msg4 = "C:\twindows\\...";
        System.out.println(msg4);

    }
}
