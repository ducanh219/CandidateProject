

public class InternCandidate extends Candidate{

    private String major;
    private String semester;
    private String universityName;
    
    public InternCandidate(String fName, String lName, String dayOfBirth, String address, String email, int type,
            String phoneNumber, String major, String semester, String universityName) {
        super(fName, lName, dayOfBirth, address, email, type, phoneNumber);
        this.major = major;
        this.semester = semester;
        this.universityName = universityName;
    }
    public InternCandidate(int candidateID, String fName, String lName, String dayOfBirth, String address, String email,
            int type, String phoneNumber, String major, String semester, String universityName) {
        super(candidateID, fName, lName, dayOfBirth, address, email, type, phoneNumber);
        this.major = major;
        this.semester = semester;
        this.universityName = universityName;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public String getSemester() {
        return semester;
    }
    public void setSemester(String semester) {
        this.semester = semester;
    }
    public String getUniversityName() {
        return universityName;
    }
    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
    @Override
    public String toString() {
        return "InternCandidate"+super.toString() +" [major="+ major + ", semester=" + semester + ", universityName=" + universityName
                + "]" ;
    }
    
}
