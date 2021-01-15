package com.quangng.guifactory;

public class Application {
    private GuiFactory factory;
    private Button button;
    private Checkbox checkbox;

    public Application(GuiFactory factory) {
        this.factory = factory;
    }

    public void createButton() {
        this.button = this.factory.createButton();
    }

    public void createCheckbox() {
        this.checkbox = this.factory.createCheckbox();
    }

    public void drawButton() {
        this.button.draw();
    }

    public void drawCheckbox() {
        this.checkbox.draw();
    }
}
