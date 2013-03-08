package springTest.springCal;

import springTest.springInterface.SpringInterface;

public class SpringCalPlus implements SpringInterface{

	@Override
	public String springTest(int firstNum, int secondNum) {
		Integer result = firstNum + secondNum;
		return "From SpringCalPlus :"+firstNum +" + "+ secondNum+ " = " + result.toString();
	}
}
