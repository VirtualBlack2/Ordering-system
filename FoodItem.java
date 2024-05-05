public class FoodItem extends RestaurantItem {
    public boolean isGluten;

    public FoodItem(String name, double price, boolean isGluten) {
        super(name, price);
        this.isGluten = isGluten;

    }

@Override
        public String toString() {
            return "Food Item: " + name + " | Price: $" + price + ", | Is Gluten: " + (isGluten ? "Yes" : "No");
        }
    }
