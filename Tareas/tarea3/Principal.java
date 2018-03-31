package tarea3;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	
	//private static Empleado[] empleados;
	private static ArrayList<Empleado> empleados;
	private static Scanner s;
	
	public static void main(String[] args) {
		s = new Scanner(System.in);
		//empleados = new Empleado[20];
		empleados = new ArrayList<Empleado>();
		cargarEmpleados();
		listarEmpleados();
	}
	
	private static void listarEmpleados() {
		System.out.println("DNI     \tNOMBRE\t\t\tAPELLIDO              \tSUELDO");
		System.out.println("========\t================\t================\t======");
		for (Empleado empleado : empleados) {
			System.out.println(
					empleado.getDni()+"\t"+
					empleado.getNombre()+"\t\t\t"+
					empleado.getApellido()+"\t\t $"+
					empleado.getSueldo()
					);
		}
	}
	
	private static void cargarEmpleados() {
		//Scanner s = new Scanner(System.in);
		int cant = 0;
		while (cant < 1) {
			System.out.print("Ingrese tipo de empleado [a/v]: Admininstrativo(a) - Vendedor(v) : ");
			String queEmpleadoEs = s.nextLine();
			
			if(queEmpleadoEs.equals("a")) {
				System.out.println("Administrativo");
				nuevoAdmin();
				cant++;
			}else if(queEmpleadoEs.equals("v")) {
				System.out.println("Vendedor");
				nuevoVendedor();
				cant++;
			}else {
				System.out.println("**** No es una opción valida ****");
			}
		}
		//System.out.println("SALIO DEL BUCLE");
	}
	
	private static void nuevoAdmin() {
		Administrativo admin = new Administrativo();
		System.out.print("Ingrese nombre: ");
		admin.setNombre(s.nextLine());
		System.out.print("Ingrese apellido: ");
		admin.setApellido(s.nextLine());
		System.out.print("Ingrese e-mail: ");
		admin.setEmail(s.nextLine());
		System.out.print("Ingrese DNI: ");
		admin.setDni(Integer.parseInt(s.nextLine()));
		System.out.print("Ingrese sueldo base: ");
		admin.setSueldoBase(Double.parseDouble(s.nextLine()));
		System.out.print("Ingrese Horas extras: ");
		admin.setHsExtra(Double.parseDouble(s.nextLine()));
		System.out.print("Ingrese horas del mes: ");
		admin.setHsMes(Double.parseDouble(s.nextLine()));

		empleados.add(admin);
	}
	
	private static void nuevoVendedor() {
		Vendedor vendedor = new Vendedor();
		System.out.print("Ingrese nombre: ");
		vendedor.setNombre(s.nextLine());
		System.out.print("Ingrese apellido: ");
		vendedor.setApellido(s.nextLine());
		System.out.print("Ingrese e-mail: ");
		vendedor.setEmail(s.nextLine());
		System.out.print("Ingrese DNI: ");
		vendedor.setDni(Integer.parseInt(s.nextLine()));
		System.out.print("Ingrese sueldo base: ");
		vendedor.setSueldoBase(Double.parseDouble(s.nextLine()));
		System.out.print("Ingrese porcentaje de comisión: ");
		vendedor.setPorcentComision(Double.parseDouble(s.nextLine()));
		System.out.print("Ingrese total de ventas: ");
		vendedor.setTotalVentas(Double.parseDouble(s.nextLine()));

		empleados.add(vendedor);
	}
}
