package in.skyras.aks.jenkins.demoone;

import java.util.Date;

public class Demo1 {
    public static void main(String[] args) {

        UtilMethods um = new UtilMethods();

        printMsg("Adding Two Values 10, 20");
        printMsg(String.valueOf(um.addValues(10,20)));
        printMsg("Subtracting Two Values 50, 20");
        printMsg(String.valueOf(um.subtractValues(50,20)));
        printMsg("Multiplying Two Values 10, 10");
        printMsg(String.valueOf(um.multiplyValues(10,10)));

        printMsg("Sample1 Run Successfully.");
    }
    public static void printMsg(String dataToPrint){
        System.out.println("[" + new Date() +"] " + dataToPrint);
    }
}
