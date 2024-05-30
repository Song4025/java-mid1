package lang.immutable.address;

public class RefMain1_3 {
    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴트를 공유할 수 있다.
        Address a = new Address("서울");
        // 개발자가 확장성을 고려하지 않고 만약 이렇게 개발한다면?
        Address b = a;

        System.out.println("a "+a);
        System.out.println("b "+b);

        change(b, "부산");
        System.out.println("a "+a); // 부산
        System.out.println("b "+b); // 부산

        // 사이드이팩트 발생 -> 디버깅 어려워지고 코드 안정성이 저하됨.
    }

    private static void change(Address address, String changeAddress){
        System.out.println("주소값을 변경합니다 : "+ changeAddress);
        address.setValue(changeAddress);
    }
}
