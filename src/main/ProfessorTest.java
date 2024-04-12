package main;

import static org.junit.Assert.*;
import org.junit.Test;

import professor.Professor;

public class ProfessorTest {

    @Test
    public void testConstrutor() {
        Professor professor = new Professor("Julia", "2313213");
        assertEquals("Julia", professor.getNome());
        assertEquals("2313213", professor.getId());
    }

}
