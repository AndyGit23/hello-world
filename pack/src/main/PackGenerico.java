package main;

public class PackGenerico {
	public static int durata;
    public static int costo;
    public static double guadTot;
    public double guaGio;
    public int inizio;
    public int fine = inizio + durata;
    public boolean stato;
    
    public int getDurata() {
		return durata;
	}
	public void setDurata(int durata) {
		this.durata = durata;
	}
	public int getCosto() {
		return costo;
	}
	public void setCosto(int costo) {
		this.costo = costo;
	}
	public double getGuadTot() {
		return guadTot;
	}
	public void setGuadTot(double guadTot) {
		this.guadTot = guadTot;
	}
	public double getGuaGio() {
		return guaGio;
	}
	public void setGuaGio(double guaGio) {
		this.guaGio = guaGio;
	}
	public int getInizio() {
		return inizio;
	}
	public void setInizio(int inizio) {
		this.inizio = inizio;
	}
	public int getFine() {
		return fine;
	}
	public void setFine(int fine) {
		this.fine = fine;
	}
	
	public void start() {
		if (durata == 0){
			stato = false;
		}else if (durata > 0) {
			stato = true;
		}
	}
	
	public double guad() {
		if (stato)
		    return (this.getGuadTot() - this.getCosto()) / this.getDurata();
		else{
			return 0;
		}
	}
	
	public void consuma() {
		durata = durata - 1;
		if(durata == 0) {
			stato = false;
		}
	}
	public boolean isStato() {
		return stato;
	}
	public void setStato(boolean stato) {
		this.stato = stato;
	}
}
