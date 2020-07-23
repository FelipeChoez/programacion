package conn.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conn.entidades.Curso_estudiantes;

import conn.interfa.Curso_estudianteDAO;
import conn.util.Util;

public class Curso_estudianteDAOImpl implements Curso_estudianteDAO {

	@Override
	public void ingresar(Curso_estudiantes ID) {
		String query ="INSERT INTO public.cursos_estudiantes(id_cursos, id_estudiantes)VALUES (?, ?);";
		Connection conn;
		try
	       {
		   conn = DriverManager.getConnection(Util.URL, Util.USUARIO, Util.CLAVE);
		   		 

			PreparedStatement stm = conn.prepareStatement(query);  
			stm.setInt(1, ID.getEstudianteID());
			stm.setInt(2, ID.getCursosID());
			stm.execute();
			   
		   }
		   	   
	   catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
	}

}
