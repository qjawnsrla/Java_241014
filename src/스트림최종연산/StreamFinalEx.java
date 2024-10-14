package 스트림최종연산;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 스트림의 최종 연산은 스트림의 각 요소를 소모하여 연산을 수행
// reduce() : 첫번째와 두번째 요소를 가지고 연산을 한 뒤, 그 결과를 세번째 요소와 다시 입력
public class StreamFinalEx {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("넷", "둘", "셋", "하나");
        Stream<String> stream2 = Stream.of("넷", "둘", "셋", "하나");
        IntStream stream3 = IntStream.of(1,2,3,4,5,6);

        Optional<String> rst = stream1.reduce((s1, s2) -> s1 + "++" + s2);
        rst.ifPresent(e->System.out.print(e + " "));

        // 정수의 합을 구하기
        OptionalInt rst2 = stream3.reduce((s1, s2) -> s1 + s2);
        System.out.println(rst2);

        // 요소의 통계
        // count() : 요소의 총 개수를 long 타입으로 변환
        // max(), min()
        IntStream stream4 = IntStream.of(50, 90, 70, 10);
        IntStream stream5 = IntStream.of(50, 90, 70, 10);
        IntStream stream6 = IntStream.of(50, 90, 70, 10);

        System.out.println(stream4.max());
        System.out.println(stream5.max());
        //System.out.println(stream5.min());
        System.out.println(stream6.min());
        System.out.println(stream6.sum());
    }
}
