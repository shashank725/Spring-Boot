import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        // Old syntax for initializing arrays
        int[] numbers = new int[5];
        numbers[0] = 25;
        numbers[1] = 11;
        numbers[2] = 2002;
        System.out.println(Arrays.toString(numbers));  // To convert memory address to value
        // New syntax for initializing arrays
        int[] num = {25,11,2002,0,7};
        System.out.println(num.length);
        
        // Multi-Dimensional Arrays
        int[][] number2D = new int[2][3];
        number2D[0][0] = 25;
        System.out.println(Arrays.deepToString(number2D));
        int[][] number2D_2 = {{25,11,2002}, {25,11,2000}};
        System.out.println(Arrays.deepToString(number2D_2));
        // 3D
        int [][][] number3D = new int[2][3][5];
        number3D[0][0][4] = 25;
        System.out.println(Arrays.deepToString(number3D));


    }
}