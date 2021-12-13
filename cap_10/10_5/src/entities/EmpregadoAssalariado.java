package entities;

public class EmpregadoAssalariado extends Empregado{

    private double salarioSemanal;

    public EmpregadoAssalariado() {
        super();
    }

    public EmpregadoAssalariado(String primeiroNome, String segundoNome, String numeroSeguroSocial, double salarioSemanal) {
        super(primeiroNome, segundoNome, numeroSeguroSocial);

        if(salarioSemanal < 0.0){
            throw new IllegalArgumentException("Salário deve ser >= 0.0");
        }

        this.salarioSemanal = salarioSemanal;
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {

        if(salarioSemanal < 0.0){
            throw new IllegalArgumentException("Salário deve ser >= 0.0");
        }

        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public double ganhos() {
        return getSalarioSemanal();
    }

    @Override
    public String toString() {
        return "EmpregadoAssalariado{" + "\n" +
                super.toString() + "\n" +
                "salarioSemanal=" + salarioSemanal +
                '}';
    }
}
