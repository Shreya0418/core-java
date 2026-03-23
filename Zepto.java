class Zepto {
    public static double search(String itemName) {
        double price = 0.0;
        if (itemName == "Lays") {
            price = 20;
            return price;
        } else if (itemName == "Sandwich Ice Cream") {
            price = 50;
            return price;
        } else if (itemName == "Moisturiser") {
            price = 100;
            return price;
        } else if (itemName == "Icecream Cake") {
            price = 150;
            return price;
        } else if (itemName == "Ramen") {
            price = 110;
            return price;
        } else if (itemName == "Body Wash") {
            price = 200;
            return price;
        } else if (itemName == "Hide and Seek") {
            price = 30;
            return price;
        } else if (itemName == "Burger") {
            price = 30;
            return price;
        } else if (itemName == "Amul Badam Shake") {
            price = 30;
            return price;
        } else if (itemName == "Butter Scotch Ice Cream") {
            price = 30;
            return price;
        } else if (itemName == "Hide and Seek") {
            price = 30;
            return price;
        } else if (itemName == "Potato Chips") {
            price = 20;
            return price;
        } else if (itemName == "Vanilla Ice Cream") {
            price = 60;
            return price;
        } else if (itemName == "Chocolate Biscuit") {
            price = 30;
            return price;
        } else if (itemName == "Milk Chocolate Bar") {
            price = 45;
            return price;
        } else if (itemName == "Orange Juice") {
            price = 50;
            return price;
        } else if (itemName == "Instant Noodles") {
            price = 15;
            return price;
        } else if (itemName == "Fresh Milk") {
            price = 28;
            return price;
        } else if (itemName == "Brown Bread") {
            price = 35;
            return price;
        } else if (itemName == "Apple") {
            price = 40;
            return price;
        } else if (itemName == "Potato") {
            price = 25;
            return price;
        } else if (itemName == "Butter") {
            price = 55;
            return price;
        } else if (itemName == "Paneer") {
            price = 90;
            return price;
        } else if (itemName == "Cheese Slices") {
            price = 70;
            return price;
        } else if (itemName == "Curd") {
            price = 32;
            return price;
        } else if (itemName == "Green Tea") {
            price = 120;
            return price;
        } else if (itemName == "Coffee Powder") {
            price = 150;
            return price;
        } else if (itemName == "Honey") {
            price = 180;
            return price;
        } else if (itemName == "Peanut Butter") {
            price = 200;
            return price;
        } else if (itemName == "Tomato Ketchup") {
            price = 65;
            return price;
        } else if (itemName == "Mayonnaise") {
            price = 85;
            return price;
        } else if (itemName == "Pasta") {
            price = 48;
            return price;
        } else if (itemName == "Oats") {
            price = 72;
            return price;
        } else if (itemName == "Cornflakes") {
            price = 95;
            return price;
        } else if (itemName == "Energy Drink") {
            price = 110;
            return price;
        } else if (itemName == "Coconut Water") {
            price = 38;
            return price;
        } else if (itemName == "Banana Chips") {
            price = 44;
            return price;
        } else if (itemName == "Popcorn") {
            price = 36;
            return price;
        } else if (itemName == "Cupcake") {
            price = 52;
            return price;
        } else if (itemName == "Muffin") {
            price = 58;
            return price;
        } else if (itemName == "Brownie") {
            price = 62;
            return price;
        } else if (itemName == "Sandwich") {
            price = 75;
            return price;
        } else if (itemName == "Pizza Base") {
            price = 80;
            return price;
        } else if (itemName == "Garlic Bread") {
            price = 68;
            return price;
        } else if (itemName == "Pickle") {
            price = 105;
            return price;
        } else if (itemName == "Jam") {
            price = 92;
            return price;
        } else if (itemName == "Sugar") {
            price = 42;
            return price;
        } else if (itemName == "Salt") {
            price = 18;
            return price;
        } else if (itemName == "Cooking Oil") {
            price = 140;
            return price;
        } else if (itemName == "Wheat Flour") {
            price = 135;
            return price;
        } else if (itemName == "Rice") {
            price = 160;
            return price;
        } else if (itemName == "Onion") {
            price = 34;
            return price;
        } else if (itemName == "Tomato") {
            price = 29;
            return price;
        } else if (itemName == "Carrot") {
            price = 26;
            return price;
        } else if (itemName == "Cabbage") {
            price = 24;
            return price;
        } else if (itemName == "Cauliflower") {
            price = 31;
            return price;
        } else if (itemName == "Grapes") {
            price = 88;
            return price;
        } else if (itemName == "Mango") {
            price = 98;
            return price;
        } else {
            System.out.println(itemName + "Not found");
        }
        return price;
    }
    public static double search(String itemName, int quantity) {
        double price = 0.0;

        if (itemName == "Lays") {
            price = 20 * quantity;
            return price;

        } else if (itemName == "Sandwich Ice Cream") {
            price = 50 * quantity;
            return price;

        } else if (itemName == "Moisturiser") {
            price = 100 * quantity;
            return price;

        } else if (itemName == "Icecream Cake") {
            price = 150 * quantity;
            return price;

        } else if (itemName == "Ramen") {
            price = 110 * quantity;
            return price;

        } else if (itemName == "Body Wash") {
            price = 200 * quantity;
            return price;

        } else if (itemName == "Hide and Seek") {
            price = 30 * quantity;
            return price;

        } else if (itemName == "Burger") {
            price = 30 * quantity;
            return price;

        } else if (itemName == "Amul Badam Shake") {
            price = 30 * quantity;
            return price;

        } else if (itemName == "Butter Scotch Ice Cream") {
            price = 30 * quantity;
            return price;

        } else if (itemName == "Potato Chips") {
            price = 20 * quantity;
            return price;

        } else if (itemName == "Vanilla Ice Cream") {
            price = 60 * quantity;
            return price;

        } else if (itemName == "Chocolate Biscuit") {
            price = 30 * quantity;
            return price;

        } else if (itemName == "Milk Chocolate Bar") {
            price = 45 * quantity;
            return price;

        } else if (itemName == "Orange Juice") {
            price = 50 * quantity;
            return price;

        } else if (itemName == "Instant Noodles") {
            price = 15 * quantity;
            return price;

        } else if (itemName == "Fresh Milk") {
            price = 28 * quantity;
            return price;

        } else if (itemName == "Brown Bread") {
            price = 35 * quantity;
            return price;

        } else if (itemName == "Apple") {
            price = 40 * quantity;
            return price;

        } else if (itemName == "Potato") {
            price = 25 * quantity;
            return price;

        } else if (itemName == "Butter") {
            price = 55 * quantity;
            return price;

        } else if (itemName == "Paneer") {
            price = 90 * quantity;
            return price;

        } else if (itemName == "Cheese Slices") {
            price = 70 * quantity;
            return price;

        } else if (itemName == "Curd") {
            price = 32 * quantity;
            return price;

        } else if (itemName == "Green Tea") {
            price = 120 * quantity;
            return price;

        } else if (itemName == "Coffee Powder") {
            price = 150 * quantity;
            return price;

        } else if (itemName == "Honey") {
            price = 180 * quantity;
            return price;

        } else if (itemName == "Peanut Butter") {
            price = 200 * quantity;
            return price;

        } else if (itemName == "Tomato Ketchup") {
            price = 65 * quantity;
            return price;

        } else if (itemName == "Mayonnaise") {
            price = 85 * quantity;
            return price;

        } else if (itemName == "Pasta") {
            price = 48 * quantity;
            return price;

        } else if (itemName == "Oats") {
            price = 72 * quantity;
            return price;

        } else if (itemName == "Cornflakes") {
            price = 95 * quantity;
            return price;

        } else if (itemName == "Energy Drink") {
            price = 110 * quantity;
            return price;

        } else if (itemName == "Coconut Water") {
            price = 38 * quantity;
            return price;

        } else if (itemName == "Banana Chips") {
            price = 44 * quantity;
            return price;

        } else if (itemName == "Popcorn") {
            price = 36 * quantity;
            return price;

        } else if (itemName == "Cupcake") {
            price = 52 * quantity;
            return price;

        } else if (itemName == "Muffin") {
            price = 58 * quantity;
            return price;

        } else if (itemName == "Brownie") {
            price = 62 * quantity;
            return price;

        } else if (itemName == "Sandwich") {
            price = 75 * quantity;
            return price;

        } else if (itemName == "Pizza Base") {
            price = 80 * quantity;
            return price;

        } else if (itemName == "Garlic Bread") {
            price = 68 * quantity;
            return price;

        } else if (itemName == "Pickle") {
            price = 105 * quantity;
            return price;

        } else if (itemName == "Jam") {
            price = 92 * quantity;
            return price;

        } else if (itemName == "Sugar") {
            price = 42 * quantity;
            return price;

        } else if (itemName == "Salt") {
            price = 18 * quantity;
            return price;

        } else if (itemName == "Cooking Oil") {
            price = 140 * quantity;
            return price;

        } else if (itemName == "Wheat Flour") {
            price = 135 * quantity;
            return price;

        } else if (itemName == "Rice") {
            price = 160 * quantity;
            return price;

        } else if (itemName == "Onion") {
            price = 34 * quantity;
            return price;

        } else if (itemName == "Tomato") {
            price = 29 * quantity;
            return price;

        } else if (itemName == "Carrot") {
            price = 26 * quantity;
            return price;

        } else if (itemName == "Cabbage") {
            price = 24 * quantity;
            return price;

        } else if (itemName == "Cauliflower") {
            price = 31 * quantity;
            return price;

        } else if (itemName == "Grapes") {
            price = 88 * quantity;
            return price;

        } else if (itemName == "Mango") {
            price = 98 * quantity;
            return price;
        } else {
            System.out.println(itemName + " Not found");

            return price;
        }
    }
}