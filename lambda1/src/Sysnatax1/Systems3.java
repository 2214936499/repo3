package Sysnatax1;

import interfaces.LambdaReturnSingleParameter;

public class Systems3 {
    public static void main(String[] args) {

        //单个参数列表有返回值的
        LambdaReturnSingleParameter lambdaReturnSingleParameter=a ->a*2;

        int test = lambdaReturnSingleParameter.test(10);

        System.out.println("单参数单返回值"+test);


        //lambda调用方法

        LambdaReturnSingleParameter fambdaReturnSingleParameter =a -> change(a);

        int test1 = fambdaReturnSingleParameter.test(5);

        System.out.println("lambda表达式调用外部方法是"+test1);

    }

    //lambda表达式引用
    //用= 类名::方法直接引用方法
    LambdaReturnSingleParameter lambdaReturnSingleParameter =Systems3::change;

    public  static  int change(int a){

        return  (a+3)*5;
    }


}
