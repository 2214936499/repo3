package exercise;

import domain.Person;
import java.util.TreeSet;

public class exercise2 {

    public static void main(String[] args) {

        //使用lambda表达式来进行进阶,
        TreeSet<Person> list=new TreeSet<>((a,b)->a.getAge()-b.getAge());

        list.add(new Person(23,"小明"));

        list.add(new Person(25,"小红"));

        list.add(new Person(26,"悟空"));

        list.add(new Person(27,"短笛"));


        System.out.println(list);
    }
}
