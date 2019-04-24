/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.calculos;

/**
 *
 * @author Leonardo
 */
public class Calculos {

	private static int resultado;

	public static int metodoSuma(int num1, int num2) {
		resultado = num1 + num2;

		return resultado;
	}

	public static int metodoResta(int num1, int num2) {
		resultado = num1 - num2;

		return resultado;
	}

	public static int metodoMultiplicar(int num1, int num2) {
		resultado = num1 * num2;

		return resultado;
	}

}
