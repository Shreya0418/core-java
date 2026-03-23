class FoodChow {

    public static double search(String itemName){

        double price = 0.0;

        if(itemName=="Street Veg Thali"){
            price = 64.45;
            return price;

        }else if(itemName=="Street Chicken Thali"){
            price = 86.70;
            return price;

        }else if(itemName=="Street Paneer Thali"){
            price = 79.55;
            return price;

        }else if(itemName=="Street Egg Thali"){
            price = 71.35;
            return price;

        }else if(itemName=="Veg Fry Rice Bowl"){
            price = 67.80;
            return price;

        }else if(itemName=="Chicken Fry Rice Bowl"){
            price = 92.60;
            return price;

        }else if(itemName=="Paneer Fry Rice Bowl"){
            price = 84.20;
            return price;

        }else if(itemName=="Egg Fry Rice Bowl"){
            price = 74.95;
            return price;

        }else if(itemName=="Veg Chilli Rice"){
            price = 69.40;
            return price;

        }else if(itemName=="Chicken Chilli Rice"){
            price = 98.15;
            return price;

        }else if(itemName=="Paneer Chilli Rice"){
            price = 88.70;
            return price;

        }else if(itemName=="Egg Chilli Rice"){
            price = 79.30;
            return price;

        }else if(itemName=="Veg Noodle Bowl"){
            price = 63.25;
            return price;

        }else if(itemName=="Chicken Noodle Bowl"){
            price = 89.55;
            return price;

        }else if(itemName=="Paneer Noodle Bowl"){
            price = 81.95;
            return price;

        }else if(itemName=="Egg Noodle Bowl"){
            price = 73.80;
            return price;

        }else if(itemName=="Veg Crispy Plate"){
            price = 82.40;
            return price;

        }else if(itemName=="Chicken Crispy Plate"){
            price = 104.90;
            return price;

        }else if(itemName=="Paneer Crispy Plate"){
            price = 96.65;
            return price;

        }else if(itemName=="Egg Crispy Plate"){
            price = 87.75;
            return price;

        }else if(itemName=="Veg Snack Meal"){
            price = 91.60;
            return price;

        }else if(itemName=="Chicken Snack Meal"){
            price = 113.40;
            return price;

        }else if(itemName=="Paneer Snack Meal"){
            price = 105.80;
            return price;

        }else if(itemName=="Egg Snack Meal"){
            price = 96.35;
            return price;

        }else if(itemName=="Veg Special Combo"){
            price = 118.70;
            return price;

        }else if(itemName=="Chicken Special Combo"){
            price = 142.85;
            return price;

        }else if(itemName=="Paneer Special Combo"){
            price = 134.55;
            return price;

        }else if(itemName=="Egg Special Combo"){
            price = 126.40;
            return price;

        }else if(itemName=="Veg Street Combo"){
            price = 102.75;
            return price;

        }else if(itemName=="Chicken Street Combo"){
            price = 127.30;
            return price;

        }else if(itemName=="Paneer Street Combo"){
            price = 119.45;
            return price;

        }else if(itemName=="Egg Street Combo"){
            price = 110.65;
            return price;

        }else if(itemName=="Veg Party Meal"){
            price = 148.25;
            return price;

        }else if(itemName=="Chicken Party Meal"){
            price = 174.60;
            return price;

        }else if(itemName=="Paneer Party Meal"){
            price = 162.35;
            return price;

        }else if(itemName=="Egg Party Meal"){
            price = 153.90;
            return price;

        }else if(itemName=="Veg Family Combo"){
            price = 185.45;
            return price;

        }else if(itemName=="Chicken Family Combo"){
            price = 218.30;
            return price;

        }else if(itemName=="Paneer Family Combo"){
            price = 204.75;
            return price;

        }else if(itemName=="Egg Family Combo"){
            price = 192.60;
            return price;

        }else if(itemName=="Veg Mega Feast"){
            price = 226.90;
            return price;

        }else if(itemName=="Chicken Mega Feast"){
            price = 258.75;
            return price;

        }else if(itemName=="Paneer Mega Feast"){
            price = 244.40;
            return price;

        }else if(itemName=="Egg Mega Feast"){
            price = 231.85;
            return price;

        }else if(itemName=="Veg Delight Meal"){
            price = 95.25;
            return price;

        }else if(itemName=="Chicken Delight Meal"){
            price = 118.80;
            return price;

        }else if(itemName=="Paneer Delight Meal"){
            price = 109.90;
            return price;

        }else if(itemName=="Egg Delight Meal"){
            price = 101.75;
            return price;

        }else if(itemName=="Veg Treat Box"){
            price = 132.60;
            return price;

        }else if(itemName=="Chicken Treat Box"){
            price = 156.95;
            return price;

        }else if(itemName=="Paneer Treat Box"){
            price = 147.40;
            return price;

        }else if(itemName=="Egg Treat Box"){
            price = 138.85;
            return price;

        }else if(itemName=="Veg Ultimate Meal"){
            price = 268.45;
            return price;

        }else if(itemName=="Chicken Ultimate Meal"){
            price = 299.70;
            return price;

        }else if(itemName=="Paneer Ultimate Meal"){
            price = 286.55;
            return price;

        }else if(itemName=="Egg Ultimate Meal"){
            price = 274.20;
            return price;

        }else if(itemName=="Chef Signature Feast"){
            price = 318.90;
            return price;

        }else{
            System.out.println(itemName + " Not found");
        }

        return price;
    }
	
	public static double search(String itemName, int quantity){

    double price = 0.0;

    if(itemName=="Street Veg Thali"){
        price = 64.45 * quantity;
        return price;

    }else if(itemName=="Street Chicken Thali"){
        price = 86.70 * quantity;
        return price;

    }else if(itemName=="Street Paneer Thali"){
        price = 79.55 * quantity;
        return price;

    }else if(itemName=="Street Egg Thali"){
        price = 71.35 * quantity;
        return price;

    }else if(itemName=="Veg Fry Rice Bowl"){
        price = 67.80 * quantity;
        return price;

    }else if(itemName=="Chicken Fry Rice Bowl"){
        price = 92.60 * quantity;
        return price;

    }else if(itemName=="Paneer Fry Rice Bowl"){
        price = 84.20 * quantity;
        return price;

    }else if(itemName=="Egg Fry Rice Bowl"){
        price = 74.95 * quantity;
        return price;

    }else if(itemName=="Veg Chilli Rice"){
        price = 69.40 * quantity;
        return price;

    }else if(itemName=="Chicken Chilli Rice"){
        price = 98.15 * quantity;
        return price;

    }else if(itemName=="Paneer Chilli Rice"){
        price = 88.70 * quantity;
        return price;

    }else if(itemName=="Egg Chilli Rice"){
        price = 79.30 * quantity;
        return price;

    }else if(itemName=="Veg Noodle Bowl"){
        price = 63.25 * quantity;
        return price;

    }else if(itemName=="Chicken Noodle Bowl"){
        price = 89.55 * quantity;
        return price;

    }else if(itemName=="Paneer Noodle Bowl"){
        price = 81.95 * quantity;
        return price;

    }else if(itemName=="Egg Noodle Bowl"){
        price = 73.80 * quantity;
        return price;

    }else if(itemName=="Veg Crispy Plate"){
        price = 82.40 * quantity;
        return price;

    }else if(itemName=="Chicken Crispy Plate"){
        price = 104.90 * quantity;
        return price;

    }else if(itemName=="Paneer Crispy Plate"){
        price = 96.65 * quantity;
        return price;

    }else if(itemName=="Egg Crispy Plate"){
        price = 87.75 * quantity;
        return price;

    }else if(itemName=="Veg Snack Meal"){
        price = 91.60 * quantity;
        return price;

    }else if(itemName=="Chicken Snack Meal"){
        price = 113.40 * quantity;
        return price;

    }else if(itemName=="Paneer Snack Meal"){
        price = 105.80 * quantity;
        return price;

    }else if(itemName=="Egg Snack Meal"){
        price = 96.35 * quantity;
        return price;

    }else if(itemName=="Veg Special Combo"){
        price = 118.70 * quantity;
        return price;

    }else if(itemName=="Chicken Special Combo"){
        price = 142.85 * quantity;
        return price;

    }else if(itemName=="Paneer Special Combo"){
        price = 134.55 * quantity;
        return price;

    }else if(itemName=="Egg Special Combo"){
        price = 126.40 * quantity;
        return price;

    }else if(itemName=="Veg Street Combo"){
        price = 102.75 * quantity;
        return price;

    }else if(itemName=="Chicken Street Combo"){
        price = 127.30 * quantity;
        return price;

    }else if(itemName=="Paneer Street Combo"){
        price = 119.45 * quantity;
        return price;

    }else if(itemName=="Egg Street Combo"){
        price = 110.65 * quantity;
        return price;

    }else if(itemName=="Veg Party Meal"){
        price = 148.25 * quantity;
        return price;

    }else if(itemName=="Chicken Party Meal"){
        price = 174.60 * quantity;
        return price;

    }else if(itemName=="Paneer Party Meal"){
        price = 162.35 * quantity;
        return price;

    }else if(itemName=="Egg Party Meal"){
        price = 153.90 * quantity;
        return price;

    }else if(itemName=="Veg Family Combo"){
        price = 185.45 * quantity;
        return price;

    }else if(itemName=="Chicken Family Combo"){
        price = 218.30 * quantity;
        return price;

    }else if(itemName=="Paneer Family Combo"){
        price = 204.75 * quantity;
        return price;

    }else if(itemName=="Egg Family Combo"){
        price = 192.60 * quantity;
        return price;

    }else if(itemName=="Veg Mega Feast"){
        price = 226.90 * quantity;
        return price;

    }else if(itemName=="Chicken Mega Feast"){
        price = 258.75 * quantity;
        return price;

    }else if(itemName=="Paneer Mega Feast"){
        price = 244.40 * quantity;
        return price;

    }else if(itemName=="Egg Mega Feast"){
        price = 231.85 * quantity;
        return price;

    }else if(itemName=="Veg Delight Meal"){
        price = 95.25 * quantity;
        return price;

    }else if(itemName=="Chicken Delight Meal"){
        price = 118.80 * quantity;
        return price;

    }else if(itemName=="Paneer Delight Meal"){
        price = 109.90 * quantity;
        return price;

    }else if(itemName=="Egg Delight Meal"){
        price = 101.75 * quantity;
        return price;

    }else if(itemName=="Veg Treat Box"){
        price = 132.60 * quantity;
        return price;

    }else if(itemName=="Chicken Treat Box"){
        price = 156.95 * quantity;
        return price;

    }else if(itemName=="Paneer Treat Box"){
        price = 147.40 * quantity;
        return price;

    }else if(itemName=="Egg Treat Box"){
        price = 138.85 * quantity;
        return price;

    }else if(itemName=="Veg Ultimate Meal"){
        price = 268.45 * quantity;
        return price;

    }else if(itemName=="Chicken Ultimate Meal"){
        price = 299.70 * quantity;
        return price;

    }else if(itemName=="Paneer Ultimate Meal"){
        price = 286.55 * quantity;
        return price;

    }else if(itemName=="Egg Ultimate Meal"){
        price = 274.20 * quantity;
        return price;

    }else if(itemName=="Chef Signature Feast"){
        price = 318.90 * quantity;
        return price;

    }else{
        System.out.println(itemName + " Not found");
    }

    return price;
}
}