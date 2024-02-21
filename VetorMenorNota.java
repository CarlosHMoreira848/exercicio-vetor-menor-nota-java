import java.util.Random;
public class VetorMenorNota {
	public static void main(String[] args) {
		System.out.println("Bem vindo ao programa de exercício de vetor! Iremos exercitar a seleção da menor nota em uma turma de alunos!");
		System.out.println("Criando turma de alunos...");
		int notas[] = new int[20];
		System.out.println("A turma de alunos foi criada! Agora vamos atribuir notas para os alunos...");
		Random random = new Random();
		for(int i = 0; i < notas.length; i++) {
			notas[i] = random.nextInt(11);
		}
		System.out.println("Atribuimos com sucesso notas para os alunos! Agora vamos listar as notas...");
		for(int a = 0; a < notas.length; a++) {
			System.out.println("Aluno " + (a + 1) + ", nota:  " + notas[a]);
		}
		System.out.println("A listagem foi concluída! Agora iremos listar a menor nota...");
		int maiorNota = notas[0];
		for(int b = 0; b < notas.length; b++) {
			if(notas[b] < maiorNota) {
				maiorNota = notas[b];
			}
		}
		System.out.println("A menor nota encontrada na lista foi: " + maiorNota);
	}
}