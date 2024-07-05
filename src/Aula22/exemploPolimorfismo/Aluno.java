package Aula22.exemploPolimorfismo;

public class Aluno extends Pessoa {
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    // tem um metodo na classe principal e um metodo na classe herdada,
    // sobescreve o metodo da classe principal
    public String obterDados(){
        return "Nome: "+getNome()+" Sobrenome: "+getSobrenome()+" Matricula: "+matricula;
    }
}
