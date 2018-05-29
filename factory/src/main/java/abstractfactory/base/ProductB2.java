package abstractfactory.base;

import abstractfactory.Handle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductB2 implements ProductB{
    private static Logger logger = LoggerFactory.getLogger(ProductB2.class);
    public ProductB2(){
        logger.error("<>ProductB2被创建<>");
    }
}
