package Composition;

public class Laptop implements Trackpad,keyboard,Storage,Screen,Processor {
    String trackpad;
    String storage;
    String screen;
    String processor;
    String keyboard;

    @Override
    public void setProcessor(Processor processor) {

    }

    @Override
    public String getProcessor() {
        return this.processor;
    }

    @Override
    public void setScreen(Screen screen) {

    }

    @Override
    public String getScreen() {
        return this.screen;
    }

    @Override
    public void setStorage(String s) {

    }

    @Override
    public String getStorage() {
        return this.storage;
    }

    @Override
    public void setTrackpad(String trackpad) {

    }

    @Override
    public String getTrackpad() {
        return this.trackpad;
    }

    @Override
    public String getkeyboard() {
        return this.keyboard;
    }

    @Override
    public void setkeyboard(String keyboard) {

    }
}
