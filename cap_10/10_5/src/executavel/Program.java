/*
*Uma empresa paga seus funcionários semanalmente. Os funcionários são de quatro tipos: funcionários assalariados
*recebem salários fixos semanais independentemente do número de horas trabalhadas, funcionários que trabalham por
*hora são pagos da mesma forma e recebem horas extras (isto é, 1,5 vez sua taxa de salário por hora) por todas
*as horas trabalhadas além das 40 horas normais, funcionários comissionados recebem uma porcentagem sobre suas
*vendas e funcionários assalariados/comissionados recebem um salário-base mais uma porcentagem sobre suas vendas.
*Para o período salarial atual, a empresa decidiu recompensar os funcionários assalariados/comissionados
*adicionando 10% aos seus salários-base. A empresa quer que você escreva um aplicativo que realiza os cálculos da
*folha de pagamento polimorficamente.
*
* */

package executavel;

import entities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        EmpregadoAssalariado empregadoAssalariado = new EmpregadoAssalariado("John", "Smith",
                "111-11-111", 800.00);

        EmpregadoGanhoHora empregadoGanhoHora = new EmpregadoGanhoHora("Karen", "Price",
                "222-22-222", 16.76, 40);

        EmpregadoComissao empregadoComissao = new EmpregadoComissao("Sue", "Jones",
                "333-33-3333", .06, 10000);

        EmpregadoAssalariadoComissionado empregadoAssalariadoComissionado = new EmpregadoAssalariadoComissionado("Bob",
                "Lewis", "444-44-4444", 5000, .04, 300);


        System.out.println("Empregados processados individualmente: ");

        System.out.printf("%n%s%n%s: $%,.2f%n%n", empregadoAssalariado, "Ganhos: ", empregadoAssalariado.ganhos());
        System.out.printf("%n%s%n%s: $%,.2f%n%n", empregadoGanhoHora, "Ganhos: ", empregadoGanhoHora.ganhos());
        System.out.printf("%n%s%n%s: $%,.2f%n%n", empregadoComissao, "Ganhos: ", empregadoComissao.ganhos());
        System.out.printf("%n%s%n%s: $%,.2f%n%n", empregadoAssalariadoComissionado, "Ganhos: ", empregadoAssalariadoComissionado.ganhos());






        List<Empregado> listaEmpregados = new ArrayList<Empregado>();

        listaEmpregados.add(empregadoAssalariado);
        listaEmpregados.add(empregadoGanhoHora);
        listaEmpregados.add(empregadoComissao);
        listaEmpregados.add(empregadoAssalariadoComissionado);

        System.out.println("Empregados processados por Polimorfismo");

        for(Empregado empregadoAtual: listaEmpregados){

            System.out.println(empregadoAtual);

            if(empregadoAtual instanceof EmpregadoAssalariadoComissionado){

                // downcast da referência de Empregado para
                // referência a EmpregadoAssalariadoComissionado
                EmpregadoAssalariadoComissionado empregado = (EmpregadoAssalariadoComissionado) empregadoAtual;

                empregado.setSalarioBase(1.10 * empregado.getSalarioBase());

                System.out.printf("Novo salário com 10%% de aumento é: $%,.2f%n", empregado.getSalarioBase());
            }

            System.out.printf("Ganhos: $%,.2f%n%n", empregadoAtual.ganhos());
        }

        int i = 1;
        for(Empregado empregado: listaEmpregados){
            System.out.printf("Empregado %d é um %s%n", i, empregado.getClass().getName());
            i++;
        }

    }



}
