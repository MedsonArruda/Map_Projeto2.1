package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controleacademico.ControleAcademico;
import disciplina.Disciplina;
import turma.Turma;

public class ControleAcademicoTest {

    private Disciplina disciplina;
    private ControleAcademico controleAcademico;
    private Turma turma;

    @BeforeEach
    void setup() {
        controleAcademico = new ControleAcademico();
    }

    @Test
    public void testAdicionarDisciplina() throws Exception {
        controleAcademico.addDisciplina("Metodos Avançados em Programação", "MAP001", 60);
        disciplina = controleAcademico.buscaDisciplina("MAP001");
        assertNotNull(disciplina);
        assertEquals("Metodos Avançados em Programação", disciplina.getNome());
    }

    @Test
    public void testRemoverDisciplina() throws Exception {
        controleAcademico.addDisciplina("Metodos Avançados em Programação", "MAP001", 60);
        disciplina = controleAcademico.buscaDisciplina("MAP001");
        assertNotNull(disciplina);
        controleAcademico.removerDisciplina(disciplina);
        assertNull(controleAcademico.buscaDisciplina("MAP001"));
    }

    @Test
    public void testAdicionarTurma() throws Exception {
        controleAcademico.addDisciplina("Metodos Avançados em Programação", "MAP001", 60);
        controleAcademico.addTurma("MAP001", "B104", "Terca 11h-13h");
        turma = controleAcademico.buscaTurma(1);
        assertNotNull(turma);
        assertEquals("B104", turma.getSala());
    }

    @Test
    public void testRemoverTurma() throws Exception {
        controleAcademico.addDisciplina("Metodos Avançados em Programação", "MAP001", 60);
        controleAcademico.addTurma("MAP001", "B104", "Terca 11h-13h");
        turma = controleAcademico.buscaTurma(1);
        assertNotNull(turma);
        controleAcademico.removerTurma(turma);
        assertNull(controleAcademico.buscaTurma(1));
    }

    @Test
    public void testAdicionarAlunos() throws Exception {
        controleAcademico.addDisciplina("Metodos Avançados em Programação", "MAP001", 60);
        controleAcademico.addTurma("MAP001", "B104", "Terca 11h-13h");
        turma = controleAcademico.buscaTurma(1);
        assertNotNull(turma);
        controleAcademico.addAlunos(1, "Medson", "1111111");
        assertEquals(1, turma.getAlunos().size());
        assertEquals("Medson", turma.getAlunos().get(0).getNome());
    }

    @Test
    public void testRemoverAlunos() throws Exception {
        controleAcademico.addDisciplina("Metodos Avançados em Programação", "MAP001", 60);
        controleAcademico.addTurma("MAP001", "B104", "Terca 11h-13h");
        turma = controleAcademico.buscaTurma(1);
        assertNotNull(turma);
        controleAcademico.addAlunos(1, "Medson", "1111111");
        controleAcademico.removerAlunos(1, "1111111");
        assertEquals(0, turma.getAlunos().size());
    }

    @Test
    public void testAdicionarProfessor() throws Exception {
        controleAcademico.addDisciplina("Metodos Avançados em Programação", "MAP001", 60);
        controleAcademico.addTurma("MAP001", "B104", "Terca 11h-13h");
        turma = controleAcademico.buscaTurma(1);
        assertNotNull(turma);
        controleAcademico.addProfessor(1, "Yoseef", "3333333");
        assertNotNull(turma.getProfessor());
        assertEquals("Yoseef", turma.getProfessor().getNome());
    }

    @Test
    public void testRemoverProfessor() throws Exception {
        controleAcademico.addDisciplina("Metodos Avançados em Programação", "MAP001", 60);
        controleAcademico.addTurma("MAP001", "B104", "Terca 11h-13h");
        turma = controleAcademico.buscaTurma(1);
        assertNotNull(turma);
        controleAcademico.addProfessor(1, "Yoseef", "3333333");
        controleAcademico.removerProfessor(1, "3333333");
        assertNull(turma.getProfessor());
    }
}
