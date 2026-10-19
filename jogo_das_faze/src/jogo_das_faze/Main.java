package jogo_das_faze;
import java.util.Arrays;
import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		
		
		int encerrar = 0;
		int encerrar1 = 0;
		
		do 
		
		{
			
		String jogadores [] = new String[2];
		int pontos [] = new int [2];
		
		for (int i = 0; i < 2; i++) {
			jogadores[i] = JOptionPane.showInputDialog(null, "Insira o seu vulgo " + (i + 1) );
		}
		
		int escolha1, escolha;
		
		String escolha3 = JOptionPane.showInputDialog(null, "Vamos jogar Jokenpo " + jogadores[0] + "\n Insira 1 para Pedra, 2 para Papel e 3 para Tesoura.");
		escolha = Integer.parseInt(escolha3);
		
		String escolha4 = JOptionPane.showInputDialog(null, "Jogaremos Jokenpo contra o jogador " + jogadores[0] + " jogador " + jogadores[1] + "\\n Insira 1 para Pedra, 2 para Papel e 3 para Tesoura.");
		escolha1 = Integer.parseInt(escolha4);
		
		if ((((escolha == 1) && (escolha1 == 3)) || ((escolha == 2) && (escolha1 == 1)) || (escolha == 3) && (escolha1 == 2)))
		
		System.out.println(Arrays.toString(pontos));
		System.out.println(Arrays.toString(jogadores));
		
		} while (encerrar == 0);
		
		
		
		
	}

}
