package controleacademico;

import java.util.ArrayList;
import java.util.Collection;

import aluno.Aluno;
import disciplina.Disciplina;
import professor.Professor;
import turma.Turma;

public class ControleAcademico {
	private Collection<Disciplina> disciplinas;
	private Collection<Turma> turmas;


	public ControleAcademico() {
		this.disciplinas = new ArrayList<Disciplina>();
		this.turmas = new ArrayList<Turma>();
	}
	   public void addDisciplina(String nome, String codigo, int cargaHoraria) throws Exception {
		   Disciplina disciplina = new Disciplina( nome, codigo, cargaHoraria);
		   if (!disciplinas.contains(disciplina)) {
			   disciplinas.add(disciplina);
		   }
		   else {
			   throw new Exception("A disciplina já existe");
		   }
	   }
	   
	   public void removerDisciplina(Disciplina disciplina) throws Exception {
		   if (disciplinas.contains(disciplina)) {
			   disciplinas.remove(disciplina);
		   }
		   else {
			   throw new Exception("A disciplina não existe");
		   	}
	   }
	   
	   public Disciplina buscaDisciplina(String codigo) throws Exception {
		   for(Disciplina disciplina : disciplinas) {
			   if (disciplina.getCodigo().equals(codigo)) {
				   return disciplina;
			   }
		   }
		return null;
	   }
	   
	   public void dadosDisciplinas() {
		   for (Disciplina disciplina : disciplinas) {
			   System.out.println("Nome: " + disciplina.getNome()
			   + "\nCodigo: " + disciplina.getCodigo()
			   + "\nCarga Horária: "+ disciplina.getCargaHoraria());
			   System.out.println();
		   }
	   }
	   
	   public void addTurma(String codigoDisciplina, String sala, String horario) throws Exception {
		   Disciplina disciplinaAux = buscaDisciplina(codigoDisciplina);
		   if (disciplinaAux==null) throw new Exception("Código de Disciplina inválido");
		   Turma turma = new Turma(turmas.size()+1, disciplinaAux, sala, horario);
		   if (!turmas.contains(turma)) {
			   turmas.add(turma);
		   }
		   else {
			   throw new Exception("A turma já existe");
		   
		   }
	   }
	   
	   public void removerTurma(Turma turma) throws Exception {
		   if (turmas.contains(turma)) {
			   turmas.remove(turma);
		   }
		   else {
			   throw new Exception("A turma não existe");
		   	}
	   }
	   
	   public Turma buscaTurma(int id) throws Exception {
		   for(Turma turma : turmas) {
			   if (turma.getId()==id) {
				   return turma;
			   }
		   }
		return null;
	   }
	   
	   
	   public void dadosTurmas() {
		    for (Turma turma : turmas) {
		        if (turma.getProfessor() != null && turma.getAlunos() != null) {
		            System.out.print("\n\n");
		            System.out.println("Id da turma: " + turma.getId()
		                    + "\nDisciplina: " + turma.getDisciplina().getNome()
		                    + "\nSala: " + turma.getSala()
		                    + "\nProfessor: " + turma.getProfessor().getNome()
		                    + "\nHorário: " + turma.getHorario()
		                    + "\nAlunos:");

		            // Utilizando expressão lambda para imprimir os nomes dos alunos
		            turma.getAlunos().forEach(aluno ->
		                    System.out.println(aluno.getNome() + " - " + aluno.getMatricula()));
		        }
		    }
		}

			   
			  
	   
	   
	   public void addAlunos(int id, String nome, String matricula) throws Exception {
		   Turma turma = buscaTurma(id);
		   if (turma==null) throw new Exception("Código de Turma inválido");
		   Aluno aluno = new Aluno(nome,matricula);
		   turma.addNovoAluno(aluno);
	   }
	   
	   public void removerAlunos(int id, String matricula) throws Exception {
		   Turma turma = buscaTurma(id);
		   if (turma==null) throw new Exception("Código de Turma inválido");
		   turma.removerAluno(matricula);
	   }
	   
	   public void addProfessor(int idTurma, String nome, String idProfessor) throws Exception {
		   Turma turma = buscaTurma(idTurma);
		   if (turma==null) throw new Exception("Código de Turma inválido");
		   Professor professor = new Professor(nome,idProfessor);
		   turma.addNovoProfessor(professor);
	   }
	   
	   public void removerProfessor(int id, String matricula) throws Exception {
		   Turma turma = buscaTurma(id);
		   if (turma==null) throw new Exception("Código de Turma inválido");
		   turma.removerProfessor();
	   }

	public Collection<Turma> getTurmas() {
		return turmas;
	}
	public void setTurmas(Collection<Turma> turmas) {
		this.turmas = turmas;
	}

	public Collection<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(Collection<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
}
