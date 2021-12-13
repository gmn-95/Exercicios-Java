package entities;

public class EmpregadoGanhoHora extends Empregado{

    private double salarioHora;
    private double horaSemanal;

    public EmpregadoGanhoHora() {
        super();
    }

    public EmpregadoGanhoHora(String primeiroNome, String segundoNome, String numeroSeguroSocial, double salarioHora, double horaSemanal) {
        super(primeiroNome, segundoNome, numeroSeguroSocial);

        if(salarioHora < 0.0){
            throw new IllegalArgumentException("Salário Hora deve ser >= 0");
        }

        if(horaSemanal < 0.0 || horaSemanal > 168.0){
            throw new IllegalArgumentException("Horas trabalhadas devem ser >= 0 e <= 168.0");
        }

        this.salarioHora = salarioHora;
        this.horaSemanal = horaSemanal;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        if(salarioHora <= 0.0){
            throw new IllegalArgumentException("Salário Hora deve ser >= 0");
        }
        this.salarioHora = salarioHora;
    }

    public double getHoraSemanal() {
        return horaSemanal;
    }

    public void setHoraSemanal(double horaSemanal) {
        if(horaSemanal < 0.0 || horaSemanal > 168.0){
            throw new IllegalArgumentException("Horas trabalhadas devem ser >= 0 e <= 168.0");
        }
        this.horaSemanal = horaSemanal;
    }

    @Override
    public double ganhos() {
        double salario = 0.0;

        if(horaSemanal <= 40){
            salario = salarioHora * horaSemanal;
        }
        else if(horaSemanal > 40){
            salario = 40 * salarioHora + (horaSemanal - 40) * salarioHora * 1.5;
        }

        return salario;
    }

    @Override
    public String toString() {
        return "EmpregadoGanhoHora{" + "\n" +
                super.toString() + "\n" +
                "salarioHora=" + salarioHora +
                ", horaSemanal=" + horaSemanal +
                '}';
    }
}
