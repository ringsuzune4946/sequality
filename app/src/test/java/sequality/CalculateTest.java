package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testAve() {
    Calculate calculate = new Calculate();
    double expected = 2.5;
    assertEquals(expected, calculate.ave(2, 3), 0.0);
  }

  @Test
  public void testToSum() {
    Calculate calculate = new Calculate();
    int expected = 55;
    assertEquals(expected, calculate.toSum(1, 10));
  }

  @Test
  public void testToAve() {
    Calculate calculate = new Calculate();
    double expected = 5.5;
    assertEquals(expected, calculate.toAve(1, 10), 0.0);
  }

  @Test
  public void testOddToSum() {
    Calculate calculate = new Calculate();
    int expected = 25;
    assertEquals(expected, calculate.oddToSum(1, 10));
  }

  @Test
  public void testEvenToSum() {
    Calculate calculate = new Calculate();
    int expected = 30;
    assertEquals(expected, calculate.evenToSum(1, 10));
  }

  @Test
  public void testCheckOdd() {
    Calculate calculate = new Calculate();
    for (int i = 1; i <= 10; i++) {
      switch (i) {
        case 1:
          assertEquals(true, calculate.checkOdd(1));
          break;
        case 2:
          assertEquals(false, calculate.checkOdd(2));
          break;
        case 3:
          assertEquals(true, calculate.checkOdd(3));
          break;
        case 4:
          assertEquals(false, calculate.checkOdd(4));
          break;
        case 5:
          assertEquals(true, calculate.checkOdd(5));
          break;
        case 6:
          assertEquals(false, calculate.checkOdd(6));
          break;
        case 7:
          assertEquals(true, calculate.checkOdd(7));
          break;
        case 8:
          assertEquals(false, calculate.checkOdd(8));
          break;
        case 9:
          assertEquals(true, calculate.checkOdd(9));
          break;
        case 10:
          assertEquals(false, calculate.checkOdd(10));
          break;
      }
    }
  }
}
