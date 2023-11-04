import java.security.SecureRandom;
import java.util.Scanner;

public class PwdGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la longueur du mot de passe : ");
        int length = scanner.nextInt();
        scanner.close();

        if (length <= 0) {
            System.out.println("Longueur de mot de passe invalide.");
            return;
        }

        String password = generatePwd(length);
        System.out.println("Mot de passe généré : " + password);
    }

    public static String generatePwd(int length) {
        String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+[]{}|;:,.<>?";
        SecureRandom random = new SecureRandom();

        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(charset.length());
            password.append(charset.charAt(randomIndex));
        }

        return password.toString();
    }
}
