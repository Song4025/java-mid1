package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("new String() == 비교 "+ (str1 == str2));
        // private final byte[] value; 에서 값을 비교해주므로 true를 반환시켜줌
        System.out.println("new String() equals 비교 "+ str1.equals(str2));

        String str3 = "hello"; // x003
        String str4 = "hello"; // x004
        System.out.println("리터럴 == 비교 "+(str3 == str4));
        System.out.println("리터럴 equals 비교 "+(str3.equals(str4)));
    }
}
