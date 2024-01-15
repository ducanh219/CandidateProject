

import java.util.ArrayList;
import java.util.Collections;

public class Algorithm {
    static ArrayList<Candidate> cnd_list = new ArrayList<>();

    public void createCandidate(int type) {
        System.out.println("Create new candidate:");
        boolean loop = true;
        do {
            String id;
            boolean invalid = false;
            do {
                id = Library.getInt("Enter id: ");
                if (cnd_list.size() >= 1) {
                    for (Candidate cnd : cnd_list) {
                        if (cnd.getId() == Integer.parseInt(id)) {
                            invalid = true;
                            System.out.println("This id has already existed!");
                            break;
                        }
                    }
                }
            } while (invalid);
            String firstname = Library.GetString("Enter first name: ", false);
            String lastname = Library.GetString("Enter last name: ", false);
            String address = Library.GetString("Enter address: ", false);
            String phone = Library.getPhone("Enter phone number: ");
            String email = Library.getEmail("Enter email: ");
            String birthdate = Library.getDate("Enter birth date: ");
            Candidate cnd = new Candidate(Integer.parseInt(id), firstname, lastname, birthdate, address, email, type,
                    phone);
            switch (type) {
                case 0:
                    createExperience(cnd);
                    break;
                case 1:
                    createFresher(cnd);
                    break;
                case 2:
                    createIntern(cnd);
                    break;
            }
            if (Library.GetYesNo("Do you want to continue (Y/N)? ") == false) {
                loop = false;
                System.out.println();
            }
        } while (loop);
        System.out.println("Candidate created: ");
        for (Candidate cnd : cnd_list) {
            cnd.toString();
        }
        System.out.println();
    }

    public static void createExperience(Candidate cnd) {
        System.out.println("Input informations of a experience candiate: ");
        String yearExp = Library.getYear("Enter year of experience: ");
        String proskill = Library.GetString("Enter professional skill: ", false);
        cnd_list.add(new Experience(cnd.getId(), cnd.getfName(), cnd.getlName(), cnd.getDayOfBirth(), cnd.getAddress(),
                cnd.getEmail(), cnd.getType(), cnd.getPhoneNumber(), yearExp, proskill));
        System.out.println("Create experience candiate successfully!");
    }

    public static void createFresher(Candidate cnd) {
        System.out.println("Input informations of a fresher candiate: ");
        String graduate_date;

        graduate_date = Library.getDate("Enter graduated time: ");

        String graduate_rank = Library.getRank("Enter rank of graduation: ");
        String uni_edu = Library.GetString("Enter university graduated from: ", false);
        cnd_list.add(
                new FresherCandidate(cnd.getId(), cnd.getfName(), cnd.getlName(), cnd.getDayOfBirth(), cnd.getAddress(),
                        cnd.getEmail(), cnd.getType(), cnd.getPhoneNumber(), graduate_date, graduate_rank, uni_edu));
        System.out.println("Create fresher candiate successfully!");
    }

    public static void createIntern(Candidate cnd) {
        System.out.println("Input informations of a intern candiate: ");
        String majors = Library.GetString("Enter majors: ", false);
        String semester = Library.getInt("Enter semester: ");
        String uni_name = Library.GetString("Enter university studying: ", false);
        cnd_list.add(new InternCandidate(cnd.getId(), cnd.getfName(), cnd.getlName(), cnd.getDayOfBirth(),
                cnd.getAddress(), cnd.getEmail(), cnd.getType(), cnd.getPhoneNumber(), majors, semester, uni_name));
        System.out.println("Create intern candiate successfully!");
    }

    public static void displayClassifiedCandidate(){
        int id=0;
        String firstname="", lastname="", address="", phone="", email="";
        String birthDate="";
        int typeCandidate=0;
        Candidate cnd_cmp = new Candidate(id, firstname, lastname, birthDate, address, email, typeCandidate, phone);
        Collections.sort(cnd_list, cnd_cmp);
        System.out.println("===========EXPERIENCE CANDIDATE============");
        for(Candidate cnd : cnd_list){
            if(cnd instanceof Experience)
                System.out.println(cnd.getfName()+" "+cnd.getlName());
        }
        System.out.println("==========FRESHER CANDIDATE==============");
        for(Candidate cnd : cnd_list){
            if(cnd instanceof FresherCandidate)
                System.out.println(cnd.getfName()+" "+cnd.getlName());
        }
        System.out.println("===========INTERN CANDIDATE==============");
        for(Candidate cnd : cnd_list){
            if(cnd instanceof InternCandidate)
                System.out.println(cnd.getfName()+" "+cnd.getlName());
        }
        System.out.println();
    }

    public static void searchCandidate() {
        displayClassifiedCandidate();
        int id = 0;
        String firstname = "", lastname = "", address = "", phone = "", email = "";
        String birthDate = "";
        int typeCandidate = 0;
        Candidate cnd_cmp = new Candidate(id, firstname, lastname, birthDate, address, email, typeCandidate, phone);
        Collections.sort(cnd_list, cnd_cmp);
        String searchName = Library.GetString("Input Candidate name (First name or Last name): ", false);
        int input_type = Library.getCandidateType("Input type of candidate: ");
        boolean exist = false;
        System.out.println("The candidates found:");
        for (Candidate cnd : cnd_list) {
            if ((cnd.getfName().contains(searchName) || cnd.getlName().contains(searchName))
                    && cnd.getType() == input_type) {
                System.out.println(
                        cnd.getfName() + " " + cnd.getlName() + " | " + cnd.getDayOfBirth() + " | " + cnd.getAddress()
                                + " | " + cnd.getPhoneNumber() + " | " + cnd.getEmail() + " | " + cnd.getType());
                exist = true;
            }
        }
        if (exist == false)
            System.out.println("The candidate do not exist!");
    }
}
