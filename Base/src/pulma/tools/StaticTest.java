package pulma.tools;

public class StaticTest {
    static int num;
    static {
        for (int i = 0; i < 100; i++) {
            num+=i;
        }
    }

    public static void main(String[] args) {
        System.out.println(num);
    }
}
