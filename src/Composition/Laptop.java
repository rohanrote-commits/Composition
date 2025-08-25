package Composition;

public class Laptop implements Trackpad,keyboard,Storage,Screen,Processor {

    Electronics e;

    @Override
    public void setProcessor(String processor) {
   this.e.processor = processor;

    }

    @Override
    public String getProcessor() {
        return this.e.processor;
    }

    @Override
    public void setScreen(String screen) {
     this.e.screen = screen;

    }

    @Override
    public String getScreen() {
        return this.e.screen;
    }

    @Override
    public void setStorage(String s) {
       this.e.storage = s;

    }

    @Override
    public String getStorage() {
        return this.e.storage;
    }

    @Override
    public void setTrackpad(String trackpad) {

    }

    @Override
    public String getTrackpad() {
        return this.e.trackpad;
    }

    @Override
    public String getkeyboard() {
        return this.e.keyBoard;
    }

    @Override
    public void setkeyboard(String keyboard) {

    }
}
