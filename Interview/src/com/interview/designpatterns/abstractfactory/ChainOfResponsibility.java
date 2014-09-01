package com.interview.designpatterns.abstractfactory;

public class ChainOfResponsibility {

}


interface Employee{
	void approveBill(int amount);
}

class Manager implements Employee{
	private Employee delegator;
	private int  ALOWABLE_AMT = 100;

	public Manager(Employee delegator){
		this.delegator = delegator;
	}

	public void approveBill(int amount){
		if(amount < ALOWABLE_AMT){
			//Approve bill
		}else{
			delegator.approveBill(amount);
		}
	
	}
}

class Director implements Employee{
	private int  ALOWABLE_AMT = 200;
	private Employee delegator;

	public Director(Employee delegator){
		this.delegator = delegator;
	}

	public void approveBill(int amount){
		if(amount < ALOWABLE_AMT){
			//Approve bill
		}else{
			delegator.approveBill(amount);
		}
	}
}