class EatSure {

    public static double search(String itemName) {

        double price = 0.0;

        if(itemName == "Paneer Butter Masala"){
            price = 210;
            return price;

        }else if(itemName == "Veg Biryani"){
            price = 215;
            return price;

        }else if(itemName == "Chicken Biryani"){
            price = 220;
            return price;

        }else if(itemName == "Veg Pulao"){
            price = 225;
            return price;

        }else if(itemName == "Paneer Tikka"){
            price = 230;
            return price;

        }else if(itemName == "Chicken Tikka"){
            price = 235;
            return price;

        }else if(itemName == "Tandoori Roti"){
            price = 240;
            return price;

        }else if(itemName == "Butter Naan"){
            price = 245;
            return price;

        }else if(itemName == "Garlic Naan"){
            price = 250;
            return price;

        }else if(itemName == "Dal Makhani"){
            price = 255;
            return price;

        }else if(itemName == "Jeera Rice"){
            price = 260;
            return price;

        }else if(itemName == "Veg Fried Rice"){
            price = 265;
            return price;

        }else if(itemName == "Schezwan Fried Rice"){
            price = 270;
            return price;

        }else if(itemName == "Hakka Noodles"){
            price = 275;
            return price;

        }else if(itemName == "Schezwan Noodles"){
            price = 280;
            return price;

        }else if(itemName == "Veg Manchurian"){
            price = 285;
            return price;

        }else if(itemName == "Paneer Manchurian"){
            price = 290;
            return price;

        }else if(itemName == "Chilli Paneer"){
            price = 295;
            return price;

        }else if(itemName == "Spring Rolls"){
            price = 300;
            return price;

        }else if(itemName == "Veg Momos"){
            price = 305;
            return price;
		
		        }else if(itemName == "Chicken Momos"){
            price = 310;
            return price;

        }else if(itemName == "Paneer Roll"){
            price = 315;
            return price;

        }else if(itemName == "Chicken Roll"){
            price = 320;
            return price;

        }else if(itemName == "Veg Burger"){
            price = 325;
            return price;

        }else if(itemName == "Chicken Burger"){
            price = 330;
            return price;

        }else if(itemName == "Paneer Burger"){
            price = 335;
            return price;

        }else if(itemName == "Veg Pizza"){
            price = 340;
            return price;

        }else if(itemName == "Chicken Pizza"){
            price = 345;
            return price;

        }else if(itemName == "Margherita Pizza"){
            price = 350;
            return price;

        }else if(itemName == "Paneer Pizza"){
            price = 355;
            return price;

        }else if(itemName == "Veg Sandwich"){
            price = 360;
            return price;

        }else if(itemName == "Grilled Sandwich"){
            price = 365;
            return price;

        }else if(itemName == "Cheese Sandwich"){
            price = 370;
            return price;

        }else if(itemName == "Veg Wrap"){
            price = 375;
            return price;

        }else if(itemName == "Chicken Wrap"){
            price = 380;
            return price;

        }else if(itemName == "Paneer Wrap"){
            price = 385;
            return price;

        }else if(itemName == "Veg Pasta"){
            price = 390;
            return price;

        }else if(itemName == "White Sauce Pasta"){
            price = 395;
            return price;

        }else if(itemName == "Red Sauce Pasta"){
            price = 400;
            return price;

        }else if(itemName == "Cheese Pasta"){
            price = 405;
            return price;
			
		        }else if(itemName == "Chocolate Milkshake"){
            price = 410;
            return price;

        }else if(itemName == "Vanilla Milkshake"){
            price = 415;
            return price;

        }else if(itemName == "Strawberry Milkshake"){
            price = 420;
            return price;

        }else if(itemName == "Cold Coffee"){
            price = 425;
            return price;

        }else if(itemName == "Lemon Soda"){
            price = 430;
            return price;

        }else if(itemName == "Mango Smoothie"){
            price = 435;
            return price;

        }else if(itemName == "Chocolate Brownie"){
            price = 440;
            return price;

        }else if(itemName == "Chocolate Lava Cake"){
            price = 445;
            return price;

        }else if(itemName == "Ice Cream Sundae"){
            price = 450;
            return price;

        }else if(itemName == "Chocolate Donut"){
            price = 455;
            return price;

        }else if(itemName == "Strawberry Donut"){
            price = 460;
            return price;

        }else if(itemName == "Cheese Garlic Bread"){
            price = 465;
            return price;

        }else if(itemName == "Loaded Nachos"){
            price = 470;
            return price;

        }else if(itemName == "Peri Peri Fries"){
            price = 475;
            return price;

        }else if(itemName == "Cheese Fries"){
            price = 480;
            return price;

        }else if(itemName == "Veg Salad Bowl"){
            price = 485;
            return price;

        }else if(itemName == "Fruit Salad Bowl"){
            price = 490;
            return price;

        }else if(itemName == "Paneer Salad Bowl"){
            price = 495;
            return price;

        }else if(itemName == "Healthy Quinoa Bowl"){
            price = 500;
            return price;
			
	    }else{
            System.out.println(itemName + " Not found");
        }

        return price;
    }
	
	public static double search(String itemName, int quantity) {

    double price = 0.0;

    if(itemName == "Paneer Butter Masala"){
        price = 210 * quantity;
        return price;

    }else if(itemName == "Veg Biryani"){
        price = 215 * quantity;
        return price;

    }else if(itemName == "Chicken Biryani"){
        price = 220 * quantity;
        return price;

    }else if(itemName == "Veg Pulao"){
        price = 225 * quantity;
        return price;

    }else if(itemName == "Paneer Tikka"){
        price = 230 * quantity;
        return price;

    }else if(itemName == "Chicken Tikka"){
        price = 235 * quantity;
        return price;

    }else if(itemName == "Tandoori Roti"){
        price = 240 * quantity;
        return price;

    }else if(itemName == "Butter Naan"){
        price = 245 * quantity;
        return price;

    }else if(itemName == "Garlic Naan"){
        price = 250 * quantity;
        return price;

    }else if(itemName == "Dal Makhani"){
        price = 255 * quantity;
        return price;

    }else if(itemName == "Jeera Rice"){
        price = 260 * quantity;
        return price;

    }else if(itemName == "Veg Fried Rice"){
        price = 265 * quantity;
        return price;

    }else if(itemName == "Schezwan Fried Rice"){
        price = 270 * quantity;
        return price;

    }else if(itemName == "Hakka Noodles"){
        price = 275 * quantity;
        return price;

    }else if(itemName == "Schezwan Noodles"){
        price = 280 * quantity;
        return price;

    }else if(itemName == "Veg Manchurian"){
        price = 285 * quantity;
        return price;

    }else if(itemName == "Paneer Manchurian"){
        price = 290 * quantity;
        return price;

    }else if(itemName == "Chilli Paneer"){
        price = 295 * quantity;
        return price;

    }else if(itemName == "Spring Rolls"){
        price = 300 * quantity;
        return price;

    }else if(itemName == "Veg Momos"){
        price = 305 * quantity;
        return price;

    }else if(itemName == "Chicken Momos"){
        price = 310 * quantity;
        return price;

    }else if(itemName == "Paneer Roll"){
        price = 315 * quantity;
        return price;

    }else if(itemName == "Chicken Roll"){
        price = 320 * quantity;
        return price;

    }else if(itemName == "Veg Burger"){
        price = 325 * quantity;
        return price;

    }else if(itemName == "Chicken Burger"){
        price = 330 * quantity;
        return price;

    }else if(itemName == "Paneer Burger"){
        price = 335 * quantity;
        return price;

    }else if(itemName == "Veg Pizza"){
        price = 340 * quantity;
        return price;

    }else if(itemName == "Chicken Pizza"){
        price = 345 * quantity;
        return price;

    }else if(itemName == "Margherita Pizza"){
        price = 350 * quantity;
        return price;

    }else if(itemName == "Paneer Pizza"){
        price = 355 * quantity;
        return price;

    }else if(itemName == "Veg Sandwich"){
        price = 360 * quantity;
        return price;

    }else if(itemName == "Grilled Sandwich"){
        price = 365 * quantity;
        return price;

    }else if(itemName == "Cheese Sandwich"){
        price = 370 * quantity;
        return price;

    }else if(itemName == "Veg Wrap"){
        price = 375 * quantity;
        return price;

    }else if(itemName == "Chicken Wrap"){
        price = 380 * quantity;
        return price;

    }else if(itemName == "Paneer Wrap"){
        price = 385 * quantity;
        return price;

    }else if(itemName == "Veg Pasta"){
        price = 390 * quantity;
        return price;

    }else if(itemName == "White Sauce Pasta"){
        price = 395 * quantity;
        return price;

    }else if(itemName == "Red Sauce Pasta"){
        price = 400 * quantity;
        return price;

    }else if(itemName == "Cheese Pasta"){
        price = 405 * quantity;
        return price;

    }else if(itemName == "Chocolate Milkshake"){
        price = 410 * quantity;
        return price;

    }else if(itemName == "Vanilla Milkshake"){
        price = 415 * quantity;
        return price;

    }else if(itemName == "Strawberry Milkshake"){
        price = 420 * quantity;
        return price;

    }else if(itemName == "Cold Coffee"){
        price = 425 * quantity;
        return price;

    }else if(itemName == "Lemon Soda"){
        price = 430 * quantity;
        return price;

    }else if(itemName == "Mango Smoothie"){
        price = 435 * quantity;
        return price;

    }else if(itemName == "Chocolate Brownie"){
        price = 440 * quantity;
        return price;

    }else if(itemName == "Chocolate Lava Cake"){
        price = 445 * quantity;
        return price;

    }else if(itemName == "Ice Cream Sundae"){
        price = 450 * quantity;
        return price;

    }else if(itemName == "Chocolate Donut"){
        price = 455 * quantity;
        return price;

    }else if(itemName == "Strawberry Donut"){
        price = 460 * quantity;
        return price;

    }else if(itemName == "Cheese Garlic Bread"){
        price = 465 * quantity;
        return price;

    }else if(itemName == "Loaded Nachos"){
        price = 470 * quantity;
        return price;

    }else if(itemName == "Peri Peri Fries"){
        price = 475 * quantity;
        return price;

    }else if(itemName == "Cheese Fries"){
        price = 480 * quantity;
        return price;

    }else if(itemName == "Veg Salad Bowl"){
        price = 485 * quantity;
        return price;

    }else if(itemName == "Fruit Salad Bowl"){
        price = 490 * quantity;
        return price;

    }else if(itemName == "Paneer Salad Bowl"){
        price = 495 * quantity;
        return price;

    }else if(itemName == "Healthy Quinoa Bowl"){
        price = 500 * quantity;
        return price;

    }else{
        System.out.println(itemName + " Not found");
    }

    return price;
}
}