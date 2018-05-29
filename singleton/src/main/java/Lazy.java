/**
 * 懒汉式
 */
public class Lazy {
    private static Lazy lazy = null;
    /**
     * 私有的默认构造，保证外界无法直接实例化
     */
    private Lazy(){}
    /**
     * 静态工厂方法，返回此类的唯一实例
     */
    synchronized public static Lazy getInstance(){
        if(lazy == null){
            lazy = new Lazy();
        }
        return lazy;
    }
}
