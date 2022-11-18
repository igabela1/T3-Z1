package ba.unsa.etf.rpr;


import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        int izbor;
        System.out.println("Unesite izbor za aplikaciju imenik: unesi 1.za unos novog broja u imenik");
        Scanner ulaz = new Scanner(System.in);
        izbor = ulaz.nextInt();
        if (izbor == 1) {
            ulaz.nextLine();
            System.out.println("Unesi ime: ");
            String ime = new String();
            ime = ulaz.nextLine();
            System.out.println("Unesi broj za mrezu: ");
            int broj = 0;
            broj = ulaz.nextInt();
            ulaz.nextLine();
            System.out.println("Unesi broj telefona: ");
            String broj1 = new String();
            broj1 = ulaz.nextLine();
            ulaz.nextLine();
            MobilniBroj novi = new MobilniBroj(broj, broj1);
            Imenik imenik1 = new Imenik();
            imenik1.dodaj(ime, novi);
            System.out.print("Dodali ste korisnika ");
            System.out.println(imenik1.dajIme(novi));
            System.out.println("Unesite iz kojeg grada zelite da pretrazite: ");
            String grad = new String();
            grad = ulaz.nextLine();
            ulaz.nextLine();
            //Set<String> skup = imenik1.izGrada(Grad.valueOf(grad));
            //Set<TelefonskiBroj> brojevi = imenik1.izGradaBrojevi(Grad.valueOf(grad));
            System.out.println("Unesite na koje slovo zelite pretrazivati: ");
            String slovo = new String();
            slovo = ulaz.nextLine();
            ulaz.nextLine();
            String rezultat = imenik1.naSlovo(slovo.charAt(0));
            System.out.println(rezultat);


        }

        return;
    }
}