package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴트를 공유할 수 있다.
        ImmutableAddress a = new ImmutableAddress("서울"); // x001
        ImmutableAddress b = a; // 참조값 대입을 막을 수 있는 방법은 없다. // x001

        System.out.println("a "+a);
        System.out.println("b "+b);

        b = new ImmutableAddress("부산");
        System.out.println("a "+a); // 부산
        System.out.println("b "+b); // 부산

        // 사이드이팩트 발생 -> 디버깅 어려워지고 코드 안정성이 저하됨.
    }
}
