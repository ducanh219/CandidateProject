

import java.util.Comparator;

public class Candidate implements Comparator<Candidate>{
    private int candidateID;
    private String fName;
    private String lName;
    private String dayOfBirth;
    private String address;
    private String email;
    private int type;
    private String phoneNumber;
    
    public Candidate(String fName, String lName, String dayOfBirth, String address, String email, int type,
            String phoneNumber) {
        this.fName = fName;
        this.lName = lName;
        this.dayOfBirth = dayOfBirth;
        this.address = address;
        this.email = email;
        this.type = type;
        this.phoneNumber = phoneNumber;
    }
    public Candidate(int candidateID, String fName, String lName, String dayOfBirth, String address, String email,
            int type, String phoneNumber) {
        this.candidateID = candidateID;
        this.fName = fName;
        this.lName = lName;
        this.dayOfBirth = dayOfBirth;
        this.address = address;
        this.email = email;
        this.type = type;
        this.phoneNumber = phoneNumber;
    }
    public int getCandidateID() {
        return candidateID;
    }
    public void setCandidateID(int candidateID) {
        this.candidateID = candidateID;
    }
    public String getfName() {
        return fName;
    }
    public void setfName(String fName) {
        this.fName = fName;
    }
    public String getlName() {
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }
    public String getDayOfBirth() {
        return dayOfBirth;
    }
    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getId() {
        return 0;
    }
    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "Candidate [candidateID=" + candidateID + ", fName=" + fName + ", lName=" + lName + ", dayOfBirth="
                + dayOfBirth + ", address=" + address + ", email=" + email + ", type=" + type + ", phoneNumber="
                + phoneNumber + "]";
    }
   
   
    @Override
    public int compare(Candidate cnd1, Candidate cnd2) {
        // TODO Auto-generated method stub
        return cnd1.getfName().compareTo(cnd2.getfName());
    }
}
