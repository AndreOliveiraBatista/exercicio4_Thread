package controller;

public class ThreadRace extends Thread{
	private int rd;// raceDistance
	private int n;// contador de sapos
	private static int colocacao = 1;
	
	public ThreadRace (int rd, int n) {
		this.rd = rd;
		this.n = n;
	}
	
	@Override
	public void run() {
		int tid = (int)threadId();//id
		int frogDistance = 0;
		while(frogDistance < rd) {
			int frogKick = (int)(Math.random()*5); // tamanho máximo do pulo do sapo é 10
			System.out.println("pulo do sapo #" + tid + " = " + frogKick + " mts");
			frogDistance += frogKick;
				try {
					sleep(frogKick);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			System.out.println("Distancia do sapo #" + tid + " = " + frogDistance + " mts");
		}

		System.out.println("Sapo " + tid + " chegou em " + (colocacao++) + "º lugar!");
	}
}


