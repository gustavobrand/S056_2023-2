package aula15.ativ03t2;

public class TesteModem {

	public static void main(String[] args) {

		ModeloABC modem1 = new ModeloABC("Modem de casa", 
				"ABC", 100f, "10base2", 10f);
		System.out.println(modem1);
		System.out.println("Tipo de cabo: " + modem1.tipoDoCaboCoaxial());
		System.out.println("Nro portas Ethernet: " + modem1.getNroPortasEthernet());
	
		System.out.println();
		
		ModeloXYZ modem2 = new ModeloXYZ("Modem da empresa", 100f, 10000f);
		System.out.println(modem2);
		System.out.println("Perfil de velocidade: " + modem2.perfilDeVelocidade());
		System.out.println("Nro portas Ethernet: " + modem2.getNroPortasEthernet());
		modem2.setVelocidadePortaFibra(500f);
		System.out.println("Perfil de velocidade: " + modem2.perfilDeVelocidade());
		
	
	}

}
