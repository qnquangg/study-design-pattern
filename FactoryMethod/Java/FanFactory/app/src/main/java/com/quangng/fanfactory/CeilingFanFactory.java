package com.quangng.fanfactory;

public class CeilingFanFactory extends FanFactory {
    @Override
    public IFan createFan() {
        return new CeilingFan();
    }
}
