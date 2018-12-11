package main;

import java.util.ArrayList;

public class Main {
	
	public void esegui() {
		ArrayList<ArrayList<Double>> lista = new ArrayList<ArrayList<Double>>();
		
		Pack p1 = new Pack(1);
		p1.setDurata(15);
		p1.setCosto(2);
		p1.setGuadTot(2.40);
		p1.setContatoreDurata(p1.getDurata());
		Pack p2 = new Pack(1);
		p2.setDurata(15);
		p2.setCosto(2);
		p2.setGuadTot(2.40);
		p2.setContatoreDurata(p2.getDurata());
		
		/*Pack p3 = new Pack(15);
		p3.setContatoreDurata(p.getDurata());
		Pack p4 = new Pack(15);
		p4.setContatoreDurata(p.getDurata());*/
		ArrayList<Pack> listaPack = new ArrayList<Pack>();
		listaPack.add(p1);
		listaPack.add(p2);
		//listaPack.add(p3);
		//listaPack.add(p4);
		
		// giorno guaGio tot
		double giorno = 0;
		double guaGio = 0;
		double tot = 0;
		
		double numeroPackAttivi = 0;
		int giorni = 35;
		while(giorni > 0) {
			
			double guaGioTot = 0;
			ArrayList<Double> record = new ArrayList<Double>();
			giorno += 1;
			record.add(giorno);
			for (int i = 0; i < listaPack.size(); i++) {
				
				System.out.println("giorno == " + giorno);
				System.out.println("Pacchetto " + i + " stato =" + listaPack.get(i).isStato());
				if(listaPack.get(i).getInizio() == giorno) {
					listaPack.get(i).start();
					System.out.println("Pacchetto " + i + " partito");
				}
				guaGio = listaPack.get(i).guad();
				System.out.println("guaGio =" + guaGio);
				guaGioTot += guaGio;
				
				if(listaPack.get(i).isStato()) {
					numeroPackAttivi += 1;
					listaPack.get(i).consuma();
					System.out.println("Pacchetto " + i + "consuma");
				}
			}
			
			record.add(guaGioTot);
			tot = tot + guaGioTot;
			record.add(tot);
			if(tot > 4) {
				System.out.println("tot > 4, giorno =" + giorno);
				tot = tot - 4;
				Pack p3 = new Pack((int)giorno);
				p3.setDurata(15);
				p3.setCosto(2);
				p3.setGuadTot(2.40);
				p3.setContatoreDurata(p3.getDurata());
				Pack p4 = new Pack((int)giorno);
				p4.setDurata(15);
				p4.setCosto(2);
				p4.setGuadTot(2.40);
				p4.setContatoreDurata(p4.getDurata());
				listaPack.add(p3);
				listaPack.add(p4);
			}
			for (int i = 0; i < listaPack.size(); i++) {
				System.out.println("listaPack.get(i).getInizio() =" + listaPack.get(i).getInizio());
				System.out.println("listaPack.get(i).getDurata() =" + listaPack.get(i).getDurata());
				System.out.println("listaPack.get(i).getFine() =" + listaPack.get(i).getFine());
				System.out.println("listaPack.get(i).getContatoreDurata() =" + listaPack.get(i).getContatoreDurata());
			}
				    
				
			record.add(numeroPackAttivi);
			
			lista.add(record);
			giorni = giorni - 1;
			System.out.println("record =" + record);
			for (int i = 0; i < listaPack.size(); i++) {
				if((listaPack.get(i).getInizio() + listaPack.get(i).getDurata()) < giorno) {
					listaPack.get(i).setStato(false);
					System.out.println("Pacchetto " + i + "stato = false");
				}
			}
			numeroPackAttivi = 0;
		}
		System.out.println("lista =" + lista);
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}
    public static void main(String[] args) {
		//System.out.println("OK");
    	new Main().esegui();
	}
}
