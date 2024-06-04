package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index = str.indexOf(key);
        // false이면 -1을 반환하니까 0까지 찾게 while문을 돌림.
        while(index >= 0){
            index = str.indexOf(key, index + 1);
            System.out.println("index: "+index);
            count++;
        }
        System.out.println("count = "+count);
    }
}
