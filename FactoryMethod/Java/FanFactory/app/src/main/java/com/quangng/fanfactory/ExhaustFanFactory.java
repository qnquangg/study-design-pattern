package com.quangng.fanfactory;

public class ExhaustFanFactory extends FanFactory {
    @Override
    public IFan createFan() {
        return new ExhaustFan();
    }
}
