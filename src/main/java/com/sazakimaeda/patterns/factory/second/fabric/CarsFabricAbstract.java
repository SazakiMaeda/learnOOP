package com.sazakimaeda.patterns.factory.second.fabric;

import com.sazakimaeda.patterns.factory.second.i.Cars;

public abstract class CarsFabricAbstract {
    Cars cars;
    public abstract Cars createCars();
}
