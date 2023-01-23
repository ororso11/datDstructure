package CodigMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionsMethod {
    public static void main(String[] args) {
        int[] temp = { 1123, 1412, 23, 44, 512132 };
        // 이미 arrays는 temp의 값을 참조하고있기떄문에 temp.length 가능함
        List<Integer> list = Arrays.stream(temp).boxed().collect(Collectors.toList());

        Collections.max(list);
        Collections.min(list);
        Collections.sort(list); // 오름차순
        Collections.sort(list,Collections.reverseOrder()); // 내림차순
        Collections.reverse(list);

        System.out.println(Collections.binarySearch(list,44));

    }
}
