import java.util.Scanner;
    public class EmpregadoTeste{
        public static void main (String arg[]){

            Empregado P1;

            P1 = new Empregado ();

            P1.nome = "ana";
            P1.cargo = "ryca";
            P1.salario = 10000;

            P1.exibirInfo();

            P1.aumentarSalario(5);
            P1.exibirInfo();




        }

    }