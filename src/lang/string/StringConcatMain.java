package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello"; // x001
        String b = " java?"; // x002

        String result = a.concat(b);
        String result2 = a + b; // 참조값기리 더하기 불가능인데?
        System.out.println("result = " + result);
        System.out.println("result2 = " + result2); // 왜 되냐? -> 문자열을 너무 자주다루니까 자바에서 특별히 편의상 + 연산만 제공한다.
    }
}
