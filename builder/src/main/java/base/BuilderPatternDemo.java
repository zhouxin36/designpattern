package base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BuilderPatternDemo {
    private static final Logger logger = LoggerFactory.getLogger(BuilderPatternDemo.class);
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        logger.info("Veg Meal");
        vegMeal.showItems();
        logger.info("Total Cost: {}",vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        logger.info("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        logger.info("Total Cost: {}",nonVegMeal.getCost());
    }
}
