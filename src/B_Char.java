/**
 * Created by Fang Yi on 18-1-22.
 */
public class B_Char {

    public static void plus(int i) {
        i++;
    }

    public static void main(String[] args) {

        // char & integer
        int i = Character.getNumericValue('3');
        plus(i);
        System.out.println(i);

    }
}
