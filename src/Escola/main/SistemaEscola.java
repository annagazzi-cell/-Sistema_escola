package Escola.main;

import escola.model.Aluno;
import escola.model.Professor;

public class SistemaEscola {

	public static void main(String[] args) {
		
		//Criando objetos
		Aluno aluno1 = new Aluno("ana", 16, "A001");
		Professor prof1 = new Professor("Carlos", 35, "Matemática");
		
		//Exibir informações
		System.out.println("=== DADOS DO ALUNO ==");
		aluno1.exibirInfo();
		
		System.out.println("\n=== DADOS DO PROFESSOR ===");
		prof1.exibirInfo();
		
		
		
	}

}
