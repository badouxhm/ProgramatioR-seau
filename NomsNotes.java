import java.util.Scanner;

public class NomsNotes {
    // 1
    public static int trouveIndice(String nom, String[] tNom) {
        for (int i = 0; i < tNom.length; i++) {
            if (tNom[i].equals(nom)) {
                return i;
            }
        }
        return -1;
    }

    // 2
    public static int trouveNote(String nom, String[] tNom, int[] tNote) {
        int indice = trouveIndice(nom, tNom);
        if (indice != -1) {
            return tNote[indice];
        } else {
            return -1;
        }
    }

    // 3
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tNoms = { "Alice", "Bob", "Charlie", "David", "Emma","Ikram" };
        int[] tNotes = { 15, 12, 18, 10, 14 , 2000};

        System.out.println("Entrez le nom de l'etudiant :");
        String nom = scanner.nextLine();

        int note = trouveNote(nom, tNoms, tNotes);

        if (note != -1) {
            System.out.println("la note de l'etudiant " + nom + " est : " + note);
        } else {
            System.out.println("l'etudianr n'existe pas !");
        }

        scanner.close();
    }
}
