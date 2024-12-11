import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);


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
            int choice = SC.nextInt();
            switch (choice){
                case 1 :


            }


        }

    }
    public static void addition(double  a,double b){

        System.out.println("adition : " + a+b);
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
        System.out.println("Puissance : ");
    }
    public static void Racine_carrée(double a , double b){

        System.out.println("Racine_carrée : ");
    }
    public static void Factorielle(double a , double b){
        System.out.println("Factorielle : ");
    }
}