package test;
import org.junit.jupiter.api.Test;
import professor.Professor;
import turma.Turma;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

import aluno.Aluno;
import disciplina.Disciplina;

class TurmaTest {

    private Aluno medson, neto;
    private Professor yoseef, maria;
    private Disciplina algoritmo;
    private Turma turma;

    @BeforeEach
    void setup(){
        algoritmo = new Disciplina("Algoritmo", "ALG123", 60);
        medson = new Aluno("Medson", "1111111");
        neto = new Aluno("Neto", "2222222");
        yoseef = new Professor("Yoseef", "3333333");
        maria = new Professor("Maria", "555555");
        turma = new Turma(1, algoritmo, "B104", "Segunda 14h-16h");
    }

    @Test
    public void testAddAluno() throws Exception{
        turma.addNovoAluno(medson);
        assertTrue(turma.getAlunos().contains(medson));
        try {
            turma.addNovoAluno(medson);
            fail("Esperava exceção");
        } catch (Exception e) {
            assertEquals("Aluno já está na turma.", e.getMessage());
        }
    }

    @Test
    public void testRemoverAluno() throws Exception{
        turma.addNovoAluno(medson);
        turma.addNovoAluno(neto);
        turma.removerAluno(medson.getMatricula());
        assertFalse(turma.getAlunos().contains(medson));
        assertTrue(turma.getAlunos().contains(neto));
        try {
            turma.removerAluno(medson.getMatricula());
            fail("Esperava exceção");
        } catch (Exception e) {
            assertEquals("Aluno não está na turma.", e.getMessage());
        }
    }

    @Test
    public void testAddProfessor() throws Exception{
        turma.addNovoProfessor(yoseef);
        assertNotNull(turma.getProfessor());
        try {
            turma.addNovoProfessor(maria);
            fail("Esperava exceção");
        } catch (Exception e) {
            assertEquals("Já existe um professor nessa turma.", e.getMessage());
        }
    }

    @Test
    public void testRemoverProfessor() throws Exception{
        turma.addNovoProfessor(yoseef);
        turma.removerProfessor();
        assertNull(turma.getProfessor());
        try {
            turma.removerProfessor();
            fail("Esperava exceção");
        } catch (Exception e) {
            assertEquals("Não há professor nesta turma para ser removido.", e.getMessage());
        }
    }

    @Test
    public void testGetterSetter(){
        assertEquals(1, turma.getId());
        turma.setId(2);
        assertEquals(2, turma.getId());
    }

    @Test
    public void testConstrutor(){
        assertEquals(algoritmo, turma.getDisciplina());
        assertEquals(1, turma.getId());
        assertEquals("B104", turma.getSala());
        assertEquals("Segunda 14h-16h", turma.getHorario());
    }
}
