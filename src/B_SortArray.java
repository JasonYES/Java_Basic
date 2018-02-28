import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Fang Yi on 18-2-9.
 */
public class B_SortArray {

        //review of different types of sorting algorithm

        //each algorithm is coded in at least two directions, which is a good way to master the core idea of one algorithm

    public void bubble(int[] nums) {
        int tmp;
        for(int i = nums.length - 1; i>0; i--) {
            for(int j = 0; j < i; j++) {
                if(nums[j] > nums[j+1]) {
                    tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                }
            }
        }
    }

    public void bubble2(int[] nums) {
        int tmp;
        for(int i = 0; i < nums.length-1; i++) {
            for(int j = nums.length - 1; j > i; j--) {
                if(nums[j] < nums[j-1]) {
                    tmp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = tmp;
                }
            }
        }
    }

    public void select(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++) {
            int min = i;
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[j] < nums[min]) min = j;
            }
            int tmp = nums[i];
            nums[i] = nums[min];
            nums[min] = tmp;
        }
    }

    public void select2(int[] nums) {

    }

    public void insert(int[] nums) {
        for(int i = 1; i < nums.length; i++) {
            for(int j = i; j > 0 && (nums[j] < nums[j-1]); j--) {
                int tmp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = tmp;
            }
        }
    }

    public static void main(String[] args) {

        B_SortArray sort = new B_SortArray();
        int[] nums = {2,5,8,9,4,6,3,585,9,3,2,55,8,2,63,5,2,3,20,90};

//        sort.bubble(nums);
//        sort.bubble2(nums);
//        sort.select(nums);
//        sort.insert(nums);
        System.out.println(Arrays.toString(nums));
    }
}
