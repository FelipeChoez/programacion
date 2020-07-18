package conn.estudiantesonline;



import java.util.List;

//import com.cursoDAO.CursoDAOImpl;
import conn.DAO.estudianteDAOImpl;

//import conn.entidades.Cursos;
import conn.entidades.Estudiante;
//import conn.interfa.CursosDAO;
import conn.interfa.EstudianteDAO;

public class Main {
	  static String URL = "jdbc:postgresql://localhost:5432/estudianteOnline";
	  static String USUARIO = "postgres";
	  static String CLAVE = "1234";
	
	  
	  public static void main(String[] args) {
		  
             //CursosDAO cursoDAO = new CursoDAOImpl();
             
            //Cursos curso = new Cursos(1, "programacion IV");
            //cursoDAO.ingresar(curso);
           //cursoDAO.eliminar(2);
             //cursoDAO.actualizar(curso);
       
             
             //List<Cursos> cursos = cursoDAO.getCursos(); 
             //System.out.println(cursos);
             
             
             //cursos= cursoDAO.getCursos();
             //System.out.println(cursos.size());
             
          
		        EstudianteDAO estudianteDAO = new estudianteDAOImpl();
		        //Estudiante estudiante =  new Estudiante(2, "juan", "fernandez", "juanfernandez@gmail.com");
		        
		        //estudianteDAO.ingresar(estudiante);
		        //estudianteDAO.eliminar(3);
                
		        //estudianteDAO.actualizar(estudiante);		  
		  
		        
		        
	             List<Estudiante> estudiantes = estudianteDAO.getEstudiante(); 
	             System.out.println(estudiantes);
	
	}

}
