package Array;

public class reversArray {
    public static void main(String[] args) {
        // 요소 개수가 홀수인경우, 또한 시간복잡도를 줄일떄 쓰면 좋은방법.
        // 전체길이 / 2 -> 3 나머지는 버림.
        // 왼쪽 : i , 오른쪽 : n - i - 1
        int[] arr = {11,44,55,11,55,124,12};

        for(int i = 0; i < arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        reverse(arr);

        for(int i = 0; i < arr.length;i++) {
            System.out.print(arr[i] + " ");
        }

    }

    // 역순
    public static void reverse(int[] arr) {
        for(int i = 0; i < arr.length / 2; i++) {
            swap(arr,i,arr.length - i - 1);
        }
    }

    // swap 과정
    public static void swap(int[] a , int i1, int i2) {
        int t = a[i1]; a[i1] = a[i2]; a[i2] = t;
    }

}
