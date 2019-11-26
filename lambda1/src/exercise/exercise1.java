package exercise;

import domain.Person;

import java.util.ArrayList;
import java.util.List;

public class exercise1 {

    //方法进阶
    public static void main(String[] args) {

        //集合排序
        List<Person> list=new ArrayList<Person>();

        list.add(new Person(23,"小明"));

        list.add(new Person(25,"小红"));

        list.add(new Person(26,"悟空"));

        list.add(new Person(27,"短笛"));

        list.sort((a,b)->{
            return b.getAge()-a.getAge();
        });

        System.out.println(list);
    }
}
