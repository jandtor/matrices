import java.util.Arrays;

public class nuevo {
    public static void main(String[] args) {
        int[] array = new int[5];
        int[] otroArray = array;

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(otroArray));

        otroArray[0] = 3;

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(otroArray));

    }
}
