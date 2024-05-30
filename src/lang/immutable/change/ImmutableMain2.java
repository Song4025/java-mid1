package lang.immutable.change;

public class ImmutableMain2 {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        ImmutableObj add = obj1.add(20);

        // 리턴값을 사용하지않으면????? 아무일도 일어나지 않는다.
        // 불변 객체에서 변경과 관련된 메서드들은 보통 객체를 새로 만들어서 반환하기 때문에 꼭!!! 리턴값을 받아야한다.
        System.out.println("obj1 " + obj1.getValue());
        System.out.println("add " + add.getValue());
    }
}
