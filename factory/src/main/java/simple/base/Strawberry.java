package simple.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Strawberry implements Fruit {
    private static Logger logger = LoggerFactory.getLogger(Strawberry.class);
    @Override
    public void grow() {
        logger.info("Strawberry is growing...");
    }

    @Override
    public void harvest() {
        logger.info("Strawberry has been harvested.");
    }

    @Override
    public void plant() {
        logger.info("Strawberry has been planted.");
    }
}
