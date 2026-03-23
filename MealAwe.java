class MealAwe {

    public static double search(String itemName){

        double price = 0.0;

        if(itemName=="Veg Power Bowl"){
            price = 72.35;
            return price;

        }else if(itemName=="Chicken Protein Bowl"){
            price = 86.45;
            return price;

        }else if(itemName=="Paneer Protein Bowl"){
            price = 81.20;
            return price;

        }else if(itemName=="Egg Protein Bowl"){
            price = 74.80;
            return price;

        }else if(itemName=="Mushroom Delight Bowl"){
            price = 69.95;
            return price;

        }else if(itemName=="Tofu Health Bowl"){
            price = 83.55;
            return price;

        }else if(itemName=="Grilled Veg Bowl"){
            price = 76.40;
            return price;

        }else if(itemName=="Grilled Chicken Bowl"){
            price = 91.35;
            return price;

        }else if(itemName=="Spicy Paneer Bowl"){
            price = 84.60;
            return price;

        }else if(itemName=="Herb Rice Bowl"){
            price = 71.90;
            return price;

        }else if(itemName=="Lemon Rice Bowl"){
            price = 65.75;
            return price;

        }else if(itemName=="Curd Rice Bowl"){
            price = 62.40;
            return price;

        }else if(itemName=="Veg Tikka Bowl"){
            price = 78.95;
            return price;

        }else if(itemName=="Chicken Tandoori Bowl"){
            price = 93.50;
            return price;

        }else if(itemName=="Paneer Tandoori Bowl"){
            price = 88.25;
            return price;

        }else if(itemName=="Masala Egg Bowl"){
            price = 73.10;
            return price;

        }else if(itemName=="Veg Fitness Meal"){
            price = 96.35;
            return price;

        }else if(itemName=="Chicken Fitness Meal"){
            price = 112.60;
            return price;

        }else if(itemName=="Paneer Fitness Meal"){
            price = 104.20;
            return price;

        }else if(itemName=="Egg Fitness Meal"){
            price = 89.75;
            return price;

        }else if(itemName=="Healthy Veg Combo"){
            price = 118.45;
            return price;

        }else if(itemName=="Healthy Chicken Combo"){
            price = 134.80;
            return price;

        }else if(itemName=="Healthy Paneer Combo"){
            price = 126.55;
            return price;

        }else if(itemName=="Healthy Egg Combo"){
            price = 111.35;
            return price;

        }else if(itemName=="Veg Diet Plate"){
            price = 79.20;
            return price;

        }else if(itemName=="Chicken Diet Plate"){
            price = 95.60;
            return price;

        }else if(itemName=="Paneer Diet Plate"){
            price = 87.40;
            return price;

        }else if(itemName=="Egg Diet Plate"){
            price = 72.90;
            return price;

        }else if(itemName=="Veg Wellness Bowl"){
            price = 82.15;
            return price;

        }else if(itemName=="Chicken Wellness Bowl"){
            price = 98.70;
            return price;

        }else if(itemName=="Paneer Wellness Bowl"){
            price = 90.55;
            return price;

        }else if(itemName=="Egg Wellness Bowl"){
            price = 76.30;
            return price;

        }else if(itemName=="Veg Energy Meal"){
            price = 103.45;
            return price;

        }else if(itemName=="Chicken Energy Meal"){
            price = 118.90;
            return price;

        }else if(itemName=="Paneer Energy Meal"){
            price = 110.65;
            return price;

        }else if(itemName=="Egg Energy Meal"){
            price = 97.80;
            return price;

        }else if(itemName=="Veg Smart Meal"){
            price = 92.40;
            return price;

        }else if(itemName=="Chicken Smart Meal"){
            price = 108.75;
            return price;

        }else if(itemName=="Paneer Smart Meal"){
            price = 101.20;
            return price;

        }else if(itemName=="Egg Smart Meal"){
            price = 86.95;
            return price;

        }else if(itemName=="Veg Balanced Bowl"){
            price = 88.60;
            return price;

        }else if(itemName=="Chicken Balanced Bowl"){
            price = 104.85;
            return price;

        }else if(itemName=="Paneer Balanced Bowl"){
            price = 96.30;
            return price;

        }else if(itemName=="Egg Balanced Bowl"){
            price = 82.70;
            return price;

        }else if(itemName=="Veg Nutri Bowl"){
            price = 91.50;
            return price;

        }else if(itemName=="Chicken Nutri Bowl"){
            price = 107.95;
            return price;

        }else if(itemName=="Paneer Nutri Bowl"){
            price = 99.40;
            return price;

        }else if(itemName=="Egg Nutri Bowl"){
            price = 84.85;
            return price;

        }else if(itemName=="Veg Light Meal"){
            price = 73.60;
            return price;

        }else if(itemName=="Chicken Light Meal"){
            price = 89.15;
            return price;

        }else if(itemName=="Paneer Light Meal"){
            price = 81.90;
            return price;

        }else if(itemName=="Egg Light Meal"){
            price = 70.55;
            return price;

        }else if(itemName=="Veg Family Meal"){
            price = 145.35;
            return price;

        }else if(itemName=="Chicken Family Meal"){
            price = 168.90;
            return price;

        }else if(itemName=="Paneer Family Meal"){
            price = 158.40;
            return price;

        }else if(itemName=="Egg Family Meal"){
            price = 139.75;
            return price;

        }else if(itemName=="Protein Mega Meal"){
            price = 182.60;
            return price;

        }else{
            System.out.println(itemName + " Not found");
        }

        return price;
    }
	
	public static double search(String itemName, int quantity){

    double price = 0.0;

    if(itemName=="Veg Power Bowl"){
        price = 72.35 * quantity;
        return price;

    }else if(itemName=="Chicken Protein Bowl"){
        price = 86.45 * quantity;
        return price;

    }else if(itemName=="Paneer Protein Bowl"){
        price = 81.20 * quantity;
        return price;

    }else if(itemName=="Egg Protein Bowl"){
        price = 74.80 * quantity;
        return price;

    }else if(itemName=="Mushroom Delight Bowl"){
        price = 69.95 * quantity;
        return price;

    }else if(itemName=="Tofu Health Bowl"){
        price = 83.55 * quantity;
        return price;

    }else if(itemName=="Grilled Veg Bowl"){
        price = 76.40 * quantity;
        return price;

    }else if(itemName=="Grilled Chicken Bowl"){
        price = 91.35 * quantity;
        return price;

    }else if(itemName=="Spicy Paneer Bowl"){
        price = 84.60 * quantity;
        return price;

    }else if(itemName=="Herb Rice Bowl"){
        price = 71.90 * quantity;
        return price;

    }else if(itemName=="Lemon Rice Bowl"){
        price = 65.75 * quantity;
        return price;

    }else if(itemName=="Curd Rice Bowl"){
        price = 62.40 * quantity;
        return price;

    }else if(itemName=="Veg Tikka Bowl"){
        price = 78.95 * quantity;
        return price;

    }else if(itemName=="Chicken Tandoori Bowl"){
        price = 93.50 * quantity;
        return price;

    }else if(itemName=="Paneer Tandoori Bowl"){
        price = 88.25 * quantity;
        return price;

    }else if(itemName=="Masala Egg Bowl"){
        price = 73.10 * quantity;
        return price;

    }else if(itemName=="Veg Fitness Meal"){
        price = 96.35 * quantity;
        return price;

    }else if(itemName=="Chicken Fitness Meal"){
        price = 112.60 * quantity;
        return price;

    }else if(itemName=="Paneer Fitness Meal"){
        price = 104.20 * quantity;
        return price;

    }else if(itemName=="Egg Fitness Meal"){
        price = 89.75 * quantity;
        return price;

    }else if(itemName=="Healthy Veg Combo"){
        price = 118.45 * quantity;
        return price;

    }else if(itemName=="Healthy Chicken Combo"){
        price = 134.80 * quantity;
        return price;

    }else if(itemName=="Healthy Paneer Combo"){
        price = 126.55 * quantity;
        return price;

    }else if(itemName=="Healthy Egg Combo"){
        price = 111.35 * quantity;
        return price;

    }else if(itemName=="Veg Diet Plate"){
        price = 79.20 * quantity;
        return price;

    }else if(itemName=="Chicken Diet Plate"){
        price = 95.60 * quantity;
        return price;

    }else if(itemName=="Paneer Diet Plate"){
        price = 87.40 * quantity;
        return price;

    }else if(itemName=="Egg Diet Plate"){
        price = 72.90 * quantity;
        return price;

    }else if(itemName=="Veg Wellness Bowl"){
        price = 82.15 * quantity;
        return price;

    }else if(itemName=="Chicken Wellness Bowl"){
        price = 98.70 * quantity;
        return price;

    }else if(itemName=="Paneer Wellness Bowl"){
        price = 90.55 * quantity;
        return price;

    }else if(itemName=="Egg Wellness Bowl"){
        price = 76.30 * quantity;
        return price;

    }else if(itemName=="Veg Energy Meal"){
        price = 103.45 * quantity;
        return price;

    }else if(itemName=="Chicken Energy Meal"){
        price = 118.90 * quantity;
        return price;

    }else if(itemName=="Paneer Energy Meal"){
        price = 110.65 * quantity;
        return price;

    }else if(itemName=="Egg Energy Meal"){
        price = 97.80 * quantity;
        return price;

    }else if(itemName=="Veg Smart Meal"){
        price = 92.40 * quantity;
        return price;

    }else if(itemName=="Chicken Smart Meal"){
        price = 108.75 * quantity;
        return price;

    }else if(itemName=="Paneer Smart Meal"){
        price = 101.20 * quantity;
        return price;

    }else if(itemName=="Egg Smart Meal"){
        price = 86.95 * quantity;
        return price;

    }else if(itemName=="Veg Balanced Bowl"){
        price = 88.60 * quantity;
        return price;

    }else if(itemName=="Chicken Balanced Bowl"){
        price = 104.85 * quantity;
        return price;

    }else if(itemName=="Paneer Balanced Bowl"){
        price = 96.30 * quantity;
        return price;

    }else if(itemName=="Egg Balanced Bowl"){
        price = 82.70 * quantity;
        return price;

    }else if(itemName=="Veg Nutri Bowl"){
        price = 91.50 * quantity;
        return price;

    }else if(itemName=="Chicken Nutri Bowl"){
        price = 107.95 * quantity;
        return price;

    }else if(itemName=="Paneer Nutri Bowl"){
        price = 99.40 * quantity;
        return price;

    }else if(itemName=="Egg Nutri Bowl"){
        price = 84.85 * quantity;
        return price;

    }else if(itemName=="Veg Light Meal"){
        price = 73.60 * quantity;
        return price;

    }else if(itemName=="Chicken Light Meal"){
        price = 89.15 * quantity;
        return price;

    }else if(itemName=="Paneer Light Meal"){
        price = 81.90 * quantity;
        return price;

    }else if(itemName=="Egg Light Meal"){
        price = 70.55 * quantity;
        return price;

    }else if(itemName=="Veg Family Meal"){
        price = 145.35 * quantity;
        return price;

    }else if(itemName=="Chicken Family Meal"){
        price = 168.90 * quantity;
        return price;

    }else if(itemName=="Paneer Family Meal"){
        price = 158.40 * quantity;
        return price;

    }else if(itemName=="Egg Family Meal"){
        price = 139.75 * quantity;
        return price;

    }else if(itemName=="Protein Mega Meal"){
        price = 182.60 * quantity;
        return price;

    }else{
        System.out.println(itemName + " Not found");
    }

    return price;
}
	
}