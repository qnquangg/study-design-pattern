package com.quangng.createbutton;

public abstract class Dialog {
    public abstract Button createButton();

    public String render() {
        Button newButton = createButton();
        return newButton.render();
    }
}
