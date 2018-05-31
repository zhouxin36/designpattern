package base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private final Logger logger = LoggerFactory.getLogger(Meal.class);
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item : items) {
            logger.info("Item : {}",item.name());
            logger.info("Packing : {}",item.packing().pack());
            logger.info("Price : {}",item.price());
        }
    }
}
