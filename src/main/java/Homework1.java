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
        int i;
        int n = intArray.length;
        System.out.println(n);
        int[] sortedArray={};
        for ( int val: intArray){

            if(sortedArray.length>0) {
            for(i= 0; i< n; i++){
                    if (val > sortedArray[i]) {
                        System.out.println("val is more");
                     sortedArray[i + 1] = val;
                    } else {
                        System.out.println("val is less");
                     sortedArray[i] =val;
                    }

                }
            }else {
                System.out.println(val);
                    sortedArray[0]=val;
            }
        }
        System.out.println(Arrays.toString(sortedArray));

    }
    public static void main(String[] args) {

        triangle(2,3,2);
        int[] intArray={-10, 0, 2, 9, -5};
        sortAsc(intArray);
    }
}
