package abstractfactory;

import abstractfactory.base.ConcreteCreator1;
import abstractfactory.base.Creator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import simple.base.BadFruitException;
import simple.base.Fruit;
import simple.base.FruitGardener;

public class Handle {
    private static Logger logger = LoggerFactory.getLogger(Handle.class);
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator1();
        creator.factoryA();
    }
}
