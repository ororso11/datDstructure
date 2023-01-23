package CodigMethod;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMethod {
    // 클래스 이름과 키워드 이름은 동일시 하면안된다.

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,4,3,5,1,23,5,1));

        list.add("서울");
        list.add(1,"대전");

        list.addAll(list2);

        list.get(0); // 0번째 index 반환
        list.set(0,"대구");

        list.indexOf("대구"); // 대구의 첫번째 인덱스 반환
        list.lastIndexOf("대구"); // 대구의 마지막 index 반환

        list.remove(0);
        list.remove("대구");
        list.removeAll(list2); // list에서 list2의 있는 모든값을 제외
        list.retainAll(list2); // list에서 list2안에 있는값을 제외한 모든 값 제외

        list.clear(); // 전체 값 삭제
        list.isEmpty(); // 길이가 0이면 true, 아니면 false
        list.size();

        list.contains("서울"); // 서울이 list에 있으면 true, 없으면 false;
        list.containsAll(list2); // list안에 list2의 모든값이 포함되어있으면 true;

        // 인자가 없으면 에러나니깐 무조건 받아줘야한다.
        list3.removeIf(k -> k % 2 != 0); // 람다식으로 홀수를 list에서 모두 제거

        // 배열 <-> 리스트 변환
        String[] temp = {"a","b","c"};
        List<String> listC = new ArrayList<>(Arrays.asList(temp));

        // List를 문자열 배열로 변환
        List<String> listCC = new ArrayList<>();
        String[] temoC = listC.toArray(new String[list.size()]);

        // 정수 배열을 List로 변환
        int[] tempInt = {1123,1412,23,44,15123};
        List<int[]> listInt = new ArrayList<>(Arrays.asList(tempInt));

        List<Integer> listAr = new ArrayList<>();
        /*int[] tempStream = list.stream().mapToInt(i->i).toArray()*/;

    }
}
