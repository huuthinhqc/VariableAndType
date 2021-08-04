import javax.swing.*;

public class App {

    static String global = "global variable"; //Biến toàn cục

    public static void main(String[] args) {
//        String  str;
//       str = "Data Type";

        String str = "Data Type"; //Biến cục bộ
        System.out.println(str);



        final double PI = 3.14; //Hằng số

        System.out.println("Name\tDOB");

        short s = 10; // -32768 -> 32767
        int i = 100; //  -2^31 -> 2^31-1
        long l = 100000000; // -2^63 -> 2^63-1
        long l2 = 100L;

        float f = 3.1f;
        double d = 5.7;

        char c = 'a';
        char c2 = '5';
        char c3 = 65;

        boolean b1 = true;
        boolean b2 = false;

        Integer ref_i = 100;

        System.out.println(global);

        SimpleSeason sse = SimpleSeason.AUTUMN;
        System.out.println(sse);
    }

}
