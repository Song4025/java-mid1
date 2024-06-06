package lang.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {
        int iterations = 1_000_000_000; // 반복횟수설정
        Long startTime, endTime;

        // 기본형 long 사용
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for(int i = 0; i < iterations; i++){
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println(sumPrimitive);
        System.out.println(endTime - startTime+"ms");

        // 래퍼클래스
        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for(int i = 0; i < iterations; i++){
            sumWrapper += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println(sumWrapper);
        System.out.println(endTime - startTime+"ms");
    }
}
