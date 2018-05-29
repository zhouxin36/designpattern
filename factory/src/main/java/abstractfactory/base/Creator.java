package abstractfactory.base;

public interface Creator {
    /**
     * 产品等级结构A的工厂方法
     * @return
     */
    public ProductA factoryA();

    /**
     * 产品等级结构B的工厂方法
     * @return
     */
    public ProductB factoryB();
}
