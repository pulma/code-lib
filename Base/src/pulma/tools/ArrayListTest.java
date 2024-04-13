package pulma.tools;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //添加一个元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);

        //获取一个元素
        System.out.println(list.get(2));

        //删除一个元素
        list.remove(2);
        System.out.println(list.get(2));

        //获取元素个数
        System.out.println("集合的长度是： "+ list.size());

        //遍历集合
        System.out.println("开始遍历集合1：");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //遍历集合
        System.out.println("开始遍历集合2：");
        for (String item:list) {
            System.out.println(item);
        }

        //处理基础类型，使用包装类
        ArrayList<Integer> list2 = new ArrayList<>();
        //自动装箱
        list2.add(100);
        list2.add(200);
        list2.add(300);
        list2.add(400);
        System.out.println(list2);

        //自动拆箱
        int num = list2.get(2);
        System.out.println(num);

    }
}
