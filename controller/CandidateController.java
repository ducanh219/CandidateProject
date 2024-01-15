
import java.util.Scanner;

public class CandidateController extends Menu {
    Scanner sc = new Scanner(System.in);
    static String[] mc = { "Experience", "Fresher", "Internship", "Searching", "Exit" };
    Library library = new Library();
    Algorithm algorithm = new Algorithm();

    public CandidateController() {
        super("Programig", mc);
    }

    public void execute(int n) {

        switch (n) {
            case 1:
                algorithm.createCandidate(n - 1);
                break;
            case 2:
                algorithm.createCandidate(n - 1);
                break;
            case 3:
                algorithm.createCandidate(n - 1);
                break;
            case 4:
                algorithm.searchCandidate();
                break;
            case 5:

                break;

        }

    }

}
