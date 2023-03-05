
package bus;

import java.util.Scanner;


public class Bus {
    
}
class autobus {
    Scanner in = new Scanner(System.in);
    int busNumber;
    int seats;
    int people;
    int index;
    String name;
    autobus(int bn, String n){
        seats = 40;
        busNumber=bn;
        name = n;
    }
    autobus(){
        seats=40;
        busNumber = 19;
        name = "RWSFY";
    }
    void displayInfo(){
        System.out.printf("%d. Zastavka\n",index);
        System.out.printf("Autobus cislo %d spolecnosti %s s poctem sedadel %d veze %d cestujicich\n", busNumber,name,seats,people);
        
        System.out.println("zadejte kolik lidi chce vystoupit a kolik nastoupit: ");
        int outCome = in.nextInt();
        int inCome = in.nextInt();
        
        people -= outCome;
        if (people<0){
            people=0;
        }
        if (people<40){
            people += inCome;
            if (people>40){
                people = 40;
            }
        }
    }
    
    void displayInfoEnd(){
        System.out.printf("%d. Zastavka konec\n",index);
        System.out.printf("Autobus cislo %d spolecnosti %s s poctem sedadel %d veze %d cestujicich\n", busNumber,name,seats,people);
        people = 0;
        System.out.printf("Autobus cislo %d spolecnosti %s s poctem sedadel %d veze %d cestujicich\n", busNumber,name,seats,people);
        
    }
    
}
