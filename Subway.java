class Subway {

    public static double search(String itemName){

        double price=0.0;

        if(itemName=="Veggie Delight Sub"){
            price=801;
            return price;

        }else if(itemName=="Paneer Tikka Sub"){
            price=804;
            return price;

        }else if(itemName=="Aloo Patty Sub"){
            price=807;
            return price;

        }else if(itemName=="Corn Cheese Sub"){
            price=810;
            return price;

        }else if(itemName=="Veg Seekh Sub"){
            price=813;
            return price;

        }else if(itemName=="Tandoori Veg Sub"){
            price=816;
            return price;

        }else if(itemName=="Mexican Veg Sub"){
            price=819;
            return price;

        }else if(itemName=="Spinach Corn Sub"){
            price=822;
            return price;

        }else if(itemName=="Veg Cheese Burst Sub"){
            price=825;
            return price;

        }else if(itemName=="Veg Mayo Sub"){
            price=828;
            return price;

        }else if(itemName=="Grilled Veg Sub"){
            price=831;
            return price;

        }else if(itemName=="Cheese Overload Sub"){
            price=834;
            return price;

        }else if(itemName=="Veg Italian Sub"){
            price=837;
            return price;

        }else if(itemName=="Veg Supreme Sub"){
            price=840;
            return price;

        }else if(itemName=="Veg BBQ Sub"){
            price=843;
            return price;

        }else if(itemName=="Veg Delight Cheese Sub"){
            price=846;
            return price;

        }else if(itemName=="Chicken Teriyaki Sub"){
            price=849;
            return price;

        }else if(itemName=="Chicken Tikka Sub"){
            price=852;
            return price;

        }else if(itemName=="Chicken Ham Sub"){
            price=855;
            return price;

        }else if(itemName=="Chicken Salami Sub"){
            price=858;
            return price;

        }else if(itemName=="Chicken Pepperoni Sub"){
            price=861;
            return price;

        }else if(itemName=="Chicken BBQ Sub"){
            price=864;
            return price;

        }else if(itemName=="Chicken Cheese Sub"){
            price=867;
            return price;

        }else if(itemName=="Chicken Delight Sub"){
            price=870;
            return price;

        }else if(itemName=="Chicken Overload Sub"){
            price=873;
            return price;

        }else if(itemName=="Grilled Chicken Sub"){
            price=876;
            return price;

        }else if(itemName=="Chicken Italiano Sub"){
            price=879;
            return price;

        }else if(itemName=="Chicken Supreme Sub"){
            price=882;
            return price;

        }else if(itemName=="Chicken Herb Sub"){
            price=885;
            return price;

        }else if(itemName=="Chicken Club Sub"){
            price=888;
            return price;

        }else if(itemName=="Turkey Sub"){
            price=891;
            return price;

        }else if(itemName=="Turkey Ham Sub"){
            price=894;
            return price;

        }else if(itemName=="Turkey Cheese Sub"){
            price=897;
            return price;

        }else if(itemName=="Turkey BBQ Sub"){
            price=900;
            return price;

        }else if(itemName=="Turkey Supreme Sub"){
            price=903;
            return price;

        }else if(itemName=="Italian BMT Sub"){
            price=906;
            return price;

        }else if(itemName=="Italian Cheese Melt Sub"){
            price=909;
            return price;

        }else if(itemName=="Italian Deluxe Sub"){
            price=912;
            return price;

        }else if(itemName=="Italian Chicken Melt Sub"){
            price=915;
            return price;

        }else if(itemName=="Italian Veg Melt Sub"){
            price=918;
            return price;

        }else if(itemName=="Egg Mayo Sub"){
            price=921;
            return price;

        }else if(itemName=="Egg Cheese Sub"){
            price=924;
            return price;

        }else if(itemName=="Egg BBQ Sub"){
            price=927;
            return price;

        }else if(itemName=="Egg Supreme Sub"){
            price=930;
            return price;

        }else if(itemName=="Egg Delight Sub"){
            price=933;
            return price;

        }else if(itemName=="Egg Pepper Sub"){
            price=936;
            return price;

        }else if(itemName=="Egg Italiano Sub"){
            price=939;
            return price;

        }else if(itemName=="Egg Herb Sub"){
            price=942;
            return price;

        }else if(itemName=="Egg Mayo Deluxe Sub"){
            price=945;
            return price;

        }else if(itemName=="Egg Cheese Melt Sub"){
            price=948;
            return price;

        }else if(itemName=="Double Veggie Sub"){
            price=951;
            return price;

        }else if(itemName=="Double Chicken Sub"){
            price=954;
            return price;

        }else if(itemName=="Double Turkey Sub"){
            price=957;
            return price;

        }else if(itemName=="Double Paneer Sub"){
            price=960;
            return price;

        }else if(itemName=="Double Egg Sub"){
            price=963;
            return price;

        }else if(itemName=="Subway Mega Veg Sub"){
            price=966;
            return price;

        }else if(itemName=="Subway Mega Chicken Sub"){
            price=969;
            return price;

        }else if(itemName=="Subway Royal Sub"){
            price=972;
            return price;

        }else{
            System.out.println(itemName+" Not found");
        }

        return price;
    }
	
	public static double search(String itemName, int quantity){

    double price = 0.0;

    if(itemName=="Veggie Delight Sub"){
        price = 801 * quantity;
        return price;

    }else if(itemName=="Paneer Tikka Sub"){
        price = 804 * quantity;
        return price;

    }else if(itemName=="Aloo Patty Sub"){
        price = 807 * quantity;
        return price;

    }else if(itemName=="Corn Cheese Sub"){
        price = 810 * quantity;
        return price;

    }else if(itemName=="Veg Seekh Sub"){
        price = 813 * quantity;
        return price;

    }else if(itemName=="Tandoori Veg Sub"){
        price = 816 * quantity;
        return price;

    }else if(itemName=="Mexican Veg Sub"){
        price = 819 * quantity;
        return price;

    }else if(itemName=="Spinach Corn Sub"){
        price = 822 * quantity;
        return price;

    }else if(itemName=="Veg Cheese Burst Sub"){
        price = 825 * quantity;
        return price;

    }else if(itemName=="Veg Mayo Sub"){
        price = 828 * quantity;
        return price;

    }else if(itemName=="Grilled Veg Sub"){
        price = 831 * quantity;
        return price;

    }else if(itemName=="Cheese Overload Sub"){
        price = 834 * quantity;
        return price;

    }else if(itemName=="Veg Italian Sub"){
        price = 837 * quantity;
        return price;

    }else if(itemName=="Veg Supreme Sub"){
        price = 840 * quantity;
        return price;

    }else if(itemName=="Veg BBQ Sub"){
        price = 843 * quantity;
        return price;

    }else if(itemName=="Veg Delight Cheese Sub"){
        price = 846 * quantity;
        return price;

    }else if(itemName=="Chicken Teriyaki Sub"){
        price = 849 * quantity;
        return price;

    }else if(itemName=="Chicken Tikka Sub"){
        price = 852 * quantity;
        return price;

    }else if(itemName=="Chicken Ham Sub"){
        price = 855 * quantity;
        return price;

    }else if(itemName=="Chicken Salami Sub"){
        price = 858 * quantity;
        return price;

    }else if(itemName=="Chicken Pepperoni Sub"){
        price = 861 * quantity;
        return price;

    }else if(itemName=="Chicken BBQ Sub"){
        price = 864 * quantity;
        return price;

    }else if(itemName=="Chicken Cheese Sub"){
        price = 867 * quantity;
        return price;

    }else if(itemName=="Chicken Delight Sub"){
        price = 870 * quantity;
        return price;

    }else if(itemName=="Chicken Overload Sub"){
        price = 873 * quantity;
        return price;

    }else if(itemName=="Grilled Chicken Sub"){
        price = 876 * quantity;
        return price;

    }else if(itemName=="Chicken Italiano Sub"){
        price = 879 * quantity;
        return price;

    }else if(itemName=="Chicken Supreme Sub"){
        price = 882 * quantity;
        return price;

    }else if(itemName=="Chicken Herb Sub"){
        price = 885 * quantity;
        return price;

    }else if(itemName=="Chicken Club Sub"){
        price = 888 * quantity;
        return price;

    }else if(itemName=="Turkey Sub"){
        price = 891 * quantity;
        return price;

    }else if(itemName=="Turkey Ham Sub"){
        price = 894 * quantity;
        return price;

    }else if(itemName=="Turkey Cheese Sub"){
        price = 897 * quantity;
        return price;

    }else if(itemName=="Turkey BBQ Sub"){
        price = 900 * quantity;
        return price;

    }else if(itemName=="Turkey Supreme Sub"){
        price = 903 * quantity;
        return price;

    }else if(itemName=="Italian BMT Sub"){
        price = 906 * quantity;
        return price;

    }else if(itemName=="Italian Cheese Melt Sub"){
        price = 909 * quantity;
        return price;

    }else if(itemName=="Italian Deluxe Sub"){
        price = 912 * quantity;
        return price;

    }else if(itemName=="Italian Chicken Melt Sub"){
        price = 915 * quantity;
        return price;

    }else if(itemName=="Italian Veg Melt Sub"){
        price = 918 * quantity;
        return price;

    }else if(itemName=="Egg Mayo Sub"){
        price = 921 * quantity;
        return price;

    }else if(itemName=="Egg Cheese Sub"){
        price = 924 * quantity;
        return price;

    }else if(itemName=="Egg BBQ Sub"){
        price = 927 * quantity;
        return price;

    }else if(itemName=="Egg Supreme Sub"){
        price = 930 * quantity;
        return price;

    }else if(itemName=="Egg Delight Sub"){
        price = 933 * quantity;
        return price;

    }else if(itemName=="Egg Pepper Sub"){
        price = 936 * quantity;
        return price;

    }else if(itemName=="Egg Italiano Sub"){
        price = 939 * quantity;
        return price;

    }else if(itemName=="Egg Herb Sub"){
        price = 942 * quantity;
        return price;

    }else if(itemName=="Egg Mayo Deluxe Sub"){
        price = 945 * quantity;
        return price;

    }else if(itemName=="Egg Cheese Melt Sub"){
        price = 948 * quantity;
        return price;

    }else if(itemName=="Double Veggie Sub"){
        price = 951 * quantity;
        return price;

    }else if(itemName=="Double Chicken Sub"){
        price = 954 * quantity;
        return price;

    }else if(itemName=="Double Turkey Sub"){
        price = 957 * quantity;
        return price;

    }else if(itemName=="Double Paneer Sub"){
        price = 960 * quantity;
        return price;

    }else if(itemName=="Double Egg Sub"){
        price = 963 * quantity;
        return price;

    }else if(itemName=="Subway Mega Veg Sub"){
        price = 966 * quantity;
        return price;

    }else if(itemName=="Subway Mega Chicken Sub"){
        price = 969 * quantity;
        return price;

    }else if(itemName=="Subway Royal Sub"){
        price = 972 * quantity;
        return price;

    }else{
        System.out.println(itemName+" Not found");
    }

    return price;
}
}