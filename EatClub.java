class EatClub {

    public static double search(String itemName){

        double price = 0.0;

        if(itemName=="Classic Veg Wrap"){
            price = 67.45;
            return price;

        }else if(itemName=="Classic Chicken Wrap"){
            price = 82.30;
            return price;

        }else if(itemName=="Paneer Grilled Wrap"){
            price = 78.95;
            return price;

        }else if(itemName=="Egg Mayo Wrap"){
            price = 71.80;
            return price;

        }else if(itemName=="Spicy Veg Wrap"){
            price = 69.40;
            return price;

        }else if(itemName=="Spicy Chicken Wrap"){
            price = 88.75;
            return price;

        }else if(itemName=="Cheese Veg Wrap"){
            price = 74.20;
            return price;

        }else if(itemName=="Cheese Chicken Wrap"){
            price = 91.60;
            return price;

        }else if(itemName=="Veg Loaded Wrap"){
            price = 76.85;
            return price;

        }else if(itemName=="Chicken Loaded Wrap"){
            price = 96.30;
            return price;

        }else if(itemName=="Veg Club Sandwich"){
            price = 72.55;
            return price;

        }else if(itemName=="Chicken Club Sandwich"){
            price = 89.95;
            return price;

        }else if(itemName=="Paneer Club Sandwich"){
            price = 83.10;
            return price;

        }else if(itemName=="Egg Club Sandwich"){
            price = 75.65;
            return price;

        }else if(itemName=="Veg Cheese Sandwich"){
            price = 68.90;
            return price;

        }else if(itemName=="Chicken Cheese Sandwich"){
            price = 92.50;
            return price;

        }else if(itemName=="Paneer Cheese Sandwich"){
            price = 84.70;
            return price;

        }else if(itemName=="Egg Cheese Sandwich"){
            price = 73.80;
            return price;

        }else if(itemName=="Veg Toast Sandwich"){
            price = 66.40;
            return price;

        }else if(itemName=="Chicken Toast Sandwich"){
            price = 85.25;
            return price;

        }else if(itemName=="Paneer Toast Sandwich"){
            price = 79.60;
            return price;

        }else if(itemName=="Egg Toast Sandwich"){
            price = 70.30;
            return price;

        }else if(itemName=="Veg Delight Pizza"){
            price = 118.45;
            return price;

        }else if(itemName=="Chicken Delight Pizza"){
            price = 142.90;
            return price;

        }else if(itemName=="Paneer Delight Pizza"){
            price = 135.70;
            return price;

        }else if(itemName=="Cheese Burst Pizza"){
            price = 128.65;
            return price;

        }else if(itemName=="Veg Supreme Pizza"){
            price = 149.80;
            return price;

        }else if(itemName=="Chicken Supreme Pizza"){
            price = 168.20;
            return price;

        }else if(itemName=="Paneer Supreme Pizza"){
            price = 156.90;
            return price;

        }else if(itemName=="Veg Italian Pizza"){
            price = 139.55;
            return price;

        }else if(itemName=="Chicken Italian Pizza"){
            price = 174.40;
            return price;

        }else if(itemName=="Paneer Italian Pizza"){
            price = 161.35;
            return price;

        }else if(itemName=="Veg Crispy Burger"){
            price = 82.15;
            return price;

        }else if(itemName=="Chicken Crispy Burger"){
            price = 97.60;
            return price;

        }else if(itemName=="Paneer Crispy Burger"){
            price = 91.25;
            return price;

        }else if(itemName=="Egg Crispy Burger"){
            price = 85.70;
            return price;

        }else if(itemName=="Veg Cheese Burger"){
            price = 88.45;
            return price;

        }else if(itemName=="Chicken Cheese Burger"){
            price = 104.95;
            return price;

        }else if(itemName=="Paneer Cheese Burger"){
            price = 96.80;
            return price;

        }else if(itemName=="Egg Cheese Burger"){
            price = 89.40;
            return price;

        }else if(itemName=="Veg Crunch Burger"){
            price = 84.75;
            return price;

        }else if(itemName=="Chicken Crunch Burger"){
            price = 108.35;
            return price;

        }else if(itemName=="Paneer Crunch Burger"){
            price = 97.55;
            return price;

        }else if(itemName=="Egg Crunch Burger"){
            price = 90.65;
            return price;

        }else if(itemName=="Veg Snack Box"){
            price = 112.50;
            return price;

        }else if(itemName=="Chicken Snack Box"){
            price = 129.40;
            return price;

        }else if(itemName=="Paneer Snack Box"){
            price = 121.95;
            return price;

        }else if(itemName=="Egg Snack Box"){
            price = 109.80;
            return price;

        }else if(itemName=="Veg Party Box"){
            price = 168.75;
            return price;

        }else if(itemName=="Chicken Party Box"){
            price = 195.20;
            return price;

        }else if(itemName=="Paneer Party Box"){
            price = 182.60;
            return price;

        }else if(itemName=="Egg Party Box"){
            price = 159.95;
            return price;

        }else if(itemName=="Veg Mega Box"){
            price = 205.40;
            return price;

        }else if(itemName=="Chicken Mega Box"){
            price = 236.85;
            return price;

        }else if(itemName=="Paneer Mega Box"){
            price = 221.50;
            return price;

        }else if(itemName=="Egg Mega Box"){
            price = 198.35;
            return price;

        }else if(itemName=="Ultimate Feast Box"){
            price = 259.90;
            return price;

        }else{
            System.out.println(itemName + " Not found");
        }

        return price;
    }
	
	public static double search(String itemName, int quantity){

    double price = 0.0;

    if(itemName=="Classic Veg Wrap"){
        price = 67.45 * quantity;
        return price;

    }else if(itemName=="Classic Chicken Wrap"){
        price = 82.30 * quantity;
        return price;

    }else if(itemName=="Paneer Grilled Wrap"){
        price = 78.95 * quantity;
        return price;

    }else if(itemName=="Egg Mayo Wrap"){
        price = 71.80 * quantity;
        return price;

    }else if(itemName=="Spicy Veg Wrap"){
        price = 69.40 * quantity;
        return price;

    }else if(itemName=="Spicy Chicken Wrap"){
        price = 88.75 * quantity;
        return price;

    }else if(itemName=="Cheese Veg Wrap"){
        price = 74.20 * quantity;
        return price;

    }else if(itemName=="Cheese Chicken Wrap"){
        price = 91.60 * quantity;
        return price;

    }else if(itemName=="Veg Loaded Wrap"){
        price = 76.85 * quantity;
        return price;

    }else if(itemName=="Chicken Loaded Wrap"){
        price = 96.30 * quantity;
        return price;

    }else if(itemName=="Veg Club Sandwich"){
        price = 72.55 * quantity;
        return price;

    }else if(itemName=="Chicken Club Sandwich"){
        price = 89.95 * quantity;
        return price;

    }else if(itemName=="Paneer Club Sandwich"){
        price = 83.10 * quantity;
        return price;

    }else if(itemName=="Egg Club Sandwich"){
        price = 75.65 * quantity;
        return price;

    }else if(itemName=="Veg Cheese Sandwich"){
        price = 68.90 * quantity;
        return price;

    }else if(itemName=="Chicken Cheese Sandwich"){
        price = 92.50 * quantity;
        return price;

    }else if(itemName=="Paneer Cheese Sandwich"){
        price = 84.70 * quantity;
        return price;

    }else if(itemName=="Egg Cheese Sandwich"){
        price = 73.80 * quantity;
        return price;

    }else if(itemName=="Veg Toast Sandwich"){
        price = 66.40 * quantity;
        return price;

    }else if(itemName=="Chicken Toast Sandwich"){
        price = 85.25 * quantity;
        return price;

    }else if(itemName=="Paneer Toast Sandwich"){
        price = 79.60 * quantity;
        return price;

    }else if(itemName=="Egg Toast Sandwich"){
        price = 70.30 * quantity;
        return price;

    }else if(itemName=="Veg Delight Pizza"){
        price = 118.45 * quantity;
        return price;

    }else if(itemName=="Chicken Delight Pizza"){
        price = 142.90 * quantity;
        return price;

    }else if(itemName=="Paneer Delight Pizza"){
        price = 135.70 * quantity;
        return price;

    }else if(itemName=="Cheese Burst Pizza"){
        price = 128.65 * quantity;
        return price;

    }else if(itemName=="Veg Supreme Pizza"){
        price = 149.80 * quantity;
        return price;

    }else if(itemName=="Chicken Supreme Pizza"){
        price = 168.20 * quantity;
        return price;

    }else if(itemName=="Paneer Supreme Pizza"){
        price = 156.90 * quantity;
        return price;

    }else if(itemName=="Veg Italian Pizza"){
        price = 139.55 * quantity;
        return price;

    }else if(itemName=="Chicken Italian Pizza"){
        price = 174.40 * quantity;
        return price;

    }else if(itemName=="Paneer Italian Pizza"){
        price = 161.35 * quantity;
        return price;

    }else if(itemName=="Veg Crispy Burger"){
        price = 82.15 * quantity;
        return price;

    }else if(itemName=="Chicken Crispy Burger"){
        price = 97.60 * quantity;
        return price;

    }else if(itemName=="Paneer Crispy Burger"){
        price = 91.25 * quantity;
        return price;

    }else if(itemName=="Egg Crispy Burger"){
        price = 85.70 * quantity;
        return price;

    }else if(itemName=="Veg Cheese Burger"){
        price = 88.45 * quantity;
        return price;

    }else if(itemName=="Chicken Cheese Burger"){
        price = 104.95 * quantity;
        return price;

    }else if(itemName=="Paneer Cheese Burger"){
        price = 96.80 * quantity;
        return price;

    }else if(itemName=="Egg Cheese Burger"){
        price = 89.40 * quantity;
        return price;

    }else if(itemName=="Veg Crunch Burger"){
        price = 84.75 * quantity;
        return price;

    }else if(itemName=="Chicken Crunch Burger"){
        price = 108.35 * quantity;
        return price;

    }else if(itemName=="Paneer Crunch Burger"){
        price = 97.55 * quantity;
        return price;

    }else if(itemName=="Egg Crunch Burger"){
        price = 90.65 * quantity;
        return price;

    }else if(itemName=="Veg Snack Box"){
        price = 112.50 * quantity;
        return price;

    }else if(itemName=="Chicken Snack Box"){
        price = 129.40 * quantity;
        return price;

    }else if(itemName=="Paneer Snack Box"){
        price = 121.95 * quantity;
        return price;

    }else if(itemName=="Egg Snack Box"){
        price = 109.80 * quantity;
        return price;

    }else if(itemName=="Veg Party Box"){
        price = 168.75 * quantity;
        return price;

    }else if(itemName=="Chicken Party Box"){
        price = 195.20 * quantity;
        return price;

    }else if(itemName=="Paneer Party Box"){
        price = 182.60 * quantity;
        return price;

    }else if(itemName=="Egg Party Box"){
        price = 159.95 * quantity;
        return price;

    }else if(itemName=="Veg Mega Box"){
        price = 205.40 * quantity;
        return price;

    }else if(itemName=="Chicken Mega Box"){
        price = 236.85 * quantity;
        return price;

    }else if(itemName=="Paneer Mega Box"){
        price = 221.50 * quantity;
        return price;

    }else if(itemName=="Egg Mega Box"){
        price = 198.35 * quantity;
        return price;

    }else if(itemName=="Ultimate Feast Box"){
        price = 259.90 * quantity;
        return price;

    }else{
        System.out.println(itemName + " Not found");
    }

    return price;
}
}