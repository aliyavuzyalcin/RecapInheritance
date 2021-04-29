public class Instructor extends User {

    private String name;
    private String surname;
    private String instructorCV;

    public Instructor(){

    }

    public Instructor(String name, String surname, String instructorCV){
        this.name = name;
        this.surname = surname;
        this.instructorCV = instructorCV;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public void setUserId(int userId) {
        this.userId = getSurname().charAt(0) + userId;
    }

    public void setInstructorCV(String instructorCV) {
        this.instructorCV = instructorCV;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getInstructorCV() {
        return instructorCV;
    }

    @Override
    public int getUserId() {
        return userId;
    }
}
