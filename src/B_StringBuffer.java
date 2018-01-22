/**
 * Created by Fang Yi on 18-1-22.
 */
public class B_StringBuffer {
    //compare the efficiency of simply "+" with StringBuilder

    static long start;
    static long end;
    static int round = 100000;

    public static void main(String[] args) {

        ////////////////
        String a = "";
        start = System.currentTimeMillis();
        for(int i = 0; i < round; i++) {
            a += round;
        }
        end = System.currentTimeMillis();
        System.out.println("simple plus : " + (end - start));

        ///////////////
        StringBuffer b = new StringBuffer("");
        start = System.currentTimeMillis();
        for(int i = 0; i < round; i++) {
            b.append(i);
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuffer : " + (end - start));

        ///////////////
        StringBuilder c = new StringBuilder("");
        start = System.currentTimeMillis();
        for(int i = 0; i < round; i++) {
            c.append(i);
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuilder : " + (end - start));



        /////////////// Result as followed

        /*
        simple plus : 39833
        StringBuffer : 6
        StringBuilder : 5
        */
        /*
        simple plus : 83769
        StringBuffer : 9
        StringBuilder : 8
        */
    }

}
