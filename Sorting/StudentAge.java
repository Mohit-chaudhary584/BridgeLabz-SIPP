package sorting;

public class StudentAge {
	public static int[] countSort(int[] arr) {
        int N = arr.length;
        int M = 0;
        for (int i = 0; i < N; i++) {
            M = Math.max(M, arr[i]);
        }
        int[] count = new int[M + 1];
        for (int i = 0; i < N; i++) {
            count[arr[i]]++;
        }
        for (int i = 1; i <= M; i++) {
            count[i] += count[i - 1];
        }
        int[] ans = new int[N];
        for (int i = N - 1; i >= 0; i--) {
        	ans[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }
        return ans;
    }
	
	public static void main(String[] args) {
		int[] age = {20, 19, 19, 21, 22, 21, 19, 22, 23, 24, 22, 21, 20, 20};
		age = countSort(age);
		for(int x : age) {
			System.out.print(x + " ");
		}
	}
}
