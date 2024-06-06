package lang.wrapper;

public class AutoboxingMain1 {
    public static void main(String[] args) {
        // Primitive -> Wrapper
        int value = 9;
        Integer boxedValue = value; // autoboxing
        // Integer boxedValue = Integer.valueOf(value); 컴파일러 단계에서 추가

        // Wrapper -> Primitive
        int unboxedValue = boxedValue; // auto unboxing
        // int unboxedValue = boxedValue.intValue(); 컴파일러 단계에서 추가

        System.out.println(boxedValue+" "+unboxedValue);
    }
}
