package joinMethod;

class Medical extends Thread {
    public void run() {
        try {
            System.out.println("Medical Start");
            Thread.sleep(3000);
            System.out.println("Medical Complete");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class TestDrive extends Thread {
    public void run() {
        try {
            System.out.println("Test Drive Starts");
            Thread.sleep(5000);
            System.out.println("Test Drive Completed");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class OfficerSign extends Thread {
    public void run() {

        try {
            System.out.println("Officer take the file");
            Thread.sleep(3000);
            System.out.println("Officer work completed");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

public class LicenseDemo {
    public static void main(String[] args) throws InterruptedException {
        Medical medical = new Medical();
        medical.start();
        medical.join();

        TestDrive testdrive = new TestDrive();
        testdrive.start();
        testdrive.join();

        OfficerSign os = new OfficerSign();
        os.start();
    }
}
