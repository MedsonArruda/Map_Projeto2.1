package main;

import static org.junit.Assert.*;
import org.junit.Test;

import disciplina.Disciplina;
import turma.Turma;

public class TurmaTest {

    @Test
    public void testConstrutor() {
        Disciplina disciplina = new Disciplina("Metodos Avançados em Programação", "MAP001", 60);
        Turma turma = new Turma(1, disciplina, "B104", "Terca 11h-13h");
        assertEquals(1, turma.getId());
        assertEquals(disciplina, turma.getDisciplina());
        assertEquals("B104", turma.getSala());
        assertEquals("Terca 11h-13h", turma.getHorario());
    }

   
}
