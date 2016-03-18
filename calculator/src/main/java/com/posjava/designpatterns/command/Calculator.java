package com.posjava.designpatterns.command;


public class Calculator {
	private static Calculator commandListUniqueInstance;
	
	private Calculator(){}
	
	public static Calculator getInstance(){
		if (commandListUniqueInstance == null){
			synchronized (Calculator.class) {
				commandListUniqueInstance = new Calculator();
			}
		}
		return commandListUniqueInstance;
	}
		
	public double plus(double number1,double number2){
		CommandSuper commandListPlus = new PlusCommand();
		return commandListPlus.executar(number1, number2);
	}
	public double less(double number1,double number2){
		CommandSuper commandListLess = new LessCommand();
		return commandListLess.executar(number1, number2);
	}
	public double divide(double number1,double number2){
		CommandSuper commandListDivide = new DivideCommand();
		return commandListDivide.executar(number1, number2);
	}
	public double multiply(double number1,double number2){
		CommandSuper commandListMultiply = new MultiplyCommand();
		return commandListMultiply.executar(number1, number2);
	}
		
}
