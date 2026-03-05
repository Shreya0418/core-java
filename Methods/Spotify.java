class Spotify{
	
	static String genreNames[] = {"Pop", "Rock", "Hip Hop", "Jazz", "Classical", "Electronic", "Punjabi", "Bollywood", "Lo-Fi", "K-Pop"};

        public static void getGenreNames() {

        System.out.println("getGenreNames invoked");

            for(String genreName : genreNames) {
                System.out.println(genreName);
    }

    System.out.println("Invoke ended");
}
	
	
}