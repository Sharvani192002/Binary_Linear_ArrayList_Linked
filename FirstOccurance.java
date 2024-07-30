package BinarySearch;

public class FirstOccurance {
    public static int findOccurrence(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            int result = -1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (nums[mid] == target) {
                    result = mid;
                    right = mid - 1;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            return result;
        }

        public static void main(String[] args) {
            int[] nums = {1, 2, 2, 2, 3, 4, 5};
            int target = 2;
            int index = findOccurrence(nums, target);
            System.out.println("The first occurrence of " + target + " is at index: " + index);
        }
    }

