package conn.entidades;

public class Curso_estudiantes {
     private int id;
     private int EstudianteID;
     private int CursosID;
	public Curso_estudiantes(int id, int estudianteID, int cursosID) {
		super();
		this.id = id;
		EstudianteID = estudianteID;
		CursosID = cursosID;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEstudianteID() {
		return EstudianteID;
	}
	public void setEstudianteID(int estudianteID) {
		EstudianteID = estudianteID;
	}
	public int getCursosID() {
		return CursosID;
	}
	public void setCursosID(int cursosID) {
		CursosID = cursosID;
	}
     
     
  	
	
}
