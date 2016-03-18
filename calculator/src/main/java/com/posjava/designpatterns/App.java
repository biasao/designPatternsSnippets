package com.posjava.designpatterns;

import java.util.Scanner;

import com.posjava.designpatterns.command.Calculator;

public class App {
	public static void main(String[] args) {
		Calculator calculatorCommandList = Calculator.getInstance();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Digite um valor");
		double number1 = sc1.nextDouble();
		System.out.println("Digite um operador");
		String operation = sc1.next();
		System.out.println("Digite outro valor valor");
		double number2 = sc1.nextDouble();
		sc1.close();
		
		switch (operation) {
		case "/":
			System.out.println("A divisao de "+number1+" / "+number2+" eh igual a "+ calculatorCommandList.divide(number1, number2));
			break;
		case "-":
			System.out.println("A subtracao de "+number1+" - "+number2+" eh igual a "+ calculatorCommandList.less(number1, number2));
			break;
		case "*":
			System.out.println("A multiplicacao de "+number1+" * "+number2+" eh igual a "+ calculatorCommandList.multiply(number1, number2));
			break;
		case "+":
			System.out.println("A adicao de "+number1+" + "+number2+" eh igual a "+ calculatorCommandList.plus(number1, number2));
			break;
		default:
			System.out.println("OPERADOR INCORRETO - os operadores validos sao: \n'+'soma\n'-'subtracao\n'*'multiplicacao\n'/'divisao");
			break;
		}
		
		
		
		
		
		
	}
 } 
