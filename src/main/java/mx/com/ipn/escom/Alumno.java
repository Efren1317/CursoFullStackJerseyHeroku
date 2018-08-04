package mx.com.ipn.escom;

public class Alumno {
	
	private String nombre;
	private int id;
	private String apeido;
	private String carrera;
	private String correo;
	
	
	public Alumno() {
		
	}
	
	
	public Alumno(String nombre, int id, String apeido, String carrera, String correo) {
		this.nombre = nombre;
		this.id = id;
		this.apeido = apeido;
		this.carrera = carrera;
		this.correo = correo;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getApeido() {
		return apeido;
	}
	public void setApeido(String apeido) {
		this.apeido = apeido;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
	
	
	
}
