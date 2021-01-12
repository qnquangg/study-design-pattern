package com.quangng.createbutton;

public class HTMLButton implements Button {
    @Override
    public String render() {
        return "Render HTML button style";
    }

    @Override
    public String onClick() {
        return "Handle HTML onClick event";
    }
}
