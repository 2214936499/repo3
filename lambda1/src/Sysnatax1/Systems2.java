package Sysnatax1;

import interfaces.LambdaNoneReturnSingleParameter;
import interfaces.LambdaReturnMutipleParameter;

public class Systems2 {
    public static void main(String[] args) {

        //语法精简
        LambdaReturnMutipleParameter lambdaReturnMutipleParameter = (int a, int b) -> {
            return a + b;
        };

        //精简省略参数类型声明
        LambdaReturnMutipleParameter lambdaReturnMutipleParameter1 = (a, b) -> {
            return a + b;
        };

        //在参数列表中只有一个参数,则（）和参数声明都可以省略
        LambdaNoneReturnSingleParameter lambdaNoneReturnSingleParameter=a->{
            System.out.println(a);
        };

        //如果方法体中只有一条语句,则方法体{}也可以省略
        LambdaNoneReturnSingleParameter lambdaNoneReturnSingleParameter1=a->System.out.println(a);


        //如果有返回值中,方法体中只有一个语句,则可以省略{}和return,return必须省略。
        LambdaReturnMutipleParameter lambdaReturnMutipleParameter2=(a,b)->a+b;

        int test = lambdaReturnMutipleParameter2.test(100, 50);

        System.out.println("复杂精简语法返回值是"+test);
    }
}
