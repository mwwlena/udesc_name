package dominio;

public class TestaAluno {
    public static void main(String[] args) {
        Aluno ze = new Aluno();
        ze.nome = "Zé da Silva";
        ze.idade = 20;
        System.out.printf("%s tem %d anos\n",
                ze.nome,
                ze.idade);
        
    }
}
