package CodigMethod;

class StringMethod {

    public static void main(String[] args) {
        String str = "abcde";

        System.out.println(str.length()); // str의 길이 반환
        System.out.println(str.isEmpty()); // str 길이가 0이면 true, 아니면 false

        System.out.println(str.charAt(2)); // 인덱스로 문자 찾기
        System.out.println(str.indexOf("c")); // 문자로 첫번째 인덱스 찾기

        System.out.println(str.substring(2,4)); // 2~3위치의 문자열 "cd"반환
        System.out.println(str.substring(3)); // 3번 이후부터 끝까지의 문자열

        System.out.println(str.replace('b','l')); // 문자 변경
        System.out.println(str.equals("abcde")); // 비교해서 값을 포함하고있으면 true, 아니면 false

        System.out.println(str.contains("bc")); // str에 bc가 포함되어있는지의 여부
        System.out.println(str.split(" ")); // 띄어쓰기내로 분리된 함수내에 데이터로 문자 분리하여서 String[] 반환
        System.out.println(str.split("")); // 띄어쓰기 없는 문자열 한문자로 분리해서 String[]으로 반환

        System.out.println(str.trim()); // 앞뒤 공백 제거 문자열 사이 공백은 제거 x

        System.out.println(str.toLowerCase()); // 대문자를 소문자로 변경
        System.out.println(str.toUpperCase()); // 소문자를 대문자로 변경

        System.out.println(str.compareTo("abcdd"));

        // str과 abcdd가 같으면 0
        //str이 abcdd보다 사전순으로 앞이면 -1
        //str이 abcdd보다 사전순으로 뒤면 1
        //str과 abcdd가 마지막 문자만 다르면 마지막 문자의 사전순 차이 반환 (여기선 1)

        System.out.println(Integer.parseInt("300")); // 문자를 숫자로 변환
        System.out.println(Integer.toBinaryString(300)); // 숫자를 문자열로 반환

    }

}
