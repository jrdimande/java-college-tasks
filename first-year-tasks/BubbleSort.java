public class BubbleSort {
    public static void main(String[] args){
        int[] nums = {5,4,3,2,1};
        int n = nums.length;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n - i - 1; j++){

                if (nums[j] > nums[j + 1]){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                }
            }
        }

        for (int i = 0; i < n; i++){
            System.out.println(nums[i]);
        }


    }



}
