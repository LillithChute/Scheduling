import org.junit.Before;
import org.junit.Test;

import assignments.AssignedSchedulingStrategy;
import assignments.AssignmentList;
import assignments.SchedulingStrategy;

import static org.junit.Assert.assertEquals;

public class TestAssignedSchedulingStrategy {

  private AssignmentList assignmentList;
  private SchedulingStrategy strategy;

  /**
   * Setup the necessary values.
   */
  @Before
  public void setup() {
    TestData data = new TestData();
    assignmentList = new AssignmentList();
    assignmentList = data.getTestData(assignmentList);
    strategy = new AssignedSchedulingStrategy();

  }

  @Test
  public void DeadlineSchedulingStrategyTest() {
    assignmentList.scheduleAssignments(strategy);
    assertEquals("Ordered by assigned\n"
            + "1 -- Create landspeeder blueprint, starting 2020-10-31, ending 2020-11-11\n"
            + "2 -- Research required technology for landspeeder, starting 2020-04-01, ending 2020-11-11\n"
            + "3 -- Revise landspeeder blueprint., starting 2020-11-23, ending 2021-03-16\n"
            + "4 -- Locate landspeeder parts., starting 2021-03-01, ending 2021-09-01\n"
            + "5 -- Build landspeeder., starting 2021-10-01, ending 2021-12-15\n"
            + "6 -- Test landspeeder., starting 2022-01-02, ending 2022-03-01\n"
            + "7 -- Fix landspeeder issues., starting 2022-01-02, ending 2022-04-01\n", assignmentList.toString());
  }
}
