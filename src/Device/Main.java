package Device;

public class Main {
    public static void main(String[] args) {
        Device device = new Device("Samsung", 120, "AB1234567CD");
        System.out.println(device.toString());

        Monitor monitor = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024);
        System.out.println(monitor.toString());
    }
}

