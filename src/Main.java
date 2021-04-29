public class Main {

    public static void main(String[] args) {


        Instructor instructor1 = new Instructor("Engin","Demiroğ","10 yılı aşkın tecrübe...");
        instructor1.setUserId(1524654);
        System.out.println("Eğitmen ID : " + instructor1.getUserId());


        System.out.println("******************************************************");

        Student student1 = new Student("Yavuz","Yalçın");
        student1.setUserId(75468544);
        student1.setAddress("İSTANBUL");
        student1.setCardInfo("12354654835787");
        student1.setContact("abc@gmail.com");
        System.out.println("Öğrenci ID : " + student1.getUserId());

        System.out.println();
        System.out.println("*********************ADD INSTRUCTOR************************");
        System.out.println();

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.addUser(instructor1);
        instructorManager.login(instructor1);
        instructorManager.announcement(instructor1);
        instructorManager.assignHomework(instructor1);
        instructorManager.openClass(instructor1);
        instructorManager.logout();

        System.out.println();
        System.out.println("*********************ADD STUDENT***************************");
        System.out.println();

        StudentManager studentManager = new StudentManager();
        studentManager.addUser(student1);
        studentManager.login(student1);
        studentManager.addAddress(student1);
        studentManager.addCardNumber(student1);
        studentManager.addComment(student1);
        studentManager.addContact(student1);
        studentManager.registerNewCourse(instructor1);
        studentManager.logout();

        System.out.println();
        System.out.println("*********************MANAGE USERS**************************");
        System.out.println();
        UserManager userManager = new UserManager();
        userManager.updateUser(student1);
        userManager.deleteUser(instructor1);
        userManager.addUser(student1);
    }
}
