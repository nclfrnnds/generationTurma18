package lista04;

import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		String agenda[][] = new String[31][24];
		int dia, hora, opcao, atividades = 0;

		System.out.printf("AGENDA\n\n");
		
		do {
		
		System.out.printf("Informe o dia [1-31]: ");
		dia = ler.nextInt();
		dia = dia - 1;
		
		System.out.printf("Informe a hora [0-23]: ");
		hora = ler.nextInt();
		
		System.out.printf("Informe sua anota��o: ");
		agenda[dia][hora] = ler.next();
		
		System.out.printf("\nDigite: [1] Sim / [0] N�o\n");
		System.out.printf("Deseja continuar? ");
		opcao = ler.nextInt();

		System.out.println();
		
		}
		while (opcao != 0);

		System.out.printf("AGENDA\n\n");
	
		for (int contDia = 0; contDia < 31; contDia++) {
			for (int contHora = 0; contHora < 24; contHora++) {
				if (agenda[contDia][contHora] != null) {
					System.out.printf("Dia %d �s %dh: %s \n", (contDia + 1), (contHora), 
							agenda[contDia][contHora]);
					atividades++;
				}
			}
		}

		System.out.printf("\nVoc� tem %d atividades este m�s.\n", atividades);
		
		ler.close();
		
	}

}
