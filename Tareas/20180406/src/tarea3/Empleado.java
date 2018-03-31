package tarea3;

public class Empleado {
	private String nombre;
	private String apellido;
	private String email;
	private int dni;
	private double sueldoBase;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public double getSueldo() {
		return sueldoBase;
	}
	
	public Empleado(){
		
	}
	
	public Empleado(String nombre, String apellido, String email, int dni, double sueldoBase){
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setEmail(email);
		this.setDni(dni);
		this.setSueldoBase(sueldoBase);
	}
}
