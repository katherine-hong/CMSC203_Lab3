import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	
	private GradeBook g1;
	private GradeBook g2;
	

	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		
		g1.addScore(94);
		g1.addScore(95);
		g2.addScore(88);
		g2.addScore(90);
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	@Test
	void testAddScore() {
		assertEquals(true, g1.addScore(94));
		assertEquals(true, g2.addScore(88));
	}

	@Test
	void testSum() {
		assertEquals(189, g1.sum(), .0001);
		assertEquals(178, g2.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(94, g1.minimum(), .001);
		assertEquals(88, g2.minimum(), .001);
	}

	@Test
	void testFinalScore() {
		assertEquals(95, g1.finalScore());
		assertEquals(90, g2.finalScore());
	}

	@Test
	void testGetScoreSize() {
		assertEquals(2, g1.getScoreSize());
		assertEquals(2, g2.getScoreSize());
	}

	@Test
	void testToString() {
		//fail("Not yet implemented");
		assertEquals("94.0 95.0 0.0 0.0 0.0 ", g1.toString());
		assertEquals("88.0 90.0 0.0 0.0 0.0 ", g2.toString());
	}

}
