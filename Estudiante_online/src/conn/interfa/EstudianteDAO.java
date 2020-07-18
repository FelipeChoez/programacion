package conn.interfa;

import java.util.List;

import conn.entidades.Estudiante;

public interface EstudianteDAO {
  void ingresar(Estudiante estudiante);
  void actualizar(Estudiante estudiante);
   void eliminar(int id);
   
   List<Estudiante>getEstudiante();
}
