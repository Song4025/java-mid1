package lang.string.immutable;

public class StringImmutable1 {
    public static void main(String[] args) {
        // 왜 안합쳐지느냐? -> 불변객체를 잘 떠올려보자.
        String str = "hello";
        str.concat(" java");
        System.out.println("str = " + str);
    }
}
