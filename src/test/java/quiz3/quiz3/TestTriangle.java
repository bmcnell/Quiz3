package quiz3.quiz3;

import static org.junit.Assert.*;

import org.junit.*;

public class TestTriangle {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	//valid triangle, with values entered as doubles
	@Test
	public void testPeri() throws TriangleException {
		Triangle tri1 = new Triangle(12.0,13.0,5.0);
		double peri1 = 30.0;
		assertEquals(peri1, tri1.getPerimeter(), 0);
	}
	
	//valid triangle, with values entered as ints
	@Test
	public void testArea() throws TriangleException {
		Triangle tri2 = new Triangle(3,4,5);
		double area1 = 6;
		assertEquals(area1,tri2.getArea(),0);
	}
	
	//invalid triangle
	@Test(expected=TriangleException.class)
	public void testTriangleException() throws TriangleException {
		Triangle badTri = new Triangle(0,8,17);
	}
}