import java.util.Scanner;

public class Main extends Klasa {
    Klasa klasa = new Klasa();
    Scanner scanner = new Scanner(System.in);
    String[] tablica = new String[6];
    public int sec;
    public int min;
    public int h;
    public int d;
    public void strat(){
        System.out.println("Enter the time: ");
        klasa.setTime(scanner.nextLine());
    }
    public void table(){

        tablica = klasa.getTime().split("");

        h = Integer.parseInt(tablica[0] + tablica[1]);
        min = Integer.parseInt(tablica[2] + tablica[3]);
        sec = Integer.parseInt(tablica[4] + tablica[5]);
        tasc();
        System.out.println( toString());
    }
    public void tasc() {

        if (sec > 59) {
            sec = sec%60;
            min+=sec/60;
            if (sec != 0 && sec < 10) {
                klasa.setSec("0" + String.valueOf(sec));
            } else if (sec == 0) {
                klasa.setSec("00");
            } else {
                klasa.setSec(String.valueOf(sec));
            }
        } else if (sec > 9) {
            klasa.setSec(String.valueOf(sec));
        } else {
            klasa.setSec("0" + String.valueOf(sec));
        }
        if (min > 59) {
            min = min%60;
            h+=min/60;
            if (min != 0 && min < 10) klasa.setMin("0" + String.valueOf(min));
            else if (min == 0) {
                klasa.setMin("00");
            } else {
                klasa.setMin(String.valueOf(min));
            }
        } else if (min > 9) {
            klasa.setMin(String.valueOf(min));
        } else {
            klasa.setMin("0" + String.valueOf(min));
        }
        if (h > 23) {
            d = h / 24;
            h = h % 24;
            if (h < 10 && h != 0) {
                klasa.setHour("0" + String.valueOf(h));
            } else if (h == 0) {
                klasa.setHour("00");
            } else {
                klasa.setHour(String.valueOf(h));
            }

        } else if (h > 9) {
            klasa.setHour(String.valueOf(h));
        } else {
            klasa.setHour("0" + String.valueOf(h));
        }


    }
    public void interval(){
        System.out.println("Hours: ");
        int addH = scanner.nextInt();
        System.out.println("Minutes: ");
        int addMin = scanner.nextInt();
        System.out.println("Seconds: ");
        int assSec = scanner.nextInt();

        table();
        sec +=assSec;
        min +=addMin;
        h+=addH;

        tasc();
        System.out.println("After "+assSec+" seconds, "+addMin+" minutes and "+addH+" hours it will be "+toString());

    }
    public void options(){
        System.out.println("1. What time is it?");
        System.out.println("2. What time will be after...?");
        System.out.println("3. Leave me alone!");
    }

    @Override
    public String toString() {
        if (tablica.length == 6) {
            if (d == 0) {
                return "\n" + klasa + "\n";
            } else if (d == 1) {
                return "\n" + d + " day  " + klasa + "\n";
            } else {
                return "\n" + d + " days " + klasa + "\n";
            }
        } else {
            return "Written number must have six digits";
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.strat();
        Scanner sc = new Scanner(System.in);
        int i;
        do {
            main.options();

            i = sc.nextInt();
            switch (i){
                case 1:main.table();
                break;
                case 2:main.interval();
            }

        }while(i!=3);


    }


}
