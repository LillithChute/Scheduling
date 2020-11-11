package assignments;

import java.util.List;

/**
 * This is part of the strategy pattern.  It takes in a list and is allowed the
 * following operations.
 */
public interface SchedulingStrategy {

  /**
   * This takes a list of assignments and returns the type of scheduling.
   *
   * @param assignmentList A list of assignments.
   * @return The type of scheduling used.
   * @throws IllegalArgumentException if the task list is null.
   */
  String schedule(List<Assignment> assignmentList) throws IllegalArgumentException;
}
