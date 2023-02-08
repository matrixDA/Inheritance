import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    Worker p1, p2, p3;

    @BeforeEach
    void setUp()
    {
        p1 = new Worker("00000A", "Bob", "Tester1", "Mr.", 1955, 14);
        p2= new Worker("00000B", "Sally", "Tester2", "Ms.", 1975, 15);
        p3= new Worker("00000B", "Sally", "Tester2", "Ms.", 1975, 16);
    }

    @Test
    void getFirstName() {
        assertEquals("Bob", p1.getFirstName());
    }

    @Test
    void getLastName() {
        assertEquals("Tester1", p1.getLastName());
    }

    @Test
    void getTitle() {
        assertEquals("Mr.", p1.getTitle());
    }

    @Test
    void getYOB() {
        assertEquals(1955, p1.getYOB());
    }

    @Test
    void getHourlyPayRate() {
        assertEquals(14, p1.getHourlyPayRate());}

    @Test
    void setID() {
        p1.setID("00000B");
        assertEquals("00000B", p1.getID());
    }

    @Test
    void setFirstName() {
        p1.setFirstName("Sally");
        assertEquals("Sally", p1.getFirstName());
    }

    @Test
    void setLastName() {
        p1.setLastName("Tester2");
        assertEquals("Tester2", p1.getLastName());
    }

    @Test
    void setTitle(){
        p1.setTitle("Dr.");
        assertEquals("Dr.", p1.getTitle());
    }

    @Test
    void setYOB() {
        p1.setYOB(1975);
        assertEquals(1975, p1.getYOB());
    }
    @Test
    void setHourlyPayRate() {
        p1.setHourlyPayRate(19);
        assertEquals(19, p1.getHourlyPayRate());
    }
    @Test
    void equals() {
        p1.setID("00000B");
        p1.setFirstName("Sally");
        p1.setLastName("Tester2");
        p1.setTitle("Ms.");
        p1.setYOB(1975);
        p1.setHourlyPayRate(15);
        assertEquals(true, p1.equals(p2));
    }
}