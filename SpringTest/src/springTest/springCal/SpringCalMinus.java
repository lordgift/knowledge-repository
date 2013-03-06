package springTest.springCal;

import springTest.springInterface.SpringInterface;

public class SpringCalMinus implements SpringInterface{

	@Override
	public String springTest(int firstNum, int secondNum) {
		Integer result = firstNum - secondNum;
		return "From SpringCalMinus :"+firstNum +" - "+ secondNum+ " = " + result.toString();
	}
	
	
}
