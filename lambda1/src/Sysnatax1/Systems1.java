package Sysnatax1;

import interfaces.LambdaNoneReturnSingleParameter;
import interfaces.LambdaNonereturnParameter;
import interfaces.LambdaReturnMutipleParameter;

public class Systems1 {
    public static void main(String[] args) {

        //lambda表达式实现接口等于实现类
        //lambda是一个匿名函数
        //()参数列表
        //{}方法体:描述方法体
        //->:lambda运算符 ：读作goes to

        //无参数无返回
        LambdaNonereturnParameter lambdaNonereturnParameter=()->{
        System.out.println("我是lambda无参数无返回值！");
        };

        //有参数无返回值
        LambdaNoneReturnSingleParameter lambdaNoneReturnSingleParameter=(int a)->{
            System.out.println("lambda表达式有参数无返回值的是"+a);
        };

        lambdaNoneReturnSingleParameter.test(5);


        //有参数有返回值的lambda表达式
        LambdaReturnMutipleParameter lambdaReturnMutipleParameter=(int a,int b)->{
            return a+b;
        };

        int test = lambdaReturnMutipleParameter.test(5, 10);

        System.out.println("结果是"+test);

    }
}
