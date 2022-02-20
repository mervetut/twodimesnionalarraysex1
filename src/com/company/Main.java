package com.company;

public class Main {

    public static void main(String[] args) {
	String [][] players = {{"John", "doctor", "US"},
                           {"Birgitte", "lawyer", "GB"},
                           {"Greta", "doctor", "SW"}};
	String occupation = "doctor";
	for (int r = 0; r < 3; r++) //traverse rows
		if (players [r][1].equals(occupation)) //[r][1] refers to the second element in the arrays, which is the occupation of players. .equal(occupation) is used to compare if the occupation equals to the [r][1] element in the arrays
			System.out.println(players[r][0] + ", " + players[r][2]); //player [0] prints name, player [2] prints nationality
	    //ask this if clause!!

		//instead of for loop, we can use for-each loop:
//		String [][] players = {{"John", "doctor", "US"},
//				{"Birgitte", "lawyer", "GB"},
//				{"Greta", "doctor", "SW"}};
//		String occupation = "doctor";
// 		for (String [] row : players) //traverse rows
		//if (row [1].equals (occupation)
		//System.out.println(players[0] + " " + players [2]);

    }
}
