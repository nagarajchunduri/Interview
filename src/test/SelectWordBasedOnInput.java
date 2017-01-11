package test;

public class SelectWordBasedOnInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getResult(33));
	}


	/**
	 * Accepts input as positive and negative integer both and
	 * Returning the result value by giving priority to higher divisible number among 3 , 5 and 15.
	 * Rule 1: if the number is divisible by 15  even though is is divisible by  3 &  5 it should return "wordsmith".
	 * Rule 2: if the number is divisible by 5  even though is is divisible by  3 , the method should return "smith".
	 * Rule 3: if the number is divisible by 3 and not divisible by 5 and 15 then the method should return "word".
	 * Rule 4: if the number is not divisible any of these three (3, 5, 15) then return the same number as result
	 * @param inputNumber
	 * @return String
	 */
	public static String getResult(int inputNumber) {
		// TODO Auto-generated method stub
		String result = null;
		if(inputNumber%15 ==0)
			result = "wordsmith";
		else if(inputNumber%5 ==0)
			result = "smith";
		else if(inputNumber%3 == 0)
			result = "word";
		else
			result = ""+inputNumber;
		return result;
	}

}
