import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Fang Yi on 18-2-9.
 */
public class B_SortArray {

        //review of different types of sorting algorithm

        //each algorithm is coded in at least two directions, which is a good way to master the core idea of one algorithm

    public void exch(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i]= nums[j];
        nums[j] = temp;
    }

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

    public int quickPartition(int[] nums, int lo, int hi) {
        int index = nums[lo];
        int i = lo; int j = hi + 1;
        while(true) {

            while(nums[++i] < index) if(i >= hi) break;
            while(nums[--j] > index) if(j <= lo) break;
            if(i >= j) break;
            exch(nums, i, j);
        }
        exch(nums, lo, j);
        return j;
    }
    public void quickMain(int[] nums, int i, int j) {
        if(i >= j) return;
        int m = quickPartition(nums,i,j);
        quickMain(nums,i,m-1);
        quickMain(nums,m+1,j);
    }
    public void quick(int[] nums){
        quickMain(nums, 0, nums.length - 1);
    }

    int[] tmp = new int[100];
    public void mergeTwo(int[] nums, int lo, int mid, int hi) {

        int a = lo; int b = mid + 1;
        for(int i = lo; i <= hi; i++) {
            tmp[i] = nums[i];
        }
        for(int i = lo; i <= hi; i++) {
            if(a > mid) nums[i] = tmp[b++];
            else if(b > hi) nums[i] = tmp[a++];
            else if(tmp[a] >= tmp[b]) nums[i] = tmp[b++];
            else nums[i] = tmp[a++];
        }
    }
    public void mergeCur(int[] nums, int lo, int hi) {
        if(lo >= hi) return;
        int mid = lo + (hi - hi)/2;
        mergeCur(nums, lo, mid);
        mergeCur(nums, mid+1, hi);
        mergeTwo(nums,lo, mid, hi);
    }
    public void merge(int[] nums) {
        mergeCur(nums, 0, nums.length-1);
    }

    public static void main(String[] args) {

        B_SortArray sort = new B_SortArray();
        int[] nums = {2,5,8,9,4,6,3,585,9,3,2,55,8,2,63,5,2,3,20,90};

//        sort.bubble(nums);
//        sort.bubble2(nums);
//        sort.select(nums);
//        sort.insert(nums);
//        sort.quick(nums);
        sort.merge(nums);
        System.out.println(Arrays.toString(nums));
    }
}
