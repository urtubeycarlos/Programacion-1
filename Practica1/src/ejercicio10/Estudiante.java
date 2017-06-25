package ejercicio10;

import java.util.LinkedList;

public class Estudiante {

	String nombre;
	int legajo;
	
	public Estudiante(String nombre, int legajo){
		this.nombre = nombre;
		this.legajo = legajo;
	}
	
	@Override
	public String toString(){
		return new String( "Estudiante{ nombre = " + this.nombre + "; legajo = " + this.legajo + " }" );
	}
	
	public static void main(String[] args){
		LinkedList<Estudiante> lista  = new LinkedList<Estudiante>();
		lista.add( new Estudiante("Carlos", 213124) );
		lista.add( new Estudiante("Manolo", 13413413) );
		System.out.println( lista );
	}
	
}
