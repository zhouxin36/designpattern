package simple.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface Fruit {
    /**
     * 生长
     */
    void grow();

    /**
     *收货
     */
    void harvest();

    /**
     * 种植
     */
    void plant();
}
