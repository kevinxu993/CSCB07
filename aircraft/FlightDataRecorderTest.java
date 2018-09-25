package aircraft;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;

public class FlightDataRecorderTest {

  FlightDataRecorder fdr = new FlightDataRecorder();

  @Before
  public void setup() {}

  @Test
  public void testAverageWithNoElement() {
    double actualOutput = fdr.average();
    double expectation = 0.0;
    assertEquals(expectation, actualOutput, 0);
  }

  @Test
  public void testAverageWithOneElement() {
    fdr.record(2.0);
    double actualOutput = fdr.average();
    double expectation = 2.0;
    assertEquals(expectation, actualOutput, 0);
  }

  @Test
  public void testRecord() {
    fdr.record(1.0);
    double actualOutput = fdr.getRecordedData().get(0);
    double expectation = 1.0;
    assertEquals(expectation, actualOutput, 0);
  }

  @Test
  public void testRecordWithMoreThanTen() {
    fdr.record(1.0);
    fdr.record(2.0);
    fdr.record(3.0);
    fdr.record(4.0);
    fdr.record(5.0);
    fdr.record(6.0);
    fdr.record(7.0);
    fdr.record(8.0);
    fdr.record(9.0);
    fdr.record(10.0);
    fdr.record(11.0);
    String actualOutput = fdr.getRecordedData().toString();
    String expectation =
        "[1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0]";
    assertEquals(expectation, actualOutput);
  }

  @Test
  public void testGetLastDataPoints() {
    fdr.record(1.0);
    fdr.record(2.0);
    fdr.record(3.0);
    fdr.record(4.0);
    fdr.record(5.0);
    double actualOutput1 = fdr.getLastDataPoints(5).get(0);
    double expectation1 = 5.0;
    double actualOutput2 = fdr.getLastDataPoints(2).get(1);
    double expectation2 = 4.0;
    assertEquals(expectation1, actualOutput1, 0);
    assertEquals(expectation2, actualOutput2, 0);
  }

  @Test
  public void testGetRecordedData() {
    fdr.record(1.0);
    fdr.record(2.0);
    fdr.record(3.0);
    List<Double> actualOutput = fdr.getRecordedData();
    List<Double> expectation = new ArrayList<Double>(3);
    expectation.add(1.0);
    expectation.add(2.0);
    expectation.add(3.0);
    assertEquals(expectation, actualOutput);
  }

  @Test
  public void testAll() {
    fdr.record(1.0);
    fdr.record(2.0);
    fdr.record(3.0);
    fdr.record(4.0);
    fdr.record(5.0);
    double actualOutput1 = fdr.getLastDataPoints(5).get(0);
    double expectation1 = 5.0;
    fdr.record(6.0);
    String actualOutput2 = fdr.getRecordedData().toString();
    System.out.println(actualOutput2);
    String expectation2 = "[1.0, 2.0, 3.0, 4.0, 5.0, 6.0]";
    assertEquals(expectation1, actualOutput1, 0);
    assertEquals(expectation2, actualOutput2);
  }

}
// Bug 1: record() cannot add more than 10 data
// Bug 2: average() divides the total value by the capacity 10, leading to a
// wrong result.
// Bug 3: getLastDataPoints() doesn't return correct list when getting called
// more than once.
// Bug 4: record() cannot add new data to correct index, and getRecordedData()
// cannot return correct list, after getLastDataPoints() is called
