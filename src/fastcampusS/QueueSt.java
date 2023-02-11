package fastcampusS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class QueueConstrut<T>{
    List<T> list = new ArrayList<>();

    public void enqueue(T t) {
        list.add(t);
    }

    public T dequeue(T t) {
        if( list.isEmpty() ) {
            return null;
        }
        return list.remove(0);
    }

    public T getQueue(T t) {
        if( list.isEmpty() ) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public String toString() {
        return list + "";
    }
}

public class QueueSt {
    // 큐 가장 먼저 넣은 데이터를 가장먼저 꺼내는구조 -> 메시지큐,radis : 현실 : 줄을 서는 행위임.
    public static void main(String[] args) {
        QueueConstrut queueConstrut = new QueueConstrut();
        queueConstrut.enqueue(1);
        queueConstrut.enqueue(2);
        System.out.println(queueConstrut);
        queueConstrut.dequeue(1);
        queueConstrut.dequeue(2);
        System.out.println(queueConstrut);
    }
}
