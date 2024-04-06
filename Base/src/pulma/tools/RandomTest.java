package pulma.tools;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(3);
            System.out.println("The num is : "+num);
        }
    }
}
