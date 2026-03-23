class Cookr {

    public static double search(String itemName){

        double price = 0.0;

        if(itemName=="Homestyle Veg Meal"){
            price = 74.35;
            return price;

        }else if(itemName=="Homestyle Chicken Meal"){
            price = 92.40;
            return price;

        }else if(itemName=="Homestyle Paneer Meal"){
            price = 88.75;
            return price;

        }else if(itemName=="Homestyle Egg Meal"){
            price = 79.60;
            return price;

        }else if(itemName=="Veg Curry Plate"){
            price = 68.45;
            return price;

        }else if(itemName=="Chicken Curry Plate"){
            price = 95.25;
            return price;

        }else if(itemName=="Paneer Curry Plate"){
            price = 90.55;
            return price;

        }else if(itemName=="Egg Curry Plate"){
            price = 83.15;
            return price;

        }else if(itemName=="Veg Masala Plate"){
            price = 72.80;
            return price;

        }else if(itemName=="Chicken Masala Plate"){
            price = 101.30;
            return price;

        }else if(itemName=="Paneer Masala Plate"){
            price = 96.45;
            return price;

        }else if(itemName=="Egg Masala Plate"){
            price = 86.70;
            return price;

        }else if(itemName=="Veg Rice Plate"){
            price = 66.20;
            return price;

        }else if(itemName=="Chicken Rice Plate"){
            price = 94.60;
            return price;

        }else if(itemName=="Paneer Rice Plate"){
            price = 89.75;
            return price;

        }else if(itemName=="Egg Rice Plate"){
            price = 80.40;
            return price;

        }else if(itemName=="Veg Lunch Box"){
            price = 112.35;
            return price;

        }else if(itemName=="Chicken Lunch Box"){
            price = 136.50;
            return price;

        }else if(itemName=="Paneer Lunch Box"){
            price = 128.80;
            return price;

        }else if(itemName=="Egg Lunch Box"){
            price = 118.25;
            return price;

        }else if(itemName=="Veg Dinner Box"){
            price = 125.40;
            return price;

        }else if(itemName=="Chicken Dinner Box"){
            price = 149.75;
            return price;

        }else if(itemName=="Paneer Dinner Box"){
            price = 141.95;
            return price;

        }else if(itemName=="Egg Dinner Box"){
            price = 132.20;
            return price;

        }else if(itemName=="Veg Comfort Meal"){
            price = 85.60;
            return price;

        }else if(itemName=="Chicken Comfort Meal"){
            price = 108.45;
            return price;

        }else if(itemName=="Paneer Comfort Meal"){
            price = 102.75;
            return price;

        }else if(itemName=="Egg Comfort Meal"){
            price = 91.55;
            return price;

        }else if(itemName=="Veg Deluxe Plate"){
            price = 97.35;
            return price;

        }else if(itemName=="Chicken Deluxe Plate"){
            price = 118.60;
            return price;

        }else if(itemName=="Paneer Deluxe Plate"){
            price = 111.90;
            return price;

        }else if(itemName=="Egg Deluxe Plate"){
            price = 101.25;
            return price;

        }else if(itemName=="Veg Feast Plate"){
            price = 132.75;
            return price;

        }else if(itemName=="Chicken Feast Plate"){
            price = 158.40;
            return price;

        }else if(itemName=="Paneer Feast Plate"){
            price = 147.65;
            return price;

        }else if(itemName=="Egg Feast Plate"){
            price = 139.20;
            return price;

        }else if(itemName=="Veg Combo Plate"){
            price = 104.55;
            return price;

        }else if(itemName=="Chicken Combo Plate"){
            price = 126.90;
            return price;

        }else if(itemName=="Paneer Combo Plate"){
            price = 118.30;
            return price;

        }else if(itemName=="Egg Combo Plate"){
            price = 109.75;
            return price;

        }else if(itemName=="Veg Tiffin Box"){
            price = 83.40;
            return price;

        }else if(itemName=="Chicken Tiffin Box"){
            price = 101.60;
            return price;

        }else if(itemName=="Paneer Tiffin Box"){
            price = 96.25;
            return price;

        }else if(itemName=="Egg Tiffin Box"){
            price = 88.95;
            return price;

        }else if(itemName=="Veg Family Pack"){
            price = 178.30;
            return price;

        }else if(itemName=="Chicken Family Pack"){
            price = 214.75;
            return price;

        }else if(itemName=="Paneer Family Pack"){
            price = 198.40;
            return price;

        }else if(itemName=="Egg Family Pack"){
            price = 184.90;
            return price;

        }else if(itemName=="Veg Grand Meal"){
            price = 222.60;
            return price;

        }else if(itemName=="Chicken Grand Meal"){
            price = 258.45;
            return price;

        }else if(itemName=="Paneer Grand Meal"){
            price = 243.75;
            return price;

        }else if(itemName=="Egg Grand Meal"){
            price = 229.35;
            return price;

        }else if(itemName=="Chef Special Meal"){
            price = 268.90;
            return price;

        }else{
            System.out.println(itemName + " Not found");
        }

        return price;
    }
	
	public static double search(String itemName, int quantity){

    double price = 0.0;

    if(itemName=="Homestyle Veg Meal"){
        price = 74.35 * quantity;
        return price;

    }else if(itemName=="Homestyle Chicken Meal"){
        price = 92.40 * quantity;
        return price;

    }else if(itemName=="Homestyle Paneer Meal"){
        price = 88.75 * quantity;
        return price;

    }else if(itemName=="Homestyle Egg Meal"){
        price = 79.60 * quantity;
        return price;

    }else if(itemName=="Veg Curry Plate"){
        price = 68.45 * quantity;
        return price;

    }else if(itemName=="Chicken Curry Plate"){
        price = 95.25 * quantity;
        return price;

    }else if(itemName=="Paneer Curry Plate"){
        price = 90.55 * quantity;
        return price;

    }else if(itemName=="Egg Curry Plate"){
        price = 83.15 * quantity;
        return price;

    }else if(itemName=="Veg Masala Plate"){
        price = 72.80 * quantity;
        return price;

    }else if(itemName=="Chicken Masala Plate"){
        price = 101.30 * quantity;
        return price;

    }else if(itemName=="Paneer Masala Plate"){
        price = 96.45 * quantity;
        return price;

    }else if(itemName=="Egg Masala Plate"){
        price = 86.70 * quantity;
        return price;

    }else if(itemName=="Veg Rice Plate"){
        price = 66.20 * quantity;
        return price;

    }else if(itemName=="Chicken Rice Plate"){
        price = 94.60 * quantity;
        return price;

    }else if(itemName=="Paneer Rice Plate"){
        price = 89.75 * quantity;
        return price;

    }else if(itemName=="Egg Rice Plate"){
        price = 80.40 * quantity;
        return price;

    }else if(itemName=="Veg Lunch Box"){
        price = 112.35 * quantity;
        return price;

    }else if(itemName=="Chicken Lunch Box"){
        price = 136.50 * quantity;
        return price;

    }else if(itemName=="Paneer Lunch Box"){
        price = 128.80 * quantity;
        return price;

    }else if(itemName=="Egg Lunch Box"){
        price = 118.25 * quantity;
        return price;

    }else if(itemName=="Veg Dinner Box"){
        price = 125.40 * quantity;
        return price;

    }else if(itemName=="Chicken Dinner Box"){
        price = 149.75 * quantity;
        return price;

    }else if(itemName=="Paneer Dinner Box"){
        price = 141.95 * quantity;
        return price;

    }else if(itemName=="Egg Dinner Box"){
        price = 132.20 * quantity;
        return price;

    }else if(itemName=="Veg Comfort Meal"){
        price = 85.60 * quantity;
        return price;

    }else if(itemName=="Chicken Comfort Meal"){
        price = 108.45 * quantity;
        return price;

    }else if(itemName=="Paneer Comfort Meal"){
        price = 102.75 * quantity;
        return price;

    }else if(itemName=="Egg Comfort Meal"){
        price = 91.55 * quantity;
        return price;

    }else if(itemName=="Veg Deluxe Plate"){
        price = 97.35 * quantity;
        return price;

    }else if(itemName=="Chicken Deluxe Plate"){
        price = 118.60 * quantity;
        return price;

    }else if(itemName=="Paneer Deluxe Plate"){
        price = 111.90 * quantity;
        return price;

    }else if(itemName=="Egg Deluxe Plate"){
        price = 101.25 * quantity;
        return price;

    }else if(itemName=="Veg Feast Plate"){
        price = 132.75 * quantity;
        return price;

    }else if(itemName=="Chicken Feast Plate"){
        price = 158.40 * quantity;
        return price;

    }else if(itemName=="Paneer Feast Plate"){
        price = 147.65 * quantity;
        return price;

    }else if(itemName=="Egg Feast Plate"){
        price = 139.20 * quantity;
        return price;

    }else if(itemName=="Veg Combo Plate"){
        price = 104.55 * quantity;
        return price;

    }else if(itemName=="Chicken Combo Plate"){
        price = 126.90 * quantity;
        return price;

    }else if(itemName=="Paneer Combo Plate"){
        price = 118.30 * quantity;
        return price;

    }else if(itemName=="Egg Combo Plate"){
        price = 109.75 * quantity;
        return price;

    }else if(itemName=="Veg Tiffin Box"){
        price = 83.40 * quantity;
        return price;

    }else if(itemName=="Chicken Tiffin Box"){
        price = 101.60 * quantity;
        return price;

    }else if(itemName=="Paneer Tiffin Box"){
        price = 96.25 * quantity;
        return price;

    }else if(itemName=="Egg Tiffin Box"){
        price = 88.95 * quantity;
        return price;

    }else if(itemName=="Veg Family Pack"){
        price = 178.30 * quantity;
        return price;

    }else if(itemName=="Chicken Family Pack"){
        price = 214.75 * quantity;
        return price;

    }else if(itemName=="Paneer Family Pack"){
        price = 198.40 * quantity;
        return price;

    }else if(itemName=="Egg Family Pack"){
        price = 184.90 * quantity;
        return price;

    }else if(itemName=="Veg Grand Meal"){
        price = 222.60 * quantity;
        return price;

    }else if(itemName=="Chicken Grand Meal"){
        price = 258.45 * quantity;
        return price;

    }else if(itemName=="Paneer Grand Meal"){
        price = 243.75 * quantity;
        return price;

    }else if(itemName=="Egg Grand Meal"){
        price = 229.35 * quantity;
        return price;

    }else if(itemName=="Chef Special Meal"){
        price = 268.90 * quantity;
        return price;

    }else{
        System.out.println(itemName + " Not found");
    }

    return price;
}
}