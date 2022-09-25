package Atividade_poo;

public class Do {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Mozart", 23, "123456789-00");
		Pessoa p2 = new Pessoa();
		
		
		System.out.println(p1.nome+"\n " + p1.idade+" \n" + p1.cpf);
		p2.setNome("Ludwig");
		p2.setIdade(20);
		p2.setCpf("123456789-00");
		
		System.out.println(p2.getNome());
		System.out.println(p2.getIdade());
		System.out.println(p2.getCpf());

	}

}
