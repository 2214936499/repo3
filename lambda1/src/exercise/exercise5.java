package exercise;

public class exercise5 {

    public static void main(String[] args) {
        //需求:开辟一个线程,实现数字的输出
        //集成thread类和实现runable接口来实现

        Thread thread=new Thread(()->{

            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        });

        thread.start();
    }
}
