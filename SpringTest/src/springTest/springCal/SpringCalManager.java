package springTest.springCal;

import springTest.springInterface.SpringInterface;

public class SpringCalManager {
	//name of interface class is same
	SpringInterface springInterface;
	public SpringCalManager(){
	
	}
	
	public void	setSpringInterface(SpringInterface sif) {
		this.springInterface = sif;
	}
	public void testCal(int firstNum,int secondNum){
		System.out.println(springInterface.springTest(firstNum, secondNum));
	}
}
