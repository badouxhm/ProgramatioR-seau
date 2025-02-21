import java.util.Scanner;

public class Palindrome {
    public static boolean estPalindrome(String mot){
        int taille = mot.length();
        for (int i=0; i<taille/2; i++){
            if (mot.charAt(i) != mot.charAt(taille-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez un mot:");
        String mot = scanner.nextLine();

        if(estPalindrome(mot)){
            System.out.println("Votre mot est un palindrome !");
        }else{
            System.out.println("Votre mot n'est pas un palindrome !");
        }

        scanner.close();
    }
}
