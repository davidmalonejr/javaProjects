package myPrograms;

public class Genius {

	/* main Method Declaration */
	public static void main(String[] args) {
		gotNames(args[0]); //Call Method gotNames()
		gotJokes(args[0],args[1],args[2]); //Call Method gotJokes()
		gotCommunityNorms(args); //Call Method gotCommunityNorms()
		
		/*Add Your Method Calls Here*/
		
		
	}

	/* gotNames Method Declaration */
	public static void gotNames(String name) {

		/* GENIUS NAMES - SAY OUR NAMES */
		System.out.println("My Name Is " + name); // Print Genius Name
		System.out.println("My Name Is Perry Irving."); // Print Genius Name
		System.out.println("My Name Is Kevin Butler."); // Print Genius Name
		System.out.println("");//Print Empty Lines
		System.out.println("");//Print Empty Lines
		
	}

	/* gotJokes Method Declaration */
	public static void gotJokes(String name, String jokeSetup, String jokePunchline) {

		/* GENIUS JOKES - WE GOT JOKES */
		System.out.println("Welcome, My Name Is" + name+ "!"); // Print My Name
		System.out.println(jokeSetup); // Joke Setup
		System.out.println(jokePunchline); // Joke Punch Line
		System.out.println(""); // Extra Line
		System.out.println(""); // Extra Line

	}

	/* gotCommunityNorms Method Declaration */
	public static void gotCommunityNorms(String[] communityNorms) {
		/* GENIUS COMMUNITY NORMS - KEEP US ACCOUNTABLE */
		System.out.println("OUR COMMUNITY NORMS");
		System.out.println("----------------------");
		System.out.println("1. " + communityNorms[3]);
		System.out.println("----------------------");
		System.out.println(""); // Extra Line
		System.out.println(""); // Extra Line

	}

	/* YOUR METHODS START HERE */
	
	

}
