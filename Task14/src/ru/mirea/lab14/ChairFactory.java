package ru.mirea.lab14;

public class ChairFactory implements ChairAbstractFactory{
    public FunctionChair createFunctionChair() {
        return new FunctionChair();
    }
    public MagicChair createMagicChair(String material) {
        return new MagicChair(material);
    }
    public VictorianChair createVictorianChair(String owner) {
        return new VictorianChair(owner);
    }
}
