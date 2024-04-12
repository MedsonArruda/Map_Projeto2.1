package turma;

import java.util.ArrayList;

import aluno.Aluno;
import disciplina.Disciplina;
import professor.Professor;

public class Turma {
	
	private int id;
	private Disciplina disciplina;
	private String sala;
	private String horario;
	private Professor professor;
	private ArrayList<Aluno> alunos;
	
	public Turma(int id, Disciplina disciplina, String sala, String horário) {
		this.setId(id);
		this.setDisciplina(disciplina);
		this.setSala(sala);
		this.setHorario(horário);
		this.alunos = new ArrayList<Aluno>();
		this.professor=null;
	}
	
	public void addNovoAluno(Aluno aluno) throws Exception {
		if (!alunos.contains(aluno)) alunos.add(aluno);
		else throw new Exception("Aluno já está na turma.");
	}

	public void removerAluno(String matricula) throws Exception {
	Aluno alunoAux = new Aluno(null, matricula);
	for (Aluno aluno : alunos) {
		if (aluno.getMatricula().equals(alunoAux.getMatricula())) {
			alunos.remove(aluno);
			return;
			}
		}
	 throw new Exception("Aluno não está na turma.");
	}
	
	public void addNovoProfessor(Professor professor) throws Exception {
		if (this.professor == null) this.professor = professor;
		else {
			throw new Exception("Turma já possue docente.");
		}
	}
	
	public void removerProfessor() throws Exception {
		if (this.professor != null) this.professor=null;
		else {
			throw new Exception("Turma sem professor."); 
		}
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public Professor getProfessor() {
		return this.professor;
	}
}
