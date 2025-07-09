package sorting;
public class StudentMarks {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] marks = {75, 38, 82, 74, 62, 91, 95, 45, 98, 83};
        bubbleSort(marks);
        for(int x : marks) {
        	System.out.print(x+" ");
        }    
    }
}

