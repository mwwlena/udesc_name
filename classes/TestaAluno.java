package exercico1oo.classes;

public class TestaAluno {
    public static void main(String[] args){
       Aluno urbano = new Aluno();
       urbano.matricula = "80195";
       urbano.nome = "Lucas Urbano";
       urbano.idade = 41;
       urbano.nota1 = 5; urbano.nota2 = 6;
       urbano.nota3 = 7; urbano.nota4 = 8;

       System.out.println("Matrícula:" + urbano.matricula);
    }
}
