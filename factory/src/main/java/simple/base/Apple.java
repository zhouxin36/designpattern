package simple.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Apple implements Fruit {
    private static Logger logger = LoggerFactory.getLogger(Apple.class);
    private int treeAge;

    public int getTreeAge() {
        return treeAge;
    }

    public void setTreeAge(int treeAge) {
        this.treeAge = treeAge;
    }

    @Override
    public void grow() {
        logger.info("Apple is growing...");
    }

    @Override
    public void harvest() {
        logger.info("Apple has been harvested.");
    }

    @Override
    public void plant() {
        logger.info("Apple has been planted.");
    }
}
