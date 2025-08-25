package Composition;

public class FeaturePhone implements Screen , Processor,keyboard {
Electronics e = new Electronics();


    @Override
    public void setProcessor(String processor) {

    }

    @Override
    public String getProcessor() {
        return this.e.processor;
    }

    @Override
    public String getkeyboard() {
        return this.e.keyBoard;
    }

    @Override
    public void setkeyboard(String keyboard) {
    this.e.keyBoard = keyboard;
    }

    @Override
    public void setScreen(String screen) {
        this.e.screen = screen;

    }

    @Override
    public String getScreen() {
        return this.e.screen;
    }
}
