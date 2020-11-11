import assignments.Assignment;
import assignments.AssignmentList;

public class TestData {

  public AssignmentList getTestData(AssignmentList assignmentList) {
    Assignment assignment = new Assignment("Create landspeeder blueprint");
    assignment.setStart(10, 31, 2020);
    assignment.setDeadline(11, 11, 2020);
    assignmentList.add(assignment);

    assignment = new Assignment("Research required technology for landspeeder");
    assignment.setStart(04, 01, 2020);
    assignment.setDeadline(11, 11, 2020);
    assignmentList.add(assignment);

    assignment = new Assignment("Revise landspeeder blueprint.");
    assignment.setDeadline(3, 16, 2021);
    assignment.setStart(11, 23, 2020);
    assignmentList.add(assignment);

    assignment = new Assignment("Locate landspeeder parts.");
    assignment.setDeadline(9, 1, 2021);
    assignment.setStart(3, 1, 2021);
    assignmentList.add(assignment);

    assignment = new Assignment("Build landspeeder.");
    assignment.setDeadline(12, 15, 2021);
    assignment.setStart(10, 1, 2021);
    assignmentList.add(assignment);

    assignment = new Assignment("Test landspeeder.");
    assignment.setDeadline(3, 1, 2022);
    assignment.setStart(1, 2, 2022);
    assignmentList.add(assignment);

    assignment = new Assignment("Fix landspeeder issues.");
    assignment.setDeadline(4, 1, 2022);
    assignment.setStart(1, 2, 2022);
    assignmentList.add(assignment);

    return  assignmentList;
  }
}
