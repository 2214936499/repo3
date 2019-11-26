package Sysnatax1;

import interfaces.MyFunction;

public class LambdaTest {

    public static void main(String[] args) {

        int op1 = getOp(5, 10, (a, b) -> {

            return (a + b) * 5;
        });

            System.out.println(op1);


        int op2 = getOp(10, 50, (a, b) -> a * 5 + b * 2);

        System.out.println(op2);
    }




    /**
     * 面向接口编程具体实现
     * @param a
     * @param b
     * @param myFunction
     * @return
     */
    public static int getOp(int a, int b, MyFunction myFunction){

        return myFunction.getValue(a,b);
    }
}
