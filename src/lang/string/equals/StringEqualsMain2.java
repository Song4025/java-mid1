package lang.string.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("메서드 호출비교1 = " +isSame(str1, str2));
        String str3 = "hello"; // x003
        String str4 = "hello"; // x004
        System.out.println("메서드 호출비교2 = " +isSame(str3, str4));
    }

    private static boolean isSame(String x, String y){
        // 넘어오는 값이 new String()일지 리터럴일지 메서드만드는 개발자는 알수없음. 절대 ==으로 사용하면 안됨.
        // return x == y;
        return x.equals(y);
    }
}
