package Composition;

public class Mobile implements Screen,Processor,Storage {

    Electronics e = new Electronics();

    @Override
    public void setProcessor(String processor) {
        e.processor = processor;

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
        return e.screen;
    }


    @Override
    public void setStorage(String s) {

        e.storage = s;
    }

    @Override
    public String getStorage() {
        return this.e.storage;
    }
}
