package CodigMethod;

public class StringBuilderMethod {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        // 문자열 변경하는 문제에서는 StringBuilder를 사용함.
        sb.append("abc");
        sb.insert(2,"kk");
        sb.delete(0,2);
        sb.deleteCharAt(2);
        sb.reverse(); // 문자열 뒤집기
        sb.setLength(2); // 문자열 길이를 2로 줄임
    }
}
