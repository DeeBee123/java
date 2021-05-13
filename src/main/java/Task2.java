import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        var x = "x variable";
        System.out.println(x);
        //data types
        byte b = 127; //8bit
        short s = 20000; //16bit
        int a = 400; //32bit
        long c = a * 3000000L; //64bit
        float pi = 3.14159f;
        double e = 2.71814566946;
        boolean ar = b < 1e9;
        char o = '!'; //16bit
        char u = '\u260E';//16bit
        String title = "LTD \"Escape\"";
        System.out.println(title + " " + ar + " " + pi + " " + c);
        var q = u == o;
        System.out.println(q);
        int[][] z = {{2, 4}, {3, 7}, {5, 78}};
        String[] names = {"John", "Anna"};
        names[0] = "Kate";
        System.out.println(Arrays.toString(names));
        String[] address = new String[5];
        address[4] = "Fifth address";
        System.out.println("address: " + Arrays.toString(address));

    }
}
