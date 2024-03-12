import java.util.*;
public class arrayListPgrms {
	public static void main (String[] args) {
		Scanner myScanObj = new Scanner(System.in);

		//7
		ArrayList<Integer> sevenList = new ArrayList<Integer>();
		for (int a = 1; a <= 10; a++) {
			System.out.print("Enter integer " + a + ". ");
			sevenList.add(myScanObj.nextInt());
		}
		ArrayList<Integer> sevenEvenList = new ArrayList<Integer>();
		ArrayList<Integer> sevenOddList = new ArrayList<Integer>();
		ArrayList<Integer> sevenNegativeList = new ArrayList<Integer>();
		for (int a = 0; a < sevenList.size(); a++) {
			if (sevenList.get(a)%2 == 0) {
				sevenEvenList.add(sevenList.get(a));
			} else {
				sevenOddList.add(sevenList.get(a));
			}
			if (sevenList.get(a) < 0) {
				sevenNegativeList.add(sevenList.get(a));
			}
		}
		System.out.print("The even numbers were " + sevenEvenList.get(0));
		for (int a = 1; a < sevenEvenList.size()-1; a++) {
			System.out.print(", " + sevenEvenList.get(a));
		}
		System.out.print(", and " + sevenEvenList.get(sevenEvenList.size()-1) + ". The odd numbers were " + sevenOddList.get(0));
		for (int a = 1; a < sevenOddList.size()-1; a++) {
			System.out.print(", " + sevenOddList.get(a));
		}
		System.out.print(", and " + sevenOddList.get(sevenOddList.size()-1) + ". The negative numbers were " + sevenNegativeList.get(0));
		for (int a = 1; a < sevenNegativeList.size()-1; a++) {
			System.out.print(", " + sevenNegativeList.get(a));
		}
		System.out.println(", and " + sevenNegativeList.get(sevenNegativeList.size()-1) + ".");
		System.out.println();
		System.out.println();
		System.out.println();

		//5.2
		System.out.print("Enter an integer. ");
		int fiveTwoInput = myScanObj.nextInt();
		ArrayList<Integer> fiveTwoFactors = new ArrayList<Integer>();
		for (int a = 1; a <= fiveTwoInput; a++) {
			if (fiveTwoInput%a == 0) {
				fiveTwoFactors.add(a);
			}
		}
		System.out.print("The factors of " + fiveTwoInput + " are " + fiveTwoFactors.get(0));
		for (int a = 1; a < fiveTwoFactors.size()-1; a++) {
			System.out.print(", " + fiveTwoFactors.get(a));
		}
		System.out.println(", and " + fiveTwoFactors.get(fiveTwoFactors.size()-1) + ".");
		System.out.println();
		System.out.println();
		System.out.println();

		//5.1
		ArrayList<Integer> fiveOneList = new ArrayList<Integer>();
		int fiveOneZeros = 0;
		int fiveOneOdds = 0;
		int fiveOneEvens = 0;
		for (int a = 0; a < 10; a++) {
			System.out.print("Enter an integer. ");
			fiveOneList.add(myScanObj.nextInt());
			if (fiveOneList.get(a) < 0) {
			} else if (fiveOneList.get(a) == 0) {
				fiveOneZeros++;
			} else if (fiveOneList.get(a)%2 == 0) {
				fiveOneEvens++;
			} else {
				fiveOneOdds++;
			}
		}
		System.out.println("There were " + fiveOneZeros + " zeros, " + fiveOneOdds + " odds*, and " + fiveOneEvens + " evens*.");
		System.out.println("*Not including zeros or negatives");
		System.out.println();
		System.out.println();
		System.out.println();

		//4
		myScanObj.nextLine();
		ArrayList<String> fourList = new ArrayList<String>();
		int fourTrentonIndex = -1;
		for (int a = 0; a < 5; a++) {
			System.out.print("Type a name. ");
			fourList.add(myScanObj.nextLine());
			if (fourList.get(a).equals("Trenton")) {
				fourTrentonIndex = a;
			}
		}
		if (fourTrentonIndex != -1) {
			System.out.println(fourList.get(fourTrentonIndex));
		} else {
			System.out.println("You didn't enter the correct name.");
		}
		System.out.println();
		System.out.println();
		System.out.println();

		//3
		ArrayList<Double> three = new ArrayList<Double>();
		for (int a = 0; a < 10; a++) {
			System.out.print("Enter a double. ");
			three.add(myScanObj.nextDouble());
			System.out.println(three.get(a) + " Entered.");
		}
		double threeSum = 0;
		for (int a = 0; a < three.size(); a++) {
			threeSum = threeSum + three.get(a);
		}
		double threeAverage = threeSum/three.size();
		ArrayList<Double> threeLargerThanAverage = new ArrayList<Double>();
		for (int a = 0; a < three.size(); a++) {
			if (three.get(a) > threeAverage) {
				threeLargerThanAverage.add(three.get(a));
			}
		}
		System.out.print("The sum is " + threeSum + ", the average is " + threeAverage + ", and the numbers larger than the average are " + threeLargerThanAverage.get(0));
		for (int a = 1; a < threeLargerThanAverage.size()-1; a++) {
			System.out.print(", " + threeLargerThanAverage.get(a));
		}
		System.out.println(", and " + threeLargerThanAverage.get(threeLargerThanAverage.size()-1) + ".");
		System.out.println();
		System.out.println();
		System.out.println();

		//2
		ArrayList<Integer> two = new ArrayList<Integer>();
		for (int a = 1; a <= 20; a++) {
			two.add(a);
		}
		for (int a = 0; a < (two.size()/2); a++) {
			System.out.println(two.get(a));
		}
		System.out.println();
		for (int a = (two.size()/2); a < two.size(); a++) {
			System.out.println(two.get(a));
		}
		System.out.println();
		System.out.println();
		System.out.println();

		//1
		ArrayList<Integer> one = new ArrayList<Integer>();
		for (int a = 0; a < 5; a++) {
			one.add((int) ((Math.random()*10)+1));
		}
		for (int a = 0; a < one.size(); a++) {
			System.out.println(one.get(a));
		}
		System.out.println();
		for (int a = one.size()-1; a >= 0; a--) {
			System.out.println(one.get(a));
		}
		System.out.println();
		System.out.println();
		System.out.println();
	}
}