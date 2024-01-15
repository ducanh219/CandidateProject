

public class Experience extends Candidate{
    private String explnYear;
    private String proSkills;
    
    public Experience(String fName, String lName, String dayOfBirth, String address, String email, int type,
            String phoneNumber, String explnYear, String proSkills) {
        super(fName, lName, dayOfBirth, address, email, type, phoneNumber);
        this.explnYear = explnYear;
        this.proSkills = proSkills;
    }
    public Experience(int candidateID, String fName, String lName, String dayOfBirth, String address, String email,
            int type, String phoneNumber, String explnYear, String proSkills) {
        super(candidateID, fName, lName, dayOfBirth, address, email, type, phoneNumber);
        this.explnYear = explnYear;
        this.proSkills = proSkills;
    }
    public String getExplnYear() {
        return explnYear;
    }
    public void setExplnYear(String explnYear) {
        this.explnYear = explnYear;
    }
    public String getProSkills() {
        return proSkills;
    }
    public void setProSkills(String proSkills) {
        this.proSkills = proSkills;
    }
    @Override
    public String toString() {
        return "Experience"+ super.toString()+" [explnYear=" + explnYear + ", proSkills=" + proSkills + "]";
    }
}
