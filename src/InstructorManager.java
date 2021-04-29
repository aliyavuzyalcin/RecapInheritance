public class InstructorManager extends UserManager {


    public void addUser(Instructor instructor) {
        System.out.println("Instructor has been added successfully. Details :\n" + "ID : " +  instructor.getUserId() + "\nName : " +
                instructor.getName() + "\nSurname : " + instructor.getSurname() + "\nAbout Instructor : "+ instructor.getInstructorCV());
    }

    public void assignHomework(Instructor instructor){
        System.out.println("Homework has been added by " + instructor.getName() + " " + instructor.getUserId());
    }

    public void announcement(Instructor instructor){
        System.out.println(instructor.getName() + " " + instructor.getSurname() + " added new announcement!");
    }

    public void openClass(Instructor instructor){
        System.out.println("New course has been added by " + instructor.getName() + " " + instructor.getSurname());
    }

}
