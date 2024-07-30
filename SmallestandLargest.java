package BinarySearch;

public class SmallestandLargest {
    public static int findSmallestGreaterOrEqual(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            int result = -1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (nums[mid] >= target) {
                    result = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            return result;
        }

        public static void main(String[] args) {
            int[] nums = {1, 2, 4, 6, 8, 10};
            int target = 5;
            int index = findSmallestGreaterOrEqual(nums, target);
            if (index != -1) {
                System.out.println("The smallest element greater than or equal to " + target + " is at index: " + index);
            } else {
                System.out.println("No element greater than or equal to " + target + " found.");
            }
        }
    }

