package conn.estudiantesonline;

import java.util.List;

import conn.DAO.Curso_estudianteDAOImpl;
import conn.DAO.estudianteDAOImpl;
import conn.entidades.Curso_estudiantes;
import conn.entidades.Cursos;
import conn.interfa.Curso_estudianteDAO;
import conn.interfa.EstudianteDAO;

//import java.util.List;

//import conn.DAO.CursoDAOImpl;
//import conn.DAO.estudianteDAOImpl;
//import conn.entidades.Cursos;
//import com.cursoDAO.CursoDAOImpl;
//import conn.DAO.estudianteDAOImpl;

//import conn.entidades.Estudiante;
//import conn.interfa.CursosDAO;
//import conn.interfa.EstudianteDAO;
//import conn.interfa.CursosDAO;
//import conn.interfa.EstudianteDAO;

public class Main {
	  static String URL = "jdbc:postgresql://localhost:5432/estudianteOnline";
	  static String USUARIO = "postgres";
	  static String CLAVE = "1234";
	
	  
	  public static void main(String[] args) {
		  
		  EstudianteDAO estudianteDAO = new estudianteDAOImpl();
	       Curso_estudianteDAO curso_estudiante = new Curso_estudianteDAOImpl();
	       Curso_estudiantes curso_estudiantes = new Curso_estudiantes(0,5,4);
	       curso_estudiante.ingresar(curso_estudiantes);
		   System.out.println("ingresado");
		    
		  
		    
		  
		      //CursosDAO cursoDAO = new CursoDAOImpl();
             //List<Estudiante> estudiantes = cursoDAO.getCursosPorCurso(1);
             //System.out.println(estudiantes);
            
             //EstudianteDAO estudianteDAO = new estudianteDAOImpl();

             //List<Cursos> curso1 = estudianteDAO.getCursosPorEstudiante(2);
             //List<Cursos> curso2 = estudianteDAO.getCursosPorEstudiante(1);
              
             //System.out.println(curso1);
             //System.out.println(curso2);
             
             
             
             
             
             
             
             //Cursos curso = new Cursos(1, "programacion IV");
            //cursoDAO.ingresar(curso);
           //cursoDAO.eliminar(2);
             //cursoDAO.actualizar(curso);
       
             
             //List<Cursos> cursos = cursoDAO.getCursos(); 
             //System.out.println(cursos);
             
             
             //cursos= cursoDAO.getCursos();
             //System.out.println(cursos.size());
             
          
		        //EstudianteDAO estudianteDAO = new estudianteDAOImpl();
		        //Estudiante estudiante =  new Estudiante(2, "juan", "fernandez", "juanfernandez@gmail.com");
		        
		        //estudianteDAO.ingresar(estudiante);
		        //estudianteDAO.eliminar(3);
                
		        //estudianteDAO.actualizar(estudiante);		  
		  
		        
		        
	             //List<Estudiante> estudiantes = estudianteDAO.getEstudiante(); 
	             //System.out.println(estudiantes);
	
	}

}
