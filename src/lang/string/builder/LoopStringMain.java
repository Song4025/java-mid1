package lang.string.builder;

public class LoopStringMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String result = "";
        for(int i = 0; i<100000; i++){
            result += " Hello Java ";
        }

        long endTime = System.currentTimeMillis();

        System.out.println("result = "+result);
        System.out.println("time = "+(endTime - startTime)+ "ms");
        // 자바가 최적화를 나름 하는데 for문은 어쩔수가없음. 100000개의 String객체를 생성하기 때문에
    }
}
