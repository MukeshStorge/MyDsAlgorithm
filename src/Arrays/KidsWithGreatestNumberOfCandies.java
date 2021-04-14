package Arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberOfCandies {

	public static void main(String args[]) {
		int[] candies = { 12,1,12 };
		int extraCandies = 10;

		System.out.println(kidsWithCandies(candies, extraCandies));

	}

	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

		List<Boolean> a = new ArrayList<Boolean>();
		int maxSize =0;
		
		for (int candy : candies) {

			maxSize= (maxSize >= candy) ? maxSize : candy;

		}
		for (int candy : candies) {

			a.add((candy + extraCandies) >= maxSize ? false : true);

		}

		return a;

	}

}
