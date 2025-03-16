package controller;

public class ThreadRace extends Thread{
	private int rd; // raceDistance
	
	public ThreadRace (int rd) {
		this.rd = rd;
	}
	
	@Override
	public void run() {
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Race();
	}
	
	private void Race() {
		int tid = (int)threadId();
		int frogDistance = 0;
		int i = 0;
		double[] vetor = new double[5];
		while(frogDistance < rd) {
			double TI = System.nanoTime();
				int frogKick = (int)(Math.random()*5); // tamanho máximo do pulo do sapo é 10
				System.out.println("pulo do sapo #" + tid + " = " + frogKick + " mts");
				frogDistance += frogKick;
				System.out.println("Distancia do sapo " + tid + " = " + frogDistance + " mts");
			double Tf = System.nanoTime();
			double TT = ((Tf - TI)/(Math.pow(10, 9)));
			vetor[i] = TT;
		}
		System.out.println("sapo #" + tid + " CHEGOU! ");
		
	}
}
