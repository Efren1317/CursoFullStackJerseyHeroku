package mx.com.ipn.escom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/alumnos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class AlumnoService {

	private static Map<Integer, Alumno> alumnos = new HashMap<>();
	
	static {
		Alumno efren = new Alumno("Efren", 12345, "Portillo", "sistemas2", "hola@gmail.com");
		Alumno efren2 = new Alumno("Efren", 12345, "Portillo", "sistemas2", "hola@gmail.com");
		
		alumnos.put(1, efren);
		alumnos.put(2, efren2);
	}
	
	/*
	 * Que va a hacer el metodo, esto ayudara ya que swager ayuda a recopilar esta info
	 * escribir la lisa de tosdos los clientes existentes
	 * */
	@GET
	public List<Alumno> getAlumno(){
		return new ArrayList<Alumno>(alumnos.values());
	}
	
	/*
	 * Guardar un alumno
	 * @param 
	 * */
	@POST
	public void addAlumno(Alumno a) {
		alumnos.put(alumnos.size()+1, a);
	}
	
	@DELETE
	@Path("/{alumnoId}")
	public void deleteAlumno(@PathParam("alumnoId")int id) {
		alumnos.remove(id);
	}
	
}










