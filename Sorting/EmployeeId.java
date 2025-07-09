package sorting;
public class EmployeeId {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] id = {102, 143, 112, 176, 142, 132, 139, 101};
        insertionSort(id);
        for(int x : id) {
        	System.out.print(x+" ");
        }
    }
}