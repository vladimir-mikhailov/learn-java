public class S2_T2_Fix {
    public static void main(String[] args) {
        try {
            int d = 0;
            int[] intArray = {1,2,3,4,5,6,7,8,9};
            double catchedRes1 = 0;
            if (d == 0) {
                throw new ArithmeticException("На ноль делить можно, но не здесь.");
            }
            catchedRes1 = (double) intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e.getMessage());
        }
    }
}
