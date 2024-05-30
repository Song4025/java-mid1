package lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("금천구");

        MemberV2 memberA = new MemberV2("회원a ", address);
        MemberV2 memberB = new MemberV2("회원b ", address);

        // 회원A, 회원B 의 처음 주소는 모두 서울
        System.out.println("memberA = "+memberA);
        System.out.println("memberB = "+memberB);

        // B만 서초구로 변경해라
        // 새로 온 개발자가 ..!!
        // memberB.getAddress().setValue("서초구"); //컴파일오류
        memberB.setAddress(new ImmutableAddress("서초구"));
        System.out.println("서초구 -> memberB.address");
        System.out.println("memberA = "+memberA);
        System.out.println("memberB = "+memberB);

    }
}
