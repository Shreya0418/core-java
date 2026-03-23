class Magicpin {

    public static double search(String itemName){

        double price = 0.0;

        if(itemName=="Chicken Shawarma"){
            price=510;
            return price;

        }else if(itemName=="Paneer Shawarma"){
            price=515;
            return price;

        }else if(itemName=="Falafel Wrap"){
            price=520;
            return price;

        }else if(itemName=="Chicken Kebab Plate"){
            price=525;
            return price;

        }else if(itemName=="Mutton Kebab Plate"){
            price=530;
            return price;

        }else if(itemName=="Chicken Seekh Kebab"){
            price=535;
            return price;

        }else if(itemName=="Mutton Seekh Kebab"){
            price=540;
            return price;

        }else if(itemName=="Veg Seekh Kebab"){
            price=545;
            return price;

        }else if(itemName=="Paneer Malai Tikka"){
            price=550;
            return price;

        }else if(itemName=="Chicken Malai Tikka"){
            price=555;
            return price;

        }else if(itemName=="Afghani Chicken"){
            price=560;
            return price;

        }else if(itemName=="Butter Chicken Combo"){
            price=565;
            return price;

        }else if(itemName=="Chicken Curry Meal"){
            price=570;
            return price;

        }else if(itemName=="Paneer Curry Meal"){
            price=575;
            return price;

        }else if(itemName=="Dal Tadka Meal"){
            price=580;
            return price;

        }else if(itemName=="Rajma Rice Combo"){
            price=585;
            return price;

        }else if(itemName=="Chole Bhature Plate"){
            price=590;
            return price;

        }else if(itemName=="Aloo Paratha Combo"){
            price=595;
            return price;

        }else if(itemName=="Paneer Paratha Combo"){
            price=600;
            return price;

        }else if(itemName=="Veg Thali Deluxe"){
            price=605;
            return price;

        }else if(itemName=="Chicken Thali Deluxe"){
            price=610;
            return price;

        }else if(itemName=="Mutton Thali Deluxe"){
            price=615;
            return price;

        }else if(itemName=="Veg Hakka Noodles Plate"){
            price=620;
            return price;

        }else if(itemName=="Chicken Hakka Noodles Plate"){
            price=625;
            return price;

        }else if(itemName=="Egg Fried Rice Plate"){
            price=630;
            return price;

        }else if(itemName=="Chicken Fried Rice Plate"){
            price=635;
            return price;

        }else if(itemName=="Veg Schezwan Rice Plate"){
            price=640;
            return price;

        }else if(itemName=="Chicken Schezwan Rice Plate"){
            price=645;
            return price;

        }else if(itemName=="Paneer Chilli Dry"){
            price=650;
            return price;

        }else if(itemName=="Chicken Chilli Dry"){
            price=655;
            return price;

        }else if(itemName=="Veg Crispy Plate"){
            price=660;
            return price;

        }else if(itemName=="Chicken Crispy Plate"){
            price=665;
            return price;

        }else if(itemName=="Honey Chilli Potato"){
            price=670;
            return price;

        }else if(itemName=="Peri Peri Chicken Bites"){
            price=675;
            return price;

        }else if(itemName=="Cheesy Chicken Balls"){
            price=680;
            return price;

        }else if(itemName=="Veg Cheese Balls"){
            price=685;
            return price;

        }else if(itemName=="Stuffed Garlic Kulcha"){
            price=690;
            return price;

        }else if(itemName=="Paneer Kulcha Plate"){
            price=695;
            return price;

        }else if(itemName=="Chicken Keema Kulcha"){
            price=700;
            return price;

        }else if(itemName=="Mutton Keema Kulcha"){
            price=705;
            return price;

        }else if(itemName=="Tawa Chicken Special"){
            price=710;
            return price;

        }else if(itemName=="Tawa Paneer Special"){
            price=715;
            return price;

        }else if(itemName=="Tawa Mushroom Masala"){
            price=720;
            return price;

        }else if(itemName=="Butter Mushroom Curry"){
            price=725;
            return price;

        }else if(itemName=="Chicken Korma Bowl"){
            price=730;
            return price;

        }else if(itemName=="Paneer Korma Bowl"){
            price=735;
            return price;

        }else if(itemName=="Veg Kofta Curry"){
            price=740;
            return price;

        }else if(itemName=="Malai Kofta Curry"){
            price=745;
            return price;

        }else if(itemName=="Chicken Tikka Masala Bowl"){
            price=750;
            return price;

        }else if(itemName=="Paneer Tikka Masala Bowl"){
            price=755;
            return price;

        }else if(itemName=="Mutton Rogan Josh Bowl"){
            price=760;
            return price;

        }else if(itemName=="Chicken Rogan Josh Bowl"){
            price=765;
            return price;

        }else if(itemName=="Veg Handi Curry"){
            price=770;
            return price;

        }else if(itemName=="Chicken Handi Curry"){
            price=775;
            return price;

        }else if(itemName=="Mutton Handi Curry"){
            price=780;
            return price;

        }else if(itemName=="Special Veg Platter"){
            price=785;
            return price;

        }else if(itemName=="Special Chicken Platter"){
            price=790;
            return price;

        }else if(itemName=="Royal Mughlai Platter"){
            price=795;
            return price;

        }else{
            System.out.println(itemName+"Not found");
        }

        return price;
    }
	
	public static double search(String itemName,int quantity){

    double price=0.0;

    if(itemName=="Chicken Shawarma"){
        price=510*quantity;
        return price;

    }else if(itemName=="Paneer Shawarma"){
        price=515*quantity;
        return price;

    }else if(itemName=="Falafel Wrap"){
        price=520*quantity;
        return price;

    }else if(itemName=="Chicken Kebab Plate"){
        price=525*quantity;
        return price;

    }else if(itemName=="Mutton Kebab Plate"){
        price=530*quantity;
        return price;

    }else if(itemName=="Chicken Seekh Kebab"){
        price=535*quantity;
        return price;

    }else if(itemName=="Mutton Seekh Kebab"){
        price=540*quantity;
        return price;

    }else if(itemName=="Veg Seekh Kebab"){
        price=545*quantity;
        return price;

    }else if(itemName=="Paneer Malai Tikka"){
        price=550*quantity;
        return price;

    }else if(itemName=="Chicken Malai Tikka"){
        price=555*quantity;
        return price;

    }else if(itemName=="Afghani Chicken"){
        price=560*quantity;
        return price;

    }else if(itemName=="Butter Chicken Combo"){
        price=565*quantity;
        return price;

    }else if(itemName=="Chicken Curry Meal"){
        price=570*quantity;
        return price;

    }else if(itemName=="Paneer Curry Meal"){
        price=575*quantity;
        return price;

    }else if(itemName=="Dal Tadka Meal"){
        price=580*quantity;
        return price;

    }else if(itemName=="Rajma Rice Combo"){
        price=585*quantity;
        return price;

    }else if(itemName=="Chole Bhature Plate"){
        price=590*quantity;
        return price;

    }else if(itemName=="Aloo Paratha Combo"){
        price=595*quantity;
        return price;

    }else if(itemName=="Paneer Paratha Combo"){
        price=600*quantity;
        return price;

    }else if(itemName=="Veg Thali Deluxe"){
        price=605*quantity;
        return price;

    }else if(itemName=="Chicken Thali Deluxe"){
        price=610*quantity;
        return price;

    }else if(itemName=="Mutton Thali Deluxe"){
        price=615*quantity;
        return price;

    }else if(itemName=="Veg Hakka Noodles Plate"){
        price=620*quantity;
        return price;

    }else if(itemName=="Chicken Hakka Noodles Plate"){
        price=625*quantity;
        return price;

    }else if(itemName=="Egg Fried Rice Plate"){
        price=630*quantity;
        return price;

    }else if(itemName=="Chicken Fried Rice Plate"){
        price=635*quantity;
        return price;

    }else if(itemName=="Veg Schezwan Rice Plate"){
        price=640*quantity;
        return price;

    }else if(itemName=="Chicken Schezwan Rice Plate"){
        price=645*quantity;
        return price;

    }else if(itemName=="Paneer Chilli Dry"){
        price=650*quantity;
        return price;

    }else if(itemName=="Chicken Chilli Dry"){
        price=655*quantity;
        return price;

    }else if(itemName=="Veg Crispy Plate"){
        price=660*quantity;
        return price;

    }else if(itemName=="Chicken Crispy Plate"){
        price=665*quantity;
        return price;

    }else if(itemName=="Honey Chilli Potato"){
        price=670*quantity;
        return price;

    }else if(itemName=="Peri Peri Chicken Bites"){
        price=675*quantity;
        return price;

    }else if(itemName=="Cheesy Chicken Balls"){
        price=680*quantity;
        return price;

    }else if(itemName=="Veg Cheese Balls"){
        price=685*quantity;
        return price;

    }else if(itemName=="Stuffed Garlic Kulcha"){
        price=690*quantity;
        return price;

    }else if(itemName=="Paneer Kulcha Plate"){
        price=695*quantity;
        return price;

    }else if(itemName=="Chicken Keema Kulcha"){
        price=700*quantity;
        return price;

    }else if(itemName=="Mutton Keema Kulcha"){
        price=705*quantity;
        return price;

    }else if(itemName=="Tawa Chicken Special"){
        price=710*quantity;
        return price;

    }else if(itemName=="Tawa Paneer Special"){
        price=715*quantity;
        return price;

    }else if(itemName=="Tawa Mushroom Masala"){
        price=720*quantity;
        return price;

    }else if(itemName=="Butter Mushroom Curry"){
        price=725*quantity;
        return price;

    }else if(itemName=="Chicken Korma Bowl"){
        price=730*quantity;
        return price;

    }else if(itemName=="Paneer Korma Bowl"){
        price=735*quantity;
        return price;

    }else if(itemName=="Veg Kofta Curry"){
        price=740*quantity;
        return price;

    }else if(itemName=="Malai Kofta Curry"){
        price=745*quantity;
        return price;

    }else if(itemName=="Chicken Tikka Masala Bowl"){
        price=750*quantity;
        return price;

    }else if(itemName=="Paneer Tikka Masala Bowl"){
        price=755*quantity;
        return price;

    }else if(itemName=="Mutton Rogan Josh Bowl"){
        price=760*quantity;
        return price;

    }else if(itemName=="Chicken Rogan Josh Bowl"){
        price=765*quantity;
        return price;

    }else if(itemName=="Veg Handi Curry"){
        price=770*quantity;
        return price;

    }else if(itemName=="Chicken Handi Curry"){
        price=775*quantity;
        return price;

    }else if(itemName=="Mutton Handi Curry"){
        price=780*quantity;
        return price;

    }else if(itemName=="Special Veg Platter"){
        price=785*quantity;
        return price;

    }else if(itemName=="Special Chicken Platter"){
        price=790*quantity;
        return price;

    }else if(itemName=="Royal Mughlai Platter"){
        price=795*quantity;
        return price;

    }else{
        System.out.println(itemName+" Not found");
    }

    return price;
}
}