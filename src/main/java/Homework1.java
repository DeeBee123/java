import java.util.Arrays;
public class Homework1 {
    private static void triangle(double a, double b, double c) {
        System.out.println("Triangles");
        var type = "";
       double area = 0;
       if(a+b>c && b+c> a && a+c>b) {
        if (a == b && b == c) {
            type="equilateral";
            area = Math.pow(a, 2) * Math.pow(3, 0.5)/4;
        } else if (a == b || b == c || a == c) {
            type="isosceles";
            double p = (a + b + c)/2;
            double value = p * (p - a) *(p - b) *(p - c);
            area = Math.pow(value, 0.5) ;
        } else {
            type="scalene";
            double p = (a + b + c)/2;
            double value = p * (p - a) *(p - b) *(p - c);
            area = Math.pow(value, 0.5) ; }
        System.out.println("Triangle is " + type + " and its area is " + area);}
       else {
        System.out.println("This is not a triangle");
    }}

    private static void sortAsc(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i+1; j < intArray.length; j++) {
                if (intArray[i] > intArray[j]) {
                    int tempValue = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = tempValue;
                }
            }
        }

        System.out.println(Arrays.toString(intArray));

    }

    private static void avgInc(int[] arrayA, int[] arrayB){
        double sumA =0;
        double sumB = 0;
        for (int i = 0; i < arrayA.length; i++) {
            sumA+=arrayA[i];
        }
        for (int i = 0; i < arrayB.length; i++) {
            sumB+=arrayB[i];
        }
        double difference = sumA/arrayA.length -sumB/arrayB.length;
        System.out.println(difference);
    }

    public static void main(String[] args) {

        triangle(2,3,2);
        int[] intArray={-10, 0, 2, 9, -5};
        sortAsc(intArray);
        int[] a= {5,6,10,15,8,4};
        int[] b={8,5,3};
        avgInc(a,b);

    }
}
