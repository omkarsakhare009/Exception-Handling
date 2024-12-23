public class Array {
    public static void main(String[] args) {
        int[] arr = new int[3];

        try {
            arr[4] = 30;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception handle");
        }
        System.out.println("Executed");
    }

}
