/**
 * Created by Fang Yi on 18-2-9.
 */
public class B_AutoBoxing {

    //test the possible performance loss caused by AutoBoxing


    public static void main(String[] args) {

        int times =10000000;
        long start;
        long end;

        int x = 5;
        Integer y = 5;

        //////////////////////////////////
        start = System.currentTimeMillis();
        for(int i = 0; i < times; i++) {
            x++;
        }
        end = System.currentTimeMillis();
        System.out.println("No Box :" + (end - start));


        /////////////////////////////////
        start = System.currentTimeMillis();
        for(int i = 0; i < times; i++) {
            y++;
        }
        end = System.currentTimeMillis();
        System.out.println("Box :" + (end - start));



        ////////////////Result///////////

        /*
        No Box :3
        Box :56
         */
    }
}
