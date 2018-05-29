/**
 * 饿汉式
 */
public class Eager {
    private static final Eager eager = new Eager();
    /**
     * 私有的默认构造
     */
    private Eager(){}
    /**
     * 静态工厂方法
     */
    public static Eager getInstance(){
        return eager;
    }
}
