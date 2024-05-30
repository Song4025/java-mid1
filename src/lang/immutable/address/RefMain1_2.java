package lang.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴트를 공유할 수 있다.
        Address a = new Address("서울"); // x001
        Address b = new Address("서울"); // x002

        System.out.println("a "+a);
        System.out.println("b "+b);

        b.setValue("부산");
        System.out.println("a "+a); // 서울
        System.out.println("b "+b); // 부산

        // 그러나 하나의 객체를 여러 변수가 공유하지 않도록 강제로 막을수 있는 방법은 없음. -> 자바문법상 문제가 없기때문
    }
}
