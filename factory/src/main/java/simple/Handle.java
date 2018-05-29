package simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import simple.base.BadFruitException;
import simple.base.Fruit;
import simple.base.FruitGardener;

public class Handle {
    private static Logger logger = LoggerFactory.getLogger(Handle.class);
    public static void main(String[] args) {
        try {
            Fruit apple = FruitGardener.factory("apple");
            Fruit grape = FruitGardener.factory("grape");
            Fruit strawberry = FruitGardener.factory("strawberry");
//            Fruit _123 = FruitGardener.factory("123");
            apple.grow();
            grape.grow();
            strawberry.grow();
        }catch (BadFruitException e){
            logger.error(e.getMessage());
        }
    }
}
