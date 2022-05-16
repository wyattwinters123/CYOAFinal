import java.util.*;
public class CYOADriver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean con = true;
		
		while (con == true) {
			System.out.print("Hello, before we get into this tragic story what is your name?");
			String name = scan.next();
			
			CYOAClass story = new CYOAClass(name);
			
			story.start();
			String answer = ""; 
			//start of first part of the story 
				answer = scan.next().toUpperCase();
			
				if(answer.equals("A")) {
					story.optionA();
				} else if (answer.equals("B")) {
					story.optionB();
					//end
				} else if (answer.equals("C")) {
					story.optionC();
					//end
					con = false;
				} else if(answer.equals("D")) {
					story.optionD();
				} else {
					System.out.println("input something wrong");
					con = false;
				}
			//end of first part of story
			
			//start of second part				
				//A path
				if(answer.equals("A")) {
					answer = scan.next().toUpperCase();
					if(answer.equals("A")) {
						story.optionAA();
					} else if(answer.equals("B")) {
						story.optionAB();
					} else if(answer.equals("C")) {
						story.optionAC();
					} else if(answer.equals("D")) {
						story.optionAD();
					} else {
						System.out.println("input something wrong");
						con = false;
					}
					//D path 
				} else if(answer.equals("D")) {
					answer = scan.next().toUpperCase();
					if(answer.equals("A")) {
						story.optionDA();
					} else if(answer.equals("B")) {
						story.optionDB();
					} else {
						System.out.println("input something wrong");
						con = false;
					}
				}
				
				System.out.println("if you want to quit input q\nif you wnat to try again input anything else");
				String input = scan.next().toLowerCase();
				if(input.equals("q")) {
					con = false;
				} else {
					con = true;
				}
				
		}
		scan.close();
		

	}

}
