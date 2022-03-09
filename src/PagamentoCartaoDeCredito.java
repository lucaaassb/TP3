
public class PagamentoCartaoDeCredito extends Pagamento{
	private String bandeiraCartao, numeroCartao, dataValidade, titularCartao, codigoSeguran�a;
	
	PagamentoCartaoDeCredito(float valorServico, String bandeiraCartao, String titularCartao, String numeroCartao, String dataValidade, String codigoSeguranca) {
		super(valorServico);
		this.bandeiraCartao = bandeiraCartao;
		this.titularCartao = titularCartao;
		this.numeroCartao = numeroCartao;
		this.dataValidade = dataValidade;
		this.codigoSeguran�a = codigoSeguranca;
	}

	public String getBandeiraCartao() {
		return bandeiraCartao;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public String getTitularCartao() {
		return titularCartao;
	}

	public String getCodigoSeguran�a() {
		return codigoSeguran�a;
	}
}

	