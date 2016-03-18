package com.posjava.designpatterns.command;

public class PlusCommand extends CommandSuper {
	@Override
	public double executar(double number1, double number2) {
		return number1+number2;
	}

}
