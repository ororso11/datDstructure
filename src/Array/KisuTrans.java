package Array;

public class KisuTrans {
    public static void main(String[] args) {
        char[] res = new char[32];

        int dno = test1(59,16,res);
        for(int i = dno - 1; i >= 0; i--) {
            System.out.println(res[i]);
        }
    }

    public static int test1(int n , int r , char[] res) {
        int cnt = 0;
        // 알파벳 수
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            res[cnt++] = dchar.charAt( n % r);
            n /= r;
        } while ( n!=0);
        return cnt;
    }

}
