package lang.string.method;

public class StringChangeMain2 {
    public static void main(String[] args) {
        String strWithSpace = "   Java Programing";
        System.out.println("소문자로 변환: " + strWithSpace.toLowerCase());
        System.out.println("대문자로 변환: " + strWithSpace.toUpperCase());
        System.out.println("공백제거1" + "'" + strWithSpace.trim() + "'");
        System.out.println("공백제거2" + "'" + strWithSpace.strip() + "'");
        System.out.println("앞공백제거" + "'" + strWithSpace.stripLeading() + "'");
        System.out.println("뒤공백제거" + "'" + strWithSpace.stripTrailing() + "'");
    }
}
