package main;

public class Pack {//extends PackGenerico{
	
	private int durata;
	private int costo;
    private double guadTot;
	private double guaGio;
    private int inizio;
    private int fine;
    private boolean stato;
    private int contatoreDurata;
    
    public Pack(int inizio){
    	this.inizio = inizio;
    }
    
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
		return this.inizio;
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
		if (this.durata == 0){
			this.stato = false;
		}else if (this.durata > 0) {
			this.stato = true;
		}
	}
	
	public double guad() {
		if (this.stato) {
			return this.getGuadTot() / this.getDurata();
		}
		else{
			return 0;
		}
	}
	
	public void consuma() {
		System.out.println("dentro consuma() this.contatoreDurata =" + this.contatoreDurata);
		System.out.println("dentro consuma() getContatoreDurata() =" + getContatoreDurata());
		this.contatoreDurata = this.contatoreDurata- 1;
		if(this.contatoreDurata <= 0) {
			this.stato = false;
		}
	}
	public boolean isStato() {
		return stato;
	}
	public void setStato(boolean stato) {
		this.stato = stato;
	}

	public int getContatoreDurata() {
		return contatoreDurata;
	}

	public void setContatoreDurata(int contatoreDurata) {
		this.contatoreDurata = contatoreDurata;
	}
}
