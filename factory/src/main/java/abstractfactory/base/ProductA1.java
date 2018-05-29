package abstractfactory.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductA1 implements ProductA{
    private static Logger logger = LoggerFactory.getLogger(ProductA1.class);
    public ProductA1(){
        logger.error("<>ProductA1被创建<>");
    }
}
