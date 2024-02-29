package se.lexicon;
import static org.junit.Assert.*;

import org.junit.Test;



public class AppTest {
    private final double testUserInput1 = 50;
    private final double testUserInput2 = 25;

    @Test
    public void additionWorksTest() {
        //Arrange
        double expectedResult = 75;

        //Act
        assertEquals(expectedResult, App.addition(testUserInput1,testUserInput2),0);
    }

    @Test
    public void subtractionWorksTest() {
        //Arrange
        double expectedResult = 25;

        //Act
        assertEquals(expectedResult,App.subtraction(testUserInput1,testUserInput2),0);
    }

    @Test
    public void multiplicationWorksTest() {
        //Arrange
        double expectedResult = 1250;

        //Act
        assertEquals(expectedResult, App.multiplication(testUserInput1,testUserInput2),0);
    }

    @Test
    public void divisionWorksTest() {
        //Arrange
        double expectedResult = 2;

        //Act
        assertEquals(expectedResult, App.division(testUserInput1,testUserInput2),0);
    }



}
