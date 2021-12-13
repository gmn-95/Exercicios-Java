package entities;

public class EmpregadoAssalariadoComissionado extends Empregado{

    private double vendasBrutas;
    private double taxaComissao;
    private double salarioBase;

    public EmpregadoAssalariadoComissionado() {
        super();
    }

    public EmpregadoAssalariadoComissionado(String primeiroNome, String segundoNome, String numeroSeguroSocial,
                                            double vendasBrutas, double taxaComissao, double salarioBase) {
        super(primeiroNome, segundoNome, numeroSeguroSocial);

        if(taxaComissao < 0.0 || taxaComissao >= 1.0){
            throw new IllegalArgumentException("Taxa de Comissão deve ser >= 0 e < 1.0");
        }

        if(vendasBrutas < 0.0){
            throw new IllegalArgumentException("Vendas brutas devem ser <= 0.0");
        }

        if(salarioBase < 0){
            throw new IllegalArgumentException("Salário base deve ser <= 0.0");
        }

        this.vendasBrutas = vendasBrutas;
        this.taxaComissao = taxaComissao;
        this.salarioBase = salarioBase;
    }

    public double getVendasBrutas() {
        return vendasBrutas;
    }

    public void setVendasBrutas(double vendasBrutas) {

        if(vendasBrutas < 0.0){
            throw new IllegalArgumentException("Vendas brutas devem ser <= 0.0");
        }

        this.vendasBrutas = vendasBrutas;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {

        if(taxaComissao < 0.0 || taxaComissao >= 1.0){
            throw new IllegalArgumentException("Taxa de Comissão deve ser >= 0 e < 1.0");
        }

        this.taxaComissao = taxaComissao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {

        if(salarioBase < 0){
            throw new IllegalArgumentException("Salário base deve ser <= 0.0");
        }

        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "EmpregadoAssalariadoComissionado{" +  "\n" +
                super.toString() + "\n" +
                "vendasBrutas=" + vendasBrutas +
                ", taxaComissao=" + taxaComissao +
                ", salarioBase=" + salarioBase +
                '}';
    }

    @Override
    public double ganhos() {
        return (taxaComissao * vendasBrutas) + salarioBase;
    }
}
