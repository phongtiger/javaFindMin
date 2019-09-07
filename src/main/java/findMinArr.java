public class findMinArr {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,-1};
        int minArr1 = findMin(arr1);
        System.out.println("Value Min of arr1 is: "+ minArr1);
    }

    public static int findMin(int []arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
