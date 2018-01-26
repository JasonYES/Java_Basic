import sun.nio.ch.ThreadPool;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by Fang Yi on 18-1-23.
 */
public class B_ThreadPool {

    /*
    The use of ThreadPool
        According to the Alibaba Java Guidelines, it a better choice to use ThreadPool than directly create a thread.
    */

    public class RunA implements Runnable {

        private int a = 0;
        private int limit = 1000;

        @Override
        public void run() {
                for(int i = 0; i < limit; i++) {
                    a++;
                    System.out.println(a);
                }
        }
    }

    public static void main(String[] args) {
//        ThreadPoolExecutor executor = new ThreadPoolExecutor()
    }
}
