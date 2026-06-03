package escola.model;

public class Aluno extends Pessoa{
	private String matricula;

	public Aluno(String name, int idade, String matricula) {
		super(name, idade); // Chama o construtor da classe Pessoa
		this.matricula = matricula;
		
		
		
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public void exibirInfo() {
		super.exibirInfo(); //chama método da classe mãe
		System.out.println("matricula: " + matricula );
	}
	
	
	
	
	
	
	
	
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
