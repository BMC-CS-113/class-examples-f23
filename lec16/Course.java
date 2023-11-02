//Adam Poliak
// 11/02/2023
// Course class
public class Course {

  int semester;
  String prof;
  String name;

  // empty Constructor
  public Course() {
    // creates the default object,
    // set the instance variables to what their default should be
    semester = 0;
    prof = "ProfName";
    name = "CourseName";
  }

  //value constructor
  public Course(int semNumber, String profName, String courseName) {
     semester = semNumber;
     prof = profName;
     name = courseName;
  }

  //getters
  public int getSemester() {
    return semester;
  }

  public String getProf() {
    return prof;
  }

  public String getName() {
    return name;
  }

  //setters/mutators
  public void setProf(String newProf) {
    prof = newProf;
  }

  public void setName(String newName) {
    name = newName;
  }

  public void setSemester(int sem) {
    semester = sem;
  }

  public String toString() {
     //specify a string representation of the object
     String output = "";
     output += "CourseName: " + name + "\n";
     output += "ProfName: "  + prof + "\n";
     output += "Semester " + semester;
     return output;
  }

  public static void main(String[] args) {
    Course irisCourse = new Course(1, "iris", "compsci");
    System.out.println(irisCourse.getSemester());
    System.out.println(irisCourse.getProf());
    System.out.println(irisCourse.getName());

    //override the prof's name
    irisCourse.setProf("olivia");
    System.out.println(irisCourse.getProf());
    
    Course defaultCourse = new Course();
    System.out.println(defaultCourse.getSemester());
    System.out.println(defaultCourse.getProf());
    System.out.println(defaultCourse.getName());

    System.out.println(defaultCourse);
    System.out.println(irisCourse);
  }
}
