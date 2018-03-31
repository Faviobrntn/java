package tarea3;

public class Administrativo extends Empleado {
	private double hsExtra;
	private double hsMes;
	
	public double getHsExtra() {
		return hsExtra;
	}
	public void setHsExtra(double hsExtra) {
		this.hsExtra = hsExtra;
	}
	public double getHsMes() {
		return hsMes;
	}
	public void setHsMes(double hsMes) {
		this.hsMes = hsMes;
	}
	
	public double getSueldo() {
		double monto = 0;
		monto = this.getSueldoBase() * ((this.getHsExtra()*1.5) + this.getHsMes()) / this.getHsMes();
		return monto;
	}
	
	public Administrativo() {

	}
	public Administrativo(String nombre, String apellido, String email, int dni, double sueldoBase) {
		super(nombre, apellido, email, dni, sueldoBase);

	}

}
