//Created by David Abellán Navarro 1ºDAM
//https://github.com/Naabda/Ejercicio4/main/Ejercicio4DavidAbellanNavarro.java
package EjerciciosEntregados;

import java.util.Scanner;

public class Ejercicio4DavidAbellanNavarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		//Declaramos las variables.
		int numIns;
		//Esta variable se ha declarado con int y con un long pero cuando se pone un número
		//alto (ej.:100), devuelve "0", por eso se declara con un double y nos da un número
		//y su exponencial (Ej.: 100n! es 9.332621544394418 pone "E=10" elevado 157).
		double resultado =1;
		
		System.out.println("Vamos hacer el factorial de un número, ¿qué número hacemos?");
		//Recogemos el número a sacar.
		numIns = sc.nextInt();
		
		// Iniciamos dando el valor del número insertado, lo condicionamos para que reste
		//"1" hasta que termine en "0" siendo "1" el último bucle hecho.
		for (int i =numIns; i>0; i--) {
			//ahora cogemos la variable resultado, la igualamos y multiplicamos por i para
			//que con cada bucle que haga se actualice con el nuevo resultado.
			resultado = resultado * i;
		}
		//Cerramos el escaner.
		sc.close();
		//Mostramos en pantalla el resultado.
		System.out.println("El factorial de "+numIns+" es "+resultado);
		
	}

}
