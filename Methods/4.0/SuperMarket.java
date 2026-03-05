class SuperMarket{

public static String[] searchBrand(String productName){
	
if(productName == "biscuit"){
    String biscuitBrands[] = {"Britannia Good Day","Britannia Marie Gold","Britannia Tiger",
    "Britannia Little Hearts","Parle-G","Parle Monaco","Parle Hide & Seek",
    "Parle Krackjack","Parle 20-20","Oreo Original","Oreo Chocolate","Britannia Bourbon",
    "Oreo Strawberry","Sunfeast Marie Light","Sunfeast Dark Fantasy","Sunfeast Mom's Magic",
    "Sunfeast Dream Cream","Unibic Choco Chip","Unibic Butter Cookies","McVitie's Digestive",
    "McVitie's Marie","Priyagold Butter Bite","Priyagold Cream Wafers","Anmol Marie",
    "Anmol Dream Lite","Cadbury Oreo Dipped","ITC Farmlite","NutriChoice Digestive","Bisk Farm Bourbon"};
    return biscuitBrands;
	}
	
if(productName == "shampoo"){
    String shampooBrands[] = {"Clinic Plus","Dove Intense Repair","Sunsilk Black Shine","Pantene Smooth & Silky","Head & Shoulders Cool Menthol",
    "Tresemme Keratin","Loreal Total Repair","Garnier Fructis","Indulekha Bringha","Himalaya Anti Hairfall",
    "Meera Herbal","Chik Shampoo","Vatika Naturals","Biotique Bio Kelp","Mamaearth Onion",
    "WOW Apple Cider Vinegar","Khadi Natural","SebaMed Everyday","Matrix Biolage","Wella Professionals",
    "Tresemme Botanique","Dove Daily Shine","Pantene Hairfall Control","Clinic Plus Strong & Long","Sunsilk Yellow",
    "Head & Shoulders Smooth","Loreal Clay","Garnier Ultra Blends","Johnson's Baby Shampoo"};
    return shampooBrands;
}

if(productName == "rice"){
    String riceBrands[] = {"India Gate Basmati","Daawat Basmati","Fortune Basmati","Kohinoor Basmati","Sri Lalitha Rice",
    "Sona Masoori Rice","Aashirvaad Basmati","Royal Basmati","Lal Qilla Basmati","24 Mantra Rice",
    "Organic Tattva Rice","BB Royal Rice","Udhayam Rice","Kurnool Rice","HMT Rice",
    "Ponmani Rice","Double Horse Rice","Shree Rice","Nirapara Rice","Patanjali Rice",
    "Vedaka Rice","Natureland Rice","Sri Bhagyalakshmi Rice","Thanjavur Rice","Krishna Rice",
    "Golden Harvest Rice","Saffola Rice","Daawat Rozana","India Gate Feast Rozzana"};
    return riceBrands;
}
if(productName == "teaPowder"){
    String teaBrands[] = {"Tata Tea Gold","Tata Tea Premium","Red Label","3 Roses","Wagh Bakri",
    "Brooke Bond Taj Mahal","Society Tea","Girnar Tea","AVT Tea","Tetley Tea",
    "Lipton Tea","Organic India Tea","Twinings Tea","Tata Agni","Red Label Natural Care",
    "Wagh Bakri Premium","Taj Mahal Gold","Society Masala Tea","Girnar Masala Tea","Tetley Green Tea",
    "Lipton Yellow Label","AVT Premium","Tata Chakra Gold","Brooke Bond Red Label Dust","Society Leaf Tea",
    "Wagh Bakri Leaf","Girnar Elaichi Tea","Tata Kanan Devan","Brooke Bond 3 Roses Dust"};
    return teaBrands;
}
if(productName == "chocolate"){
    String chocolateBrands[] = {"Dairy Milk","Dairy Milk Silk","KitKat","5 Star","Munch",
    "Perk","Milky Bar","Bournville","Snickers","Mars",
    "Galaxy","Ferrero Rocher","Toblerone","Lindt","Kinder Joy",
    "Hershey's Bar","Amul Dark Chocolate","Nestle Classic","Fuse","Temptations",
    "KitKat Dark","Dairy Milk Fruit & Nut","Milky Bar Choo","Kinder Bueno","Ferrero Moments",
    "Mars Mini","Snickers Mini","Galaxy Smooth","Lindt Excellence"};
    return chocolateBrands;
}
if(productName == "faceWash"){
    String faceWashBrands[] = {"Himalaya Neem","Garnier Men Turbo","Garnier Bright Complete","Pond's Pure White","Pond's Men Energy",
    "Clean & Clear","Lakme Blush & Glow","Mamaearth Ubtan","WOW Aloe Vera","Biotique Honey Gel",
    "Lotus Herbals","Nivea Men","L'Oreal Men Expert","Olay Foaming","Simple Kind To Skin",
    "Plum Green Tea","Cetaphil Cleanser","Neutrogena Deep Clean","VLCC Ayurveda","Khadi Herbal",
    "Patanjali Saundarya","Everyuth Naturals","Joy Skin Fruits","Dove Face Wash","Fair & Lovely Clean Up",
    "The Man Company","UrbanGabru","Minimalist Salicylic","Mamaearth Charcoal"};
    return faceWashBrands;
}
if(productName == "detergentPowder"){
    String detergentBrands[] = {"Surf Excel","Surf Excel Easy Wash","Ariel Matic","Ariel Complete","Tide Plus",
    "Tide Naturals","Rin Advanced","Wheel Green","Nirma Super","Ghadi Detergent",
    "Henko Stain Champion","Fena Superwash","Mr.White","Patang Detergent","Trilo",
    "Xpert Detergent","Ujala Detergent","Morelight Detergent","CleanMate","Power Wash",
    "Sunlight Powder","Bright Wash","Classic Detergent","Ace Detergent","OK Powder",
    "Sparkle Wash","Super White","Perfect Wash","Top Clean"};
    return detergentBrands;
}
if(productName == "coffeePowder"){
    String coffeeBrands[] = {"Bru Instant","Bru Gold","Nescafe Classic","Nescafe Sunrise","Nescafe Gold",
    "Continental Coffee","Tata Coffee","Leo Coffee","Narasu's Coffee","Cothas Coffee",
    "Halli Berri Coffee","Seven Beans","Sleepy Owl","Blue Tokai","Davidoff Coffee",
    "Lavazza Coffee","Rage Coffee","Bevzilla Coffee","Colombian Brew","Bayar's Coffee",
    "Levista Coffee","Malgudi Coffee","Sidapur Coffee","Araku Coffee","Mysore Coffee",
    "Filter Coffee Powder","Strong Blend Coffee","Premium Roast Coffee","Classic Filter Coffee"};
    return coffeeBrands;
}

if(productName == "soap"){
    String soapBrands[] = {"Lux","Lifebuoy","Santoor","Pears Pure","Dove Cream Beauty",
    "Dettol Original","Cinthol Lime","Hamam Neem","Mysore Sandal","Medimix Ayurvedic",
    "Patanjali Kanti","Godrej No.1","Fiama Di Wills","Vivel Aloe","Liril Lemon",
    "Chandrika Ayurvedic","Khadi Herbal","Biotique Basil","SebaMed Cleansing","Johnson's Baby Soap",
    "Himalaya Neem","Ayush Purifying","Power Soap","Nirma Bath","Aramusk",
    "Cinthol Cool","Dettol Skincare","Dove Pink","Lux International"};
    return soapBrands;
}
if(productName == "toothpaste"){
    String toothpasteBrands[] = {"Colgate Strong Teeth","Colgate Max Fresh","Colgate Total","Colgate Visible White","Colgate Active Salt",
    "Closeup Red Hot","Closeup Menthol Fresh","Pepsodent Germicheck","Pepsodent Expert Protection","Sensodyne Rapid Relief",
    "Sensodyne Fresh Mint","Dabur Red","Dabur Meswak","Patanjali Dant Kanti","Vicco Vajradanti",
    "Himalaya Complete Care","Oral-B Pro Health","Aquafresh","Anchor White","Promise Neem",
    "Babool","Meswak Herbal","Colgate Kids","Pepsodent Kids","Sensodyne Repair",
    "Closeup Whitening","Colgate Herbal","Dabur Herbal","Oral-B Gum Care"};
    return toothpasteBrands;
}
if(productName == "hairOil"){
    String hairOilBrands[] = {"Parachute Coconut Oil","Dabur Amla","Indulekha Bringha","Bajaj Almond Drops","Navratna Cool Oil",
    "Himalaya Anti Hairfall","Vatika Coconut Oil","Patanjali Kesh Kanti","Khadi Herbal Oil","WOW Onion Oil",
    "Mamaearth Onion Oil","Biotique Bhringraj","Meera Coconut Oil","Nihar Naturals","Emami 7 Oils",
    "Dabur Jasmine Oil","Parachute Advansed","Dabur Vatika Almond","Indulekha Neemraj","Urban Botanics Oil",
    "Soulflower Castor Oil","Khadi Amla Oil","Himani Navratna","Parachute Aloe Vera","Dabur Anmol",
    "Bajaj Brahmi Oil","Shalimar Coconut Oil","Himalaya Coconut Oil","Kesh King Oil"};
    return hairOilBrands;
}

if(productName == "handWash"){
    String handWashBrands[] = {"Dettol Liquid","Lifebuoy Total","Savlon Moisture","Godrej Protekt","Palmolive Handwash",
    "Himalaya Pure Hands","Dove Handwash","Fiama Handwash","Pears Handwash","Santoor Handwash",
    "Medimix Handwash","Khadi Herbal","Biotique Handwash","Patanjali Handwash","Nivea Handwash",
    "BoroPlus Handwash","Clean & Care","Good Vibes","Vivel Handwash","Joy Handwash",
    "Aloe Vera Handwash","Lemon Fresh Handwash","Neem Care Handwash","Advanced Germ Protection","Soft Touch Handwash",
    "Daily Shine Handwash","Fresh Guard","Gentle Care","Antibacterial Plus"};
    return handWashBrands;
}
if(productName == "deodorant"){
    String deodorantBrands[] = {"Axe Dark Temptation","Axe Signature","Wild Stone","Wild Stone Code","Fogg Fresh",
    "Fogg Royal","Nivea Men","Engage M1","Engage W2","Park Avenue Good Morning",
    "Denver Hamilton","Layer'r Shot","Set Wet Cool","Old Spice","Brut Classic",
    "Yardley London","Rexona Women","Adidas Deo","Nike Deo","Bella Vita Deo",
    "Beardo Mafia","The Man Company","Ramsons Deo","Envy 1000","Secret Temptation",
    "Jovan Musk","Police To Be","Armaf Club De Nuit","Ajmal Silver Shade"};
    return deodorantBrands;
}
if(productName == "milk"){
    String milkBrands[] = {"Nandini Milk","Amul Milk","Arokya Milk","Heritage Milk","Mother Dairy",
    "Dodla Milk","Thirumala Milk","Jersey Milk","Hatsun Milk","Milky Mist Milk",
    "Vijaya Milk","Saras Milk","Parag Milk","Gokul Milk","Kwality Milk",
    "Akshayakalpa Milk","Country Delight","Nutralite Milk","Ananda Milk","Verka Milk",
    "Prabhat Milk","Warana Milk","Nestle A+ Milk","Britannia Milk","Reliance Dairy",
    "Metro Dairy","Namdhari Milk","Organic India Milk","Fresh & Pure Milk"};
    return milkBrands;
}
if(productName == "bread"){
    String breadBrands[] = {"Britannia Bread","Harvest Gold","Modern Bread","Fresho Bread","English Oven",
    "Kitty Bread","Spencer's Bread","Nilgiris Bread","Wibs Bread","Bonn Bread",
    "Kalory Bread","Metro Bread","Perfect Bread","Daily Fresh Bread","Golden Harvest Bread",
    "Premium Slice Bread","Brown Crust Bread","Whole Wheat Bread","Milk Bread","Sandwich Bread",
    "Multi Grain Bread","Oats Bread","Fruit Bread","Garlic Bread","Sweet Bread",
    "Classic White Bread","Soft Slice Bread","Fresh Bake Bread","Super Soft Bread"};
    return breadBrands;
}
if(productName == "sugar"){
    String sugarBrands[] = {"Madhur Sugar","Trust Sugar","Parry's Sugar","Uttam Sugar","Dhampur Sugar",
    "Dwarikesh Sugar","Balrampur Sugar","EID Parry Sugar","Sakthi Sugar","Mawana Sugar",
    "Shree Renuka Sugar","Bajaj Sugar","Triveni Sugar","Organic Tattva Sugar","24 Mantra Sugar",
    "Natureland Sugar","BB Royal Sugar","Vedaka Sugar","Fortune Sugar","More Choice Sugar",
    "Daily Choice Sugar","Classic Crystal Sugar","Premium White Sugar","Refined Sugar","Sulphurless Sugar",
    "Fine Grain Sugar","Natural Cane Sugar","Golden Sugar","Pure Crystal Sugar"};
    return sugarBrands;
}
if(productName == "salt"){
    String saltBrands[] = {"Tata Salt","Aashirvaad Salt","Catch Salt","Annapurna Salt","Saffola Salt",
    "Captain Cook Salt","Nirma Salt","Sambhar Salt","Surya Salt","i-Shakti Salt",
    "Nature Fresh Salt","24 Mantra Salt","Organic Tattva Salt","Vedaka Salt","BB Royal Salt",
    "More Choice Salt","Classic Iodised Salt","Sea Salt","Rock Salt","Himalayan Pink Salt",
    "Sendha Namak","Table Salt","Fine Salt","Crystal Salt","Low Sodium Salt",
    "Premium Iodized Salt","Natural Sea Salt","Refined Salt","Pure White Salt"};
    return saltBrands;
}
if(productName == "toothbrush"){
    String toothbrushBrands[] = {"Colgate ZigZag","Colgate Slim Soft","Colgate Gentle","Oral-B Pro Health","Oral-B Indicator",
    "Oral-B Sensitive","Pepsodent Soft","Pepsodent Double Action","Closeup Toothbrush","Sensodyne Toothbrush",
    "Anchor Toothbrush","Promise Toothbrush","Dabur Toothbrush","Himalaya Toothbrush","Patanjali Toothbrush",
    "Aquafresh Toothbrush","Classic Soft Brush","Medium Bristle Brush","Hard Bristle Brush","Kids Toothbrush",
    "Ultra Soft Brush","Deep Clean Brush","Advanced Care Brush","Premium Brush","Twin Pack Brush",
    "Whitening Brush","Gum Care Brush","Compact Head Brush","Flexi Grip Brush"};
    return toothbrushBrands;
}
if(productName == "faceCream"){
    String faceCreamBrands[] = {"Pond's Light Moisturizer","Pond's Bright Beauty","Lakme Peach Milk","Lakme Absolute","Nivea Soft",
    "Nivea Creme","Olay Natural White","Olay Total Effects","Garnier Light","Garnier Vitamin C",
    "Fair & Lovely Advanced","Himalaya Nourishing","Biotique Morning Nectar","Mamaearth Vitamin C","WOW Skin Science",
    "Lotus Herbals WhiteGlow","VLCC Skin Brightening","Cetaphil Moisturizing","Simple Hydrating","Plum Green Tea",
    "Minimalist Vitamin B5","Khadi Herbal Cream","Patanjali Saundarya","Joy Skin Cream","Dove Beauty Cream",
    "L'Oreal Revitalift","Olay Retinol","Nivea Men Creme","The Man Company Cream"};
    return faceCreamBrands;
}
if(productName == "floorCleaner"){
    String floorCleanerBrands[] = {"Lizol Citrus","Lizol Lavender","Harpic Floor Cleaner","Domex Floor Cleaner","Colin Floor Cleaner",
    "Vim Floor Cleaner","Dettol Floor Cleaner","Savlon Floor Cleaner","Pril Floor Cleaner","Fena Floor Cleaner",
    "Nimyle Floor Cleaner","More Choice Cleaner","Classic Floor Cleaner","Sparkle Floor Cleaner","Power Clean",
    "Phenyl White","Black Phenyl","Herbal Floor Cleaner","Neem Floor Cleaner","Rose Floor Cleaner",
    "Jasmine Floor Cleaner","Lemon Fresh Cleaner","Advanced Germ Cleaner","Premium Floor Wash","Strong Action Cleaner",
    "Disinfectant Floor Cleaner","Shine Plus Cleaner","Daily Fresh Cleaner","Extra Power Cleaner"};
    return floorCleanerBrands;
}
if(productName == "cookingOil"){
    String cookingOilBrands[] = {"Fortune Sunflower","Fortune Rice Bran","Saffola Gold","Saffola Active","Sundrop Oil",
    "Dhara Refined","Gemini Oil","Freedom Oil","Gold Winner","Sunpure Oil",
    "Vimal Oil","Nature Fresh Oil","24 Mantra Oil","Organic Tattva Oil","Vedaka Oil",
    "BB Royal Oil","More Choice Oil","Emami Healthy Oil","Patanjali Oil","Engine Mustard Oil",
    "Gokul Oil","Cargill Nature Fresh","Crystal Oil","Classic Refined Oil","Premium Cooking Oil",
    "Double Filter Oil","Filtered Groundnut Oil","Cold Pressed Oil","Healthy Life Oil"};
    return cookingOilBrands;
}
if(productName == "noodles"){
    String noodlesBrands[] = {"Maggi 2 Minute","Maggi Masala","Yippee Magic Masala","Yippee Mood Masala","Top Ramen Curry",
    "Top Ramen Masala","Ching's Secret","Knorr Soupy Noodles","Sunfeast Yippee","Wai Wai Noodles",
    "Patanjali Atta Noodles","Smith & Jones Noodles","Ching's Schezwan","Maggi Oats Noodles","Maggi Chicken Noodles",
    "Yippee Atta Noodles","Knorr Chicken Noodles","Top Ramen Fiery","Maggi Vegetable","Classic Instant Noodles",
    "Cup Noodles","Premium Wheat Noodles","Spicy Masala Noodles","Cheese Noodles","Korean Style Noodles",
    "Chinese Style Noodles","Desi Masala Noodles","Extra Spicy Noodles","Family Pack Noodles"};
    return noodlesBrands;
}
if(productName == "biscuitsCream"){
    String biscuitsCreamBrands[] = {"Oreo Vanilla","Oreo Chocolate","Britannia Bourbon","Britannia Little Hearts","Sunfeast Dream Cream",
    "Hide & Seek Cream","Parle 20-20 Cream","Priyagold Cream Wafers","Bisk Farm Cream","McVitie's Cream",
    "Unibic Cream","Good Day Cream","Tiger Cream","Anmol Cream","Monaco Cream",
    "Krackjack Cream","Mom's Magic Cream","Dark Fantasy Cream","Treat Croissant Cream","Milk Bikis Cream",
    "Chocolate Cream Biscuit","Strawberry Cream Biscuit","Orange Cream Biscuit","Vanilla Cream Biscuit","Double Cream Biscuit",
    "Premium Cream Biscuit","Family Pack Cream","Kids Cream Biscuit","Classic Cream Biscuit"};
    return biscuitsCreamBrands;
}
if(productName == "iceCream"){
    String iceCreamBrands[] = {"Amul Vanilla","Amul Chocolate","Amul Butterscotch","Kwality Walls Cornetto","Kwality Walls Magnum",
    "Vadilal Vanilla","Vadilal Cassata","Mother Dairy Ice Cream","Arun Ice Cream","Havmor Ice Cream",
    "Cream Bell","Naturals Ice Cream","Baskin Robbins","London Dairy","Top N Town",
    "Dinshaw's Ice Cream","Polar Bear Ice Cream","Scoops Ice Cream","Milky Mist Ice Cream","Nandini Ice Cream",
    "Amul Kulfi","Kwality Walls Feast","Vadilal Kulfi","Mother Dairy Kulfi","Havmor Kulfi",
    "Chocolate Cone","Strawberry Cup","Family Pack Ice Cream","Premium Ice Cream"};
    return iceCreamBrands;
}
if(productName == "jam"){
    String jamBrands[] = {"Kissan Mixed Fruit","Kissan Strawberry","Kissan Mango","Mapro Mixed Fruit","Mapro Strawberry",
    "Tops Mixed Fruit","Tops Orange","Mala's Jam","Urban Platter Jam","24 Mantra Jam",
    "Organic Tattva Jam","BB Royal Jam","More Choice Jam","Classic Fruit Jam","Premium Strawberry Jam",
    "Mixed Berry Jam","Blueberry Jam","Pineapple Jam","Apple Jam","Mango Jam",
    "Raspberry Jam","Natural Fruit Jam","No Sugar Jam","Kids Special Jam","Family Pack Jam",
    "Fresh Fruit Jam","Homestyle Jam","Golden Harvest Jam","Pure Delight Jam"};
    return jamBrands;
}
if(productName == "ketchup"){
    String ketchupBrands[] = {"Kissan Tomato","Maggi Tomato","Tops Tomato","Del Monte Tomato","Heinz Tomato",
    "Veeba Tomato","Ching's Tomato","Urban Platter Ketchup","24 Mantra Ketchup","Organic Tattva Ketchup",
    "BB Royal Ketchup","More Choice Ketchup","Classic Tomato Ketchup","Premium Tomato Sauce","Spicy Tomato Sauce",
    "Sweet Tomato Sauce","Garlic Tomato Sauce","Chilli Tomato Sauce","Hot & Sweet Sauce","Kids Tomato Sauce",
    "Family Pack Ketchup","Restaurant Style Sauce","Desi Style Ketchup","Tangy Tomato Sauce","Extra Spicy Sauce",
    "Natural Tomato Sauce","Fresh Blend Ketchup","Golden Harvest Ketchup","Pure Tomato Sauce"};
    return ketchupBrands;
}
if(productName == "oats"){
    String oatsBrands[] = {"Quaker Oats","Saffola Oats","Kellogg's Oats","Bagrry's Oats","True Elements Oats",
    "24 Mantra Oats","Organic Tattva Oats","BB Royal Oats","More Choice Oats","Patanjali Oats",
    "Natureland Oats","Yoga Bar Oats","Urban Platter Oats","Classic Rolled Oats","Instant Oats",
    "Steel Cut Oats","Masala Oats","Honey Oats","High Fiber Oats","Premium Oats",
    "Healthy Heart Oats","Diet Oats","Family Pack Oats","Kids Oats","Natural Oats",
    "Fresh Harvest Oats","Golden Grain Oats","Wholesome Oats","Pure Oats"};
    return oatsBrands;
}
if(productName == "pickle"){
    String pickleBrands[] = {"Mother's Recipe Mango","Mother's Recipe Lime","Priya Mango Pickle","Priya Lemon Pickle","Aachi Mango Pickle",
    "Aachi Garlic Pickle","Eastern Pickle","Nilons Mango","Nilons Mixed","Bedekar Mango",
    "Patanjali Pickle","24 Mantra Pickle","Organic Tattva Pickle","BB Royal Pickle","More Choice Pickle",
    "Classic Mango Pickle","Premium Lime Pickle","Andhra Avakaya","Gongura Pickle","Garlic Pickle",
    "Mixed Veg Pickle","Red Chilli Pickle","Sweet Lime Pickle","Green Chilli Pickle","Family Pack Pickle",
    "Homestyle Pickle","Traditional Pickle","Desi Style Pickle","Spicy Mango Pickle"};
    return pickleBrands;
}
if(productName == "butter"){
    String butterBrands[] = {"Amul Butter","Nandini Butter","Milky Mist Butter","Mother Dairy Butter","Britannia Butter",
    "Heritage Butter","Dodla Butter","Arokya Butter","Gokul Butter","Saras Butter",
    "Vijaya Butter","Kwality Butter","Ananda Butter","Parag Butter","Warana Butter",
    "Akshayakalpa Butter","Country Delight Butter","Metro Butter","Nilgiris Butter","Daily Fresh Butter",
    "Classic Salted Butter","Unsalted Butter","Premium Butter","Fresh Cream Butter","Farm Fresh Butter",
    "Pure Cow Butter","Table Butter","Spread Butter","Golden Butter"};
    return butterBrands;
}

if(productName == "cheese"){
    String cheeseBrands[] = {"Amul Cheese","Britannia Cheese","Milky Mist Cheese","Mother Dairy Cheese","Go Cheese",
    "D'lecta Cheese","Gowardhan Cheese","Nandini Cheese","Heritage Cheese","Kodai Cheese",
    "Laughing Cow","Arla Cheese","President Cheese","Parag Cheese","Akshayakalpa Cheese",
    "Metro Cheese","Nilgiris Cheese","Processed Cheese","Cheddar Cheese","Mozzarella Cheese",
    "Pizza Cheese","Cheese Cubes","Cheese Slices","Cheese Spread","Cheese Block",
    "Premium Cheese","Classic Cheese","Fresh Cream Cheese","Smoked Cheese"};
    return cheeseBrands;
}

if(productName == "paneer"){
    String paneerBrands[] = {"Amul Paneer","Milky Mist Paneer","Mother Dairy Paneer","Britannia Paneer","Gowardhan Paneer",
    "Nandini Paneer","Heritage Paneer","Dodla Paneer","Arokya Paneer","Akshayakalpa Paneer",
    "Metro Paneer","Nilgiris Paneer","Fresh Paneer","Malai Paneer","Premium Paneer",
    "Organic Paneer","Classic Paneer","Soft Paneer","Farm Fresh Paneer","Cow Milk Paneer",
    "Buffalo Milk Paneer","Malabar Paneer","Daily Fresh Paneer","Healthy Paneer","Pure Paneer",
    "Desi Paneer","Homestyle Paneer","Creamy Paneer","Special Paneer"};
    return paneerBrands;
}

if(productName == "ghee"){
    String gheeBrands[] = {"Amul Ghee","Nandini Ghee","Milky Mist Ghee","Mother Dairy Ghee","Gowardhan Ghee",
    "Aashirvaad Ghee","Patanjali Ghee","Heritage Ghee","Dodla Ghee","Arokya Ghee",
    "Akshayakalpa Ghee","Metro Ghee","Nilgiris Ghee","Desi Cow Ghee","Organic Ghee",
    "Classic Ghee","Premium Ghee","Farm Fresh Ghee","Pure Cow Ghee","Buffalo Ghee",
    "Vedic Ghee","Ananda Ghee","Saras Ghee","Vijaya Ghee","Parag Ghee",
    "Traditional Ghee","Healthy Ghee","Golden Ghee","Fresh Ghee"};
    return gheeBrands;
}

if(productName == "curd"){
    String curdBrands[] = {"Nandini Curd","Amul Curd","Milky Mist Curd","Mother Dairy Curd","Heritage Curd",
    "Dodla Curd","Arokya Curd","Gowardhan Curd","Akshayakalpa Curd","Metro Curd",
    "Nilgiris Curd","Fresh Curd","Thick Curd","Premium Curd","Classic Curd",
    "Organic Curd","Farm Fresh Curd","Healthy Curd","Probiotic Curd","Low Fat Curd",
    "Full Cream Curd","Desi Curd","Homestyle Curd","Daily Fresh Curd","Pure Curd",
    "Natural Curd","Buffalo Curd","Cow Milk Curd","Special Curd"};
    return curdBrands;
}
if(productName == "maida"){
    String maidaBrands[] = {"Aashirvaad Maida","Pillsbury Maida","Fortune Maida","24 Mantra Maida","Organic Tattva Maida",
    "BB Royal Maida","More Choice Maida","Natureland Maida","Classic Maida","Premium Maida",
    "Fine Maida","Super White Maida","Fresh Harvest Maida","Golden Grain Maida","Daily Choice Maida",
    "Shakti Bhog Maida","Rajdhani Maida","Annapurna Maida","Reliable Maida","Grihasthi Maida",
    "Vikram Maida","Samrat Maida","Healthy Life Maida","Pure Maida","Quality Maida",
    "Special Maida","Ultra Fine Maida","Select Maida","Traditional Maida"};
    return maidaBrands;
}

if(productName == "rava"){
    String ravaBrands[] = {"Aashirvaad Rava","Pillsbury Rava","Fortune Rava","24 Mantra Rava","Organic Tattva Rava",
    "BB Royal Rava","More Choice Rava","Natureland Rava","Classic Rava","Premium Rava",
    "Bombay Rava","Fine Rava","Fresh Harvest Rava","Golden Grain Rava","Daily Choice Rava",
    "Shakti Bhog Rava","Rajdhani Rava","Annapurna Rava","Reliable Rava","Grihasthi Rava",
    "Vikram Rava","Samrat Rava","Healthy Life Rava","Pure Rava","Quality Rava",
    "Special Rava","Ultra Fine Rava","Select Rava","Traditional Rava"};
    return ravaBrands;
}

if(productName == "wheatFlour"){
    String wheatFlourBrands[] = {"Aashirvaad Atta","Pillsbury Atta","Fortune Atta","24 Mantra Atta","Organic Tattva Atta",
    "BB Royal Atta","More Choice Atta","Natureland Atta","Classic Atta","Premium Atta",
    "Shakti Bhog Atta","Rajdhani Atta","Annapurna Atta","Reliable Atta","Grihasthi Atta",
    "Vikram Atta","Samrat Atta","Healthy Life Atta","Pure Atta","Quality Atta",
    "Chakki Fresh Atta","Whole Wheat Atta","Multigrain Atta","Daily Choice Atta","Golden Grain Atta",
    "Select Atta","Traditional Atta","Fine Atta","Fresh Harvest Atta"};
    return wheatFlourBrands;
}

if(productName == "poha"){
    String pohaBrands[] = {"Tata Sampann Poha","24 Mantra Poha","Organic Tattva Poha","BB Royal Poha","More Choice Poha",
    "Natureland Poha","Classic Poha","Premium Poha","Thin Poha","Thick Poha",
    "Fresh Harvest Poha","Golden Grain Poha","Daily Choice Poha","Shakti Bhog Poha","Rajdhani Poha",
    "Annapurna Poha","Reliable Poha","Grihasthi Poha","Vikram Poha","Samrat Poha",
    "Healthy Life Poha","Pure Poha","Quality Poha","Special Poha","Select Poha",
    "Traditional Poha","Fine Poha","Farm Fresh Poha","Desi Poha"};
    return pohaBrands;
}

if(productName == "vermicelli"){
    String vermicelliBrands[] = {"MTR Vermicelli","Bambino Vermicelli","Nestle Vermicelli","24 Mantra Vermicelli","Organic Tattva Vermicelli",
    "BB Royal Vermicelli","More Choice Vermicelli","Natureland Vermicelli","Classic Vermicelli","Premium Vermicelli",
    "Roasted Vermicelli","Thin Vermicelli","Fresh Harvest Vermicelli","Golden Grain Vermicelli","Daily Choice Vermicelli",
    "Shakti Bhog Vermicelli","Rajdhani Vermicelli","Annapurna Vermicelli","Reliable Vermicelli","Grihasthi Vermicelli",
    "Vikram Vermicelli","Samrat Vermicelli","Healthy Life Vermicelli","Pure Vermicelli","Quality Vermicelli",
    "Special Vermicelli","Select Vermicelli","Traditional Vermicelli","Fine Vermicelli"};
    return vermicelliBrands;
}

if(productName == "pasta"){
    String pastaBrands[] = {"Maggi Pasta","Sunfeast Pasta","Weikfield Pasta","Borges Pasta","24 Mantra Pasta",
    "Organic Tattva Pasta","BB Royal Pasta","More Choice Pasta","Natureland Pasta","Classic Pasta",
    "Premium Pasta","Penne Pasta","Macaroni Pasta","Spaghetti Pasta","Fusilli Pasta",
    "Whole Wheat Pasta","Cheese Pasta","Tomato Pasta","Italian Style Pasta","Family Pack Pasta",
    "Kids Pasta","Masala Pasta","Healthy Pasta","Fresh Harvest Pasta","Golden Grain Pasta",
    "Select Pasta","Traditional Pasta","Fine Pasta","Special Pasta"};
    return pastaBrands;
}

if(productName == "macaroni"){
    String macaroniBrands[] = {"Weikfield Macaroni","Sunfeast Macaroni","Maggi Macaroni","Borges Macaroni","24 Mantra Macaroni",
    "Organic Tattva Macaroni","BB Royal Macaroni","More Choice Macaroni","Natureland Macaroni","Classic Macaroni",
    "Premium Macaroni","Elbow Macaroni","Cheese Macaroni","Masala Macaroni","Whole Wheat Macaroni",
    "Italian Style Macaroni","Family Pack Macaroni","Kids Macaroni","Healthy Macaroni","Fresh Harvest Macaroni",
    "Golden Grain Macaroni","Select Macaroni","Traditional Macaroni","Fine Macaroni","Special Macaroni",
    "Quality Macaroni","Pure Macaroni","Standard Macaroni","Daily Choice Macaroni"};
    return macaroniBrands;
}

if(productName == "cornflakes"){
    String cornflakesBrands[] = {"Kellogg's Cornflakes","Bagrry's Cornflakes","Quaker Cornflakes","24 Mantra Cornflakes","Organic Tattva Cornflakes",
    "BB Royal Cornflakes","More Choice Cornflakes","Natureland Cornflakes","Classic Cornflakes","Premium Cornflakes",
    "Honey Cornflakes","Choco Cornflakes","Fruit Cornflakes","Almond Cornflakes","High Fiber Cornflakes",
    "Healthy Heart Cornflakes","Kids Cornflakes","Family Pack Cornflakes","Golden Grain Cornflakes","Fresh Harvest Cornflakes",
    "Select Cornflakes","Traditional Cornflakes","Fine Cornflakes","Special Cornflakes","Quality Cornflakes",
    "Pure Cornflakes","Crunchy Cornflakes","Diet Cornflakes","Multigrain Cornflakes"};
    return cornflakesBrands;
}

if(productName == "muesli"){
    String muesliBrands[] = {"Kellogg's Muesli","Bagrry's Muesli","Yoga Bar Muesli","True Elements Muesli","24 Mantra Muesli",
    "Organic Tattva Muesli","BB Royal Muesli","More Choice Muesli","Natureland Muesli","Classic Muesli",
    "Premium Muesli","Fruit & Nut Muesli","Choco Muesli","Almond Muesli","High Fiber Muesli",
    "Healthy Heart Muesli","Kids Muesli","Family Pack Muesli","Golden Grain Muesli","Fresh Harvest Muesli",
    "Select Muesli","Traditional Muesli","Fine Muesli","Special Muesli","Quality Muesli",
    "Pure Muesli","Crunchy Muesli","Diet Muesli","Multigrain Muesli"};
    return muesliBrands;
}

if(productName == "energy"){
    String boostBrands[] = {"Boost Original","Boost Chocolate","Horlicks Classic","Horlicks Chocolate","Bournvita",
    "Complan","Pediasure","Ensure","Protinex","Milo",
    "Junior Horlicks","Women's Horlicks","Mother Horlicks","Junior Complan","Protein Plus",
    "Health Mix Powder","Maltova","Nutrela Health Drink","Junior Boost","Chocolate Malt Drink",
    "Premium Health Drink","Kids Nutrition Drink","Strong Bones Drink","Energy Health Drink","Family Pack Health Drink",
    "Classic Malt Drink","High Protein Drink","Daily Nutrition Drink","Special Boost Pack"};
    return boostBrands;
}
if(productName == "horlicks"){
    String horlicksBrands[] = {"Horlicks Classic","Horlicks Chocolate","Horlicks Elaichi","Horlicks Women's","Horlicks Junior",
    "Horlicks Growth+","Horlicks Protein+","Lite Horlicks","Mother Horlicks","Junior Chocolate Horlicks",
    "Horlicks Diabetes Plus","Horlicks Stage 1","Horlicks Stage 2","Horlicks Stage 3","Horlicks Health & Nutrition",
    "Horlicks Immunity+","Horlicks Malt","Horlicks Vanilla","Horlicks Caramel","Horlicks Almond",
    "Horlicks Kesar","Horlicks Strong","Horlicks Family Pack","Horlicks Sachet","Horlicks Jar",
    "Horlicks Refill","Horlicks Mini Pack","Horlicks Energy","Horlicks Special Edition"};
    return horlicksBrands;
}

if(productName == "bournvita"){
    String bournvitaBrands[] = {"Bournvita Classic","Bournvita Lil Champs","Bournvita 5 Star Magic","Bournvita Women","Bournvita Shakti",
    "Bournvita Chocolate","Bournvita Health Drink","Bournvita Jar Pack","Bournvita Refill","Bournvita Sachet",
    "Bournvita Pro-Health","Bournvita Strong","Bournvita Kids Pack","Bournvita Premium","Bournvita Family Pack",
    "Bournvita Energy+","Bournvita Growth+","Bournvita Mini Pack","Bournvita Almond","Bournvita Caramel",
    "Bournvita Vanilla","Bournvita Malt","Bournvita Jar Small","Bournvita Jar Large","Bournvita Combo Pack",
    "Bournvita Value Pack","Bournvita Limited Edition","Bournvita Immunity+","Bournvita Special Pack"};
    return bournvitaBrands;
}

if(productName == "bucket"){
    String bucketBrands[] = {"Milton Bucket","Cello Bucket","Supreme Bucket","Princeware Bucket","BB Royal Bucket",
    "More Choice Bucket","Classic Bucket","Premium Bucket","Plastic Bucket","Steel Bucket",
    "Jumbo Bucket","Mini Bucket","Large Bucket","Small Bucket","Family Pack Bucket",
    "Value Pack Bucket","Strong Handle Bucket","Color Bucket","Designer Bucket","Eco Bucket",
    "Daily Use Bucket","Select Bucket","Quality Bucket","Special Bucket","Traditional Bucket",
    "Super Strong Bucket","Heavy Duty Bucket","Light Weight Bucket","Ultra Bucket"};
    return bucketBrands;
}

if(productName == "mug"){
    String mugBrands[] = {"Milton Mug","Cello Mug","Supreme Mug","Princeware Mug","BB Royal Mug",
    "More Choice Mug","Classic Mug","Premium Mug","Plastic Mug","Steel Mug",
    "Jumbo Mug","Mini Mug","Large Mug","Small Mug","Family Pack Mug",
    "Value Pack Mug","Strong Mug","Color Mug","Designer Mug","Eco Mug",
    "Daily Use Mug","Select Mug","Quality Mug","Special Mug","Traditional Mug",
    "Super Strong Mug","Heavy Duty Mug","Light Weight Mug","Ultra Mug"};
    return mugBrands;
}

if(productName == "greenTea"){
    String greenTeaBrands[] = {"Lipton Green Tea","Tetley Green Tea","Tata Green Tea","Girnar Green Tea","Society Green Tea",
    "Wagh Bakri Green Tea","Organic India Green Tea","24 Mantra Green Tea","Twinings Green Tea","Typhoo Green Tea",
    "Lipton Lemon Green Tea","Lipton Honey Green Tea","Tetley Lemon Green Tea","Girnar Tulsi Green Tea","Organic Tulsi Tea",
    "Chamomile Green Tea","Jasmine Green Tea","Mint Green Tea","Slim Green Tea","Detox Green Tea",
    "Classic Green Tea","Premium Green Tea","Family Pack Green Tea","Tea Bags Pack","Loose Green Tea",
    "Herbal Green Tea","Immunity Green Tea","Weight Loss Tea","Pure Green Tea"};
    return greenTeaBrands;
}

if(productName == "peanuts"){
    String peanutsBrands[] = {"Haldiram's Peanuts","Balaji Peanuts","BB Royal Peanuts","24 Mantra Peanuts","Organic Tattva Peanuts",
    "More Choice Peanuts","Classic Peanuts","Premium Peanuts","Salted Peanuts","Masala Peanuts",
    "Roasted Peanuts","Spicy Peanuts","Plain Peanuts","Healthy Peanuts","Fresh Peanuts",
    "Golden Peanuts","Crunchy Peanuts","Desi Peanuts","Farm Fresh Peanuts","Family Pack Peanuts",
    "Jumbo Peanuts","Dry Roasted Peanuts","Chilli Peanuts","Tandoori Peanuts","Value Pack Peanuts",
    "Super Crunch Peanuts","Pure Peanuts","Quality Peanuts","Select Peanuts"};
    return peanutsBrands;
}

if(productName == "almonds"){
    String almondsBrands[] = {"California Almonds","BB Royal Almonds","24 Mantra Almonds","Organic Tattva Almonds","More Choice Almonds",
    "Nutraj Almonds","Happilo Almonds","Vedaka Almonds","Classic Almonds","Premium Almonds",
    "Mamra Almonds","Salted Almonds","Roasted Almonds","Plain Almonds","Healthy Almonds",
    "Fresh Almonds","Golden Almonds","Jumbo Almonds","Family Pack Almonds","Value Pack Almonds",
    "Pure Almonds","Quality Almonds","Select Almonds","Desi Almonds","Natural Almonds",
    "Crunchy Almonds","Super Almonds","Fine Almonds","Special Almonds"};
    return almondsBrands;
}

if(productName == "cashews"){
    String cashewsBrands[] = {"BB Royal Cashews","24 Mantra Cashews","Organic Tattva Cashews","More Choice Cashews","Nutraj Cashews",
    "Happilo Cashews","Vedaka Cashews","Classic Cashews","Premium Cashews","Salted Cashews",
    "Roasted Cashews","Plain Cashews","Healthy Cashews","Fresh Cashews","Golden Cashews",
    "Jumbo Cashews","Family Pack Cashews","Value Pack Cashews","Pure Cashews","Quality Cashews",
    "Select Cashews","Desi Cashews","Natural Cashews","Crunchy Cashews","Super Cashews",
    "Fine Cashews","Special Cashews","W320 Cashews","Goan Cashews"};
    return cashewsBrands;
}

if(productName == "raisins"){
    String raisinsBrands[] = {"BB Royal Raisins","24 Mantra Raisins","Organic Tattva Raisins","More Choice Raisins","Nutraj Raisins",
    "Happilo Raisins","Vedaka Raisins","Classic Raisins","Premium Raisins","Golden Raisins",
    "Black Raisins","Seedless Raisins","Plain Raisins","Healthy Raisins","Fresh Raisins",
    "Jumbo Raisins","Family Pack Raisins","Value Pack Raisins","Pure Raisins","Quality Raisins",
    "Select Raisins","Desi Raisins","Natural Raisins","Crunchy Raisins","Super Raisins",
    "Fine Raisins","Special Raisins","Afghan Raisins","Kishmish Premium"};
    return raisinsBrands;
}

if(productName == "dates"){
    String datesBrands[] = {"Lion Dates","BB Royal Dates","24 Mantra Dates","Organic Tattva Dates","More Choice Dates",
    "Nutraj Dates","Happilo Dates","Vedaka Dates","Classic Dates","Premium Dates",
    "Medjool Dates","Omani Dates","Seedless Dates","Plain Dates","Healthy Dates",
    "Fresh Dates","Golden Dates","Jumbo Dates","Family Pack Dates","Value Pack Dates",
    "Pure Dates","Quality Dates","Select Dates","Desi Dates","Natural Dates",
    "Crunchy Dates","Super Dates","Fine Dates","Special Dates"};
    return datesBrands;
}

if(productName == "candy"){
    String candyBrands[] = {"Alpenliebe","Eclairs","Pulse Candy","Mentos","Center Fresh",
    "Center Fruit","Hajmola Candy","Parle Kismi","Lotte Choco Pie Candy","Lactogem",
    "Pan Pasand","Poppins","Gems Candy","Skittles","Chupa Chups",
    "Jolly Rancher","Toffichoo","Caramel Candy","Milk Toffee","Fruit Candy",
    "Orange Candy","Strawberry Candy","Mint Candy","Chocolate Candy","Sour Candy",
    "Kids Candy Pack","Family Candy Pack","Premium Candy","Classic Candy"};
    return candyBrands;
}

if(productName == "juice"){
    String juiceBrands[] = {"Real Fruit Juice","Tropicana Juice","Minute Maid","B Natural Juice","Paper Boat Juice",
    "Frooti Mango","Maaza Mango","Slice Mango","Appy Fizz","Coolberg Juice",
    "BB Royal Juice","24 Mantra Juice","Organic Tattva Juice","More Choice Juice","Mixed Fruit Juice",
    "Orange Juice","Apple Juice","Pineapple Juice","Guava Juice","Litchi Juice",
    "Mango Juice","Cranberry Juice","Grape Juice","Pomegranate Juice","Fresh Juice Pack",
    "Family Pack Juice","Premium Juice","Classic Juice","Healthy Juice"};
    return juiceBrands;
}
if(productName == "mineralWater"){
    String mineralWaterBrands[] = {"Bisleri","Kinley","Aquafina","Bailley","Himalayan Water",
    "Tata Copper+","Vedica Water","Rail Neer","Kingfisher Water","Oxyrich Water",
    "BB Royal Water","24 Mantra Water","Organic Tattva Water","More Choice Water","Fresh Water Bottle",
    "1L Water Bottle","2L Water Bottle","500ml Water","Premium Mineral Water","Natural Spring Water",
    "Packaged Drinking Water","Pure Life Water","Crystal Clear Water","Healthy Hydration Water","Family Pack Water",
    "Club Soda Water","Sparkling Water","Copper Infused Water","Classic Mineral Water"};
    return mineralWaterBrands;
}

if(productName == "energyDrink"){
    String energyDrinkBrands[] = {"Red Bull","Monster Energy","Sting Energy","Tzinga Energy","Glucon-D Energy",
    "Electral Energy","Enerzal Drink","Paper Boat Energy","BB Royal Energy","24 Mantra Energy",
    "Organic Energy Drink","More Choice Energy","Classic Energy Drink","Premium Energy Drink","Sports Energy Drink",
    "Electrolyte Drink","Orange Energy Drink","Lemon Energy Drink","Mango Energy Drink","Berry Energy Drink",
    "Vitamin Energy Drink","Power Energy Drink","Family Pack Energy","Strong Energy Drink","Healthy Energy Drink",
    "Zero Sugar Energy","Spark Energy","Active Energy","Boost Energy Bottle"};
    return energyDrinkBrands;
}

if(productName == "mayonnaise"){
    String mayonnaiseBrands[] = {"Veeba Mayonnaise","Del Monte Mayo","Dr.Oetker FunFoods","Wingreens Mayo","Heinz Mayo",
    "Kissan Mayo","Urban Platter Mayo","24 Mantra Mayo","Organic Tattva Mayo","BB Royal Mayo",
    "More Choice Mayo","Classic Mayonnaise","Premium Mayo","Garlic Mayo","Chilli Mayo",
    "Tandoori Mayo","Mint Mayo","Olive Oil Mayo","Eggless Mayo","Cheese Mayo",
    "Sandwich Spread Mayo","Burger Mayo","Pizza Mayo","Healthy Mayo","Low Fat Mayo",
    "Family Pack Mayo","Restaurant Style Mayo","Special Mayo","Extra Creamy Mayo"};
    return mayonnaiseBrands;
}

if(productName == "honey"){
    String honeyBrands[] = {"Dabur Honey","Patanjali Honey","Himalaya Honey","Zandu Honey","Lion Honey",
    "24 Mantra Honey","Organic Tattva Honey","BB Royal Honey","More Choice Honey","Apis Honey",
    "Hitkari Honey","Nature's Nectar Honey","Indigenous Honey","Forest Honey","Wild Honey",
    "Raw Honey","Pure Honey","Premium Honey","Classic Honey","Natural Honey",
    "Multiflora Honey","Tulsi Honey","Eucalyptus Honey","Mustard Honey","Farm Fresh Honey",
    "Golden Honey","Healthy Honey","Family Pack Honey","Special Honey"};
    return honeyBrands;
}

if(productName == "peanutButter"){
    String peanutButterBrands[] = {"Pintola Peanut Butter","Sundrop Peanut Butter","Dr.Oetker Peanut Butter","Alpino Peanut Butter","MyFitness Peanut Butter",
    "24 Mantra Peanut Butter","Organic Tattva Peanut Butter","BB Royal Peanut Butter","More Choice Peanut Butter","Crunchy Peanut Butter",
    "Creamy Peanut Butter","Chocolate Peanut Butter","Natural Peanut Butter","Honey Peanut Butter","Classic Peanut Butter",
    "Premium Peanut Butter","High Protein Peanut Butter","Low Sugar Peanut Butter","Family Pack Peanut Butter","Healthy Peanut Butter",
    "Smooth Peanut Butter","Extra Crunch Peanut Butter","Roasted Peanut Butter","Desi Peanut Butter","Value Pack Peanut Butter",
    "Pure Peanut Butter","Quality Peanut Butter","Special Peanut Butter","Select Peanut Butter"};
    return peanutButterBrands;
}

if(productName == "chocoSpread"){
    String chocoSpreadBrands[] = {"Nutella","Hershey's Spread","Sundrop Choco Spread","Dr.Oetker Choco Spread","Veeba Choco Spread",
    "Urban Platter Spread","24 Mantra Spread","Organic Tattva Spread","BB Royal Spread","More Choice Spread",
    "Chocolate Hazelnut Spread","Classic Choco Spread","Premium Choco Spread","Dark Choco Spread","Milk Choco Spread",
    "Crunchy Choco Spread","Smooth Choco Spread","Family Pack Spread","Healthy Choco Spread","Value Pack Spread",
    "Hazelnut Cocoa Spread","Almond Choco Spread","Kids Choco Spread","Dessert Spread","Sweet Spread",
    "Golden Choco Spread","Pure Choco Spread","Quality Spread","Special Spread"};
    return chocoSpreadBrands;
}

if(productName == "papad"){
    String papadBrands[] = {"Lijjat Papad","Haldiram's Papad","Aashirvaad Papad","24 Mantra Papad","Organic Tattva Papad",
    "BB Royal Papad","More Choice Papad","Classic Papad","Premium Papad","Masala Papad",
    "Plain Papad","Punjabi Papad","Jeera Papad","Urad Papad","Moong Papad",
    "Chilli Papad","Garlic Papad","Family Pack Papad","Value Pack Papad","Healthy Papad",
    "Roasted Papad","Fryums Papad","Mini Papad","Large Papad","Desi Papad",
    "Traditional Papad","Golden Papad","Crunchy Papad","Special Papad"};
    return papadBrands;
}

if(productName == "readyToEat"){
    String readyToEatBrands[] = {"MTR Ready To Eat","Haldiram's Ready To Eat","ITC Kitchens Ready","Tasty Bite","Gits Ready Meals",
    "24 Mantra Ready Meals","Organic Tattva Ready","BB Royal Ready","More Choice Ready","Classic Ready Meal",
    "Premium Ready Meal","Rajma Chawal Pack","Dal Makhani Pack","Paneer Butter Masala Pack","Veg Biryani Pack",
    "Poha Ready Pack","Upma Ready Pack","Healthy Ready Meal","Family Pack Meal","Value Pack Meal",
    "Instant Meal Pack","Quick Cook Meal","Desi Ready Meal","Traditional Ready Meal","Frozen Ready Meal",
    "Restaurant Style Meal","Spicy Ready Meal","Special Ready Meal","Mini Ready Meal"};
    return readyToEatBrands;
}

if(productName == "frozenParatha"){
    String frozenParathaBrands[] = {"ITC Frozen Paratha","MTR Frozen Paratha","Gits Frozen Paratha","Haldiram's Paratha","Tasty Bite Paratha",
    "24 Mantra Paratha","Organic Tattva Paratha","BB Royal Paratha","More Choice Paratha","Classic Paratha",
    "Premium Paratha","Aloo Paratha","Methi Paratha","Plain Paratha","Malabar Paratha",
    "Laccha Paratha","Butter Paratha","Family Pack Paratha","Value Pack Paratha","Healthy Paratha",
    "Frozen Roti","Frozen Chapati","Desi Paratha","Traditional Paratha","Restaurant Style Paratha",
    "Mini Paratha","Large Paratha","Special Paratha","Quick Cook Paratha"};
    return frozenParathaBrands;
}

if(productName == "frozenVeggies"){
    String frozenVeggiesBrands[] = {"Safal Frozen Veggies","ITC Frozen Veggies","MTR Frozen Veggies","24 Mantra Frozen","Organic Tattva Frozen",
    "BB Royal Frozen","More Choice Frozen","Classic Frozen Veggies","Premium Frozen Veggies","Frozen Peas Pack",
    "Frozen Corn Pack","Frozen Mixed Veg","Frozen Carrot","Frozen Beans","Frozen Spinach",
    "Healthy Frozen Veg","Family Pack Frozen","Value Pack Frozen","Desi Frozen Veg","Traditional Frozen Veg",
    "Restaurant Style Frozen","Quick Cook Frozen","Mini Frozen Pack","Large Frozen Pack","Special Frozen Veg",
    "Fresh Harvest Frozen","Golden Frozen Veg","Pure Frozen Veg","Quality Frozen Veg"};
    return frozenVeggiesBrands;
}
if(productName == "frozenPeas"){
    String frozenPeasBrands[] = {"Safal Frozen Peas","ITC Frozen Peas","MTR Frozen Peas","24 Mantra Frozen Peas","Organic Tattva Frozen Peas",
    "BB Royal Frozen Peas","More Choice Frozen Peas","Classic Frozen Peas","Premium Frozen Peas","Green Peas Pack",
    "Sweet Peas Pack","Healthy Frozen Peas","Family Pack Peas","Value Pack Peas","Desi Frozen Peas",
    "Traditional Frozen Peas","Restaurant Style Peas","Quick Cook Peas","Mini Peas Pack","Large Peas Pack",
    "Special Frozen Peas","Fresh Harvest Peas","Golden Peas","Pure Frozen Peas","Quality Peas",
    "Standard Frozen Peas","Daily Choice Peas","Farm Fresh Peas","Select Frozen Peas"};
    return frozenPeasBrands;
}

if(productName == "frozenCorn"){
    String frozenCornBrands[] = {"Safal Frozen Corn","ITC Frozen Corn","MTR Frozen Corn","24 Mantra Frozen Corn","Organic Tattva Frozen Corn",
    "BB Royal Frozen Corn","More Choice Frozen Corn","Classic Frozen Corn","Premium Frozen Corn","Sweet Corn Pack",
    "American Corn Pack","Healthy Frozen Corn","Family Pack Corn","Value Pack Corn","Desi Frozen Corn",
    "Traditional Frozen Corn","Restaurant Style Corn","Quick Cook Corn","Mini Corn Pack","Large Corn Pack",
    "Special Frozen Corn","Fresh Harvest Corn","Golden Corn","Pure Frozen Corn","Quality Corn",
    "Standard Frozen Corn","Daily Choice Corn","Farm Fresh Corn","Select Frozen Corn"};
    return frozenCornBrands;
}

if(productName == "tissuePaper"){
    String tissuePaperBrands[] = {"Origami Tissue","Bella Tissue","Premier Tissue","Kleenex Tissue","Soft Touch Tissue",
    "Selpak Tissue","Paseo Tissue","BB Royal Tissue","More Choice Tissue","Classic Tissue",
    "Premium Tissue","Soft Napkin Tissue","Kitchen Tissue Roll","Facial Tissue","Pocket Tissue",
    "Family Pack Tissue","Value Pack Tissue","Extra Soft Tissue","Strong Tissue","Double Ply Tissue",
    "Triple Ply Tissue","White Tissue","Eco Friendly Tissue","Pure Soft Tissue","Quality Tissue",
    "Standard Tissue","Daily Use Tissue","Fresh Tissue Pack","Select Tissue"};
    return tissuePaperBrands;
}

if(productName == "toiletPaper"){
    String toiletPaperBrands[] = {"Origami Toilet Roll","Bella Toilet Roll","Premier Toilet Roll","Kleenex Toilet Roll","Soft Touch Toilet Roll",
    "Selpak Toilet Roll","Paseo Toilet Roll","BB Royal Toilet Roll","More Choice Toilet Roll","Classic Toilet Roll",
    "Premium Toilet Roll","Double Ply Roll","Triple Ply Roll","Family Pack Roll","Value Pack Roll",
    "Extra Soft Roll","Strong Roll","White Roll","Eco Friendly Roll","Pure Soft Roll",
    "Quality Roll","Standard Roll","Daily Use Roll","Fresh Roll Pack","Select Roll",
    "Comfort Roll","Gentle Roll","Luxury Roll","Max Soft Roll"};
    return toiletPaperBrands;
}

if(productName == "garbageBags"){
    String garbageBagsBrands[] = {"Clean Mate Garbage Bags","Origami Garbage Bags","BB Royal Garbage Bags","More Choice Garbage Bags","Classic Garbage Bags",
    "Premium Garbage Bags","Large Garbage Bags","Medium Garbage Bags","Small Garbage Bags","Black Garbage Bags",
    "Green Garbage Bags","Strong Garbage Bags","Extra Thick Bags","Eco Friendly Bags","Compostable Bags",
    "Family Pack Bags","Value Pack Bags","Daily Use Bags","Heavy Duty Bags","Jumbo Bags",
    "Mini Bags","Quality Bags","Standard Bags","Fresh Pack Bags","Select Bags",
    "Kitchen Garbage Bags","Office Garbage Bags","Dustbin Bags","Bio Degradable Bags"};
    return garbageBagsBrands;
}

if(productName == "aluminumFoil"){
    String aluminumFoilBrands[] = {"Hindalco Foil","Freshwrapp Foil","Clean Wrap Foil","BB Royal Foil","More Choice Foil",
    "Classic Foil","Premium Foil","Kitchen Foil Roll","Heavy Duty Foil","Extra Thick Foil",
    "Standard Foil","Family Pack Foil","Value Pack Foil","Strong Foil","Silver Foil",
    "Pure Aluminum Foil","Daily Use Foil","Fresh Pack Foil","Select Foil","Quality Foil",
    "Jumbo Foil Roll","Mini Foil Roll","Eco Friendly Foil","Food Grade Foil","Special Foil",
    "Multipurpose Foil","Home Foil","Professional Foil","Extra Strength Foil"};
    return aluminumFoilBrands;
}

if(productName == "clingWrap"){
    String clingWrapBrands[] = {"Clean Wrap Cling Film","Freshwrapp Cling Film","BB Royal Cling Wrap","More Choice Cling Wrap","Classic Cling Wrap",
    "Premium Cling Wrap","Kitchen Wrap Roll","Stretch Wrap","Extra Strong Wrap","Standard Wrap",
    "Family Pack Wrap","Value Pack Wrap","Food Wrap Film","Transparent Wrap","Multipurpose Wrap",
    "Daily Use Wrap","Fresh Pack Wrap","Select Wrap","Quality Wrap","Jumbo Wrap Roll",
    "Mini Wrap Roll","Eco Friendly Wrap","Food Grade Wrap","Special Wrap","Home Wrap",
    "Professional Wrap","Extra Stretch Wrap","Crystal Clear Wrap","Seal Tight Wrap"};
    return clingWrapBrands;
}

if(productName == "matchBox"){
    String matchBoxBrands[] = {"Ship Matchbox","Homelite Matchbox","Three Mangoes Matchbox","BB Royal Matchbox","More Choice Matchbox",
    "Classic Matchbox","Premium Matchbox","Safety Matchbox","Kitchen Matchbox","Family Pack Matchbox",
    "Value Pack Matchbox","Standard Matchbox","Long Stick Matchbox","Wax Matchbox","Wooden Matchbox",
    "Daily Use Matchbox","Select Matchbox","Quality Matchbox","Jumbo Matchbox","Mini Matchbox",
    "Extra Safety Matchbox","Home Matchbox","Professional Matchbox","Special Matchbox","Strong Matchbox",
    "Traditional Matchbox","Reliable Matchbox","Super Safety Matchbox","Fresh Pack Matchbox"};
    return matchBoxBrands;
}

if(productName == "agarbatti"){
    String agarbattiBrands[] = {"Cycle Agarbatti","Mysore Deepam","Mangaldeep Agarbatti","Zed Black Agarbatti","Patanjali Agarbatti",
    "24 Mantra Agarbatti","Organic Tattva Agarbatti","BB Royal Agarbatti","More Choice Agarbatti","Classic Agarbatti",
    "Premium Agarbatti","Sandal Agarbatti","Rose Agarbatti","Jasmine Agarbatti","Lavender Agarbatti",
    "Family Pack Agarbatti","Value Pack Agarbatti","Long Lasting Agarbatti","Natural Agarbatti","Temple Agarbatti",
    "Pooja Agarbatti","Special Agarbatti","Strong Fragrance Agarbatti","Desi Agarbatti","Traditional Agarbatti",
    "Golden Agarbatti","Pure Agarbatti","Quality Agarbatti","Select Agarbatti"};
    return agarbattiBrands;
}

if(productName == "candle"){
    String candleBrands[] = {"Mysore Candle","Pooja Candle","Aroma Candle","BB Royal Candle","More Choice Candle",
    "Classic Candle","Premium Candle","White Candle","Decorative Candle","Scented Candle",
    "Lavender Candle","Rose Candle","Vanilla Candle","Jasmine Candle","Family Pack Candle",
    "Value Pack Candle","Long Burning Candle","Tea Light Candle","Pillar Candle","Floating Candle",
    "Birthday Candle","Spiral Candle","Color Candle","Eco Friendly Candle","Pure Wax Candle",
    "Golden Candle","Traditional Candle","Special Candle","Festival Candle"};
    return candleBrands;
}
if(productName == "mosquitoCoil"){
    String mosquitoCoilBrands[] = {"Goodknight Coil","All Out Coil","Mortein Coil","Maxo Coil","Tortoise Coil",
    "BB Royal Coil","More Choice Coil","Classic Coil","Premium Coil","Jumbo Coil",
    "Mini Coil","Extra Power Coil","Herbal Coil","Neem Coil","Lavender Coil",
    "Family Pack Coil","Value Pack Coil","Long Lasting Coil","Strong Coil","Night Protection Coil",
    "Daily Use Coil","Select Coil","Quality Coil","Special Coil","Traditional Coil",
    "Green Coil","Gold Coil","Super Coil","Ultra Coil"};
    return mosquitoCoilBrands;
}

if(productName == "mosquitoLiquid"){
    String mosquitoLiquidBrands[] = {"Goodknight Liquid","All Out Liquid","Mortein Liquid","Maxo Liquid","BB Royal Liquid",
    "More Choice Liquid","Classic Liquid","Premium Liquid","Extra Power Liquid","Herbal Liquid",
    "Neem Liquid","Lavender Liquid","Night Protection Liquid","Family Pack Liquid","Value Pack Liquid",
    "Jumbo Liquid","Mini Liquid","Strong Liquid","Daily Use Liquid","Select Liquid",
    "Quality Liquid","Special Liquid","Long Lasting Liquid","Ultra Liquid","Power Plus Liquid",
    "Refill Liquid","Combo Pack Liquid","Advance Protection Liquid","Gold Liquid"};
    return mosquitoLiquidBrands;
}

if(productName == "floorMop"){
    String floorMopBrands[] = {"Scotch Brite Mop","Gala Mop","Spotzero Mop","Milton Mop","BB Royal Mop",
    "More Choice Mop","Classic Mop","Premium Mop","Spin Mop","Flat Mop",
    "Microfiber Mop","Wet Mop","Dry Mop","Jumbo Mop","Mini Mop",
    "Family Pack Mop","Value Pack Mop","Strong Handle Mop","Steel Rod Mop","Plastic Mop",
    "Daily Use Mop","Select Mop","Quality Mop","Special Mop","Traditional Mop",
    "Super Absorb Mop","Easy Clean Mop","Pro Mop","Ultra Mop"};
    return floorMopBrands;
}

if(productName == "broom"){
    String broomBrands[] = {"Gala Broom","Spotzero Broom","BB Royal Broom","More Choice Broom","Classic Broom",
    "Premium Broom","Soft Broom","Hard Broom","Grass Broom","Plastic Broom",
    "Long Handle Broom","Mini Broom","Jumbo Broom","Family Pack Broom","Value Pack Broom",
    "Strong Stick Broom","Steel Rod Broom","Daily Use Broom","Select Broom","Quality Broom",
    "Special Broom","Traditional Broom","Super Clean Broom","Easy Sweep Broom","Eco Broom",
    "Heavy Duty Broom","Light Weight Broom","Pro Broom","Ultra Broom"};
    return broomBrands;
}



if(productName == "lunchBox"){
    String lunchBoxBrands[] = {"Milton Lunch Box","Cello Lunch Box","Tupperware Lunch Box","Signoraware Lunch Box","BB Royal Lunch Box",
    "More Choice Lunch Box","Classic Lunch Box","Premium Lunch Box","Steel Lunch Box","Plastic Lunch Box",
    "Jumbo Lunch Box","Mini Lunch Box","Large Lunch Box","Small Lunch Box","Family Pack Lunch Box",
    "Value Pack Lunch Box","Microwave Safe Lunch Box","Leak Proof Lunch Box","Designer Lunch Box","Eco Lunch Box",
    "Daily Use Lunch Box","Select Lunch Box","Quality Lunch Box","Special Lunch Box","Traditional Lunch Box",
    "Super Strong Lunch Box","Heavy Duty Lunch Box","Light Weight Lunch Box","Ultra Lunch Box"};
    return lunchBoxBrands;
}

if(productName == "waterBottle"){
    String waterBottleBrands[] = {"Milton Bottle","Cello Bottle","Tupperware Bottle","Signoraware Bottle","BB Royal Bottle",
    "More Choice Bottle","Classic Bottle","Premium Bottle","Steel Bottle","Plastic Bottle",
    "Copper Bottle","Jumbo Bottle","Mini Bottle","Large Bottle","Small Bottle",
    "Family Pack Bottle","Value Pack Bottle","Leak Proof Bottle","Designer Bottle","Eco Bottle",
    "Daily Use Bottle","Select Bottle","Quality Bottle","Special Bottle","Traditional Bottle",
    "Super Strong Bottle","Heavy Duty Bottle","Light Weight Bottle","Ultra Bottle"};
    return waterBottleBrands;
}

if(productName == "pressureCooker"){
    String pressureCookerBrands[] = {"Prestige Cooker","Hawkins Cooker","Butterfly Cooker","Pigeon Cooker","BB Royal Cooker",
    "More Choice Cooker","Classic Cooker","Premium Cooker","Steel Cooker","Aluminium Cooker",
    "Jumbo Cooker","Mini Cooker","5L Cooker","3L Cooker","Family Pack Cooker",
    "Value Pack Cooker","Induction Base Cooker","Gas Stove Cooker","Designer Cooker","Eco Cooker",
    "Daily Use Cooker","Select Cooker","Quality Cooker","Special Cooker","Traditional Cooker",
    "Super Strong Cooker","Heavy Duty Cooker","Light Weight Cooker","Ultra Cooker"};
    return pressureCookerBrands;
}

if(productName == "fryingPan"){
    String fryingPanBrands[] = {"Prestige Frying Pan","Hawkins Frying Pan","Butterfly Frying Pan","Pigeon Frying Pan","BB Royal Frying Pan",
    "More Choice Frying Pan","Classic Frying Pan","Premium Frying Pan","Non Stick Pan","Steel Pan",
    "Cast Iron Pan","Jumbo Pan","Mini Pan","Large Pan","Small Pan",
    "Family Pack Pan","Value Pack Pan","Induction Base Pan","Gas Stove Pan","Designer Pan",
    "Eco Pan","Daily Use Pan","Select Pan","Quality Pan","Special Pan",
    "Super Strong Pan","Heavy Duty Pan","Light Weight Pan","Ultra Pan"};
    return fryingPanBrands;
}
if(productName == "kadai"){
    String kadaiBrands[] = {"Prestige Kadai","Hawkins Kadai","Butterfly Kadai","Pigeon Kadai","BB Royal Kadai",
    "More Choice Kadai","Classic Kadai","Premium Kadai","Non Stick Kadai","Steel Kadai",
    "Cast Iron Kadai","Jumbo Kadai","Mini Kadai","Large Kadai","Small Kadai",
    "Family Pack Kadai","Value Pack Kadai","Induction Base Kadai","Gas Stove Kadai","Designer Kadai",
    "Eco Kadai","Daily Use Kadai","Select Kadai","Quality Kadai","Special Kadai",
    "Super Strong Kadai","Heavy Duty Kadai","Light Weight Kadai","Ultra Kadai"};
    return kadaiBrands;
}

if(productName == "gasStove"){
    String gasStoveBrands[] = {"Prestige Gas Stove","Butterfly Gas Stove","Pigeon Gas Stove","Sunflame Gas Stove","Glen Gas Stove",
    "BB Royal Gas Stove","More Choice Gas Stove","Classic Gas Stove","Premium Gas Stove","2 Burner Stove",
    "3 Burner Stove","4 Burner Stove","Steel Stove","Glass Top Stove","Auto Ignition Stove",
    "Manual Ignition Stove","Family Pack Stove","Value Pack Stove","Designer Stove","Eco Stove",
    "Daily Use Stove","Select Stove","Quality Stove","Special Stove","Traditional Stove",
    "Super Strong Stove","Heavy Duty Stove","Light Weight Stove","Ultra Stove"};
    return gasStoveBrands;
}

if(productName == "inductionStove"){
    String inductionStoveBrands[] = {"Prestige Induction","Philips Induction","Butterfly Induction","Pigeon Induction","Usha Induction",
    "BB Royal Induction","More Choice Induction","Classic Induction","Premium Induction","Single Plate Induction",
    "Double Plate Induction","Digital Induction","Touch Panel Induction","Steel Induction","Portable Induction",
    "Family Pack Induction","Value Pack Induction","Designer Induction","Eco Induction","Daily Use Induction",
    "Select Induction","Quality Induction","Special Induction","Traditional Induction","Super Strong Induction",
    "Heavy Duty Induction","Light Weight Induction","Ultra Induction","Pro Induction"};
    return inductionStoveBrands;
}

if(productName == "mixerGrinder"){
    String mixerGrinderBrands[] = {"Preethi Mixer","Philips Mixer","Butterfly Mixer","Bajaj Mixer","Prestige Mixer",
    "BB Royal Mixer","More Choice Mixer","Classic Mixer","Premium Mixer","750W Mixer",
    "500W Mixer","3 Jar Mixer","4 Jar Mixer","Steel Jar Mixer","Plastic Jar Mixer",
    "Family Pack Mixer","Value Pack Mixer","Designer Mixer","Eco Mixer","Daily Use Mixer",
    "Select Mixer","Quality Mixer","Special Mixer","Traditional Mixer","Super Strong Mixer",
    "Heavy Duty Mixer","Light Weight Mixer","Ultra Mixer","Pro Mixer"};
    return mixerGrinderBrands;
}

if(productName == "electricKettle"){
    String electricKettleBrands[] = {"Prestige Kettle","Philips Kettle","Butterfly Kettle","Pigeon Kettle","Bajaj Kettle",
    "BB Royal Kettle","More Choice Kettle","Classic Kettle","Premium Kettle","1L Kettle",
    "1.5L Kettle","2L Kettle","Steel Kettle","Plastic Kettle","Auto Cut Kettle",
    "Family Pack Kettle","Value Pack Kettle","Designer Kettle","Eco Kettle","Daily Use Kettle",
    "Select Kettle","Quality Kettle","Special Kettle","Traditional Kettle","Super Strong Kettle",
    "Heavy Duty Kettle","Light Weight Kettle","Ultra Kettle","Pro Kettle"};
    return electricKettleBrands;
}

if(productName == "riceCooker"){
    String riceCookerBrands[] = {"Prestige Rice Cooker","Philips Rice Cooker","Butterfly Rice Cooker","Pigeon Rice Cooker","Panasonic Rice Cooker",
    "BB Royal Rice Cooker","More Choice Rice Cooker","Classic Rice Cooker","Premium Rice Cooker","1L Cooker",
    "2L Cooker","3L Cooker","Steel Cooker","Non Stick Cooker","Electric Cooker",
    "Family Pack Cooker","Value Pack Cooker","Designer Cooker","Eco Cooker","Daily Use Cooker",
    "Select Cooker","Quality Cooker","Special Cooker","Traditional Cooker","Super Strong Cooker",
    "Heavy Duty Cooker","Light Weight Cooker","Ultra Cooker","Pro Cooker"};
    return riceCookerBrands;
}

if(productName == "bedsheet"){
    String bedsheetBrands[] = {"Bombay Dyeing Bedsheet","Spaces Bedsheet","Portico Bedsheet","BB Royal Bedsheet","More Choice Bedsheet",
    "Classic Bedsheet","Premium Bedsheet","Cotton Bedsheet","King Size Bedsheet","Queen Size Bedsheet",
    "Single Bedsheet","Double Bedsheet","Designer Bedsheet","Printed Bedsheet","Plain Bedsheet",
    "Family Pack Bedsheet","Value Pack Bedsheet","Eco Bedsheet","Daily Use Bedsheet","Select Bedsheet",
    "Quality Bedsheet","Special Bedsheet","Traditional Bedsheet","Super Soft Bedsheet","Heavy Duty Bedsheet",
    "Light Weight Bedsheet","Ultra Bedsheet","Pro Bedsheet","Luxury Bedsheet"};
    return bedsheetBrands;
}

if(productName == "pillowCover"){
    String pillowCoverBrands[] = {"Bombay Dyeing Pillow Cover","Spaces Pillow Cover","Portico Pillow Cover","BB Royal Pillow Cover","More Choice Pillow Cover",
    "Classic Pillow Cover","Premium Pillow Cover","Cotton Pillow Cover","King Size Pillow Cover","Queen Size Pillow Cover",
    "Single Pillow Cover","Double Pillow Cover","Designer Pillow Cover","Printed Pillow Cover","Plain Pillow Cover",
    "Family Pack Pillow Cover","Value Pack Pillow Cover","Eco Pillow Cover","Daily Use Pillow Cover","Select Pillow Cover",
    "Quality Pillow Cover","Special Pillow Cover","Traditional Pillow Cover","Super Soft Pillow Cover","Heavy Duty Pillow Cover",
    "Light Weight Pillow Cover","Ultra Pillow Cover","Pro Pillow Cover","Luxury Pillow Cover"};
    return pillowCoverBrands;
}

if(productName == "blanket"){
    String blanketBrands[] = {"Spaces Blanket","Portico Blanket","Bombay Dyeing Blanket","BB Royal Blanket","More Choice Blanket",
    "Classic Blanket","Premium Blanket","Cotton Blanket","Wool Blanket","Single Blanket",
    "Double Blanket","King Size Blanket","Queen Size Blanket","Designer Blanket","Printed Blanket",
    "Family Pack Blanket","Value Pack Blanket","Eco Blanket","Daily Use Blanket","Select Blanket",
    "Quality Blanket","Special Blanket","Traditional Blanket","Super Soft Blanket","Heavy Blanket",
    "Light Weight Blanket","Ultra Blanket","Pro Blanket","Luxury Blanket"};
    return blanketBrands;
}

if(productName == "towel"){
    String towelBrands[] = {"Bombay Dyeing Towel","Spaces Towel","Portico Towel","BB Royal Towel","More Choice Towel",
    "Classic Towel","Premium Towel","Cotton Towel","Bath Towel","Hand Towel",
    "Face Towel","Large Towel","Small Towel","Designer Towel","Printed Towel",
    "Family Pack Towel","Value Pack Towel","Eco Towel","Daily Use Towel","Select Towel",
    "Quality Towel","Special Towel","Traditional Towel","Super Soft Towel","Heavy Duty Towel",
    "Light Weight Towel","Ultra Towel","Pro Towel","Luxury Towel"};
    return towelBrands;
}
if(productName == "napkin"){
    String napkinBrands[] = {"Origami Napkin","Bella Napkin","Premier Napkin","Kleenex Napkin","Soft Touch Napkin",
    "Selpak Napkin","Paseo Napkin","BB Royal Napkin","More Choice Napkin","Classic Napkin",
    "Premium Napkin","Paper Napkin","Cloth Napkin","Family Pack Napkin","Value Pack Napkin",
    "Eco Napkin","Daily Use Napkin","Select Napkin","Quality Napkin","Special Napkin",
    "Designer Napkin","Printed Napkin","White Napkin","Color Napkin","Super Soft Napkin",
    "Heavy Duty Napkin","Light Weight Napkin","Ultra Napkin","Luxury Napkin"};
    return napkinBrands;
}

if(productName == "schoolBag"){
    String schoolBagBrands[] = {"Skybags","American Tourister","Wildcraft","Safari","VIP School Bag",
    "BB Royal Bag","More Choice Bag","Classic Bag","Premium Bag","Kids School Bag",
    "Large School Bag","Small School Bag","Waterproof Bag","Trolley Bag","Designer Bag",
    "Eco Bag","Daily Use Bag","Select Bag","Quality Bag","Special Bag",
    "Printed Bag","Cartoon Bag","Strong Zip Bag","Light Weight Bag","Heavy Duty Bag",
    "Super Strong Bag","Pro School Bag","Ultra Bag","Luxury Bag"};
    return schoolBagBrands;
}

if(productName == "notebook"){
    String notebookBrands[] = {"Classmate Notebook","Navneet Notebook","Camlin Notebook","Paperkraft Notebook","Luxor Notebook",
    "BB Royal Notebook","More Choice Notebook","Classic Notebook","Premium Notebook","Long Notebook",
    "Short Notebook","A4 Notebook","Ruled Notebook","Unruled Notebook","Graph Notebook",
    "Spiral Notebook","Hard Cover Notebook","Soft Cover Notebook","Eco Notebook","Daily Use Notebook",
    "Select Notebook","Quality Notebook","Special Notebook","Designer Notebook","Printed Notebook",
    "Mini Notebook","Jumbo Notebook","Pro Notebook","Ultra Notebook"};
    return notebookBrands;
}

if (productName == ("coldCoffee")) {
    String[] brands = {
        "Nescafe Cold Coffee","Bru Cold Coffee","Starbucks Cold Coffee","BB Royal Coffee","More Choice Coffee","Classic Coffee","Premium Coffee",
        "Mocha Coffee","Latte Coffee","Vanilla Coffee","Hazelnut Coffee","Fresh Coffee","Daily Coffee","Select Coffee",
        "Quality Coffee","Special Coffee","Ultra Coffee","Pro Coffee","Strong Coffee","Healthy Coffee",
        "Family Pack Coffee","Value Pack Coffee","Natural Coffee","Organic Coffee","Cool Coffee",
        "Light Coffee","Desi Coffee","Village Coffee","Farm Coffee","Pure Coffee",
        "Comfort Coffee","Refreshing Coffee","Golden Coffee","Active Coffee","Eco Coffee",
        "Super Coffee","Ultimate Coffee"
    };
    return brands;
}

if(productName == "pen"){
    String penBrands[] = {"Reynolds Pen","Cello Pen","Parker Pen","Pilot Pen","Luxor Pen",
    "BB Royal Pen","More Choice Pen","Classic Pen","Premium Pen","Ball Pen",
    "Gel Pen","Ink Pen","Blue Pen","Black Pen","Red Pen",
    "Eco Pen","Daily Use Pen","Select Pen","Quality Pen","Special Pen",
    "Designer Pen","Smooth Pen","Fine Tip Pen","Broad Tip Pen","Jumbo Pack Pen",
    "Mini Pack Pen","Pro Pen","Ultra Pen","Luxury Pen"};
    return penBrands;
}

if(productName == "pencil"){
    String pencilBrands[] = {"Nataraj Pencil","Apsara Pencil","Faber Castell Pencil","Camlin Pencil","Luxor Pencil",
    "BB Royal Pencil","More Choice Pencil","Classic Pencil","Premium Pencil","HB Pencil",
    "2B Pencil","Drawing Pencil","Color Pencil","Graphite Pencil","Eco Pencil",
    "Daily Use Pencil","Select Pencil","Quality Pencil","Special Pencil","Designer Pencil",
    "Mini Pencil","Jumbo Pencil","Pro Pencil","Ultra Pencil","Luxury Pencil",
    "Smooth Pencil","Fine Pencil","Strong Pencil","Standard Pencil"};
    return pencilBrands;
}

if(productName == "eraser"){
    String eraserBrands[] = {"Nataraj Eraser","Apsara Eraser","Faber Castell Eraser","Camlin Eraser","Luxor Eraser",
    "BB Royal Eraser","More Choice Eraser","Classic Eraser","Premium Eraser","Soft Eraser",
    "Hard Eraser","White Eraser","Color Eraser","Eco Eraser","Daily Use Eraser",
    "Select Eraser","Quality Eraser","Special Eraser","Designer Eraser","Mini Eraser",
    "Jumbo Eraser","Pro Eraser","Ultra Eraser","Luxury Eraser","Smooth Eraser",
    "Strong Eraser","Standard Eraser","School Eraser","Office Eraser"};
    return eraserBrands;
}

if(productName == "sharpener"){
    String sharpenerBrands[] = {"Nataraj Sharpener","Apsara Sharpener","Faber Castell Sharpener","Camlin Sharpener","Luxor Sharpener",
    "BB Royal Sharpener","More Choice Sharpener","Classic Sharpener","Premium Sharpener","Metal Sharpener",
    "Plastic Sharpener","Single Hole Sharpener","Double Hole Sharpener","Eco Sharpener","Daily Use Sharpener",
    "Select Sharpener","Quality Sharpener","Special Sharpener","Designer Sharpener","Mini Sharpener",
    "Jumbo Sharpener","Pro Sharpener","Ultra Sharpener","Luxury Sharpener","Smooth Sharpener",
    "Strong Sharpener","Standard Sharpener","School Sharpener","Office Sharpener"};
    return sharpenerBrands;
}

if(productName == "scale"){
    String scaleBrands[] = {"Nataraj Scale","Apsara Scale","Faber Castell Scale","Camlin Scale","Luxor Scale",
    "BB Royal Scale","More Choice Scale","Classic Scale","Premium Scale","Steel Scale",
    "Plastic Scale","Transparent Scale","30cm Scale","15cm Scale","Eco Scale",
    "Daily Use Scale","Select Scale","Quality Scale","Special Scale","Designer Scale",
    "Mini Scale","Jumbo Scale","Pro Scale","Ultra Scale","Luxury Scale",
    "Smooth Scale","Strong Scale","Standard Scale","School Scale"};
    return scaleBrands;
}

if(productName == "glue"){
    String glueBrands[] = {"Fevicol Glue","Fevi Stick","Camlin Glue","Pidilite Glue","Dr Fixit Glue",
    "BB Royal Glue","More Choice Glue","Classic Glue","Premium Glue","Liquid Glue",
    "Stick Glue","White Glue","Transparent Glue","Strong Bond Glue","Super Glue",
    "Eco Glue","Daily Use Glue","Select Glue","Quality Glue","Special Glue",
    "Designer Glue","Mini Glue","Jumbo Glue","Pro Glue","Ultra Glue",
    "School Glue","Office Glue","Craft Glue","Wood Glue"};
    return glueBrands;
}

if(productName == ("sketchPen")){
    String[] sketchPenBrands = {
    "Camlin Sketch Pen","Faber Castell Sketch Pen","DOMS Sketch Pen","Apsara Sketch Pen",
    "Luxor Sketch Pen","BB Royal Sketch Pen","More Choice Sketch Pen","Classic Sketch Pen",
    "Premium Sketch Pen","Color Sketch Pen","Washable Sketch Pen","Fine Tip Sketch Pen",
    "Broad Tip Sketch Pen","Kids Sketch Pen","School Sketch Pen","Artist Sketch Pen",
    "Mini Sketch Pen","Jumbo Sketch Pen","Eco Sketch Pen","Daily Use Sketch Pen",
    "Select Sketch Pen","Quality Sketch Pen","Special Sketch Pen","Designer Sketch Pen",
    "Smooth Ink Sketch Pen","Bright Color Sketch Pen","Super Ink Sketch Pen",
    "Ultra Sketch Pen","Pro Sketch Pen","Office Sketch Pen","Drawing Sketch Pen",
    "Water Based Sketch Pen","Permanent Sketch Pen","Multi Color Sketch Pen",
    "Creative Sketch Pen","Magic Sketch Pen","ColorMax Sketch Pen"
    };
    return sketchPenBrands;
}

if(productName == ("colorPencils")){
    String[] colorPencilsBrands = {
    "Faber Castell Color","DOMS Color","Camlin Color","Apsara Color",
    "Nataraj Color","BB Royal Color","More Choice Color","Classic Color",
    "Premium Color","Wooden Color Pencil","Artist Color Pencil",
    "Kids Color Pencil","School Color Pencil","Mini Color Pencil",
    "Jumbo Color Pencil","Eco Color Pencil","Daily Use Color Pencil",
    "Select Color Pencil","Quality Color Pencil","Special Color Pencil",
    "Designer Color Pencil","Smooth Color Pencil","Bright Color Pencil",
    "Ultra Color Pencil","Pro Color Pencil","Office Color Pencil",
    "Drawing Color Pencil","Water Color Pencil","Wax Color Pencil",
    "Soft Core Pencil","Hard Core Pencil","Creative Pencil",
    "Magic Color Pencil","ColorMax Pencil","Rainbow Pencil",
    "Fine Tip Pencil","Super Shade Pencil"
    };
    return colorPencilsBrands;
}

if(productName == ("babyDiapers")){
    String[] babyDiapersBrands = {
    "Pampers","Huggies","MamyPoko","Little Angel","BB Royal Diapers",
    "More Choice Diapers","Classic Diapers","Premium Diapers",
    "Newborn Diapers","Pant Style Diapers","Tape Style Diapers",
    "Ultra Soft Diapers","Dry Pants","Overnight Diapers",
    "Mini Diapers","Jumbo Diapers","Eco Diapers","Daily Use Diapers",
    "Select Diapers","Quality Diapers","Special Diapers",
    "Designer Diapers","Leak Guard Diapers","Cotton Soft Diapers",
    "Super Dry Diapers","Ultra Comfort Diapers","Baby Care Diapers",
    "Skin Friendly Diapers","Active Baby Diapers","Pro Baby Diapers",
    "Ultra Baby Diapers","Safe Care Diapers","Happy Baby Diapers",
    "Power Dry Diapers","Soft Touch Diapers","Comfort Fit Diapers",
    "Premium Care Diapers"
    };
    return babyDiapersBrands;
}

if(productName == ("babyWipes")){
    String[] babyWipesBrands = {
    "Pampers Wipes","Huggies Wipes","MamyPoko Wipes","Johnson Baby Wipes",
    "BB Royal Wipes","More Choice Wipes","Classic Wipes","Premium Wipes",
    "Aloe Vera Wipes","Vitamin E Wipes","Sensitive Wipes",
    "Fragrance Free Wipes","Cotton Wipes","Soft Care Wipes",
    "Mini Pack Wipes","Jumbo Pack Wipes","Eco Wipes",
    "Daily Use Wipes","Select Wipes","Quality Wipes",
    "Special Wipes","Designer Wipes","Fresh Care Wipes",
    "Ultra Soft Wipes","Skin Friendly Wipes","Moist Care Wipes",
    "Gentle Touch Wipes","Baby Clean Wipes","Safe Care Wipes",
    "Pure Water Wipes","Extra Moist Wipes","Cooling Wipes",
    "Comfort Wipes","Premium Care Wipes","Natural Wipes",
    "Healthy Baby Wipes","Ultra Clean Wipes"
    };
    return babyWipesBrands;
}

if(productName == ("babySoap")){
    String[] babySoapBrands = {
    "Johnson Baby Soap","Himalaya Baby Soap","Pears Baby Soap","Sebamed Baby Soap",
    "Chicco Baby Soap","Mamaearth Baby Soap","BB Royal Baby Soap","More Choice Baby Soap",
    "Classic Baby Soap","Premium Baby Soap","Aloe Baby Soap","Milk Baby Soap",
    "Glycerin Baby Soap","Natural Baby Soap","Herbal Baby Soap",
    "Ultra Soft Baby Soap","Skin Care Baby Soap","Gentle Baby Soap",
    "Moisture Baby Soap","Daily Care Baby Soap","Eco Baby Soap",
    "Select Baby Soap","Quality Baby Soap","Special Baby Soap",
    "Designer Baby Soap","Pure Baby Soap","Soft Touch Baby Soap",
    "Comfort Baby Soap","Sensitive Baby Soap","Tear Free Baby Soap",
    "Fresh Baby Soap","Healthy Baby Soap","Safe Baby Soap",
    "Organic Baby Soap","Extra Mild Baby Soap","Family Pack Baby Soap",
    "Baby Care Soap"
    };
    return babySoapBrands;
}

if(productName == ("babyShampoo")){
    String[] babyShampooBrands = {
    "Johnson Baby Shampoo","Himalaya Baby Shampoo","Sebamed Baby Shampoo","Chicco Baby Shampoo",
    "Mamaearth Baby Shampoo","BB Royal Baby Shampoo","More Choice Baby Shampoo",
    "Classic Baby Shampoo","Premium Baby Shampoo","Tear Free Shampoo",
    "No More Tears Shampoo","Mild Baby Shampoo","Herbal Baby Shampoo",
    "Natural Baby Shampoo","Aloe Baby Shampoo","Milk Protein Shampoo",
    "Ultra Soft Shampoo","Skin Care Shampoo","Gentle Shampoo",
    "Moisture Shampoo","Daily Care Shampoo","Eco Shampoo",
    "Select Shampoo","Quality Shampoo","Special Shampoo",
    "Designer Shampoo","Pure Baby Shampoo","Soft Touch Shampoo",
    "Comfort Shampoo","Sensitive Shampoo","Fresh Baby Shampoo",
    "Healthy Baby Shampoo","Safe Baby Shampoo","Organic Shampoo",
    "Extra Mild Shampoo","Family Pack Shampoo","Baby Hair Care Shampoo"
    };
    return babyShampooBrands;
}

if (productName == ("popcorn")) {
    String[] brands = {
        "Act II Popcorn","Pop Secret","BB Royal Popcorn","More Choice Popcorn","Classic Popcorn","Premium Popcorn","Butter Popcorn",
        "Salted Popcorn","Cheese Popcorn","Caramel Popcorn","Masala Popcorn","Sweet Popcorn","Corn Popcorn","Healthy Popcorn",
        "Family Pack Popcorn","Value Pack Popcorn","Fresh Popcorn","Movie Time Popcorn","Party Popcorn","Mini Pack Popcorn",
        "Jumbo Pack Popcorn","Eco Popcorn","Daily Snack Popcorn","Select Popcorn","Quality Popcorn",
        "Special Popcorn","Pro Popcorn","Ultra Popcorn","Comfort Popcorn","Golden Popcorn",
        "Natural Popcorn","Crunchy Popcorn","Light Popcorn","Air Popped Popcorn","Power Popcorn",
        "Super Popcorn","Ultimate Popcorn"
    };
    return brands;
}

if (productName == ("bhujia")) {
    String[] brands = {
        "Haldiram Bhujia","Bikaji Bhujia","Balaji Bhujia","BB Royal Bhujia","More Choice Bhujia","Classic Bhujia","Premium Bhujia",
        "Masala Bhujia","Plain Bhujia","Spicy Bhujia","Aloo Bhujia","Desi Bhujia","Crunchy Bhujia","Fresh Bhujia",
        "Family Pack Bhujia","Value Pack Bhujia","Mini Pack Bhujia","Jumbo Pack Bhujia","Eco Bhujia","Daily Snack Bhujia",
        "Select Bhujia","Quality Bhujia","Special Bhujia","Pro Bhujia","Ultra Bhujia",
        "Comfort Bhujia","Golden Bhujia","Natural Bhujia","Traditional Bhujia","Power Bhujia",
        "Super Bhujia","Light Bhujia","Extra Spicy Bhujia","Restaurant Style Bhujia","Healthy Bhujia",
        "Party Bhujia","Ultimate Bhujia"
    };
    return brands;
}

if (productName == ("mixture")) {
    String[] brands = {
        "Haldiram Mixture","Bikaji Mixture","Balaji Mixture","BB Royal Mixture","More Choice Mixture","Classic Mixture","Premium Mixture",
        "South Mixture","Bombay Mixture","Spicy Mixture","Sweet Mixture","Crunchy Mixture","Desi Mixture","Fresh Mixture",
        "Family Pack Mixture","Value Pack Mixture","Mini Pack Mixture","Jumbo Pack Mixture","Eco Mixture","Daily Snack Mixture",
        "Select Mixture","Quality Mixture","Special Mixture","Pro Mixture","Ultra Mixture",
        "Comfort Mixture","Golden Mixture","Natural Mixture","Traditional Mixture","Power Mixture",
        "Super Mixture","Light Mixture","Extra Spicy Mixture","Restaurant Style Mixture","Healthy Mixture",
        "Party Mixture","Ultimate Mixture"
    };
    return brands;
}


if(productName == ("sanitaryPads")){
    String[] sanitaryPadsBrands = {
    "Whisper Ultra","Stayfree Secure","Sofy Anti Bacteria","Carefree Pads","BB Royal Pads","More Choice Pads","Classic Pads","Premium Pads",
    "XL Pads","XXL Pads","Night Pads","Day Pads",
    "Cotton Soft Pads","Ultra Thin Pads","Max Coverage Pads",
    "Dry Net Pads","Herbal Pads","Organic Pads",
    "Eco Pads","Daily Use Pads","Select Pads",
    "Quality Pads","Special Pads","Designer Pads",
    "Comfort Pads","Sensitive Skin Pads","Heavy Flow Pads",
    "Light Flow Pads","Wings Pads","No Wings Pads",
    "Super Dry Pads","Extra Long Pads","Fresh Care Pads",
    "Safe Care Pads","Healthy Care Pads","Family Pack Pads",
    "Ultra Protection Pads"
    };
    return sanitaryPadsBrands;
}

if(productName == ("adultDiapers")){
    String[] adultDiapersBrands = {
    "Friends Adult Diapers","Depends Adult Diapers","Dignity Adult Diapers",
    "BB Royal Adult Diapers","More Choice Adult Diapers","Classic Adult Diapers",
    "Premium Adult Diapers","Tape Style Adult Diapers","Pant Style Adult Diapers",
    "Overnight Adult Diapers","Ultra Soft Adult Diapers","Dry Pants Adult",
    "Large Adult Diapers","Medium Adult Diapers","Small Adult Diapers",
    "XL Adult Diapers","XXL Adult Diapers","Eco Adult Diapers",
    "Daily Use Adult Diapers","Select Adult Diapers","Quality Adult Diapers",
    "Special Adult Diapers","Comfort Adult Diapers","Skin Friendly Adult Diapers",
    "Leak Guard Adult Diapers","Super Dry Adult Diapers","Ultra Comfort Adult Diapers",
    "Safe Care Adult Diapers","Premium Care Adult Diapers","Healthy Care Adult Diapers",
    "Family Pack Adult Diapers","Value Pack Adult Diapers","Extra Absorb Adult Diapers",
    "Strong Protection Adult Diapers","Night Protection Adult Diapers",
    "Power Dry Adult Diapers","Soft Touch Adult Diapers"
    };
    return adultDiapersBrands;
}

if(productName == ("proteinPowder")){
    String[] proteinPowderBrands = {
    "Optimum Nutrition","MuscleBlaze Whey","Dymatize Protein","MyProtein Impact",
    "BigMuscles Protein","BB Royal Protein","More Choice Protein",
    "Classic Protein","Premium Protein","Whey Protein",
    "Isolate Protein","Mass Gainer","Plant Protein",
    "Soy Protein","Casein Protein","Chocolate Protein",
    "Vanilla Protein","Strawberry Protein","High Protein Blend",
    "Gym Protein","Athlete Protein","Muscle Gain Protein",
    "Lean Protein","Diet Protein","Vegan Protein",
    "Organic Protein","Ultra Protein","Pro Protein",
    "Daily Protein","Energy Protein","Bulk Protein",
    "Performance Protein","Strong Protein","Active Protein",
    "Fitness Protein","Power Protein","Premium Whey"
    };
    return proteinPowderBrands;
}

if(productName == ("attaNoodles")){
    String[] attaNoodlesBrands = {
    "Maggi Atta Noodles","Yippee Atta Noodles","Top Ramen Atta","Ching's Atta Noodles",
    "Knorr Atta Noodles","Patanjali Atta Noodles","BB Royal Atta Noodles",
    "More Choice Atta Noodles","Classic Atta Noodles","Premium Atta Noodles",
    "Masala Atta Noodles","Spicy Atta Noodles","Veg Atta Noodles",
    "Healthy Atta Noodles","High Fiber Noodles","Kids Atta Noodles",
    "Family Pack Noodles","Value Pack Noodles","Instant Atta Noodles",
    "Desi Masala Noodles","Restaurant Style Noodles","Quick Cook Noodles",
    "Eco Noodles","Select Noodles","Quality Noodles",
    "Special Noodles","Designer Pack Noodles","Jumbo Pack Noodles",
    "Mini Pack Noodles","Strong Wheat Noodles","Protein Atta Noodles",
    "Multigrain Noodles","Low Fat Noodles","Ultra Noodles",
    "Pro Noodles","Daily Use Noodles","Super Wheat Noodles"
    };
    return attaNoodlesBrands;
}

if(productName == ("sooji")){
    String[] soojiBrands = {
    "Aashirvaad Sooji","Pillsbury Sooji","Fortune Sooji","24 Mantra Sooji",
    "Organic Tattva Sooji","BB Royal Sooji","More Choice Sooji",
    "Classic Sooji","Premium Sooji","Bombay Sooji",
    "Fine Sooji","Roasted Sooji","Fresh Harvest Sooji",
    "Golden Grain Sooji","Daily Choice Sooji","Shakti Bhog Sooji",
    "Rajdhani Sooji","Annapurna Sooji","Reliable Sooji",
    "Grihasthi Sooji","Vikram Sooji","Samrat Sooji",
    "Healthy Life Sooji","Pure Sooji","Quality Sooji",
    "Special Sooji","Ultra Fine Sooji","Select Sooji",
    "Traditional Sooji","Farm Fresh Sooji","Desi Sooji",
    "Premium Rava Sooji","Super Fine Sooji","Value Pack Sooji",
    "Family Pack Sooji","Natural Sooji","Standard Sooji"
    };
    return soojiBrands;
}

if(productName == ("dalToor")){
    String[] dalToorBrands = {
    "Tata Sampann Toor Dal","24 Mantra Toor Dal","Organic Tattva Toor Dal",
    "BB Royal Toor Dal","More Choice Toor Dal","Classic Toor Dal",
    "Premium Toor Dal","Desi Toor Dal","Farm Fresh Toor Dal",
    "Golden Toor Dal","Healthy Toor Dal","Value Pack Toor Dal",
    "Family Pack Toor Dal","Select Toor Dal","Quality Toor Dal",
    "Special Toor Dal","Natural Toor Dal","Traditional Toor Dal",
    "Unpolished Toor Dal","Polished Toor Dal","High Protein Toor Dal",
    "Fresh Harvest Toor Dal","Pure Toor Dal","Standard Toor Dal",
    "Jumbo Pack Toor Dal","Mini Pack Toor Dal","Eco Toor Dal",
    "Daily Use Toor Dal","Strong Grain Toor Dal","Premium Select Toor Dal",
    "Cleaned Toor Dal","Sorted Toor Dal","Wholesome Toor Dal",
    "Healthy Choice Toor Dal","Ultra Toor Dal","Pro Toor Dal",
    "Super Quality Toor Dal"
    };
    return dalToorBrands;
}

if(productName == ("dalMoong")){
    String[] dalMoongBrands = {
    "Tata Sampann Moong Dal","24 Mantra Moong Dal","Organic Tattva Moong Dal",
    "BB Royal Moong Dal","More Choice Moong Dal","Classic Moong Dal",
    "Premium Moong Dal","Desi Moong Dal","Farm Fresh Moong Dal",
    "Golden Moong Dal","Healthy Moong Dal","Value Pack Moong Dal",
    "Family Pack Moong Dal","Select Moong Dal","Quality Moong Dal",
    "Special Moong Dal","Natural Moong Dal","Traditional Moong Dal",
    "Unpolished Moong Dal","Polished Moong Dal","High Protein Moong Dal",
    "Fresh Harvest Moong Dal","Pure Moong Dal","Standard Moong Dal",
    "Jumbo Pack Moong Dal","Mini Pack Moong Dal","Eco Moong Dal",
    "Daily Use Moong Dal","Strong Grain Moong Dal","Premium Select Moong Dal",
    "Cleaned Moong Dal","Sorted Moong Dal","Wholesome Moong Dal",
    "Healthy Choice Moong Dal","Ultra Moong Dal","Pro Moong Dal",
    "Super Quality Moong Dal"
    };
    return dalMoongBrands;
}

if(productName == ("dalChana")){
    String[] dalChanaBrands = {
    "Tata Sampann Chana Dal","24 Mantra Chana Dal","Organic Tattva Chana Dal",
    "BB Royal Chana Dal","More Choice Chana Dal","Classic Chana Dal",
    "Premium Chana Dal","Desi Chana Dal","Farm Fresh Chana Dal",
    "Golden Chana Dal","Healthy Chana Dal","Value Pack Chana Dal",
    "Family Pack Chana Dal","Select Chana Dal","Quality Chana Dal",
    "Special Chana Dal","Natural Chana Dal","Traditional Chana Dal",
    "Unpolished Chana Dal","Polished Chana Dal","High Protein Chana Dal",
    "Fresh Harvest Chana Dal","Pure Chana Dal","Standard Chana Dal",
    "Jumbo Pack Chana Dal","Mini Pack Chana Dal","Eco Chana Dal",
    "Daily Use Chana Dal","Strong Grain Chana Dal","Premium Select Chana Dal",
    "Cleaned Chana Dal","Sorted Chana Dal","Wholesome Chana Dal",
    "Healthy Choice Chana Dal","Ultra Chana Dal","Pro Chana Dal",
    "Super Quality Chana Dal"
    };
    return dalChanaBrands;
}

if(productName == ("rajma")){
    String[] rajmaBrands={
    "Tata Sampann Rajma","24 Mantra Rajma","Organic Tattva Rajma","BB Royal Rajma","More Choice Rajma",
    "Classic Rajma","Premium Rajma","Jammu Rajma","Kashmiri Rajma","Red Rajma",
    "Healthy Rajma","Farm Fresh Rajma","Desi Rajma","Value Pack Rajma","Family Pack Rajma",
    "Select Rajma","Quality Rajma","Special Rajma","Natural Rajma","Traditional Rajma",
    "Unpolished Rajma","High Protein Rajma","Fresh Harvest Rajma","Pure Rajma","Standard Rajma",
    "Mini Pack Rajma","Jumbo Pack Rajma","Eco Rajma","Daily Use Rajma","Strong Grain Rajma",
    "Sorted Rajma","Cleaned Rajma","Wholesome Rajma","Healthy Choice Rajma","Ultra Rajma",
    "Pro Rajma","Super Quality Rajma"};
    return rajmaBrands;
}

if(productName == ("chole")){
    String[] choleBrands={
    "Tata Sampann Chole","24 Mantra Chole","Organic Tattva Chole","BB Royal Chole","More Choice Chole",
    "Classic Chole","Premium Chole","Kabuli Chole","White Chole","Healthy Chole",
    "Farm Fresh Chole","Desi Chole","Value Pack Chole","Family Pack Chole","Select Chole",
    "Quality Chole","Special Chole","Natural Chole","Traditional Chole","Unpolished Chole",
    "High Protein Chole","Fresh Harvest Chole","Pure Chole","Standard Chole","Mini Pack Chole",
    "Jumbo Pack Chole","Eco Chole","Daily Use Chole","Strong Grain Chole","Sorted Chole",
    "Cleaned Chole","Wholesome Chole","Healthy Choice Chole","Ultra Chole","Pro Chole",
    "Super Quality Chole","Golden Chole"};
    return choleBrands;
}

if(productName == ("sabudana")){
    String[] sabudanaBrands={
    "Tata Sampann Sabudana","24 Mantra Sabudana","Organic Tattva Sabudana","BB Royal Sabudana","More Choice Sabudana",
    "Classic Sabudana","Premium Sabudana","Healthy Sabudana","Farm Fresh Sabudana","Desi Sabudana",
    "Value Pack Sabudana","Family Pack Sabudana","Select Sabudana","Quality Sabudana","Special Sabudana",
    "Natural Sabudana","Traditional Sabudana","Pearl Sabudana","Mini Sabudana","Jumbo Sabudana",
    "Eco Sabudana","Daily Use Sabudana","Fresh Harvest Sabudana","Pure Sabudana","Standard Sabudana",
    "Golden Sabudana","Sorted Sabudana","Cleaned Sabudana","Wholesome Sabudana","Healthy Choice Sabudana",
    "Ultra Sabudana","Pro Sabudana","Super Quality Sabudana","Fine Sabudana","Premium Pearl Sabudana",
    "Strong Grain Sabudana","Select Pearl Sabudana"};
    return sabudanaBrands;
}

if(productName == ("phenyl")){
    String[] phenylBrands={
    "Lizol Phenyl","Domex Phenyl","Dettol Phenyl","Fena Phenyl","Nimyle Phenyl",
    "BB Royal Phenyl","More Choice Phenyl","Classic Phenyl","Premium Phenyl","White Phenyl",
    "Black Phenyl","Herbal Phenyl","Neem Phenyl","Rose Phenyl","Lavender Phenyl",
    "Lemon Phenyl","Strong Action Phenyl","Daily Use Phenyl","Select Phenyl","Quality Phenyl",
    "Special Phenyl","Disinfectant Phenyl","Floor Care Phenyl","Extra Power Phenyl","Eco Phenyl",
    "Fresh Fragrance Phenyl","Ultra Clean Phenyl","Pro Phenyl","Home Care Phenyl","Safe Phenyl",
    "Hygiene Phenyl","Advanced Phenyl","Germ Kill Phenyl","Super Clean Phenyl","Max Power Phenyl",
    "Premium Care Phenyl","Total Clean Phenyl"};
    return phenylBrands;
}

if(productName == ("roomFreshener")){
    String[] roomFreshenerBrands={
    "Odonil","Godrej Aer","Airwick","Ambi Pur","BB Royal Freshener",
    "More Choice Freshener","Classic Freshener","Premium Freshener","Lavender Freshener",
    "Rose Freshener","Jasmine Freshener","Lemon Freshener","Floral Freshener",
    "Ocean Freshener","Musk Freshener","Vanilla Freshener","Automatic Freshener",
    "Spray Freshener","Gel Freshener","Daily Use Freshener","Select Freshener",
    "Quality Freshener","Special Freshener","Designer Freshener","Eco Freshener",
    "Long Lasting Freshener","Ultra Freshener","Pro Freshener","Home Freshener",
    "Safe Freshener","Natural Freshener","Strong Fragrance Freshener",
    "Premium Aroma Freshener","Comfort Freshener","Pure Air Freshener",
    "Fresh Care Freshener","Total Fresh Freshener"};
    return roomFreshenerBrands;
}

if(productName == ("glassCleaner")){
    String[] glassCleanerBrands={
    "Colin Cleaner","Lizol Glass Cleaner","Domex Glass Cleaner","Dettol Glass Cleaner","Vim Glass Cleaner",
    "BB Royal Cleaner","More Choice Cleaner","Classic Cleaner","Premium Cleaner","Shine Glass Cleaner",
    "Crystal Cleaner","Streak Free Cleaner","Spray Cleaner","Daily Use Cleaner","Select Cleaner",
    "Quality Cleaner","Special Cleaner","Eco Cleaner","Window Cleaner","Mirror Cleaner",
    "Surface Cleaner","Ultra Shine Cleaner","Pro Cleaner","Home Care Cleaner",
    "Safe Glass Cleaner","Strong Action Cleaner","Fresh Fragrance Cleaner",
    "Advanced Cleaner","Total Clean Cleaner","Quick Clean Cleaner",
    "Max Shine Cleaner","Pure Glass Cleaner","Smart Cleaner",
    "Professional Cleaner","Power Clean Cleaner","Bright View Cleaner",
    "Sparkle Glass Cleaner"};
    return glassCleanerBrands;
}

if(productName == ("toiletCleaner")){
    String[] toiletCleanerBrands={"Harpic","Domex Toilet Cleaner","Lizol Toilet Cleaner","Dettol Toilet Cleaner","Vim Toilet Cleaner",
    "BB Royal Toilet Cleaner","More Choice Cleaner","Classic Cleaner","Premium Cleaner",
    "Power Toilet Cleaner","Strong Action Cleaner","Disinfectant Cleaner",
    "Daily Use Cleaner","Select Cleaner","Quality Cleaner","Special Cleaner",
    "Eco Cleaner","Ultra Clean Cleaner","Pro Cleaner","Home Care Cleaner",
    "Safe Toilet Cleaner","Fresh Fragrance Cleaner","Advanced Cleaner",
    "Total Clean Cleaner","Quick Clean Cleaner","Max Power Cleaner",
    "Germ Kill Cleaner","Deep Clean Cleaner","Smart Cleaner",
    "Professional Cleaner","Hygiene Cleaner","Extra Strong Cleaner",
    "Premium Care Cleaner","Sparkle Toilet Cleaner","Bright Clean Cleaner",
    "Super Clean Cleaner","Ultimate Toilet Cleaner"};
    return toiletCleanerBrands;
}

if (productName == ("bodyLotion")) {
    String[] brands = {
        "Vaseline Lotion","Nivea Lotion","Dove Lotion","Pond's Lotion","Himalaya Lotion","BB Royal Lotion","More Choice Lotion",
        "Classic Lotion","Premium Lotion","Aloe Lotion","Cocoa Lotion","Vitamin E Lotion","Shea Butter Lotion","Herbal Lotion",
        "Natural Lotion","Daily Care Lotion","Eco Lotion","Select Lotion","Quality Lotion","Special Lotion","Designer Lotion",
        "Ultra Moist Lotion","Pro Lotion","Skin Care Lotion","Soft Touch Lotion","Hydrating Lotion","Deep Moist Lotion",
        "Smooth Lotion","Fresh Lotion","Glow Lotion","Light Lotion","Strong Moist Lotion","Healthy Skin Lotion",
        "Family Pack Lotion","Value Pack Lotion","Pure Lotion","Comfort Lotion"
    };
    return brands;
}

if (productName == ("talcumPowder")) {
    String[] brands = {
        "Pond's Powder","Nycil Powder","Cinthol Powder","Dermicool Powder","BB Royal Powder","More Choice Powder","Classic Powder",
        "Premium Powder","Cool Powder","Fresh Powder","Herbal Powder","Natural Powder","Daily Use Powder","Select Powder",
        "Quality Powder","Special Powder","Designer Powder","Ultra Cool Powder","Pro Powder","Skin Care Powder",
        "Soft Powder","Comfort Powder","Healthy Powder","Extra Fresh Powder","Rose Powder","Lavender Powder",
        "Sandal Powder","Neem Powder","Aloe Powder","Baby Powder","Family Pack Powder","Value Pack Powder",
        "Pure Powder","Glow Powder","Long Lasting Powder","Smooth Powder","Strong Cool Powder"
    };
    return brands;
}

if (productName == ("shavingCream")) {
    String[] brands = {
        "Gillette Cream","Old Spice Cream","Park Avenue Cream","Godrej Cream","BB Royal Cream","More Choice Cream","Classic Cream",
        "Premium Cream","Foam Cream","Herbal Cream","Sensitive Cream","Fresh Cream","Cooling Cream","Daily Use Cream",
        "Select Cream","Quality Cream","Special Cream","Ultra Smooth Cream","Pro Cream","Skin Guard Cream",
        "Soft Glide Cream","Comfort Cream","Healthy Skin Cream","Aloe Cream","Neem Cream","Lemon Cream",
        "Menthol Cream","Active Cream","Power Cream","Strong Hold Cream","Family Pack Cream","Value Pack Cream",
        "Pure Cream","Gentle Cream","Long Lasting Cream","Super Glide Cream","Ultimate Cream"
    };
    return brands;
}

if (productName == ("hairGel")) {
    String[] brands = {
        "Set Wet Gel","Gatsby Gel","Park Avenue Gel","Beardo Gel","BB Royal Gel","More Choice Gel","Classic Gel",
        "Premium Gel","Strong Hold Gel","Wet Look Gel","Herbal Gel","Natural Gel","Daily Use Gel","Select Gel",
        "Quality Gel","Special Gel","Ultra Hold Gel","Pro Gel","Matte Finish Gel","Shine Gel",
        "Cooling Gel","Aloe Gel","Active Gel","Power Gel","Designer Gel","Family Pack Gel",
        "Value Pack Gel","Pure Gel","Long Hold Gel","Smooth Gel","Comfort Gel",
        "Healthy Hair Gel","Fresh Gel","Eco Gel","Extreme Hold Gel","Professional Gel","Ultimate Gel"
    };
    return brands;
}

if (productName == ("coconutOil")) {
    String[] brands = {
        "Parachute Oil","Dabur Oil","Indulekha Oil","Bajaj Oil","BB Royal Oil","More Choice Oil","Classic Oil",
        "Premium Oil","Pure Coconut Oil","Cold Pressed Oil","Extra Virgin Oil","Herbal Oil","Natural Oil","Daily Use Oil",
        "Select Oil","Quality Oil","Special Oil","Aloe Oil","Neem Oil","Jasmine Oil",
        "Strong Oil","Healthy Hair Oil","Family Pack Oil","Value Pack Oil","Pure Drop Oil",
        "Filtered Oil","Wood Pressed Oil","Organic Oil","Fresh Oil","Eco Oil",
        "Light Oil","Traditional Oil","Pro Oil","Ultra Oil","Comfort Oil",
        "Glow Oil","Ultimate Oil"
    };
    return brands;
}

if (productName == ("mustardOil")) {
    String[] brands = {
        "Fortune Mustard Oil","Dhara Mustard Oil","Engine Oil","BB Royal Mustard Oil","More Choice Mustard Oil","Classic Mustard Oil","Premium Mustard Oil",
        "Cold Pressed Mustard Oil","Kachi Ghani Oil","Filtered Mustard Oil","Organic Mustard Oil","Pure Mustard Oil","Natural Mustard Oil","Daily Use Mustard Oil",
        "Select Mustard Oil","Quality Mustard Oil","Special Mustard Oil","Traditional Mustard Oil","Healthy Oil","Family Pack Oil",
        "Value Pack Oil","Strong Flavor Oil","Light Flavor Oil","Fresh Mustard Oil","Eco Mustard Oil",
        "Desi Mustard Oil","Golden Mustard Oil","Pro Mustard Oil","Ultra Mustard Oil","Comfort Mustard Oil",
        "Village Oil","Farm Oil","Wood Pressed Oil","Refined Mustard Oil","Premium Gold Oil",
        "Ultimate Mustard Oil"
    };
    return brands;
}

if (productName == ("oliveOil")) {
    String[] brands = {
        "Borges Olive Oil","Figaro Olive Oil","Del Monte Olive Oil","BB Royal Olive Oil","More Choice Olive Oil","Classic Olive Oil","Premium Olive Oil",
        "Extra Virgin Olive Oil","Pure Olive Oil","Light Olive Oil","Cooking Olive Oil","Salad Olive Oil","Imported Olive Oil","Natural Olive Oil",
        "Daily Use Olive Oil","Select Olive Oil","Quality Olive Oil","Special Olive Oil","Healthy Heart Oil","Family Pack Oil",
        "Value Pack Oil","Mediterranean Oil","Cold Pressed Olive Oil","Organic Olive Oil","Golden Olive Oil",
        "Eco Olive Oil","Pro Olive Oil","Ultra Olive Oil","Comfort Olive Oil","Chef Choice Oil",
        "Italian Olive Oil","Spanish Olive Oil","Refined Olive Oil","Pure Gold Oil","Fresh Olive Oil",
        "Ultimate Olive Oil"
    };
    return brands;
}

if (productName == ("sonaMasooriRice")) {
    String[] brands = {
        "India Gate Rice","Daawat Rice","Fortune Rice","BB Royal Rice","More Choice Rice","Classic Rice","Premium Rice",
        "Organic Rice","Pure Sona Rice","Select Rice","Quality Rice","Special Rice","Traditional Rice","Healthy Rice",
        "Family Pack Rice","Value Pack Rice","Fresh Harvest Rice","Golden Grain Rice","Eco Rice","Daily Use Rice",
        "Desi Rice","Farm Rice","Standard Rice","Fine Grain Rice","Premium Gold Rice",
        "Light Weight Rice","Pro Rice","Ultra Rice","Comfort Rice","Village Rice",
        "Natural Rice","Organic Gold Rice","Chef Choice Rice","Soft Grain Rice","Long Grain Rice",
        "Ultimate Rice"
    };
    return brands;
}

if (productName == ("basmatiRice")) {
    String[] brands = {
        "India Gate Basmati","Daawat Basmati","Fortune Basmati","Kohinoor Basmati","BB Royal Basmati","More Choice Basmati","Classic Basmati",
        "Premium Basmati","Organic Basmati","Extra Long Rice","Select Basmati","Quality Basmati","Special Basmati","Traditional Basmati",
        "Healthy Basmati","Family Pack Rice","Value Pack Rice","Golden Grain Rice","Fresh Harvest Rice","Eco Rice",
        "Chef Choice Rice","Royal Basmati","Fine Grain Rice","Long Grain Rice","Pure Basmati",
        "Natural Basmati","Daily Use Rice","Desi Basmati","Farm Rice","Pro Basmati",
        "Ultra Basmati","Comfort Rice","Aged Basmati","Super Long Rice","Premium Gold Rice",
        "Soft Grain Rice","Ultimate Basmati"
    };
    return brands;
}

if (productName == ("softDrink")) {
    String[] brands = {
        "Coca Cola","Pepsi","Sprite","Fanta","Thums Up","Limca","BB Royal Drink",
        "More Choice Drink","Classic Cola","Premium Soda","Orange Drink","Lemon Drink","Cola Drink","Energy Soda",
        "Diet Cola","Zero Sugar Cola","Fresh Soda","Sparkling Drink","Cool Drink","Family Pack Drink",
        "Value Pack Drink","Strong Soda","Chill Drink","Party Drink","Ice Cola",
        "Sweet Soda","Power Drink","Refreshing Soda","Mini Bottle Drink","Jumbo Bottle Drink",
        "Eco Drink","Daily Drink","Select Drink","Quality Drink","Special Drink",
        "Pro Drink","Ultimate Soda"
    };
    return brands;
}

if (productName == ("chips")) {
    String[] brands = {
        "Lays Chips","Bingo Chips","Kurkure Chips","Haldiram Chips","Balaji Chips","BB Royal Chips","More Choice Chips",
        "Classic Chips","Premium Chips","Salted Chips","Masala Chips","Cream & Onion Chips","Tomato Chips","Spicy Chips",
        "Cheese Chips","Family Pack Chips","Value Pack Chips","Crunchy Chips","Thin Cut Chips","Thick Cut Chips",
        "Potato Chips","Corn Chips","Healthy Chips","Baked Chips","Fresh Chips",
        "Desi Chips","Party Chips","Mini Pack Chips","Jumbo Pack Chips","Eco Chips",
        "Daily Snack Chips","Select Chips","Quality Chips","Special Chips","Pro Chips",
        "Ultra Chips","Ultimate Chips"
    };
    return brands;
}

if (productName == ("nachos")) {
    String[] brands = {
        "Doritos Nachos","Bingo Nachos","Cornitos Nachos","Haldiram Nachos","BB Royal Nachos","More Choice Nachos","Classic Nachos",
        "Premium Nachos","Cheese Nachos","Salted Nachos","Spicy Nachos","Mexican Nachos","Corn Nachos","Crunchy Nachos",
        "Family Pack Nachos","Value Pack Nachos","Healthy Nachos","Baked Nachos","Fresh Nachos","Party Nachos",
        "Mini Pack Nachos","Jumbo Pack Nachos","Eco Nachos","Daily Snack Nachos","Select Nachos",
        "Quality Nachos","Special Nachos","Pro Nachos","Ultra Nachos","Comfort Nachos",
        "Golden Nachos","Natural Nachos","Restaurant Style Nachos","Desi Nachos","Power Nachos",
        "Super Nachos","Ultimate Nachos"
    };
    return brands;
}


if (productName == ("chikki")) {
    String[] brands = {
        "Lonavala Chikki","Haldiram Chikki","Bikaji Chikki","BB Royal Chikki","More Choice Chikki","Classic Chikki","Premium Chikki",
        "Peanut Chikki","Til Chikki","Dry Fruit Chikki","Desi Chikki","Crunchy Chikki","Fresh Chikki","Natural Chikki",
        "Family Pack Chikki","Value Pack Chikki","Mini Pack Chikki","Jumbo Pack Chikki","Eco Chikki","Daily Snack Chikki",
        "Select Chikki","Quality Chikki","Special Chikki","Pro Chikki","Ultra Chikki",
        "Comfort Chikki","Golden Chikki","Traditional Chikki","Power Chikki","Healthy Chikki",
        "Light Chikki","Extra Sweet Chikki","Organic Chikki","Restaurant Style Chikki","Pure Chikki",
        "Village Chikki","Ultimate Chikki"
    };
    return brands;
}

if (productName == ("granolaBar")) {
    String[] brands = {
        "Yoga Bar","Kellogg Bar","Nature Valley","BB Royal Bar","More Choice Bar","Classic Bar","Premium Bar",
        "Oats Bar","Chocolate Bar","Honey Bar","Dry Fruit Bar","Protein Bar","Energy Bar","Crunchy Bar",
        "Family Pack Bar","Value Pack Bar","Mini Pack Bar","Jumbo Pack Bar","Eco Bar","Daily Snack Bar",
        "Select Bar","Quality Bar","Special Bar","Pro Bar","Ultra Bar",
        "Comfort Bar","Golden Bar","Natural Bar","Healthy Bar","Light Bar",
        "Low Sugar Bar","High Fiber Bar","Organic Bar","Fresh Bar","Power Bar",
        "Super Bar","Ultimate Bar"
    };
    return brands;
}

if (productName == ("besan")) {
    String[] brands = {
        "Aashirvaad Besan","Fortune Besan","Rajdhani Besan","BB Royal Besan","More Choice Besan","Classic Besan","Premium Besan",
        "Fine Besan","Organic Besan","Pure Besan","Natural Besan","Fresh Besan","Daily Use Besan","Select Besan",
        "Quality Besan","Special Besan","Ultra Fine Besan","Pro Besan","Healthy Besan","Family Pack Besan",
        "Value Pack Besan","Golden Grain Besan","Eco Besan","Traditional Besan","Desi Besan",
        "Light Besan","Strong Besan","Standard Besan","Chef Choice Besan","Soft Besan",
        "Village Besan","Farm Besan","Hygienic Besan","Clean Besan","Protein Besan",
        "Super Besan","Ultimate Besan"
    };
    return brands;
}

if (productName == ("cornFlour")) {
    String[] brands = {
        "Weikfield CornFlour","Brown & Polson CornFlour","BB Royal CornFlour","More Choice CornFlour","Classic CornFlour","Premium CornFlour","Fine CornFlour",
        "Pure CornFlour","Natural CornFlour","Fresh CornFlour","Daily Use CornFlour","Select CornFlour","Quality CornFlour","Special CornFlour",
        "Ultra CornFlour","Pro CornFlour","Healthy CornFlour","Family Pack CornFlour","Value Pack CornFlour","Golden Grain CornFlour",
        "Eco CornFlour","Traditional CornFlour","Chef Choice CornFlour","Soft CornFlour","Light CornFlour",
        "Standard CornFlour","Desi CornFlour","Organic CornFlour","Farm CornFlour","Clean CornFlour",
        "Hygienic CornFlour","Smooth CornFlour","Strong CornFlour","Village CornFlour","Refined CornFlour",
        "Super CornFlour","Ultimate CornFlour"
    };
    return brands;
}

if (productName == ("bakingPowder")) {
    String[] brands = {
        "Weikfield Baking Powder","Brown & Polson Baking Powder","BB Royal Baking Powder","More Choice Baking Powder","Classic Baking Powder","Premium Baking Powder","Fine Baking Powder",
        "Pure Baking Powder","Natural Baking Powder","Fresh Baking Powder","Daily Use Baking Powder","Select Baking Powder","Quality Baking Powder","Special Baking Powder",
        "Ultra Baking Powder","Pro Baking Powder","Healthy Baking Powder","Family Pack Baking Powder","Value Pack Baking Powder","Golden Baking Powder",
        "Eco Baking Powder","Traditional Baking Powder","Chef Choice Baking Powder","Soft Baking Powder","Light Baking Powder",
        "Standard Baking Powder","Desi Baking Powder","Organic Baking Powder","Farm Baking Powder","Clean Baking Powder",
        "Hygienic Baking Powder","Smooth Baking Powder","Strong Baking Powder","Village Baking Powder","Refined Baking Powder",
        "Super Baking Powder","Ultimate Baking Powder"
    };
    return brands;
}

if (productName == ("herbalTea")) {
    String[] brands = {
        "Organic India Tea","Tetley Herbal","Lipton Herbal","BB Royal Herbal Tea","More Choice Herbal Tea","Classic Herbal Tea","Premium Herbal Tea",
        "Tulsi Tea","Chamomile Tea","Ginger Tea","Lemon Tea","Fresh Tea","Daily Tea","Select Tea",
        "Quality Tea","Special Tea","Ultra Tea","Pro Tea","Healthy Tea","Family Pack Tea",
        "Value Pack Tea","Natural Tea","Organic Tea","Green Herbal Tea","Light Tea",
        "Strong Tea","Detox Tea","Immunity Tea","Relax Tea","Comfort Tea",
        "Refreshing Tea","Golden Tea","Traditional Tea","Eco Tea","Power Tea",
        "Super Tea","Ultimate Tea"
    };
    return brands;
}

if (productName == ("blackCoffee")) {
    String[] brands = {
        "Bru Black Coffee","Nescafe Black Coffee","Davidoff Black Coffee","BB Royal Black Coffee","More Choice Black Coffee","Classic Black Coffee","Premium Black Coffee",
        "Strong Black Coffee","Instant Black Coffee","Fresh Black Coffee","Daily Black Coffee","Select Black Coffee","Quality Black Coffee","Special Black Coffee",
        "Ultra Black Coffee","Pro Black Coffee","Healthy Black Coffee","Family Pack Black Coffee","Value Pack Black Coffee","Natural Black Coffee",
        "Organic Black Coffee","Light Black Coffee","Dark Roast Coffee","Medium Roast Coffee","Pure Black Coffee",
        "Comfort Black Coffee","Refreshing Black Coffee","Golden Coffee","Active Coffee","Eco Coffee",
        "Energy Coffee","Power Coffee","Desi Coffee","Farm Coffee","Premium Roast Coffee",
        "Super Black Coffee","Ultimate Black Coffee"
    };
    return brands;
}


if (productName == ("bakingSoda")) {
    String[] brands = {
        "Tata Baking Soda","Weikfield Baking Soda","BB Royal Baking Soda","More Choice Baking Soda","Classic Baking Soda","Premium Baking Soda","Fine Baking Soda",
        "Pure Baking Soda","Natural Baking Soda","Fresh Baking Soda","Daily Use Baking Soda","Select Baking Soda","Quality Baking Soda","Special Baking Soda",
        "Ultra Baking Soda","Pro Baking Soda","Healthy Baking Soda","Family Pack Baking Soda","Value Pack Baking Soda","Golden Baking Soda",
        "Eco Baking Soda","Traditional Baking Soda","Chef Choice Baking Soda","Soft Baking Soda","Light Baking Soda",
        "Standard Baking Soda","Desi Baking Soda","Organic Baking Soda","Farm Baking Soda","Clean Baking Soda",
        "Hygienic Baking Soda","Smooth Baking Soda","Strong Baking Soda","Village Baking Soda","Refined Baking Soda",
        "Super Baking Soda","Ultimate Baking Soda"
    };
    return brands;
}

if (productName == ("custardPowder")) {
    String[] brands = {
        "Weikfield Custard","Brown & Polson Custard","BB Royal Custard","More Choice Custard","Classic Custard","Premium Custard","Vanilla Custard",
        "Strawberry Custard","Mango Custard","Chocolate Custard","Pineapple Custard","Fresh Custard","Daily Use Custard","Select Custard",
        "Quality Custard","Special Custard","Ultra Custard","Pro Custard","Healthy Custard","Family Pack Custard",
        "Value Pack Custard","Golden Custard","Eco Custard","Traditional Custard","Chef Choice Custard",
        "Smooth Custard","Light Custard","Creamy Custard","Dessert Custard","Instant Custard",
        "Rich Custard","Sweet Custard","Pure Custard","Fine Custard","Delight Custard",
        "Super Custard","Ultimate Custard"
    };
    return brands;
}

if (productName == ("yeast")) {
    String[] brands = {
        "Keya Yeast","Blue Bird Yeast","BB Royal Yeast","More Choice Yeast","Classic Yeast","Premium Yeast","Active Yeast",
        "Dry Yeast","Instant Yeast","Baking Yeast","Fresh Yeast","Daily Use Yeast","Select Yeast","Quality Yeast",
        "Special Yeast","Ultra Yeast","Pro Yeast","Healthy Yeast","Family Pack Yeast","Value Pack Yeast",
        "Golden Yeast","Eco Yeast","Traditional Yeast","Chef Choice Yeast","Soft Yeast",
        "Light Yeast","Standard Yeast","Organic Yeast","Farm Yeast","Clean Yeast",
        "Hygienic Yeast","Smooth Yeast","Strong Yeast","Village Yeast","Refined Yeast",
        "Super Yeast","Ultimate Yeast"
    };
    return brands;
}

if (productName == ("soyaChunks")) {
    String[] brands = {
        "Nutrela Soya","Fortune Soya","BB Royal Soya","More Choice Soya","Classic Soya","Premium Soya","Protein Soya",
        "Healthy Soya","Fresh Soya","Natural Soya","Daily Use Soya","Select Soya","Quality Soya","Special Soya",
        "Ultra Soya","Pro Soya","Family Pack Soya","Value Pack Soya","Golden Soya","Eco Soya",
        "Traditional Soya","Chef Choice Soya","Light Soya","Standard Soya","Organic Soya",
        "Farm Soya","Clean Soya","Hygienic Soya","Smooth Soya","Strong Soya",
        "Village Soya","Refined Soya","Pure Soya","Fine Soya","Desi Soya",
        "Super Soya","Ultimate Soya"
    };
    return brands;
}

if (productName == ("chana")) {
    String[] brands = {
        "Tata Sampann Chana","Fortune Chana","BB Royal Chana","More Choice Chana","Classic Chana","Premium Chana","Desi Chana",
        "Kabuli Chana","Organic Chana","Fresh Chana","Daily Use Chana","Select Chana","Quality Chana","Special Chana",
        "Ultra Chana","Pro Chana","Healthy Chana","Family Pack Chana","Value Pack Chana","Golden Chana",
        "Eco Chana","Traditional Chana","Chef Choice Chana","Light Chana","Standard Chana",
        "Farm Chana","Clean Chana","Hygienic Chana","Smooth Chana","Strong Chana",
        "Village Chana","Refined Chana","Pure Chana","Fine Chana","Natural Chana",
        "Super Chana","Ultimate Chana"
    };
    return brands;
}

if (productName == ("uradDal")) {
    String[] brands = {
        "Tata Sampann Urad","Fortune Urad","BB Royal Urad","More Choice Urad","Classic Urad","Premium Urad","Split Urad",
        "Whole Urad","Organic Urad","Fresh Urad","Daily Use Urad","Select Urad","Quality Urad","Special Urad",
        "Ultra Urad","Pro Urad","Healthy Urad","Family Pack Urad","Value Pack Urad","Golden Urad",
        "Eco Urad","Traditional Urad","Chef Choice Urad","Light Urad","Standard Urad",
        "Farm Urad","Clean Urad","Hygienic Urad","Smooth Urad","Strong Urad",
        "Village Urad","Refined Urad","Pure Urad","Fine Urad","Natural Urad",
        "Super Urad","Ultimate Urad"
    };
    return brands;
}

if (productName == ("airFreshener")) {
    String[] brands = {
        "Odonil Freshener","Godrej Aer","Ambi Pur","BB Royal Freshener","More Choice Freshener","Classic Freshener","Premium Freshener",
        "Rose Freshener","Lavender Freshener","Jasmine Freshener","Lemon Freshener","Floral Freshener","Daily Freshener","Select Freshener",
        "Quality Freshener","Special Freshener","Ultra Freshener","Pro Freshener","Strong Freshener","Ocean Freshener",
        "Musk Freshener","Vanilla Freshener","Designer Freshener","Eco Freshener","Family Pack Freshener",
        "Value Pack Freshener","Long Last Freshener","Comfort Freshener","Room Spray","Power Freshener",
        "Natural Freshener","Pure Freshener","Fresh Air Spray","Cool Freshener","Active Freshener",
        "Super Freshener","Ultimate Freshener"
    };
    return brands;
}

if (productName == ("faceMask")) {
    String[] brands = {
        "Mamaearth Mask","Himalaya Mask","Garnier Mask","BB Royal Mask","More Choice Mask","Classic Mask","Premium Mask",
        "Charcoal Mask","Neem Mask","Aloe Mask","Clay Mask","Herbal Mask","Daily Mask","Select Mask",
        "Quality Mask","Special Mask","Ultra Mask","Pro Mask","Skin Care Mask","Glow Mask",
        "Hydrating Mask","Detox Mask","Brightening Mask","Cooling Mask","Natural Mask",
        "Organic Mask","Fresh Mask","Comfort Mask","Soft Mask","Healthy Mask",
        "Designer Mask","Family Pack Mask","Value Pack Mask","Pure Mask","Active Mask",
        "Super Mask","Ultimate Mask"
    };
    return brands;
}

if (productName == ("sunscreen")) {
    String[] brands = {
        "Lakme Sunscreen","Nivea Sunscreen","Lotus Sunscreen","BB Royal Sunscreen","More Choice Sunscreen","Classic Sunscreen","Premium Sunscreen",
        "SPF 30 Sunscreen","SPF 50 Sunscreen","Gel Sunscreen","Cream Sunscreen","Matte Sunscreen","Daily Sunscreen","Select Sunscreen",
        "Quality Sunscreen","Special Sunscreen","Ultra Sunscreen","Pro Sunscreen","Skin Care Sunscreen","Glow Sunscreen",
        "Hydrating Sunscreen","Waterproof Sunscreen","Sweat Proof Sunscreen","Natural Sunscreen","Organic Sunscreen",
        "Fresh Sunscreen","Comfort Sunscreen","Soft Sunscreen","Healthy Sunscreen","Family Pack Sunscreen",
        "Value Pack Sunscreen","Pure Sunscreen","Active Sunscreen","Cooling Sunscreen","Light Sunscreen",
        "Super Sunscreen","Ultimate Sunscreen"
    };
    return brands;
}

if (productName == ("lipBalm")) {
    String[] brands = {
        "Nivea Lip Balm","Vaseline Lip Balm","Lakme Lip Balm","BB Royal Lip Balm","More Choice Lip Balm","Classic Lip Balm","Premium Lip Balm",
        "Strawberry Lip Balm","Cherry Lip Balm","Vanilla Lip Balm","Mint Lip Balm","Aloe Lip Balm","Daily Lip Balm","Select Lip Balm",
        "Quality Lip Balm","Special Lip Balm","Ultra Lip Balm","Pro Lip Balm","Soft Lip Balm","Hydrating Lip Balm",
        "Glossy Lip Balm","Matte Lip Balm","Natural Lip Balm","Organic Lip Balm","Fresh Lip Balm",
        "Comfort Lip Balm","Healthy Lip Balm","Family Pack Lip Balm","Value Pack Lip Balm","Pure Lip Balm",
        "Cooling Lip Balm","Tinted Lip Balm","SPF Lip Balm","Light Lip Balm","Smooth Lip Balm",
        "Super Lip Balm","Ultimate Lip Balm"
    };
    return brands;
}

if (productName == ("handCream")) {
    String[] brands = {
        "Vaseline Hand Cream","Nivea Hand Cream","Dove Hand Cream","BB Royal Hand Cream","More Choice Hand Cream","Classic Hand Cream","Premium Hand Cream",
        "Aloe Hand Cream","Shea Butter Hand Cream","Vitamin E Hand Cream","Daily Hand Cream","Select Hand Cream","Quality Hand Cream","Special Hand Cream",
        "Ultra Hand Cream","Pro Hand Cream","Soft Hand Cream","Hydrating Hand Cream","Glow Hand Cream","Natural Hand Cream",
        "Organic Hand Cream","Fresh Hand Cream","Comfort Hand Cream","Healthy Hand Cream","Family Pack Hand Cream",
        "Value Pack Hand Cream","Pure Hand Cream","Cooling Hand Cream","Light Hand Cream","Smooth Hand Cream",
        "Strong Moist Hand Cream","Designer Hand Cream","Active Hand Cream","Skin Care Hand Cream","Protective Hand Cream",
        "Super Hand Cream","Ultimate Hand Cream"
    };
    return brands;
}

if (productName == ("footCream")) {
    String[] brands = {
        "Krack Foot Cream","Himalaya Foot Cream","Vaseline Foot Cream","BB Royal Foot Cream","More Choice Foot Cream","Classic Foot Cream","Premium Foot Cream",
        "Crack Repair Cream","Heel Repair Cream","Aloe Foot Cream","Neem Foot Cream","Daily Foot Cream","Select Foot Cream","Quality Foot Cream",
        "Special Foot Cream","Ultra Foot Cream","Pro Foot Cream","Soft Foot Cream","Hydrating Foot Cream","Glow Foot Cream",
        "Natural Foot Cream","Organic Foot Cream","Fresh Foot Cream","Comfort Foot Cream","Healthy Foot Cream",
        "Family Pack Foot Cream","Value Pack Foot Cream","Pure Foot Cream","Cooling Foot Cream","Light Foot Cream",
        "Smooth Foot Cream","Strong Repair Cream","Designer Foot Cream","Active Foot Cream","Skin Care Foot Cream",
        "Super Foot Cream","Ultimate Foot Cream"
    };
    return brands;
}

if (productName == ("shampooConditioner")) {
    String[] brands = {
        "Dove Combo","Sunsilk Combo","Pantene Combo","BB Royal Combo","More Choice Combo","Classic Combo","Premium Combo",
        "Anti Hairfall Combo","Smooth Combo","Shine Combo","Herbal Combo","Natural Combo","Daily Combo","Select Combo",
        "Quality Combo","Special Combo","Ultra Combo","Pro Combo","Soft Combo","Hydrating Combo",
        "Glow Combo","Organic Combo","Fresh Combo","Comfort Combo","Healthy Combo",
        "Family Pack Combo","Value Pack Combo","Pure Combo","Cooling Combo","Light Combo",
        "Strong Combo","Designer Combo","Active Combo","Repair Combo","Care Combo",
        "Super Combo","Ultimate Combo"
    };
    return brands;
}

if (productName == ("beardOil")) {
    String[] brands = {
        "Beardo Oil","Ustraa Oil","Man Company Oil","BB Royal Beard Oil","More Choice Beard Oil","Classic Beard Oil","Premium Beard Oil",
        "Aloe Beard Oil","Herbal Beard Oil","Natural Beard Oil","Daily Beard Oil","Select Beard Oil","Quality Beard Oil","Special Beard Oil",
        "Ultra Beard Oil","Pro Beard Oil","Soft Beard Oil","Hydrating Beard Oil","Glow Beard Oil","Organic Beard Oil",
        "Fresh Beard Oil","Comfort Beard Oil","Healthy Beard Oil","Family Pack Beard Oil","Value Pack Beard Oil",
        "Pure Beard Oil","Cooling Beard Oil","Light Beard Oil","Smooth Beard Oil","Strong Beard Oil",
        "Designer Beard Oil","Active Beard Oil","Skin Care Beard Oil","Woody Beard Oil","Musk Beard Oil",
        "Super Beard Oil","Ultimate Beard Oil"
    };
    return brands;
}

if (productName == ("hairSerum")) {
    String[] brands = {
        "Livon Serum","Streax Serum","L'Oreal Serum","BB Royal Serum","More Choice Serum","Classic Serum","Premium Serum",
        "Anti Frizz Serum","Smooth Serum","Shine Serum","Herbal Serum","Natural Serum","Daily Serum","Select Serum",
        "Quality Serum","Special Serum","Ultra Serum","Pro Serum","Soft Serum","Hydrating Serum",
        "Glow Serum","Organic Serum","Fresh Serum","Comfort Serum","Healthy Hair Serum",
        "Family Pack Serum","Value Pack Serum","Pure Serum","Light Serum","Strong Serum",
        "Designer Serum","Active Serum","Repair Serum","Care Serum","Silky Serum",
        "Super Serum","Ultimate Serum"
    };
    return brands;
}

if (productName == ("faceScrub")) {
    String[] brands = {
        "Himalaya Scrub","Garnier Scrub","Clean & Clear Scrub","BB Royal Scrub","More Choice Scrub","Classic Scrub","Premium Scrub",
        "Neem Scrub","Walnut Scrub","Coffee Scrub","Herbal Scrub","Natural Scrub","Daily Scrub","Select Scrub",
        "Quality Scrub","Special Scrub","Ultra Scrub","Pro Scrub","Soft Scrub","Hydrating Scrub",
        "Glow Scrub","Organic Scrub","Fresh Scrub","Comfort Scrub","Healthy Skin Scrub",
        "Family Pack Scrub","Value Pack Scrub","Pure Scrub","Light Scrub","Strong Scrub",
        "Designer Scrub","Active Scrub","Detox Scrub","Brightening Scrub","Cooling Scrub",
        "Super Scrub","Ultimate Scrub"
    };
    return brands;
}

if (productName == ("bodyWash")) {
    String[] brands = {
        "Dove Body Wash","Nivea Body Wash","Lux Body Wash","BB Royal Body Wash","More Choice Body Wash","Classic Body Wash","Premium Body Wash",
        "Aloe Body Wash","Neem Body Wash","Milk Body Wash","Herbal Body Wash","Natural Body Wash","Daily Body Wash","Select Body Wash",
        "Quality Body Wash","Special Body Wash","Ultra Body Wash","Pro Body Wash","Soft Body Wash","Hydrating Body Wash",
        "Glow Body Wash","Organic Body Wash","Fresh Body Wash","Comfort Body Wash","Healthy Skin Body Wash",
        "Family Pack Body Wash","Value Pack Body Wash","Pure Body Wash","Cooling Body Wash","Light Body Wash",
        "Strong Body Wash","Designer Body Wash","Active Body Wash","Skin Care Body Wash","Foam Body Wash",
        "Super Body Wash","Ultimate Body Wash"
    };
    return brands;
}

if (productName == ("soda")) {
    String[] brands = {
        "Kinley Soda","Schweppes Soda","Catch Soda","BB Royal Soda","More Choice Soda","Classic Soda","Premium Soda",
        "Club Soda","Lemon Soda","Plain Soda","Sparkling Soda","Fresh Soda","Daily Soda","Select Soda",
        "Quality Soda","Special Soda","Ultra Soda","Pro Soda","Strong Soda","Chill Soda",
        "Party Soda","Mini Soda","Jumbo Soda","Eco Soda","Cool Soda",
        "Natural Soda","Pure Soda","Light Soda","Power Soda","Active Soda",
        "Comfort Soda","Healthy Soda","Value Pack Soda","Family Pack Soda","Refreshing Soda",
        "Super Soda","Ultimate Soda"
    };
    return brands;
}

if (productName == ("buttermilk")) {
    String[] brands = {
        "Amul Buttermilk","Nandini Buttermilk","Heritage Buttermilk","BB Royal Buttermilk","More Choice Buttermilk","Classic Buttermilk","Premium Buttermilk",
        "Masala Buttermilk","Salted Buttermilk","Plain Buttermilk","Fresh Buttermilk","Daily Buttermilk","Select Buttermilk","Quality Buttermilk",
        "Special Buttermilk","Ultra Buttermilk","Pro Buttermilk","Healthy Buttermilk","Family Pack Buttermilk","Value Pack Buttermilk",
        "Natural Buttermilk","Organic Buttermilk","Cool Buttermilk","Light Buttermilk","Strong Flavor Buttermilk",
        "Desi Buttermilk","Village Buttermilk","Farm Buttermilk","Pure Buttermilk","Comfort Buttermilk",
        "Refreshing Buttermilk","Golden Buttermilk","Traditional Buttermilk","Active Buttermilk","Eco Buttermilk",
        "Super Buttermilk","Ultimate Buttermilk"
    };
    return brands;
}

if (productName == ("lassi")) {
    String[] brands = {
        "Amul Lassi","Nandini Lassi","Mother Dairy Lassi","BB Royal Lassi","More Choice Lassi","Classic Lassi","Premium Lassi",
        "Sweet Lassi","Salted Lassi","Mango Lassi","Strawberry Lassi","Fresh Lassi","Daily Lassi","Select Lassi",
        "Quality Lassi","Special Lassi","Ultra Lassi","Pro Lassi","Healthy Lassi","Family Pack Lassi",
        "Value Pack Lassi","Natural Lassi","Organic Lassi","Cool Lassi","Light Lassi",
        "Desi Lassi","Village Lassi","Farm Lassi","Pure Lassi","Comfort Lassi",
        "Refreshing Lassi","Golden Lassi","Traditional Lassi","Active Lassi","Eco Lassi",
        "Super Lassi","Ultimate Lassi"
    };
    return brands;
}

if (productName == ("flavoredMilk")) {
    String[] brands = {
        "Amul Flavored Milk","Nandini Flavored Milk","Hershey's Milk","BB Royal Milk","More Choice Milk","Classic Milk","Premium Milk",
        "Chocolate Milk","Strawberry Milk","Vanilla Milk","Badam Milk","Fresh Milk","Daily Milk","Select Milk",
        "Quality Milk","Special Milk","Ultra Milk","Pro Milk","Healthy Milk","Family Pack Milk",
        "Value Pack Milk","Natural Milk","Organic Milk","Cool Milk","Light Milk",
        "Desi Milk","Village Milk","Farm Milk","Pure Milk","Comfort Milk",
        "Refreshing Milk","Golden Milk","Traditional Milk","Active Milk","Eco Milk",
        "Super Milk","Ultimate Milk"
    };
    return brands;
}

if (productName == ("coconutWater")) {
    String[] brands = {
        "Tender Coconut","Paper Boat Coconut","BB Royal Coconut Water","More Choice Coconut Water","Classic Coconut Water","Premium Coconut Water","Natural Coconut Water",
        "Fresh Coconut Water","Daily Coconut Water","Select Coconut Water","Quality Coconut Water","Special Coconut Water","Ultra Coconut Water","Pro Coconut Water",
        "Healthy Coconut Water","Family Pack Coconut Water","Value Pack Coconut Water","Pure Coconut Water","Organic Coconut Water","Cool Coconut Water",
        "Light Coconut Water","Village Coconut Water","Farm Coconut Water","Eco Coconut Water","Refreshing Coconut Water",
        "Golden Coconut Water","Active Coconut Water","Strong Coconut Water","Comfort Coconut Water","Natural Drink",
        "Hydration Drink","Fresh Drink","Power Coconut Water","Chill Coconut Water","Energy Coconut Water",
        "Super Coconut Water","Ultimate Coconut Water"
    };
    return brands;
}

if (productName == ("glucosePowder")) {
    String[] brands = {
        "Glucon D","Tang Glucose","BB Royal Glucose","More Choice Glucose","Classic Glucose","Premium Glucose","Orange Glucose",
        "Lemon Glucose","Mango Glucose","Fresh Glucose","Daily Glucose","Select Glucose","Quality Glucose","Special Glucose",
        "Ultra Glucose","Pro Glucose","Healthy Glucose","Family Pack Glucose","Value Pack Glucose","Natural Glucose",
        "Organic Glucose","Cool Glucose","Light Glucose","Strong Glucose","Energy Glucose",
        "Hydration Glucose","Active Glucose","Pure Glucose","Comfort Glucose","Refreshing Glucose",
        "Golden Glucose","Traditional Glucose","Eco Glucose","Power Glucose","Quick Energy Glucose",
        "Super Glucose","Ultimate Glucose"
    };
    return brands;
}




return new String[0];
}
}

	
