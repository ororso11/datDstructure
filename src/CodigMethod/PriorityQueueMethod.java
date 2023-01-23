package CodigMethod;

import java.util.PriorityQueue;

public class PriorityQueueMethod {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        // 낮은 순서가 우선순위를 갖는다.
        // 높은 숫자가 우선시 되려면 Collections.reverseOrder() 작성 필요
        pq.add(1);
        pq.offer(1);
        pq.peek(); // 첫번째 값 반환
        pq.remove(); // 첫번째 값 삭제
        pq.clear(); // 값 모두 삭제
        pq.peek(); // 첫번째 값 출력
    }
}
