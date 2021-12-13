package entities;

public abstract class Empregado {

    private String primeiroNome;
    private String segundoNome;
    private String numeroSeguroSocial;

    public Empregado() {
    }

    public Empregado(String primeiroNome, String segundoNome, String numeroSeguroSocial) {
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public void setSegundoNome(String segundoNome) {
        this.segundoNome = segundoNome;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public void setNumeroSeguroSocial(String numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public abstract double ganhos();

    @Override
    public String toString() {
        return "Empregado{" +
                "primeiroNome='" + primeiroNome + '\'' +
                ", segundoNome='" + segundoNome + '\'' +
                ", numeroSeguroSocial=" + numeroSeguroSocial +
                '}';
    }
}
