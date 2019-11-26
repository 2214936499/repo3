package FunctionalInterface;

/**
 * 用functonalInterface修饰,且抽象方法只有一个,这样的接口称为函数式接口,及lambda接口
 */
@FunctionalInterface
public interface MyFunction1 {
    int getValue(int a);
}
