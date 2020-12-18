import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test Class for the AdminWorker class
 */

public class AdminWorkerTest {
    private AdminWorker adminworkerValid, adminworkerInvalid;

    @Before
    public void setUp() throws Exception {
        adminworkerValid = new AdminWorker("John", "Sheridan", "1234567xx", 2);
        adminworkerInvalid = new AdminWorker("Jeffery", "Sinclar", "xx34567qq", 8);
    }

    @Test
    public void testConstructor() {
        assertEquals(2, adminworkerValid.getGrade());
        assertEquals(1, adminworkerInvalid.getGrade());
    }

    @Test
    public void setGrade() {
        assertEquals(2, adminworkerValid.getGrade());
        adminworkerValid.setGrade(1);
        assertEquals(1, adminworkerValid.getGrade());
        adminworkerValid.setGrade(0);
        assertEquals(1, adminworkerValid.getGrade());
        adminworkerValid.setGrade(3);
        assertEquals(3, adminworkerValid.getGrade());
        adminworkerValid.setGrade(8);
        assertEquals(3, adminworkerValid.getGrade(), 0.01);
    }

    @Test
    public void calculateSalary() {
        assertEquals(1600.0, adminworkerValid.calculateSalary(), 0.01);
        assertEquals(900, adminworkerInvalid.calculateSalary(), 0.01);
    }

    @Test
    public void testEquals() {
        assertTrue(adminworkerValid.equals(adminworkerValid));
        AdminWorker otherAdminWorker = new AdminWorker("John", "Sheridan", "1234567xx", 2);
        assertTrue(adminworkerValid.equals(otherAdminWorker));
        otherAdminWorker.setGrade(1);
        assertFalse(adminworkerValid.equals(otherAdminWorker));
    }

    @Test
    public void testToString() {
        assertTrue(adminworkerValid.toString().contains("John"));
        assertTrue(adminworkerValid.toString().contains("1234567xx"));
        assertTrue(adminworkerValid.toString().contains("2"));

    }
}