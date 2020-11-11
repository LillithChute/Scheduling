package assignments;

import java.util.ArrayList;
import java.util.List;

/**
 * A list of task that need to be completed.
 */
public class AssignmentList {

  private List<Assignment> tasks;
  private String ordering;

  /** Default constructor. */
  public AssignmentList() {
    tasks = new ArrayList<>();
    ordering = "assigned";
  }

  /**
   * Used to schedule the items in its task list.
   *
   * @param strategy
   */
  public void scheduleAssignments(SchedulingStrategy strategy) {
    if (strategy == null) {
      throw new IllegalArgumentException("No scheduling strategy provided.");
    }

    if (this.tasks.size() < 1) {
      throw new IllegalArgumentException("There are no tasks to be scheduled.");
    }

    this.ordering = strategy.schedule(this.tasks);
  }

  /**
   * Add a task to the task list.
   * 
   * @param t the task
   */
  public void add(Assignment t) {
    tasks.add(t);
  }

  @Override
  public String toString() {
    StringBuffer sb = new StringBuffer("Ordered by ");
    sb.append(ordering);
    sb.append("\n");
    for (int i = 0 ; i < tasks.size() ; i++) {
      sb.append(i + 1);
      sb.append(" -- ");
      sb.append(tasks.get(i));
      sb.append("\n");
    }
    return sb.toString();
  }
}
