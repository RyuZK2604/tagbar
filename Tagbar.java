import java.util.Scanner;

public class Tagbar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] users = new String[10][2]; 
        int count = 0;
        boolean run = true;

        while (run) {
            System.out.println("\n==== LOGIN SYSTEM ====");
            System.out.println("[1] Login");
            System.out.println("[2] Register");
            System.out.println("[3] Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1: 
                
                    System.out.print("Username: ");
                    String u = sc.nextLine();
                    System.out.print("Password: ");
                    String p = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (users[i][0].equals(u) && users[i][1].equals(p)) {
                            System.out.println("Hello, " + u + "!");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Invalid username or password!");
                    }
                    break;

                case 2: 
                
                    System.out.print("Enter new username: ");
                    String newU = sc.nextLine();
                    boolean exists = false;

                    for (int i = 0; i < count; i++) {
                        if (users[i][0].equals(newU)) {
                            System.out.println("Username already exists!");
                            exists = true;
                            break;
                        }
                    }

                    if (!exists) {
                        System.out.print("Enter password: ");
                        String pass = sc.nextLine();
                        System.out.print("Confirm password: ");
                        String conf = sc.nextLine();

                        if (pass.equals(conf)) {
                            users[count][0] = newU;
                            users[count][1] = pass;
                            count++;
                            System.out.println("Registered successfully!");
                        } else {
                            System.out.println("Passwords do not match!");
                        }
                    }
                    break;

                case 3: 
                    System.out.println("Goodbye!");
                    run = false;
                    break;

                default: 
                    System.out.println("Invalid option!");
                    break;
            }
        }

        sc.close();
    }
}
