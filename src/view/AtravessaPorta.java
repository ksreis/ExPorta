package view;

import java.util.concurrent.Semaphore;
import controller.ThreadPorta;

public class AtravessaPorta {

	public static void main(String[] args) {
		int permissoes = 1;
		Semaphore semaforo = new Semaphore(permissoes);

		for (int xPessoa = 1; xPessoa < 5; xPessoa++) {
			Thread pessoa = new ThreadPorta(xPessoa, semaforo);
			pessoa.start();
		}
	}

}