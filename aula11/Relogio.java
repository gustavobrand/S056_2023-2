package aula11;

public class Relogio {
	private int segundo;
	private int minuto;
	private int hora;
	
	public void configuraHorario(int segundo, int minuto, int hora) {
		this.segundo = segundo;
		this.minuto = minuto;
		this.hora = hora;
	}
	public void configuraHorario(int segundo, int minuto) {
		this.segundo = segundo;
		this.minuto = minuto;		
	}
	@Override
	public String toString() {
		return "Relogio: " + hora + ":" + minuto + ":" + segundo;
	}
	


}
