package aula15.ativ03t2.v2;

public class TesteModem {

	public static void main(String[] args) {

		ModeloABC modem1 = new ModeloABC("Modem de casa", "ABC", 100f, "10base2", 10f);
		Modem.MostrarModem(modem1);
			
		System.out.println();
		
		ModeloXYZ modem2 = new ModeloXYZ("Modem da empresa", 100f, 10000f);
		Modem.MostrarModem(modem2);	
	}

}
