package assignments;

import java.util.Comparator;
import java.util.List;

public class AssignedSchedulingStrategy implements SchedulingStrategy {

  @Override
  public String schedule(List<Assignment> assignmentList) {
    assignmentList.sort(Comparator.comparing(Assignment::getNumber));

    return "assigned";
  }
}
