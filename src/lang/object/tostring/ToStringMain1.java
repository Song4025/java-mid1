package lang.object.tostring;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();
        //string() 반환값 출력
        System.out.println(string);

        // object를 직접 출력
        System.out.println(object);
    }
}
