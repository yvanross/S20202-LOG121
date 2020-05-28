package PatronDecorateur.Coffee;

import PatronDecorateur.Repas.IIngredient;
import PatronDecorateur.Repas.Ingredient;

// Decorator WithSprinkles mixes sprinkles onto coffee.
// Note it extends CoffeeDecorator.
public class WithSprinkles extends Ingredient {
    public WithSprinkles(IIngredient ingredient,Double cost, String description) {
        super(ingredient,cost,description);
    }

    @Override
    public double getCost() {
        return super.getCost() + this.getCost();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", " + this.getDescription();
    }
}