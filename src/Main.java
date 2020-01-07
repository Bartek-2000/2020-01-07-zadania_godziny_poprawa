import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main extends Klasa{
    Klasa klasa = new Klasa();
    Scanner scanner = new Scanner(System.in);
    String x = scanner.nextLine();
    String[] tablica = new String[6];
    int sec;
    int min;
    int h;
    int d;
    public void tasc(){
        tablica = x.split("");
        h = Integer.parseInt(tablica[0] + tablica[1]);
        min = Integer.parseInt(tablica[2] + tablica[3]);
        sec = Integer.parseInt(tablica[4] + tablica[5]);
        if(sec>59){
            sec = sec-60;
            min++;
        }
        if(min>59){
            min = min-60;
            h++;
        }
        if(h>24){
            d = h/24;
            h = h%24;
        }
        klasa.setSec(String.valueOf(sec));
        klasa.setMin(String.valueOf(min));
        klasa.setHour(String.valueOf(h));
    }

    @Override
    public String toString() {
        return "" + d +" dni  "+ klasa;
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.tasc();
        System.out.println(main.toString());


    }


}
