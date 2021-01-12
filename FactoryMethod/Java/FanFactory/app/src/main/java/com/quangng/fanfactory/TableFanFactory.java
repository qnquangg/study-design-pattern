package com.quangng.fanfactory;

public class TableFanFactory extends FanFactory {
    @Override
    public IFan createFan() {
        return new TableFan();
    }
}
