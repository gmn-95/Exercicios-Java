public class Viagens {

    private int quilometrosDirigidos;
    private int litrosUtilizados;
    private int quilometragemTotal;
    private int totalLitros;

    public Viagens() {
    }

    public Viagens(int quilometrosDirigidos, int litrosUtilizados) {
        this.quilometrosDirigidos = quilometrosDirigidos;
        this.litrosUtilizados = litrosUtilizados;
    }

    public int consumo(int quilometrosDirigidos, int litrosUtilizados){
        return quilometrosDirigidos / litrosUtilizados;
    }

    public int getQuilometragemTotal() {
        return quilometragemTotal;
    }

    public void setQuilometragemTotal(int quilometragemTotal) {
        this.quilometragemTotal += quilometragemTotal;
    }

    public int getTotalLitros() {
        return totalLitros;
    }

    public void setTotalLitros(int totalLitros) {
        this.totalLitros += totalLitros;
    }

    public int getQuilometrosDirigidos() {
        return quilometrosDirigidos;
    }

    public void setQuilometrosDirigidos(int quilometrosDirigidos) {
        this.quilometrosDirigidos = quilometrosDirigidos;
    }

    public int getLitrosUtilizados() {
        return litrosUtilizados;
    }

    public void setLitrosUtilizados(int litrosUtilizados) {
        this.litrosUtilizados = litrosUtilizados;
    }
}
