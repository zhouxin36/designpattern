package abstractfactory.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductA2 implements ProductA{
    private static Logger logger = LoggerFactory.getLogger(ProductA2.class);
    public ProductA2(){
        logger.error("<>ProductA2被创建<>");
    }
}
