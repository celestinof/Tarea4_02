package cuentas;
public class Main {

    public static void main(String[] args) {
        CCuenta micuenta1 = operativa_cuenta(0);

        try {
            micuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            micuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

	private static CCuenta operativa_cuenta(float cantidad) {
		CCuenta micuenta1;
        double saldoActual;

        micuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = micuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
		return micuenta1;
		
		
		
	}
}
