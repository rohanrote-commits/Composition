package Composition;

public class Television implements Screen, Processor{
    String screen;
    String processor;


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
}
