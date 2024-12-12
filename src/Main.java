import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        while (true) {
            System.out.println("------------Colculator Programm----------- ");
            System.out.println("1_Addition (+)\n");
            System.out.println("2_Soustraction (-)\n");
            System.out.println("3_Multiplication (*)\n");
            System.out.println("4_Division (/)\n");
            System.out.println("5_Puissance \n");
            System.out.println("6_Racine carrée \n");
            System.out.println("7_Factorielle \n");
            System.out.println("8_Quiter\n");
            System.out.println("---------------------------------");
            System.out.println("entrer votre choix : \n");
            Scanner SC = new Scanner(System.in);
            int choice;
            choice = SC.nextInt();
            switch (choice){
                case 1:
                    addition(saisir(),saisir());
                    break;
                case 2:
                    soustraction(saisir(),saisir());
                    break;
                case 3:
                    Multiplication(saisir(),saisir());
                    break;
                case 4:
                    Division(saisir(),saisir());
                     break;
                case 5 :
                    Puissance(saisir(),saisir());
                    break;
                case 6 :
                    Racine_carrée(saisir());
                    break;
                case 7 :
                      Factorielle(saisir());
                case 8 :
                    return;
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }


        }

    }
    public static int saisir(){
        Scanner SC = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre :");
        return SC.nextInt();
    }
    public static void addition(double  a,double b){

        System.out.println("adition : " + (a+b));
    }
    public static void soustraction(double a , double b){

        System.out.println("soustraction : " + (a-b));
    }
    public static void Multiplication(double a , double b){

        System.out.println("Multiplication : " + a*b);
    }
    public static void Division(double a , double b){

        System.out.println("Division : " + a/b);
    }
    public static void Puissance(double a , double b){

        System.out.println("Puissance : "+( Math.pow(a, b)));
    }
    public static void Racine_carrée(double a ){
        System.out.println("Racine_carrée : "+ Math.sqrt(a));
    }
    public static void Factorielle(double a ){
         int fact = 1;
         if (a==1 || a==0) {
             fact = 1;
         }
         else {
             for (int i = 2 ; i<=a;i++){
                 fact = fact * i;
             }
         }


        System.out.println("Factorielle : "+fact);

    }
}