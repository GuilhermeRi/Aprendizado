public class TestaTransferencia {
	public static void main(String[] args) {
		Conta contaDoVinicius = new Conta(6646,969060);
		contaDoVinicius.deposita(100);
		contaDoVinicius.deposita(50);
		System.out.println(contaDoVinicius.getSaldo());

		boolean conseguiuRetirar = contaDoVinicius.saca(20);
		System.out.println(contaDoVinicius.getSaldo());
		System.out.println(conseguiuRetirar);

		Conta contaDaMarcela = new Conta(6644,969063);
		contaDaMarcela.deposita(1000);

		boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoVinicius);

		if (sucessoTransferencia) {
			System.out.println("transferencia com sucesso");

		} else {
			System.out.println("faltou dinheiro");

		}
		System.out.println(contaDaMarcela.getSaldo());
		System.out.println(contaDoVinicius.getSaldo());
	}

}