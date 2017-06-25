package ejercicio10;

public class UNGS {
	
	Comision[] comisiones;
	
	public UNGS(){
		this.comisiones = new Comision[16];
	}
	
	boolean cursaCon(Estudiante e, Docente d){
		for(int i=0; i<comisiones.length; i++) if( comisiones[i] != null ){
			if( comisiones[i].cursaEstudiante(e) && comisiones[i].estaDocente(d) )
				return true;
		} return false;
	}
	
	boolean suficientesDocentes(){
		for( int i=0; i<comisiones.length; i++ ) if( comisiones[i] != null )
			if( (comisiones[i].inscriptos.length / comisiones[i].docentes.length) > 20.0 )
				return false;
		return true;
	}
	
	
	public static void main(String[] args){
	
		UNGS ungs = new UNGS();
		Comision c = new Comision("Lecto", 1, 55, 2);
		c.inscriptos[0] = new Estudiante("Josefa", 86327);
		c.calificaciones[0] = 5;
		c.docentes[0] = new Docente("Carlos", 23294);
		ungs.comisiones[0] = c;
		
		System.out.println( ungs.cursaCon(new Estudiante("Josefa", 86327), new Docente("Carlos", 23294) ) );
		System.out.println( ungs.suficientesDocentes() );
		
		
	}
	
}
