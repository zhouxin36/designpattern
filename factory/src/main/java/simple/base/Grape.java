package simple.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 葡萄
 */
public class Grape implements Fruit{
    private static Logger logger = LoggerFactory.getLogger(Grape.class);
    //有籽和无籽
    private boolean seedless;

    public boolean isSeedless() {
        return seedless;
    }

    public void setSeedless(boolean seedless) {
        this.seedless = seedless;
    }

    @Override
    public void grow() {
        logger.info("Grape is growing...");
    }

    @Override
    public void harvest() {
        logger.info("Grape has been harvested.");
    }

    @Override
    public void plant() {
        logger.info("Grape has been planted.");
    }
}
