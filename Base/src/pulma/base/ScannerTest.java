package pulma.base;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("请输入一个数字： ");
        int num =  sc.nextInt();
        System.out.println("输入的数字是："+num);

        System.out.println("请输入一个字符串： ");
        String str = sc.next();
        System.out.println("输入的文字是： "+str);
    }
}
