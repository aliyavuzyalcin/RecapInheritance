public class StudentManager extends UserManager {


    public void addUser(Student student) {
        System.out.println("New student has been added! Details : " + "\nID : " + student.getUserId()
                + "\nName : " + student.getName() + "\nSurname : " + student.getSurname());
    }

    public void addComment(Student student){
        System.out.println(student.getUserId() + " has shared a new comment!");
    }

    public void addAddress(Student student){
        System.out.println("New address added! : " + student.getAddress());
    }

    public void addContact(Student student){
        System.out.println("New contact info added! : " + student.getContact());
    }

    public void addCardNumber(Student student){
        System.out.println("New card added! : " + student.getCardInfo());
    }

    public void registerNewCourse(Instructor instructor){
        System.out.println("Registered new course of " + instructor.getName() + " " + instructor.getSurname());
    }
}
