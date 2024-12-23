public class Multiplecatch {
    public static void main(String[] args) {
        int a = 20;
        try {

            divide(a);
            String S = null;
            System.out.println(S.length());
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Arithmetic Exception");
        } catch (NullPointerException s) {
            throw new NullPointerException("Null Exception");

        } catch (ArrayIndexOutOfBoundsException r) {
            throw new ArrayIndexOutOfBoundsException("Array Exception");
        } catch (java.lang.Exception c) {
            System.out.println("Exception handle");
        }

        finally {
            System.out.println("Finally block executed");
        }

        System.out.println("Executed");

    }

    public static void divide(int a) throws ArithmeticException {
        try {

            a = a / 0;

        } catch (ArithmeticException e) {
            throw new ArithmeticException("Arithmetic Exception");
        }

    }

}
