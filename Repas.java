import java.util.Date;

public class Repas {
	private int numéro;
	private LocalDate date;
	
	public Repas(int numero,LocalDate date){
		this.numéro=numero;
		this.date=date;
	}
	
	public int getNuméro(){
		return this.numéro;
	}
	
	public void setNuméro(int numero){
		this.numéro=numero;
	}
}
