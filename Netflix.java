class Netflix {
	
	 static String kannadaMovies[] = {
            "KGF Chapter 1","Jogi","Kantara","777 Charlie","Ugramm",
            "Vikrant Rona","RangiTaranga","Avane Srimannarayana","Mufti","Tagaru",
            "Lucia","Bell Bottom","Kirik Party","Dia","Rajahuli",
            "Googly","Rajakumara","Power","Masterpiece","Hebbuli",
            "Natasaarvabhowma","Yajamana","Anjani Putra","Madagaja","Kotigobba",
            "Ulidavaru Kandante","James","Yuvarathnaa","Roberrt","Chamak"
        };


        static String hindiMovies[] = {
            "Dangal","3 Idiots","PK","Bajrangi Bhaijaan","War",
            "Pathaan","Jawan","Chennai Express","Zindagi Na Milegi Dobara","Andhadhun",
            "Drishyam","Raazi","Queen","Yeh Jawani Hai Deewani","Kabir Singh",
            "Barfi","Kalank","Lagaan","Shershaah","Uri",
            "Haq","Pink","Badhaai Ho","Bhool Bhulaiyaa","Hera Pheri",
            "Krrish","Student of the Year","Sanam Teri Kasam","Kuch Kuch Hota Hai","Kal Ho Naa Ho"
        };

        static String englishMovies[] = {
            "Inception","Interstellar","The Dark Knight","Avengers Endgame","Titanic",
            "Avatar","Gladiator","The Matrix","Joker","The Shawshank Redemption",
            "The Godfather","Forrest Gump","The Lion King","Frozen","Harry Potter",
            "The Conjuring","Spider-Man","Iron Man","Doctor Strange","Thor",
            "Black Panther","Mission Impossible","Top Gun","John Wick","The Batman",
            "Jurassic Park","Deadpool","The Prestige","Gravity","Dune"
        };

        static String teluguMovies[] = {
            "RRR","Baahubali","Baahubali 2","Pushpa","Ala Vaikunthapurramuloo",
            "Arjun Reddy","Eega","Magadheera","Srimanthudu","Pokiri",
            "Attarintiki Daredi","Sye","Oopiri","Fidaa","Geetha Govindam",
            "Jersey","Rangasthalam","Temper","Khaidi","Sarkaru Vaari Paata",
            "Bheemla Nayak","Saaho","Mahanati","Leader","Businessman",
            "Dhruva","Janatha Garage","Gabbar Singh","Indra","Nannaku Prematho"
        };

        static String malayalamMovies[] = {
            "Premam","Drishyam 2","Bangalore Days","Lucifer","Minnal Murali",
            "Kumbalangi Nights","Jallikattu","Charlie","Uyare","Take Off",
            "Kurup","Ayyappanum Koshiyum","Hridayam","Driving Licence","Pulimurugan",
            "Virus","Malik","The Great Indian Kitchen","2018","Neram",
            "Anjaam Pathiraa","Memories","Thondimuthalum Driksakshiyum","Ustad Hotel","Maheshinte Prathikaaram",
            "Angamaly Diaries","Trance","Oppam","Varathan","Solo"
        };

        static String koreanMovies[] = {
            "Parasite","Train to Busan","Oldboy","The Host","Snowpiercer",
            "The Handmaiden","Memories of Murder","The Wailing","I Saw the Devil","Burning",
            "The Chaser","A Bittersweet Life","The Man from Nowhere","Mother","Silenced",
            "Miracle in Cell No 7","Veteran","Extreme Job","Along with the Gods","The Admiral",
            "Confidential Assignment","Peninsula","The Outlaws","Midnight Runners","New World",
            "The Villainess","Time to Hunt","Okja","The Witch","Hope"
        };

	
	public static void main(String[] args) {
		
		// String nameOfPlatform1 = "Netflix";

        // Movies Categories (6 Languages)

        // String kannadaMovies[] = {
            // "KGF Chapter 1","Jogi","Kantara","777 Charlie","Ugramm",
            // "Vikrant Rona","RangiTaranga","Avane Srimannarayana","Mufti","Tagaru",
            // "Lucia","Bell Bottom","Kirik Party","Dia","Rajahuli",
            // "Googly","Rajakumara","Power","Masterpiece","Hebbuli",
            // "Natasaarvabhowma","Yajamana","Anjani Putra","Madagaja","Kotigobba",
            // "Ulidavaru Kandante","James","Yuvarathnaa","Roberrt","Chamak"
        // };


        // String hindiMovies[] = {
            // "Dangal","3 Idiots","PK","Bajrangi Bhaijaan","War",
            // "Pathaan","Jawan","Chennai Express","Zindagi Na Milegi Dobara","Andhadhun",
            // "Drishyam","Raazi","Queen","Yeh Jawani Hai Deewani","Kabir Singh",
            // "Barfi","Kalank","Lagaan","Shershaah","Uri",
            // "Haq","Pink","Badhaai Ho","Bhool Bhulaiyaa","Hera Pheri",
            // "Krrish","Student of the Year","Sanam Teri Kasam","Kuch Kuch Hota Hai","Kal Ho Naa Ho"
        // };

        // String englishMovies[] = {
            // "Inception","Interstellar","The Dark Knight","Avengers Endgame","Titanic",
            // "Avatar","Gladiator","The Matrix","Joker","The Shawshank Redemption",
            // "The Godfather","Forrest Gump","The Lion King","Frozen","Harry Potter",
            // "The Conjuring","Spider-Man","Iron Man","Doctor Strange","Thor",
            // "Black Panther","Mission Impossible","Top Gun","John Wick","The Batman",
            // "Jurassic Park","Deadpool","The Prestige","Gravity","Dune"
        // };

        // String teluguMovies[] = {
            // "RRR","Baahubali","Baahubali 2","Pushpa","Ala Vaikunthapurramuloo",
            // "Arjun Reddy","Eega","Magadheera","Srimanthudu","Pokiri",
            // "Attarintiki Daredi","Sye","Oopiri","Fidaa","Geetha Govindam",
            // "Jersey","Rangasthalam","Temper","Khaidi","Sarkaru Vaari Paata",
            // "Bheemla Nayak","Saaho","Mahanati","Leader","Businessman",
            // "Dhruva","Janatha Garage","Gabbar Singh","Indra","Nannaku Prematho"
        // };

        // String malayalamMovies[] = {
            // "Premam","Drishyam 2","Bangalore Days","Lucifer","Minnal Murali",
            // "Kumbalangi Nights","Jallikattu","Charlie","Uyare","Take Off",
            // "Kurup","Ayyappanum Koshiyum","Hridayam","Driving Licence","Pulimurugan",
            // "Virus","Malik","The Great Indian Kitchen","2018","Neram",
            // "Anjaam Pathiraa","Memories","Thondimuthalum Driksakshiyum","Ustad Hotel","Maheshinte Prathikaaram",
            // "Angamaly Diaries","Trance","Oppam","Varathan","Solo"
        // };

        // String koreanMovies[] = {
            // "Parasite","Train to Busan","Oldboy","The Host","Snowpiercer",
            // "The Handmaiden","Memories of Murder","The Wailing","I Saw the Devil","Burning",
            // "The Chaser","A Bittersweet Life","The Man from Nowhere","Mother","Silenced",
            // "Miracle in Cell No 7","Veteran","Extreme Job","Along with the Gods","The Admiral",
            // "Confidential Assignment","Peninsula","The Outlaws","Midnight Runners","New World",
            // "The Villainess","Time to Hunt","Okja","The Witch","Hope"
        // };

        // System.out.println("The Name of the Platform is: " + nameOfPlatform1);

        // System.out.println("\nThe Kannada Movies Lists are :");
        // System.out.println(
            // kannadaMovies[0] + "\n" + kannadaMovies[1] + "\n" + kannadaMovies[2] + "\n" +
            // kannadaMovies[3] + "\n" + kannadaMovies[4] + "\n" + kannadaMovies[5] + "\n" +
            // kannadaMovies[6] + "\n" + kannadaMovies[7] + "\n" + kannadaMovies[8] + "\n" +
            // kannadaMovies[9] + "\n" + kannadaMovies[10] + "\n" + kannadaMovies[11] + "\n" +
            // kannadaMovies[12] + "\n" + kannadaMovies[13] + "\n" + kannadaMovies[14] + "\n" +
            // kannadaMovies[15] + "\n" + kannadaMovies[16] + "\n" + kannadaMovies[17] + "\n" +
            // kannadaMovies[18] + "\n" + kannadaMovies[19] + "\n" + kannadaMovies[20] + "\n" +
            // kannadaMovies[21] + "\n" + kannadaMovies[22] + "\n" + kannadaMovies[23] + "\n" +
            // kannadaMovies[24] + "\n" + kannadaMovies[25] + "\n" + kannadaMovies[26] + "\n" +
            // kannadaMovies[27] + "\n" + kannadaMovies[28] + "\n" + kannadaMovies[29]
        // );
		
// String k1 = kannadaMovies[0];  System.out.println(k1);
// String k2 = kannadaMovies[1];  System.out.println(k2);
// String k3 = kannadaMovies[2];  System.out.println(k3);
// String k4 = kannadaMovies[3];  System.out.println(k4);
// String k5 = kannadaMovies[4];  System.out.println(k5);
// String k6 = kannadaMovies[5];  System.out.println(k6);
// String k7 = kannadaMovies[6];  System.out.println(k7);
// String k8 = kannadaMovies[7];  System.out.println(k8);
// String k9 = kannadaMovies[8];  System.out.println(k9);
// String k10 = kannadaMovies[9]; System.out.println(k10);
// String k11 = kannadaMovies[10]; System.out.println(k11);
// String k12 = kannadaMovies[11]; System.out.println(k12);
// String k13 = kannadaMovies[12]; System.out.println(k13);
// String k14 = kannadaMovies[13]; System.out.println(k14);
// String k15 = kannadaMovies[14]; System.out.println(k15);
// String k16 = kannadaMovies[15]; System.out.println(k16);
// String k17 = kannadaMovies[16]; System.out.println(k17);
// String k18 = kannadaMovies[17]; System.out.println(k18);
// String k19 = kannadaMovies[18]; System.out.println(k19);
// String k20 = kannadaMovies[19]; System.out.println(k20);
// String k21 = kannadaMovies[20]; System.out.println(k21);
// String k22 = kannadaMovies[21]; System.out.println(k22);
// String k23 = kannadaMovies[22]; System.out.println(k23);
// String k24 = kannadaMovies[23]; System.out.println(k24);
// String k25 = kannadaMovies[24]; System.out.println(k25);
// String k26 = kannadaMovies[25]; System.out.println(k26);
// String k27 = kannadaMovies[26]; System.out.println(k27);
// String k28 = kannadaMovies[27]; System.out.println(k28);
// String k29 = kannadaMovies[28]; System.out.println(k29);
// String k30 = kannadaMovies[29]; System.out.println(k30);


        // System.out.println("\nThe Hindi Movies Lists are :");
        // // System.out.println(
            // // hindiMovies[0] + "\n" + hindiMovies[1] + "\n" + hindiMovies[2] + "\n" +
            // // hindiMovies[3] + "\n" + hindiMovies[4] + "\n" + hindiMovies[5] + "\n" +
            // // hindiMovies[6] + "\n" + hindiMovies[7] + "\n" + hindiMovies[8] + "\n" +
            // // hindiMovies[9] + "\n" + hindiMovies[10] + "\n" + hindiMovies[11] + "\n" +
            // // hindiMovies[12] + "\n" + hindiMovies[13] + "\n" + hindiMovies[14] + "\n" +
            // // hindiMovies[15] + "\n" + hindiMovies[16] + "\n" + hindiMovies[17] + "\n" +
            // // hindiMovies[18] + "\n" + hindiMovies[19] + "\n" + hindiMovies[20] + "\n" +
            // // hindiMovies[21] + "\n" + hindiMovies[22] + "\n" + hindiMovies[23] + "\n" +
            // // hindiMovies[24] + "\n" + hindiMovies[25] + "\n" + hindiMovies[26] + "\n" +
            // // hindiMovies[27] + "\n" + hindiMovies[28] + "\n" + hindiMovies[29]
        // // );
		
// String h1 = hindiMovies[0];  System.out.println(h1);
// String h2 = hindiMovies[1];  System.out.println(h2);
// String h3 = hindiMovies[2];  System.out.println(h3);
// String h4 = hindiMovies[3];  System.out.println(h4);
// String h5 = hindiMovies[4];  System.out.println(h5);
// String h6 = hindiMovies[5];  System.out.println(h6);
// String h7 = hindiMovies[6];  System.out.println(h7);
// String h8 = hindiMovies[7];  System.out.println(h8);
// String h9 = hindiMovies[8];  System.out.println(h9);
// String h10 = hindiMovies[9]; System.out.println(h10);
// String h11 = hindiMovies[10]; System.out.println(h11);
// String h12 = hindiMovies[11]; System.out.println(h12);
// String h13 = hindiMovies[12]; System.out.println(h13);
// String h14 = hindiMovies[13]; System.out.println(h14);
// String h15 = hindiMovies[14]; System.out.println(h15);
// String h16 = hindiMovies[15]; System.out.println(h16);
// String h17 = hindiMovies[16]; System.out.println(h17);
// String h18 = hindiMovies[17]; System.out.println(h18);
// String h19 = hindiMovies[18]; System.out.println(h19);
// String h20 = hindiMovies[19]; System.out.println(h20);
// String h21 = hindiMovies[20]; System.out.println(h21);
// String h22 = hindiMovies[21]; System.out.println(h22);
// String h23 = hindiMovies[22]; System.out.println(h23);
// String h24 = hindiMovies[23]; System.out.println(h24);
// String h25 = hindiMovies[24]; System.out.println(h25);
// String h26 = hindiMovies[25]; System.out.println(h26);
// String h27 = hindiMovies[26]; System.out.println(h27);
// String h28 = hindiMovies[27]; System.out.println(h28);
// String h29 = hindiMovies[28]; System.out.println(h29);
// String h30 = hindiMovies[29]; System.out.println(h30);


        // System.out.println("\nThe English Movies Lists are :");
        // // System.out.println(
            // // englishMovies[0] + "\n" + englishMovies[1] + "\n" + englishMovies[2] + "\n" +
            // // englishMovies[3] + "\n" + englishMovies[4] + "\n" + englishMovies[5] + "\n" +
            // // englishMovies[6] + "\n" + englishMovies[7] + "\n" + englishMovies[8] + "\n" +
            // // englishMovies[9] + "\n" + englishMovies[10] + "\n" + englishMovies[11] + "\n" +
            // // englishMovies[12] + "\n" + englishMovies[13] + "\n" + englishMovies[14] + "\n" +
            // // englishMovies[15] + "\n" + englishMovies[16] + "\n" + englishMovies[17] + "\n" +
            // // englishMovies[18] + "\n" + englishMovies[19] + "\n" + englishMovies[20] + "\n" +
            // // englishMovies[21] + "\n" + englishMovies[22] + "\n" + englishMovies[23] + "\n" +
            // // englishMovies[24] + "\n" + englishMovies[25] + "\n" + englishMovies[26] + "\n" +
            // // englishMovies[27] + "\n" + englishMovies[28] + "\n" + englishMovies[29]
        // // ;
		
// String e1 = englishMovies[0];  System.out.println(e1);
// String e2 = englishMovies[1];  System.out.println(e2);
// String e3 = englishMovies[2];  System.out.println(e3);
// String e4 = englishMovies[3];  System.out.println(e4);
// String e5 = englishMovies[4];  System.out.println(e5);
// String e6 = englishMovies[5];  System.out.println(e6);
// String e7 = englishMovies[6];  System.out.println(e7);
// String e8 = englishMovies[7];  System.out.println(e8);
// String e9 = englishMovies[8];  System.out.println(e9);
// String e10 = englishMovies[9]; System.out.println(e10);
// String e11 = englishMovies[10]; System.out.println(e11);
// String e12 = englishMovies[11]; System.out.println(e12);
// String e13 = englishMovies[12]; System.out.println(e13);
// String e14 = englishMovies[13]; System.out.println(e14);
// String e15 = englishMovies[14]; System.out.println(e15);
// String e16 = englishMovies[15]; System.out.println(e16);
// String e17 = englishMovies[16]; System.out.println(e17);
// String e18 = englishMovies[17]; System.out.println(e18);
// String e19 = englishMovies[18]; System.out.println(e19);
// String e20 = englishMovies[19]; System.out.println(e20);
// String e21 = englishMovies[20]; System.out.println(e21);
// String e22 = englishMovies[21]; System.out.println(e22);
// String e23 = englishMovies[22]; System.out.println(e23);
// String e24 = englishMovies[23]; System.out.println(e24);
// String e25 = englishMovies[24]; System.out.println(e25);
// String e26 = englishMovies[25]; System.out.println(e26);
// String e27 = englishMovies[26]; System.out.println(e27);
// String e28 = englishMovies[27]; System.out.println(e28);
// String e29 = englishMovies[28]; System.out.println(e29);
// String e30 = englishMovies[29]; System.out.println(e30);


        // System.out.println("\nThe Telugu Movies Lists are :");
        // // System.out.println(
            // // teluguMovies[0] + "\n" + teluguMovies[1] + "\n" + teluguMovies[2] + "\n" +
            // // teluguMovies[3] + "\n" + teluguMovies[4] + "\n" + teluguMovies[5] + "\n" +
            // // teluguMovies[6] + "\n" + teluguMovies[7] + "\n" + teluguMovies[8] + "\n" +
            // // teluguMovies[9] + "\n" + teluguMovies[10] + "\n" + teluguMovies[11] + "\n" +
            // // teluguMovies[12] + "\n" + teluguMovies[13] + "\n" + teluguMovies[14] + "\n" +
            // // teluguMovies[15] + "\n" + teluguMovies[16] + "\n" + teluguMovies[17] + "\n" +
            // // teluguMovies[18] + "\n" + teluguMovies[19] + "\n" + teluguMovies[20] + "\n" +
            // // teluguMovies[21] + "\n" + teluguMovies[22] + "\n" + teluguMovies[23] + "\n" +
            // // teluguMovies[24] + "\n" + teluguMovies[25] + "\n" + teluguMovies[26] + "\n" +
            // // teluguMovies[27] + "\n" + teluguMovies[28] + "\n" + teluguMovies[29]
        // // );
		
// String t1 = teluguMovies[0];  System.out.println(t1);
// String t2 = teluguMovies[1];  System.out.println(t2);
// String t3 = teluguMovies[2];  System.out.println(t3);
// String t4 = teluguMovies[3];  System.out.println(t4);
// String t5 = teluguMovies[4];  System.out.println(t5);
// String t6 = teluguMovies[5];  System.out.println(t6);
// String t7 = teluguMovies[6];  System.out.println(t7);
// String t8 = teluguMovies[7];  System.out.println(t8);
// String t9 = teluguMovies[8];  System.out.println(t9);
// String t10 = teluguMovies[9]; System.out.println(t10);
// String t11 = teluguMovies[10]; System.out.println(t11);
// String t12 = teluguMovies[11]; System.out.println(t12);
// String t13 = teluguMovies[12]; System.out.println(t13);
// String t14 = teluguMovies[13]; System.out.println(t14);
// String t15 = teluguMovies[14]; System.out.println(t15);
// String t16 = teluguMovies[15]; System.out.println(t16);
// String t17 = teluguMovies[16]; System.out.println(t17);
// String t18 = teluguMovies[17]; System.out.println(t18);
// String t19 = teluguMovies[18]; System.out.println(t19);
// String t20 = teluguMovies[19]; System.out.println(t20);
// String t21 = teluguMovies[20]; System.out.println(t21);
// String t22 = teluguMovies[21]; System.out.println(t22);
// String t23 = teluguMovies[22]; System.out.println(t23);
// String t24 = teluguMovies[23]; System.out.println(t24);
// String t25 = teluguMovies[24]; System.out.println(t25);
// String t26 = teluguMovies[25]; System.out.println(t26);
// String t27 = teluguMovies[26]; System.out.println(t27);
// String t28 = teluguMovies[27]; System.out.println(t28);
// String t29 = teluguMovies[28]; System.out.println(t29);
// String t30 = teluguMovies[29]; System.out.println(t30);


        // System.out.println("\nThe Malayalam Movies Lists are :");
        // // System.out.println(
            // // malayalamMovies[0] + "\n" + malayalamMovies[1] + "\n" + malayalamMovies[2] + "\n" +
            // // malayalamMovies[3] + "\n" + malayalamMovies[4] + "\n" + malayalamMovies[5] + "\n" +
            // // malayalamMovies[6] + "\n" + malayalamMovies[7] + "\n" + malayalamMovies[8] + "\n" +
            // // malayalamMovies[9] + "\n" + malayalamMovies[10] + "\n" + malayalamMovies[11] + "\n" +
            // // malayalamMovies[12] + "\n" + malayalamMovies[13] + "\n" + malayalamMovies[14] + "\n" +
            // // malayalamMovies[15] + "\n" + malayalamMovies[16] + "\n" + malayalamMovies[17] + "\n" +
            // // malayalamMovies[18] + "\n" + malayalamMovies[19] + "\n" + malayalamMovies[20] + "\n" +
            // // malayalamMovies[21] + "\n" + malayalamMovies[22] + "\n" + malayalamMovies[23] + "\n" +
            // // malayalamMovies[24] + "\n" + malayalamMovies[25] + "\n" + malayalamMovies[26] + "\n" +
            // // malayalamMovies[27] + "\n" + malayalamMovies[28] + "\n" + malayalamMovies[29]
        // // );
		
// String m1 = malayalamMovies[0];  System.out.println(m1);
// String m2 = malayalamMovies[1];  System.out.println(m2);
// String m3 = malayalamMovies[2];  System.out.println(m3);
// String m4 = malayalamMovies[3];  System.out.println(m4);
// String m5 = malayalamMovies[4];  System.out.println(m5);
// String m6 = malayalamMovies[5];  System.out.println(m6);
// String m7 = malayalamMovies[6];  System.out.println(m7);
// String m8 = malayalamMovies[7];  System.out.println(m8);
// String m9 = malayalamMovies[8];  System.out.println(m9);
// String m10 = malayalamMovies[9]; System.out.println(m10);
// String m11 = malayalamMovies[10]; System.out.println(m11);
// String m12 = malayalamMovies[11]; System.out.println(m12);
// String m13 = malayalamMovies[12]; System.out.println(m13);
// String m14 = malayalamMovies[13]; System.out.println(m14);
// String m15 = malayalamMovies[14]; System.out.println(m15);
// String m16 = malayalamMovies[15]; System.out.println(m16);
// String m17 = malayalamMovies[16]; System.out.println(m17);
// String m18 = malayalamMovies[17]; System.out.println(m18);
// String m19 = malayalamMovies[18]; System.out.println(m19);
// String m20 = malayalamMovies[19]; System.out.println(m20);
// String m21 = malayalamMovies[20]; System.out.println(m21);
// String m22 = malayalamMovies[21]; System.out.println(m22);
// String m23 = malayalamMovies[22]; System.out.println(m23);
// String m24 = malayalamMovies[23]; System.out.println(m24);
// String m25 = malayalamMovies[24]; System.out.println(m25);
// String m26 = malayalamMovies[25]; System.out.println(m26);
// String m27 = malayalamMovies[26]; System.out.println(m27);
// String m28 = malayalamMovies[27]; System.out.println(m28);
// String m29 = malayalamMovies[28]; System.out.println(m29);
// String m30 = malayalamMovies[29]; System.out.println(m30);


        // System.out.println("\nThe Korean Movies Lists are :");
        // System.out.println(
            // koreanMovies[0] + "\n" + koreanMovies[1] + "\n" + koreanMovies[2] + "\n" +
            // koreanMovies[3] + "\n" + koreanMovies[4] + "\n" + koreanMovies[5] + "\n" +
            // koreanMovies[6] + "\n" + koreanMovies[7] + "\n" + koreanMovies[8] + "\n" +
            // koreanMovies[9] + "\n" + koreanMovies[10] + "\n" + koreanMovies[11] + "\n" +
            // koreanMovies[12] + "\n" + koreanMovies[13] + "\n" + koreanMovies[14] + "\n" +
            // koreanMovies[15] + "\n" + koreanMovies[16] + "\n" + koreanMovies[17] + "\n" +
            // koreanMovies[18] + "\n" + koreanMovies[19] + "\n" + koreanMovies[20] + "\n" +
            // koreanMovies[21] + "\n" + koreanMovies[22] + "\n" + koreanMovies[23] + "\n" +
            // koreanMovies[24] + "\n" + koreanMovies[25] + "\n" + koreanMovies[26] + "\n" +
            // koreanMovies[27] + "\n" + koreanMovies[28] + "\n" + koreanMovies[29]
        // );
		
// String ko1 = koreanMovies[0];  System.out.println(ko1);
// String ko2 = koreanMovies[1];  System.out.println(ko2);
// String ko3 = koreanMovies[2];  System.out.println(ko3);
// String ko4 = koreanMovies[3];  System.out.println(ko4);
// String ko5 = koreanMovies[4];  System.out.println(ko5);
// String ko6 = koreanMovies[5];  System.out.println(ko6);
// String ko7 = koreanMovies[6];  System.out.println(ko7);
// String ko8 = koreanMovies[7];  System.out.println(ko8);
// String ko9 = koreanMovies[8];  System.out.println(ko9);
// String ko10 = koreanMovies[9]; System.out.println(ko10);
// String ko11 = koreanMovies[10]; System.out.println(ko11);
// String ko12 = koreanMovies[11]; System.out.println(ko12);
// String ko13 = koreanMovies[12]; System.out.println(ko13);
// String ko14 = koreanMovies[13]; System.out.println(ko14);
// String ko15 = koreanMovies[14]; System.out.println(ko15);
// String ko16 = koreanMovies[15]; System.out.println(ko16);
// String ko17 = koreanMovies[16]; System.out.println(ko17);
// String ko18 = koreanMovies[17]; System.out.println(ko18);
// String ko19 = koreanMovies[18]; System.out.println(ko19);
// String ko20 = koreanMovies[19]; System.out.println(ko20);
// String ko21 = koreanMovies[20]; System.out.println(ko21);
// String ko22 = koreanMovies[21]; System.out.println(ko22);
// String ko23 = koreanMovies[22]; System.out.println(ko23);
// String ko24 = koreanMovies[23]; System.out.println(ko24);
// String ko25 = koreanMovies[24]; System.out.println(ko25);
// String ko26 = koreanMovies[25]; System.out.println(ko26);
// String ko27 = koreanMovies[26]; System.out.println(ko27);
// String ko28 = koreanMovies[27]; System.out.println(ko28);
// String ko29 = koreanMovies[28]; System.out.println(ko29);
// String ko30 = koreanMovies[29]; System.out.println(ko30);

getKannadaMovieList();
getHindiMovieList();
 getEnglishMovieList();
 getTeluguMovieList();
 getMalayalamMovieList();
 getKoreanMovieList();
 

	}
	
	static void getKannadaMovieList() {
		System.out.println("The Kannada MOvies List are: ");
		for( String kannadaMovie : kannadaMovies ) {
			System.out.println(kannadaMovie);
		}
	}
	
	static void getHindiMovieList() {
		System.out.println("\nThe Hindi MOvies List are: ");
		for( String hindiMovie : hindiMovies ) {
			System.out.println(hindiMovie);
		}
	}
	
	static void getEnglishMovieList() {
		System.out.println("\nThe English MOvies List are: ");
		for( String englishMovie : englishMovies ) {
			System.out.println(englishMovie);
		}
	}
	
	static void getTeluguMovieList() {
		System.out.println("\nThe Telugu MOvies List are: ");
		for( String teluguMovie : teluguMovies ) {
			System.out.println(teluguMovie);
		}
	}
	
	static void getMalayalamMovieList() {
		System.out.println("\nThe Malayalam MOvies List are: ");
		for( String malayalamMovie : malayalamMovies ) {
			System.out.println(malayalamMovie);
		}
	}
	
	static void getKoreanMovieList() {
		System.out.println("\nThe Korean MOvies List are: ");
		for( String koreanMovie : koreanMovies ) {
			System.out.println(koreanMovie);
		}
	}

}