

public class Cliente {
    private String nome;
    private String sobrenome;
    private String rg;
    private double saldoEmConta;
    private double limite;

    private double divida;

    public Cliente(String nome, String sobrenome, String rg, double limite) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.limite= limite;
        saldoEmConta=10;
        divida = 0;

    }
    public void comprar(double valor) throws ClientException {
        if (limite < valor || saldoEmConta < valor)
            throw  new ClientException("limte insuficiente para a compra");
         double operacao = this.saldoEmConta - valor;
    }

    public void pagarDivida(double valor) throws ClientException
    {
        if (divida == 0 )
            throw new ClientException(" não possui divida ativa para pagamento");
        if (divida > saldoEmConta)
            throw new ClientException("Saldo inuficiente para realizar pagamento da divida");
        saldoEmConta-=valor;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                nome + ' ' +
                sobrenome + ' ' +
                ", seu saldo é=" + saldoEmConta + "R$ }";
    }
}