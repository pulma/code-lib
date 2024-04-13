package pulma.tools;

public class StringTest {
    public static void main(String[] args) {
        System.out.println("******************************************************");
        System.out.println("*********************length()");
        System.out.println("******************************************************");
        int length = "sdjlkfsdlkfsdlkfjlksdjflskdfj".length();
        System.out.println("the length of the string is :"+length);


        System.out.println("******************************************************");
        System.out.println("*********************concat()");
        System.out.println("******************************************************");
        String str1 = "hello";
        String str2 = "world";
        String str3 = str1.concat(str2);
        System.out.println(str1);//hello
        System.out.println(str2);//world
        System.out.println(str3);//helloworld


        System.out.println("******************************************************");
        System.out.println("*********************indexOf()");
        System.out.println("******************************************************");
        String hello = "Hello";
        String llo = "llo";
        int index = hello.indexOf(llo);
        System.out.println(index); //2


        System.out.println("******************************************************");
        System.out.println("*********************substring()");
        System.out.println("******************************************************");
        String helloworld = "helloworld";
        String substring = helloworld.substring(4, 7);
        System.out.println(substring);

        System.out.println("******************************************************");
        System.out.println("*********************split()");
        System.out.println("******************************************************");
        String s = "aaa,bbb,ccc";
        String[] split = s.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
    }
}
