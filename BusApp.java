
package bus;

public class BusApp {

    
    public static void main(String[] args) {
        autobus bus15 = new autobus();
        bus15.people = 0;
        bus15.busNumber = 15;
        bus15.name = "DPMLJ";
        
        for (int i = 1;i<=5;i++){
            bus15.index = i;
            if (i<5){
                bus15.displayInfo();
            } else bus15.displayInfoEnd();
        }
        
    }
    
}
