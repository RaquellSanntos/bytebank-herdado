
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario nico = new Funcionario();
		nico.setNome("Nico Steppst");
		nico.setCpf("222.222.222-11");
		nico.setSalario(2500.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());

	}

}
