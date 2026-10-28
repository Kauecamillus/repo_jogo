package jogo_das_faze;
import java.util.Arrays;
import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		
		
		int encerrar = 0;
		int encerrar1 = 0;
		int status1 = 0;
		int status2 = 0;
		String alternativa = "";
		
		
		{
			
		String jogadores [] = new String[2];
		int pontos = 0;
		int pontos2 = 0;
		
		for (int i = 0; i < 2; i++) {
			jogadores[i] = JOptionPane.showInputDialog(null, "Insira o seu vulgo " + (i + 1) );
		}
		
		int escolha1, escolha;
		
		while (status1 < 2 && status2 < 2) {
		
		String escolha3 = JOptionPane.showInputDialog(null, "Vamos jogar Jokenpo " + jogadores[0] + "\n Insira 1 para Pedra, 2 para Papel e 3 para Tesoura.");
		escolha = Integer.parseInt(escolha3);
		
		String escolha4 = JOptionPane.showInputDialog(null, "Jogaremos Jokenpo contra o jogador " + jogadores[0] + " jogador " + jogadores[1] + "\n Insira 1 para Pedra, 2 para Papel e 3 para Tesoura.");
		escolha1 = Integer.parseInt(escolha4);
		
		if ((escolha == 1) && (escolha1 == 3) || (escolha == 2) && (escolha1 == 1) || (escolha == 3) && (escolha1 == 2)) {
			pontos += 15;
			status1 += 1;
			JOptionPane.showMessageDialog(null, "Jogador " + jogadores[0] + " pontuou!\n Pontos do " + jogadores[0] + ": " + pontos + "\n Pontos do jogador " + jogadores[1] + ": " + pontos2);
			System.out.println(status1);
		}else if (escolha == escolha1) {
			JOptionPane.showMessageDialog(null, "Empate! Tente novamente jogadores!");
		}else {
			pontos2 += 15;
			status2 += 1;
			JOptionPane.showMessageDialog(null, "Jogador " + jogadores[1] + " pontuou!\n Pontos do " + jogadores[0] + ": " + pontos + "\n Pontos do jogador " + jogadores[1] + ": " + pontos2);
		}
		}
		
		if (status1 == 2) {
			JOptionPane.showMessageDialog(null, "Jogador " + jogadores[0] + " ganhou o round, tente novamente depois " + jogadores[1] + ".");
			status1 = 0;
		}else {
			JOptionPane.showMessageDialog(null, "Jogador " + jogadores[1] + " ganhou o round, tente novamente depois " + jogadores[0] + ".");
			status2 = 0;
		} while (status1 < 5 && pontos < 60) {
			String escolha3 = JOptionPane.showInputDialog(null, "Vamos jogar um quiz de java " + jogadores[0] + "\n Insira respectivamente as alternativas sem erro de digitação. Só avança de fase se forem feito 60 pontos."
					+ "\n Qual das alternativas é falsa?\n"
					+ " A. Um array começa com indice igual a 1.\n"
					+ " B. Uma variavel int pode conter letras.\n"
					+ " C. ''private'' é uma das 52 palavras reservadas.\n");
			alternativa = "C";
			
		if (escolha3.equalsIgnoreCase(alternativa)) {
			JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
			pontos += 15;
			status1 += 1;
		}else {
			JOptionPane.showMessageDialog(null, "Errou!");
			status1 += 1;
		}
			escolha3 = JOptionPane.showInputDialog(null, "Vamos jogar um quiz de java " + jogadores[0] + "\n Insira respectivamente as alternativas sem erro de digitação. Só avança de fase se forem feito 60 pontos."
				+ "\n Qual das alternativas é falsa?\n"
				+ " A. Um array começa com indice igual a 1.\n"
				+ " B. Uma variavel int pode conter letras.\n"
				+ " C. ''private'' é uma das 52 palavras reservadas.\n");
			alternativa = "C";
		
			if (escolha3.equalsIgnoreCase(alternativa)) {
				JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
				pontos += 15;
				status1 += 1;
			}else {
				JOptionPane.showMessageDialog(null, "Errou!");
				status1 += 1;
	}
		}
		
		
		
		
		
		System.out.println(pontos + "" + pontos2);
		System.out.println(Arrays.toString(jogadores));
		
		} while (encerrar == 0);
		
		
		
		
	}

}
