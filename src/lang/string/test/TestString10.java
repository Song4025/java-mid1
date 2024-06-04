package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String str = "apple,banana,mango";
        String[] splitFruits = str.split(",");
        for (String fruit : splitFruits) {
            System.out.println(fruit);
        }
        //합치기
        String joinedString = String.join("->", splitFruits);
        System.out.println(joinedString);
    }
}
