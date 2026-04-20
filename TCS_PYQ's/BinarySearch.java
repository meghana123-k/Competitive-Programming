public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9, 11, 56, 58, 138 };
        int target = 5;
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                System.out.println("found");
                return;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            left++;
            right--;
        }
        System.out.println("not found");
    }
}
