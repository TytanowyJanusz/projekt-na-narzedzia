package zywieniowa1;
import java.util.Scanner;

public class Zywieniowa1 {
    public static void main(String[] args) {
            
        /*BMI*/
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Podaj wzrost (w cm): ");
        double wzrost = Double.parseDouble(reader.nextLine());
        System.out.println("Podaj wage: ");
        double waga = Double.parseDouble(reader.nextLine());
        double bmi= waga/(Math.pow(wzrost/100,2));
        bmi =Math.floor(bmi*100)/100;
        System.out.println("Twoje BMI to: "+bmi);
        
        if(bmi<16){
            System.out.println("Twoje BMI wskazuje na wygłodzenie!");
        }
        if(bmi>=16 && bmi<17){
            System.out.println("Twoje BMI wskazuje na wychudzenie!");
        }
        if(bmi>=17 && bmi<18.49){
            System.out.println("Twoje BMI wskazuje na niedowage!");
        }
        if(bmi>=18.5 && bmi<25){
            System.out.println("Twoje BMI wskazuje na prawidłową wagę ciała!");
        }
        if(bmi>=25 && bmi<30){
            System.out.println("Twoje BMI wskazuje na nadwage!");
        }
        if(bmi>=30 && bmi<35){
            System.out.println("Twoje BMI wskazuje na I stopień otyłości!");
        }
        if(bmi>=35 && bmi<40){
            System.out.println("Twoje BMI wskazuje na II stopień otyłości!");
        }
        if(bmi>=40){
            System.out.println("Twoje BMI wskazuje na skrajną otyłość!");
        }
        System.out.println("\nKalkulator BMI (Body Mass Index) wskazuje jedynie przybliżoną zawartość tłuszczu w organizmie. W niektórych przypadkach wskaźnik ten może sugerować błędne wnioski.");
    }
    
}
