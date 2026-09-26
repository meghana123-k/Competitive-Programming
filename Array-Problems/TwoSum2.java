public class TwoSum2 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 6, 8, 9, 14};
        int target = 10;
        int left = 0, right = arr.length-1;
        boolean found = false;
        while(left < right) {
            int sum = arr[left] + arr[right];
            if(sum == target) {
                found = true;
                break;
            }
            else if(sum > target) {
                right--;
            } else {
                left++;
            }
        }
        System.out.println(found);
    }
}
