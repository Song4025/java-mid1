package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        // Integer newInteger = new Integer(10); // 미래 삭제예정, 대신 value()를 사용
        Integer newInteger = Integer.valueOf(10); // x001
        Integer integerObj = Integer.valueOf(10); // x001  -128 ~ 127 자주 사용되는 숫자 값 재사용, 불변
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newInteger : "+ newInteger);
        System.out.println(integerObj);
        System.out.println(longObj);
        System.out.println(doubleObj);

        System.out.println("내부값 읽기: "+integerObj.intValue());
        System.out.println("Long내부값: "+longObj.longValue());

        System.out.println("비교");
        System.out.println("==: "+(newInteger == integerObj));
        System.out.println("equals: "+(newInteger.equals(integerObj)));
    }
}
