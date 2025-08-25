package Composition;

public class MainComposition {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.setProcessor("Processor");
        mobile.setStorage("Storage");



        Television t = new Television();
        t.setProcessor("Processor");
        t.getProcessor();
                t.setScreen("Screen");
        t.getProcessor();


    }
}
