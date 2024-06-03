package lang.immutable.test;

public class MyDateMain {
    public static void main(String[] args) {
        // date1 = x001 date2 = x001
        ImmutableMyDate date1 = new ImmutableMyDate(2024, 1, 1);
        ImmutableMyDate date2 = date1;

        System.out.println("date1 = " +date1);
        System.out.println("date2 = " +date2);

        System.out.println("2025 -> date1");
        // date1.setYear(2028); 이건 사용하면안됨
        // date2 = new ImmutableMyDate(2028, 12,16); 이런방법도 있지만...
        // 반환값 무조건 받아야함.
        date1 = date1.withYear(2029); // x002
        System.out.println("date1 = " +date1);
        System.out.println("date2 = " +date2);
    }
}
