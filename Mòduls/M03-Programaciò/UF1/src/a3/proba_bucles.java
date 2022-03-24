package a3;

public class proba_bucles {

    public static void main(String[] args) {
        int i, x, a, b;

        for (i = 10; i > 0; i--) {
            System.out.print(i + "");

        }
        for (a = 1, b = 1; a + b < 10; a++, b += 2) {
            System.out.printf("a = %d"+ a + "b = %d"+ b +"a + b =%d"+ (a+b));
        }
    }

}
