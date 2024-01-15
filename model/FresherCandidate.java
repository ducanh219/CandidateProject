

public class FresherCandidate extends Candidate{
    private String graduatedDate;
    private String graduatedRank;
    private String education;
    
    public FresherCandidate(String fName, String lName, String dayOfBirth, String address, String email, int type,
            String phoneNumber, String graduatedDate, String graduatedRank, String education) {
        super(fName, lName, dayOfBirth, address, email, type, phoneNumber);
        this.graduatedDate = graduatedDate;
        this.graduatedRank = graduatedRank;
        this.education = education;
    }
    public FresherCandidate(int candidateID, String fName, String lName, String dayOfBirth, String address,
            String email, int type, String phoneNumber, String graduatedDate, String graduatedRank, String education) {
        super(candidateID, fName, lName, dayOfBirth, address, email, type, phoneNumber);
        this.graduatedDate = graduatedDate;
        this.graduatedRank = graduatedRank;
        this.education = education;
    }
    public String getGraduatedDate() {
        return graduatedDate;
    }
    public void setGraduatedDate(String graduatedDate) {
        this.graduatedDate = graduatedDate;
    }
    public String getGraduatedRank() {
        return graduatedRank;
    }
    public void setGraduatedRank(String graduatedRank) {
        this.graduatedRank = graduatedRank;
    }
    public String getEducation() {
        return education;
    }
    public void setEducation(String education) {
        this.education = education;
    }
    @Override
    public String toString() {
        return "FresherCandidate " + super.toString()+"[graduatedDate=" + graduatedDate + ", graduatedRank=" + graduatedRank + ", education="
                + education + "]";
    }
}
