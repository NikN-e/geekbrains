public class Task4 {
    public static void main(String[] args) {

        int a = 4;
        int b = 346;

        System.out.println(expr(a, b));

    }
    public static boolean expr(int a, int b){
        return a + b >= 10 && a + b <= 20;
    }
}
