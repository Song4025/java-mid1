package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";
        Integer integer1 = Integer.parseInt(str);
        System.out.println(integer1);

        // Integer -> int 언박싱
        int intValue = integer1.intValue();
        System.out.println(intValue);

        // int -> Integer 박싱
        Integer integer2 = Integer.valueOf(intValue);
        System.out.println(integer2);
    }
}
