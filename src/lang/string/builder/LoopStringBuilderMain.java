package lang.string.builder;

public class LoopStringBuilderMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<100000; i++){
            sb.append("Hello Java ");
        }

        long endTime = System.currentTimeMillis();

        String result = sb.toString();
        System.out.println("result = "+result);
        System.out.println("time = "+(endTime - startTime)+ "ms");
        // 6605ms -> 5ms 로 줄어듬
        // 반복해서 문자를 연결할때, 조건문을 통해 동적으로 문자열을 조합할때, 복잡한 문자열의 특정 부분을 변경해야할때, 매우 긴 대용량의 문자열을 다룰때
    }
}
