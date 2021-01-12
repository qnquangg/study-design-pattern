package com.quangng.createbutton;

public class WindowsButton implements Button {
    @Override
    public String render() {
        return "Render Windows button style";
    }

    @Override
    public String onClick() {
        return "Handle Windows button onClick event";
    }
}
