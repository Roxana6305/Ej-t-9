package Ejercicio_tema_9;

public class Cliente1 {

	public static void main(String[] args) {
		Cliente ClienteJuan = new Cliente();
			ClienteJuan.Nombre = "Juan";
			ClienteJuan.Edad = 40;
			ClienteJuan.Telefono = 1123234545;
			ClienteJuan.Credito = 10000;
			System.out.println(ClienteJuan.Nombre);
			System.out.println(ClienteJuan.Edad);
			System.out.println(ClienteJuan.Telefono);
			System.out.println(ClienteJuan.Credito);
			
			
		Trabajador Trabajador1 = new Trabajador();
			Trabajador1.Nombre = "Juan Perez";
			Trabajador1.Edad = 45;
			Trabajador1.Telefono = 1145562023;
			Trabajador1.Salario = 30000;
			System.out.println(Trabajador1.Nombre);
			System.out.println(Trabajador1.Edad);
			System.out.println(Trabajador1.Telefono);
			System.out.println(Trabajador1.Salario);
		}

	

}
