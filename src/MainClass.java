public class MainClass {
    public static void main(String[] args) {
        int[] arr = {0, 1, 16, 24, 35, 47, 59, 62, 73, 88, 99};

        int i = binary_search(arr, 62);
        System.out.println(i + "");
    }

    private static int binary_search(int[] a, int key){
        int low = 0;
        int high = a.length-1;


        while (low <= high) {

            int mid = (low + high)/2;

            if (a[mid] == key) {
                return mid;
            } else if (a[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return 0;
    }
}
