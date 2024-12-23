public class Stringexception {
    public static void main(String[] args) {

        try {
            String S = null;
            System.out.println(S.length());

        } catch (NullPointerException s) {
            System.out.println("Exception Handle");

        }
        System.out.println("Executed");
    }

}
