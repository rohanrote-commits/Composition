package Composition;

public class FeaturePhone implements Screen , Processor,keyboard {
    String screen;
    String keyboard;
    String processor;

    @Override
    public void setScreen(Screen screen) {

    }

    @Override
    public String getScreen() {
        return this.screen;
    }

    @Override
    public void setProcessor(Processor processor) {

    }

    @Override
    public String getProcessor() {
        return this.processor;
    }

    @Override
    public String getkeyboard() {
        return this.keyboard;
    }

    @Override
    public void setkeyboard(String keyboard) {

    }
}
