package lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address address = new Address("금천구");

        MemberV1 memberA = new MemberV1("회원a ", address);
        MemberV1 memberB = new MemberV1("회원b ", address);

        // 회원A, 회원B 의 처음 주소는 모두 서울
        System.out.println("memberA = "+memberA);
        System.out.println("memberB = "+memberB);
        
        // 그리고 수많은 코드들이 진행된 후 요구사항이 변경됬다.  B만 서초구로 변경해라

        // 새로 온 개발자가 ..!!
        memberB.getAddress().setValue("서초구");
        System.out.println("서초구 -> memberB.address");
        System.out.println("memberA = "+memberA);
        System.out.println("memberB = "+memberB);
    }
}
