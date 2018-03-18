import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Fang Yi on 18-3-14.
 */
public class Pure_test {

    public int res = 0;

    public static void main(String[] args) {

//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//            int sum = sc.nextInt();
//            int[][] lim = new int[n][2];

//            int n = 2;
            int[][] lim = {{0,3},{0,3},{0,3}};
//
//            for(int i = 0; i < n; i++){
//                for(int j = 0; j < 2; j++){
//                    lim[i][j] = sc.nextInt();
//                }
//            }
            Pure_test p = new Pure_test();
            p.rec(0, 5, lim);
            System.out.println(p.res);
        }

        public void rec(int loc, int tar, int[][] lim) {
            if(tar == 0) {
                res++;
                return;
            }
            if(loc >= lim.length) return;
            for (int i = lim[loc][0]; i <= lim[loc][1]; i++) {
                tar -= i;
                rec(loc+1, tar, lim);
                tar += i;
            }
    }
}
