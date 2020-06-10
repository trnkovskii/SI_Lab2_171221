package SILab2;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.SpringLayout.Constraints;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExampleTest {

	@Test
	void testEveryBranch() {
	}
	
	@Test
	void testEveryPath() {
	}
	@Test
	public void testInvalidEmail() throws NoSuchFieldException {
	    email("Jackyahoo.com", false);
	}

	@Test
	public void testValidEmail() throws NoSuchFieldException {
	    email("jack@yahoo.com", true);
	}

	@Test
	public void testNoUpperCase() throws NoSuchFieldException {
	    email("Jack@yahoo.com", false);
	}
	 
	}
}
