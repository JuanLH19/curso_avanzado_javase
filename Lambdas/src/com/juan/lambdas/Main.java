package com.juan.lambdas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OnOneListener oneListener = new OnOneListener() {
			
			@Override
			public void onOne(String message) {
				// TODO Auto-generated method stub
				System.out.println("One: "+message);
			}
		};
		//Hacemos lo mismo pero con menos líneas de código a través de lambda
		OnOneListener oneListener2 = (String message) -> {//Definimos la lambda
			System.out.println("One Lambda: " + message);
		};
		
		oneListener.onOne("Sin Lambda :(");
		oneListener2.onOne("Con Lambda :)");
		
		//La lambda la asignamos a una variable
		OnOneListener oneListener3 = message -> System.out.println("Tu mensaje: "+message);

	}

}
