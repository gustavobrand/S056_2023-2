package aula15.ativ03t2.v3;

import aula15.ativ03t2.v3.ModeloABC.TipoPortaCoaxial;
import aula15.ativ03t2.v3.ModeloXYZ.PerfilPortaFibra;

public class TesteModem {

	public static void main(String[] args) {

		ModeloABC modem1 = new ModeloABC("Modem de casa", "ABC", 100f, 
				TipoPortaCoaxial.DEZBASE5, 10f);
		System.out.println(modem1);
		System.out.println("Tipo de cabo: " + modem1.tipoDoCaboCoaxial());
		
		System.out.println();
		
		ModeloXYZ modem2 = new ModeloXYZ("Modem da empresa", 100f, 
				PerfilPortaFibra.GIGABIT);
		System.out.println(modem2);
		System.out.println("Perfil de velocidade da fibra: " + modem2.perfilDeVelocidade());
	}

}
