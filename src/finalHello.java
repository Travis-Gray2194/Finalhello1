import java.util.Scanner;

public class finalHello {


    public static void main(String[] args)
    {
        String fname,lname,language;
        System.out.println("Please Enter your First name :");

        Scanner scan = new Scanner (System.in);
        fname= scan.nextLine ();


        System.out.println("Please Enter your Last name :");

        scan = new Scanner (System.in);
        lname= scan.nextLine ();
        //Calling method helloname first and last name
        helloName( fname,lname );

    }

    //Second Method printing out statements first and last name with Hello in different languages
    public static void helloName(String fname,String lname)
    {

        System.out.println("English: Hello, "+ fname+"!");
        System.out.println("Your first name: "+fname);
        System.out.println("Your last name: "+lname);
        System.out.println();

        System.out.println("French: Bonjour, "+ fname+"!");
        System.out.println("Votre prenom: "+fname);
        System.out.println("Votre nom: "+lname);
        System.out.println();

        System.out.println("Twi: Mahai, "+ fname+"!");
        System.out.println("Wo din: "+fname);
        System.out.println("Wo Papa din: "+lname);
        System.out.println();

        System.out.println("Afaanoromo: Akam, "+ fname+"!");
        System.out.println("Maqaankee: "+fname);
        System.out.println("Maqaan akaaka keti: "+lname);
        System.out.println();

    }

}