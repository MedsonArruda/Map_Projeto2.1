package test;
import org.junit.jupiter.api.Test;
import professor.Professor;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

class ProfessorTest {
    
    private Professor professor;
    
    @BeforeEach
    public void setup() {
        professor = new Professor("Yoseef", "3333333");
    }   

    @Test
    public void testGetterSetter() {
        professor.setId("123124");
        assertEquals("123124", professor.getId());
    }

    @Test
    public void testConstrutor() {
        assertEquals("Yoseef", professor.getNome());
        assertEquals("3333333", professor.getId());
    }

}
