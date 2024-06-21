package exemploStatic.exemploHeranca;

public class Principal {
    public static void main(String[] args) {

        Motorista m1 = new Motorista("João","Silva",123);
        m1.setNome("João");
        m1.setSobrenome("Silva");
        m1.setMatricula(123);
        m1.setSalario(1200);
        m1.setCnh("1232154201");
        System.out.println("Nome do motorista: "+m1.getNome()+" "+m1.getSobrenome());
        System.out.println("Recebe "+String.format("%.2f",m1.getSalario()));

        Engenheiro e1 = new Engenheiro("Pedro","Almeida",456);
        e1.setNome("Pedro");
        e1.setSobrenome("Almeida");
        e1.setMatricula(456);
        e1.setSalario(5000);
        System.out.println("Nome do engenheiro: "+e1.getNome()+" "+e1.getSobrenome());
        System.out.println("Recebe: "+String.format("%.2f",e1.getSalario()));
    }
}
