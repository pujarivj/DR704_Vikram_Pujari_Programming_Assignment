package Test;

import java.util.HashSet;

public class Hashsetdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    HashSet<String> cities = new HashSet<>();

        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Delhi");
        cities.add("Chennai");
        cities.add("Kolhapur");

        System.out.println("Cities: " + cities);

        // Adding duplicate cities
        cities.add("Mumbai");
        cities.add("Pune");

        System.out.println("After adding duplicates: " + cities);
    }

}
