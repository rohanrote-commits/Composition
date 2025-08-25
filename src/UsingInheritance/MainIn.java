package UsingInheritance;

public class MainIn {
    public static void main(String[] args) {

        Mobile mobile = new Mobile();
        Laptop laptop = new Laptop();
        Tablet tablet = new Tablet();

        //By normal inheritance we can assign values to the unwanted fields of Mobile
        mobile.setTrackpad("trackpad");
        mobile.setKeyBoard("keyboard");
    }
}
