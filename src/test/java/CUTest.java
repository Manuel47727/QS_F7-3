import org.example.CU;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CUTest {

    private CU cu;

    @BeforeEach
    public void setUp() {
        cu = new CU();
        cu.insertMarkCU(1000, 18);
        cu.insertMarkCU(2000, 8);
    }

    @Test
    public void insertMarkCUTest() {
        cu.insertMarkCU(3000, 10);
        cu.insertMarkCU(4000, 16);
        assertEquals(4, cu.marksSize());
    }

    @Test
    public void searchStudentTest() {
        double mark1 = cu.searchStudent(1000);
        double mark2 = cu.searchStudent(2000);

        assertEquals(mark1, 18);
        assertEquals(mark2, 8);
    }

    @Test
    public void averageUCTest() {
        double averageMarks = cu.averageCU();

        assertEquals(13, averageMarks);
    }

    @Test
    public void isApprovedTest() {
        assertEquals(true, cu.isApproved(1000));
        assertEquals(false, cu.isApproved(2000));
    }

}
