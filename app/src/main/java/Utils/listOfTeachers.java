package Utils;

public class listOfTeachers {
    private String facultyName;
    private int facultyID;
    private String facultySubject;
    private int facultyImage;

    public listOfTeachers(String facultyName, int facultyID, String facultySubject, int facultyImage) {
        this.facultyName = facultyName;
        this.facultyID = facultyID;
        this.facultySubject = facultySubject;
        this.facultyImage = facultyImage;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public int getFacultyID() {
        return facultyID;
    }

    public void setFacultyID(int facultyID) {
        this.facultyID = facultyID;
    }

    public String getFacultySubject() {
        return facultySubject;
    }

    public void setFacultySubject(String facultySubject) {
        this.facultySubject = facultySubject;
    }

    public int getFacultyImage() {
        return facultyImage;
    }

    public void setFacultyImage(int facultyImage) {
        this.facultyImage = facultyImage;
    }
}
