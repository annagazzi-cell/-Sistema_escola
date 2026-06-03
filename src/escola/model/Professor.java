package escola.model;

public class Professor extends Pessoa {
	private String disciplina;

	public Professor(String name, int idade, String disciplina) {
		super(name, idade);
		this.disciplina = disciplina;
	}
	
	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public void exibirInfo() {
		super.exibirInfo();
		System.out.println("Disciplina: " + disciplina);
	}
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
