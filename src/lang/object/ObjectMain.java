package lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // toString()은 Object 클래스의 메서드 toString은 객체의대한 정보를 반환 lang.object.Child@776ec8df
        String string = child.toString();
        System.out.println(string);
    }
}
