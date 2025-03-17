package com.sazakimaeda.patterns.factory.second.fabric.fSubjects;

import com.sazakimaeda.patterns.factory.second.fabric.CarsFabricAbstract;
import com.sazakimaeda.patterns.factory.second.i.Cars;
import com.sazakimaeda.patterns.factory.second.i.subjects.Moskwich;

public class fMoskwich extends CarsFabricAbstract {
    @Override
    public Cars createCars() {
        return new Moskwich();
    }
}
