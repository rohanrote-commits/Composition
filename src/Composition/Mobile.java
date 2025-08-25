package Composition;

public class Mobile implements Screen,Processor,Storage {
    String processor;
    String screen;
    String storage;

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
}
