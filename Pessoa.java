package Atividade_poo;

public class Pessoa {
	String nome;
	int idade;
	String cpf;

	Pessoa(String nome, int idade, String cpf) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}

	Pessoa() {
		// valores padrão,inicializar(=)
		this.nome =null;
		this.idade =0;
		this.cpf =null;
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(cpf);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
