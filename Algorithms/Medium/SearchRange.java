package Algorithms.Medium;

public class SearchRange {

    public static int[] searchRange(int[] nums, int target){
        int mid = nums.length/2;
        int left = -1;
        int right = -1;

        //binary search
        // use hi/lo to move around, rather than mid directly. If we only use mid, how do we detect that an element is not present?
        while(left == -1 || right == -1){
            System.out.println("current mid: " + mid);
            System.out.println("length: " + nums.length);

            if(nums[mid] > target){
                //search left
                mid /= 2;
            } else if (nums[mid] < target){
                //search right
                mid = Math.min((nums.length + mid)/ 2, nums.length);
            } else if(mid == nums.length - 1 || mid == 0){
                break;
            } else{
                //you found it! mid is equal to target. walk left and right to find lhs and rhs bounds
                left = right = mid;
                System.out.println("you made it into the loop!");
                while(true){
                    if (left == 0 || nums[left - 1] != target){
                        break;
                    } else {
                        left--;
                    }

                    if(right == nums.length || nums[right + 1] != target){
                        break;
                    } else{
                        right++;
                    }
                }
            }
        }

        int[] ans = new int[2];
        ans[0] = left;
        ans[1] = right;
        return ans;
    }
}
