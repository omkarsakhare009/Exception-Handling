class Exception {
    public static void main(String[] args) {
        int a = 20;
        try {
            a = 20 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception Occured");

        }
        System.out.println("Executed");
    }
}