package tarea3;

public class Vendedor extends Empleado {
	private double porcentComision;
	private double totalVentas;
	
	public double getPorcentComision() {
		return porcentComision;
	}

	public void setPorcentComision(double porcentComision) {
		this.porcentComision = porcentComision;
	}

	public double getTotalVentas() {
		return totalVentas;
	}

	public void setTotalVentas(double totalVentas) {
		this.totalVentas = totalVentas;
	}
	
	public double getSueldo() {
		double monto = 0;
		monto = this.getSueldoBase() + (this.getPorcentComision() * this.getTotalVentas() / 100);
		return monto;
	}

	public Vendedor() {

	}

	public Vendedor(String nombre, String apellido, String email, int dni, double sueldoBase) {
		super(nombre, apellido, email, dni, sueldoBase);
	}
}
