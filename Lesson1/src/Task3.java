public class Task3 {
    public static void main(String[] args) {

        int a = 4;
        int b = 6;
        int c = 9;
        int d = 3;

        System.out.println("Значение вырвжения a * (b + (c / d)) = "+ expr(a, b, c, d));

    }
    public static double expr(int a, int b, int c, int d){
        double result = a * (b + (c / d));
        return result;
    }
}
