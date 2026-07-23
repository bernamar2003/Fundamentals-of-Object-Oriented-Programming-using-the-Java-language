public class Estudante{
    public static void main(String[] args){
        Student aluno1 = new Student("Bernardo Martins", "Engenharia de Software", 19.5);
        aluno1.displayDetails();
    }
}
class Student{
	String nome;
	String curso;
	Double media;

	public Student(String nome, String curso, Double media){
	this.nome = nome;
	this.curso = curso;
	this.media = media;
 }
	void displayDetails(){
System.out.println("Nome do Aluno: " + nome + "\n Curso do Aluno: " + curso + "\n Media do aluno: " + media);
}
}
