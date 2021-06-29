public class Teste {
	public static void main(String[] args) {
		Cliente vinicius = new Cliente();
		vinicius.setNome("Vinicius Ribeiro");
		vinicius.setCpf("222.222.222.-22");
		vinicius.setProfissao("programador");

		Conta contaDoPaulo = new Conta(6646, 969060);
		contaDoPaulo.deposita(100);

		contaDoPaulo.setTitular(vinicius);
		System.out.println(contaDoPaulo.getTitular().getNome());
		System.out.println(contaDoPaulo.getTitular());

	}
}