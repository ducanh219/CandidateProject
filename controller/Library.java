
import java.util.Scanner;
import java.util.regex.Pattern;

public class Library {
    public int getInt(String condition, int m, int n) {
        int a = -1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(condition + ": ");
            try {
                String s = sc.nextLine();
                a = Integer.parseInt(s);
                if (a >= m && a <= n) {
                    return a;
                }
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Check your input");
            }
        }
    }

    public static boolean GetYesNo(String msg) {
        String s = "";
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        do {
            System.out.print(msg);
            try {
                s = sc.next("[yn]");
                loop = false;
            } catch (Exception e) {
                System.out.println(e);
                sc.nextLine();
            }
        } while (loop);
        if (s.charAt(0) == 'y')
            return true;
        else
            return false;
    }

    public static String GetString(String msg, boolean isEmpty) {
        String s = "";
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        do {
            System.out.print(msg);
            try {
                s = sc.nextLine();
                if (isEmpty)
                    loop = false;
                else if (!s.isEmpty())
                    loop = false;
            } catch (Exception e) {
                System.out.println(e);
                sc.nextLine();
            }
        } while (loop);
        System.out.println();
        return s.trim();
    }

    public static String getInt(String msg) {
        String i = "";
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        do {
            System.out.print(msg);
            try {
                int a = Integer.parseInt(sc.nextLine());
                if (a <= 0) {
                    System.out.println("Invalid input!");
                    loop = true;
                } else {
                    i = String.valueOf(a);
                    loop = false;

                }
            } catch (NumberFormatException e) {
                System.out.println("Need number format!");
                sc.nextLine();
            }
        } while (loop);
        System.out.println();
        return i;
    }

    public static String getDate(String msg) {
        String i = "";
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        do {
            System.out.println(msg);
            try {
                i = sc.nextLine();
                if (Integer.parseInt(i) >= 1900 && Integer.parseInt(i) <= 2023)
                    loop = false;
                else
                    System.out.println("Invalid date!");
            } catch (NumberFormatException e) {
                System.out.println("Invalid date!");
                sc.nextLine();
            }
        } while (loop);
        System.out.println();
        return i;
    }

    public static String getPhone(String msg) {
        String phone;
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        do {
            boolean isNumber = true;
            int count = 0;
            System.out.println(msg);
            phone = sc.nextLine();
            if (phone == null) {
                System.out.println("Invalid input!");
                continue;
            }
            for (char ch : phone.toCharArray()) {
                if (!Character.isDigit(ch)) {
                    isNumber = false;
                    break;
                }
                count++;
            }
            if (isNumber == true && count >= 10)
                loop = false;
            else
                System.out.println("Invalid phone number!");
        } while (loop);
        System.out.println();
        return phone;
    }

    public static String getEmail(String msg) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
        Pattern pat = Pattern.compile(emailRegex);
        String email;
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        do {
            System.out.println(msg);
            email = sc.nextLine();
            if (email == null) {
                System.out.println("Invalid input!");
                continue;
            }
            if (pat.matcher(email).matches())
                loop = false;
            else
                System.out.println("Invalid email!");
        } while (loop);
        System.out.println();
        return email;
    }

    public static String getYear(String msg) {
        String i = "";
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        do {
            System.out.println(msg);
            try {
                int a = Integer.parseInt(sc.nextLine());
                if (a >= 0 && a <= 100) {
                    i = String.valueOf(a);
                    loop = false;
                } else
                    System.out.println("Year of Experience must be from 0 to 100");
            } catch (NumberFormatException e) {
                System.out.println("Invalid number of year!");
                sc.nextLine();
            }
        } while (loop);
        System.out.println();
        return i;
    }

    public static String getRank(String msg) {
        String rank;
        Scanner sc = new Scanner(System.in);
        String rank_type = "[Ee]xcellence|[Gg]ood|[Ff]air|[Pp]oor";
        boolean loop = true;
        do {
            System.out.println(msg);
            rank = sc.nextLine();
            if (rank == null) {
                System.out.println("Invalid input!");
                continue;
            }
            if (rank.matches(rank_type))
                loop = false;
            else
                System.out.println("Invalid rank!");
        } while (loop);
        System.out.println();
        return rank;
    }

    public static int getCandidateType(String msg) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        do {
            System.out.println(msg);
            try {
                i = Integer.parseInt(sc.nextLine());
                if (i >= 0 && i <= 2)
                    loop = false;
            } catch (NumberFormatException e) {
                System.out.println("Invalid type! Please input from 0 to 2!");
                sc.nextLine();
            }
        } while (loop);
        System.out.println();
        return i;
    }
}
