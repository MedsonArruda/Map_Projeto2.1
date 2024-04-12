package main;

import controleacademico.ControleAcademico;

public class Main {
	public static void main(String[] args) throws Exception {
		ControleAcademico ControleAcademico = new ControleAcademico();
		ControleAcademico.addDisciplina("Metodos Avançados em Programação", "MAP001", 60);
		ControleAcademico.addDisciplina("Estrutura de Dados", "EDA001", 60);
		ControleAcademico.addDisciplina("Ensino a distância", "EDA", 60);
		
		ControleAcademico.dadosDisciplinas();
		ControleAcademico.addTurma("MAP001", "B104", "Terca 11h-13h" );
		ControleAcademico.addTurma("EDA001", "LABII", "Quinta 14h-16h");
		ControleAcademico.addAlunos(1, "Medson", "1111111");
		ControleAcademico.addAlunos(1, "Neto", "2222222");
		ControleAcademico.addProfessor(1, "Yoseef", "3333333");
		ControleAcademico.addProfessor(2, "Maria", "555555");
		ControleAcademico.addAlunos(2,"Severina", "44444444");
		ControleAcademico.dadosTurmas();
	
	}
}
