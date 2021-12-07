import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IDocument doc;
        ICreateDocument create = new CreateTextDocument();
        Scanner scan = new Scanner(System.in);
        String cmd;
        boolean flag = true;
        while (flag) {
            cmd = scan.nextLine();
            switch (cmd){
                case "File":
                    System.out.println("Commands:\n 1. New\n 2. Open\n 3. Save\n 4. Exit");
                    break;
                case "New":
                    doc = create.createNew();
                    System.out.println("File has been created.");
                    break;
                case "Open":
                    doc = create.createOpen();
                    System.out.println("File has been opened.");
                    break;
                case "Save":
                    System.out.println("File has been saved.");
                    break;
                case "Exit":
                    flag = false;
                    break;
                default:
                    break;
            }
        }
    }
}
