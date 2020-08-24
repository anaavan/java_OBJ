public class Empregado{

    String nome;
    String cargo;
    double salario;


    void exibirInfo(){
        System.out.println("Nome: "+nome);

        System.out.println("Cargo: "+cargo);

        System.out.println("Salario: "+salario);
    }

    void aumentarSalario(double Percent){
        salario = (Percent / 100) * salario + salario ;
    
    }

}

    
