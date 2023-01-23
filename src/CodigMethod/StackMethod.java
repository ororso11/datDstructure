package CodigMethod;


import java.util.Stack;

public class StackMethod {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1); // 값 추가
        stack.pop(); // 값 삭제
        stack.clear(); // 전체 값 삭제
        stack.size(); // 크기 변환
        stack.empty(); // 비어있으면 true, 비어있지않으면 false
        stack.contains(1); // 1을 포함하고있으면 tr, 아니면 false
        stack.peek(); // top 출력, 비어있으면 null
    }
}
