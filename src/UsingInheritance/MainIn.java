package UsingInheritance;

public class MainIn {
    public static void main(String[] args) {

        Mobile mobile = new Mobile("Screen","Storage","Processor");
        Laptop laptop = new Laptop("Screen","Keybpard","Storage","Processor","trackpad");
        Tablet tablet = new Tablet("Screen","Storage","Processor");


        //By normal inheritance we can assign values to the unwanted fields of Mobile
        //this will give null value
        mobile.getTrackpad();



    }
}
