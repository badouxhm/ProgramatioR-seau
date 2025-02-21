import java.util.ArrayList;

public class ArrayListes {
    public static void main(String[] args){

        //1
        ArrayList<String> languages= new ArrayList<>();
        languages.add("PHP");
        languages.add("Java");
        languages.add("C++");
        languages.add("Python");

        System.out.println("Liste initiale : " + languages);

        //2
        System.out.println("parcours de la List :");
        for (String language : languages){
            System.out.println(language);
        }

        //3
        languages.add(0,"Pascal");
        System.out.println("Liste aprés l'insertion de Pascal en premiere position : " + languages);

        //4
        String TroisiemeElement = languages.get(2);
        System.out.println("Le troisieme element de la liste est : " + TroisiemeElement);

        //5 
        languages.set(2, "COBOL");
        System.out.println("Liste apres MAJ du 3eme element : " + languages);

        //6
        languages.remove(2);
        System.out.println("Liste apres supression de 3eme element : " + languages);
    }
}
