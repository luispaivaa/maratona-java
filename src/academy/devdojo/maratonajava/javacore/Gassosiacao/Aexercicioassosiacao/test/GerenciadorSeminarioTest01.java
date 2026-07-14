package academy.devdojo.maratonajava.javacore.Gassosiacao.Aexercicioassosiacao.test;

import academy.devdojo.maratonajava.javacore.Gassosiacao.Aexercicioassosiacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassosiacao.Aexercicioassosiacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassosiacao.Aexercicioassosiacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassosiacao.Aexercicioassosiacao.dominio.Seminario;

public class GerenciadorSeminarioTest01 {
    public static void main(String[] args){
        Professor professor1 = new Professor("Edgard", "Física");

        Aluno aluno01 = new Aluno("Fulano", 17);
        Aluno aluno02 = new Aluno("Beltrano", 19);
        Aluno aluno03 = new Aluno("Ciclano", 18);
        Aluno[] alunosParaSeminario = {aluno01, aluno02, aluno03};

        Local enderecoDoSeminario = new Local("UNIPÊ - Bloco F - Sala 110");

        Seminario seminario01 = new Seminario("Mecânica Clássica na Prática", enderecoDoSeminario, professor1, alunosParaSeminario);
        Seminario[] seminariosListados = {seminario01};

        professor1.setSeminariosAgendados(seminariosListados);

        seminario01.imprime();
        professor1.dadosProfessor();
    }
}
