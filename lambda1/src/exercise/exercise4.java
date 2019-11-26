package exercise;

import domain.Person;

import java.util.ArrayList;
import java.util.ListIterator;

public class exercise4 {

    public static void main(String[] args) {

        ArrayList<Person> list = new ArrayList<Person>();

        list.add(new Person(23, "小明"));

        list.add(new Person(25, "小红"));

        list.add(new Person(26, "悟空"));

        list.add(new Person(27, "短笛"));

//        //集合框架删除元素,最好用迭代器
//        ListIterator<Person> it = list.listIterator();
//
//        while (it.hasNext()) {
//
//            Person next = it.next();
//
//            if (next.getAge() > 26) {
//                it.remove();
//            }
//        }


        //用lambda方式删除元素
        //将集合中每一个元素都带入到方法中,如果返回值为true,则删除元素,否则保留
        list.removeIf(a->a.getAge()>25);
        System.out.println(list);
    }
}
