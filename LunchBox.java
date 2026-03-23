class LunchBox {

    public static double search(String itemName){

        double price = 0.0;

        if(itemName=="Paneer Rice Bowl"){
            price = 88.40;
            return price;

        }else if(itemName=="Chicken Rice Bowl"){
            price = 92.55;
            return price;

        }else if(itemName=="Veg Curry Bowl"){
            price = 95.20;
            return price;

        }else if(itemName=="Chicken Curry Bowl"){
            price = 98.35;
            return price;

        }else if(itemName=="Dal Fry Bowl"){
            price = 76.60;
            return price;

        }else if(itemName=="Rajma Rice Bowl"){
            price = 79.75;
            return price;

        }else if(itemName=="Chole Rice Bowl"){
            price = 83.90;
            return price;

        }else if(itemName=="Butter Paneer Bowl"){
            price = 101.10;
            return price;

        }else if(itemName=="Paneer Masala Bowl"){
            price = 104.25;
            return price;

        }else if(itemName=="Veg Handi Bowl"){
            price = 90.80;
            return price;

        }else if(itemName=="Chicken Handi Bowl"){
            price = 108.45;
            return price;

        }else if(itemName=="Mutton Curry Bowl"){
            price = 120.30;
            return price;

        }else if(itemName=="Egg Curry Bowl"){
            price = 82.15;
            return price;

        }else if(itemName=="Paneer Kofta Bowl"){
            price = 99.95;
            return price;

        }else if(itemName=="Veg Kofta Bowl"){
            price = 87.60;
            return price;

        }else if(itemName=="Chicken Tikka Bowl"){
            price = 111.25;
            return price;

        }else if(itemName=="Chicken Butter Bowl"){
            price = 114.40;
            return price;

        }else if(itemName=="Veg Pulao Bowl"){
            price = 77.85;
            return price;

        }else if(itemName=="Chicken Pulao Bowl"){
            price = 89.70;
            return price;

        }else if(itemName=="Mushroom Rice Bowl"){
            price = 84.55;
            return price;

        }else if(itemName=="Paneer Pulao Bowl"){
            price = 93.25;
            return price;

        }else if(itemName=="Chicken Fried Rice Bowl"){
            price = 105.60;
            return price;

        }else if(itemName=="Veg Fried Rice Bowl"){
            price = 88.95;
            return price;

        }else if(itemName=="Egg Fried Rice Bowl"){
            price = 90.40;
            return price;

        }else if(itemName=="Paneer Fried Rice Bowl"){
            price = 97.30;
            return price;

        }else if(itemName=="Chicken Noodle Bowl"){
            price = 103.85;
            return price;

        }else if(itemName=="Veg Noodle Bowl"){
            price = 86.70;
            return price;

        }else if(itemName=="Egg Noodle Bowl"){
            price = 89.45;
            return price;

        }else if(itemName=="Paneer Noodle Bowl"){
            price = 95.60;
            return price;

        }else if(itemName=="Mushroom Noodle Bowl"){
            price = 91.20;
            return price;

        }else if(itemName=="Chicken Schezwan Bowl"){
            price = 109.75;
            return price;

        }else if(itemName=="Veg Schezwan Bowl"){
            price = 92.10;
            return price;

        }else if(itemName=="Paneer Schezwan Bowl"){
            price = 96.85;
            return price;

        }else if(itemName=="Egg Schezwan Bowl"){
            price = 90.95;
            return price;

        }else if(itemName=="Veg Combo Meal"){
            price = 112.30;
            return price;

        }else if(itemName=="Chicken Combo Meal"){
            price = 124.50;
            return price;

        }else if(itemName=="Paneer Combo Meal"){
            price = 118.65;
            return price;

        }else if(itemName=="Egg Combo Meal"){
            price = 106.40;
            return price;

        }else if(itemName=="Mutton Combo Meal"){
            price = 135.20;
            return price;

        }else if(itemName=="Veg Deluxe Meal"){
            price = 119.95;
            return price;

        }else if(itemName=="Chicken Deluxe Meal"){
            price = 132.70;
            return price;

        }else if(itemName=="Paneer Deluxe Meal"){
            price = 125.60;
            return price;

        }else if(itemName=="Egg Deluxe Meal"){
            price = 108.35;
            return price;

        }else if(itemName=="Rice Meal Special"){
            price = 101.75;
            return price;

        }else if(itemName=="Chicken Rice Meal"){
            price = 116.80;
            return price;

        }else if(itemName=="Veg Rice Meal"){
            price = 99.15;
            return price;

        }else if(itemName=="Paneer Rice Meal"){
            price = 110.55;
            return price;

        }else if(itemName=="Egg Rice Meal"){
            price = 102.20;
            return price;

        }else if(itemName=="Veg Lunch Meal"){
            price = 120.85;
            return price;

        }else if(itemName=="Chicken Lunch Meal"){
            price = 138.40;
            return price;

        }else if(itemName=="Paneer Lunch Meal"){
            price = 129.75;
            return price;

        }else if(itemName=="Egg Lunch Meal"){
            price = 115.90;
            return price;

        }else if(itemName=="Veg Family Bowl"){
            price = 150.30;
            return price;

        }else if(itemName=="Chicken Family Bowl"){
            price = 168.55;
            return price;

        }else if(itemName=="Paneer Family Bowl"){
            price = 160.40;
            return price;

        }else if(itemName=="Egg Family Bowl"){
            price = 148.25;
            return price;

        }else if(itemName=="Mutton Family Bowl"){
            price = 189.75;
            return price;

        }else{
            System.out.println(itemName + " Not found");
        }

        return price;
    }
	
	public static double search(String itemName, int quantity){

    double price = 0.0;

    if(itemName=="Paneer Rice Bowl"){
        price = 88.40 * quantity;
        return price;

    }else if(itemName=="Chicken Rice Bowl"){
        price = 92.55 * quantity;
        return price;

    }else if(itemName=="Veg Curry Bowl"){
        price = 95.20 * quantity;
        return price;

    }else if(itemName=="Chicken Curry Bowl"){
        price = 98.35 * quantity;
        return price;

    }else if(itemName=="Dal Fry Bowl"){
        price = 76.60 * quantity;
        return price;

    }else if(itemName=="Rajma Rice Bowl"){
        price = 79.75 * quantity;
        return price;

    }else if(itemName=="Chole Rice Bowl"){
        price = 83.90 * quantity;
        return price;

    }else if(itemName=="Butter Paneer Bowl"){
        price = 101.10 * quantity;
        return price;

    }else if(itemName=="Paneer Masala Bowl"){
        price = 104.25 * quantity;
        return price;

    }else if(itemName=="Veg Handi Bowl"){
        price = 90.80 * quantity;
        return price;

    }else if(itemName=="Chicken Handi Bowl"){
        price = 108.45 * quantity;
        return price;

    }else if(itemName=="Mutton Curry Bowl"){
        price = 120.30 * quantity;
        return price;

    }else if(itemName=="Egg Curry Bowl"){
        price = 82.15 * quantity;
        return price;

    }else if(itemName=="Paneer Kofta Bowl"){
        price = 99.95 * quantity;
        return price;

    }else if(itemName=="Veg Kofta Bowl"){
        price = 87.60 * quantity;
        return price;

    }else if(itemName=="Chicken Tikka Bowl"){
        price = 111.25 * quantity;
        return price;

    }else if(itemName=="Chicken Butter Bowl"){
        price = 114.40 * quantity;
        return price;

    }else if(itemName=="Veg Pulao Bowl"){
        price = 77.85 * quantity;
        return price;

    }else if(itemName=="Chicken Pulao Bowl"){
        price = 89.70 * quantity;
        return price;

    }else if(itemName=="Mushroom Rice Bowl"){
        price = 84.55 * quantity;
        return price;

    }else if(itemName=="Paneer Pulao Bowl"){
        price = 93.25 * quantity;
        return price;

    }else if(itemName=="Chicken Fried Rice Bowl"){
        price = 105.60 * quantity;
        return price;

    }else if(itemName=="Veg Fried Rice Bowl"){
        price = 88.95 * quantity;
        return price;

    }else if(itemName=="Egg Fried Rice Bowl"){
        price = 90.40 * quantity;
        return price;

    }else if(itemName=="Paneer Fried Rice Bowl"){
        price = 97.30 * quantity;
        return price;

    }else if(itemName=="Chicken Noodle Bowl"){
        price = 103.85 * quantity;
        return price;

    }else if(itemName=="Veg Noodle Bowl"){
        price = 86.70 * quantity;
        return price;

    }else if(itemName=="Egg Noodle Bowl"){
        price = 89.45 * quantity;
        return price;

    }else if(itemName=="Paneer Noodle Bowl"){
        price = 95.60 * quantity;
        return price;

    }else if(itemName=="Mushroom Noodle Bowl"){
        price = 91.20 * quantity;
        return price;

    }else if(itemName=="Chicken Schezwan Bowl"){
        price = 109.75 * quantity;
        return price;

    }else if(itemName=="Veg Schezwan Bowl"){
        price = 92.10 * quantity;
        return price;

    }else if(itemName=="Paneer Schezwan Bowl"){
        price = 96.85 * quantity;
        return price;

    }else if(itemName=="Egg Schezwan Bowl"){
        price = 90.95 * quantity;
        return price;

    }else if(itemName=="Veg Combo Meal"){
        price = 112.30 * quantity;
        return price;

    }else if(itemName=="Chicken Combo Meal"){
        price = 124.50 * quantity;
        return price;

    }else if(itemName=="Paneer Combo Meal"){
        price = 118.65 * quantity;
        return price;

    }else if(itemName=="Egg Combo Meal"){
        price = 106.40 * quantity;
        return price;

    }else if(itemName=="Mutton Combo Meal"){
        price = 135.20 * quantity;
        return price;

    }else if(itemName=="Veg Deluxe Meal"){
        price = 119.95 * quantity;
        return price;

    }else if(itemName=="Chicken Deluxe Meal"){
        price = 132.70 * quantity;
        return price;

    }else if(itemName=="Paneer Deluxe Meal"){
        price = 125.60 * quantity;
        return price;

    }else if(itemName=="Egg Deluxe Meal"){
        price = 108.35 * quantity;
        return price;

    }else if(itemName=="Rice Meal Special"){
        price = 101.75 * quantity;
        return price;

    }else if(itemName=="Chicken Rice Meal"){
        price = 116.80 * quantity;
        return price;

    }else if(itemName=="Veg Rice Meal"){
        price = 99.15 * quantity;
        return price;

    }else if(itemName=="Paneer Rice Meal"){
        price = 110.55 * quantity;
        return price;

    }else if(itemName=="Egg Rice Meal"){
        price = 102.20 * quantity;
        return price;

    }else if(itemName=="Veg Lunch Meal"){
        price = 120.85 * quantity;
        return price;

    }else if(itemName=="Chicken Lunch Meal"){
        price = 138.40 * quantity;
        return price;

    }else if(itemName=="Paneer Lunch Meal"){
        price = 129.75 * quantity;
        return price;

    }else if(itemName=="Egg Lunch Meal"){
        price = 115.90 * quantity;
        return price;

    }else if(itemName=="Veg Family Bowl"){
        price = 150.30 * quantity;
        return price;

    }else if(itemName=="Chicken Family Bowl"){
        price = 168.55 * quantity;
        return price;

    }else if(itemName=="Paneer Family Bowl"){
        price = 160.40 * quantity;
        return price;

    }else if(itemName=="Egg Family Bowl"){
        price = 148.25 * quantity;
        return price;

    }else if(itemName=="Mutton Family Bowl"){
        price = 189.75 * quantity;
        return price;

    }else{
        System.out.println(itemName + " Not found");
    }

    return price;
  }
}