package exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class exercise3 {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();

        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10,11);

        list.forEach(System.out::println);

        list.forEach(ele->{
            if (ele%2==0){
                System.out.println("偶数是"+ele);
            }
        });
    }
}
