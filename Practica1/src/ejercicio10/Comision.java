package ejercicio10;

public class Comision {
	
	String materia;
	int numero;
	Docente[] docentes;
	Estudiante[] inscriptos;
	int[] calificaciones;
	
	public Comision(String nombre_materia, int numero_comision, int cant_estudiantes, int cant_docentes){
		this.materia = nombre_materia;
		this.numero = numero_comision;
		this.inscriptos = new Estudiante[cant_estudiantes];
		this.docentes = new Docente[cant_docentes];
		this.calificaciones = new int[cant_estudiantes];
	}
	
	boolean cursaEstudiante(Estudiante e){
		for(int i=0; i<inscriptos.length; i++) if( inscriptos[i] != null )
			if( inscriptos[i].legajo == e.legajo )
				return true;
		return false;
	}
	
	boolean estaDocente(Docente d){
		for(int i=0; i<docentes.length; i++) if( docentes[i] != null )
			if( docentes[i].DNI == d.DNI )
				return true;
		return false;
	}

}
