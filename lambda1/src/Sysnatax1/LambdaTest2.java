package Sysnatax1;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * java8内置的接口
 * <p>
 * <p>
 * Consumer<T>
 */
public class LambdaTest2 {

    public static void main(String[] args) {


        //1.消费者接口
        happy(1000, (a) -> {
            double b = a - 10000;

            System.out.println("消费了这么多元" + b);
        });


        String op1 = getOp1("     我是救世主       ！！！！！！      ", str -> str.trim());

        System.out.println(op1);

    }

    //1.消费性接口1
    //加入git中
    public static void happy(double money, Consumer<Double> consumer) {

        consumer.accept(money);
    }

    public static String getOp1(String str, Function<String,String> fn){

        return fn.apply(str);
    }
}

