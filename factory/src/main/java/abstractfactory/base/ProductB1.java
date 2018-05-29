package abstractfactory.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductB1 implements ProductB{
    private static Logger logger = LoggerFactory.getLogger(ProductB1.class);
    public ProductB1(){
        logger.error("<>ProductB1被创建<>");
    }
}
