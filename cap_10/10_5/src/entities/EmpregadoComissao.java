package entities;

public class EmpregadoComissao extends Empregado{

    private double taxaComissao;
    private double vendasBrutas;

    public EmpregadoComissao() {
        super();
    }

    public EmpregadoComissao(String primeiroNome, String segundoNome, String numeroSeguroSocial, double taxaComissao, double vendasBrutas) {
        super(primeiroNome, segundoNome, numeroSeguroSocial);

        if(taxaComissao < 0.0 || taxaComissao >= 1.0){
            throw new IllegalArgumentException("Taxa de Comissão deve ser >= 0 e < 1.0");
        }

        if(vendasBrutas < 0.0){
            throw new IllegalArgumentException("Vendas brutas devem ser <= 0.0");
        }

        this.taxaComissao = taxaComissao;
        this.vendasBrutas = vendasBrutas;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {

        if(taxaComissao <= 0.0 || taxaComissao >= 1.0){
            throw new IllegalArgumentException("Taxa de Comissão deve ser >= 0 e < 1.0");
        }

        this.taxaComissao = taxaComissao;
    }

    public double getVendasBrutas() {
        return vendasBrutas;
    }

    public void setVendasBrutas(double vendasBrutas) {

        if(taxaComissao < 0.0 || vendasBrutas < 0.0){
            throw new IllegalArgumentException("Vendas devem ser >= 0");
        }

        this.vendasBrutas = vendasBrutas;
    }

    @Override
    public String toString() {
        return "EmpregadoComissao{" + "\n" +
                super.toString() + "\n" +
                "taxaComissao=" + taxaComissao +
                ", vendasBrutas=" + vendasBrutas +
                '}';
    }

    @Override
    public double ganhos() {
        return taxaComissao * vendasBrutas;
    }
}
