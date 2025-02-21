public class Vecteur3d {
    private double x, y, z;
    //1
    public Vecteur3d(double a, double b, double c){
        this.x=a;
        this.y=b;
        this.z=c;
    }
    //2
    public void AfficherVect(){
        System.out.println("<"+ x +","+ y +","+ z +">");
    }
    //3
    public double Norme(){
        return(Math.sqrt(x*x + y*y + z*z));
    }
    //4
    public static Vecteur3d somme(Vecteur3d V1,Vecteur3d V2){
        return new Vecteur3d(V1.x+V2.x , V1.y+V2.y , V1.z+V2.z);
    }
    //5
    public double ProduitScalaire(Vecteur3d V){
        return (this.x*V.x + this.y*V.y + this.z*V.z);
    }
    //6
    public static void main (String[] args){
        Vecteur3d V1 = new Vecteur3d(1.2, 2.1, 3.1);
        Vecteur3d V2 = new Vecteur3d(4, 5, 6);

        System.out.print("Vecteur 1: ");
        V1.AfficherVect();
        System.out.print("Vecteur 2: ");
        V2.AfficherVect();

        System.out.println("La norme du Vecteur 1: "+V1.Norme());
        System.out.println("La norme du Vecteur 2: "+V2.Norme());

        Vecteur3d V3 = somme(V1, V2);
        System.out.print("La somme des deux Vecteurs : ");
        V3.AfficherVect();

        System.out.println("La produit scalaire des deux Vecteurs : " + V1.ProduitScalaire(V2));

    }
}
