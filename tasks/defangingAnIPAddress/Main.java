package tasks.defangingAnIPAddress;

public class Main {
    public static void main(String[] args) {
        DefangingAnIPAddress defangingAnIPAddress = new DefangingAnIPAddress();

        System.out.println(defangingAnIPAddress.defangIPaddr("255.100.50.0"));

        System.out.println(defangingAnIPAddress.defangIPaddrV2("255.100.50.0"));
    }
}
