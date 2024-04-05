package pulma.base;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int num =  sc.nextInt();
        System.out.println("输入的数字是："+num);
    }
}
