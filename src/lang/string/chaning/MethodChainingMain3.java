package lang.string.chaning;

public class MethodChainingMain3 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();

        // 체인처럼 연결되서 메서드 체이닝
        int result = adder.add(1).add(2).add(3).getValue();

        System.out.println(result);

    }
}
