package Composition;

public class Television implements Screen, Processor{
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
}
