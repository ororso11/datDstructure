package CodigMethod;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMethod {
    public static void main(String[] args) {
        // 왜 링크드 인지??
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.offer(2); // 값 추가
        queue.poll(); // 첫번째 값  반환, 없으면 null
        queue.remove(); // 첫번째 값 삭제
        queue.clear(); // 값 다삭제
        queue.peek(); // 첫번째값 출력
    }
}
