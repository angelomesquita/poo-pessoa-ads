package sistemaacademico;

public class App {
    
    public static void main(String[] args) {

        // Instanciar um novo objeto da classe aluno
        Aluno aluno01 = new Aluno();
        // setar os atributos de aluno
        aluno01.setNome("Nome do Aluno 01");
        aluno01.setIdade(19);
        aluno01.setRa("202410000036");
        aluno01.setCurso("ADS");
        // exibir no console
        System.out.println("Nome: " + aluno01.getNome());
        System.out.println("Idade: " + aluno01.getIdade());
        System.out.println("RA: " + aluno01.getRa());
        System.out.println("Curso: " + aluno01.getCurso());
    }
    
}
