package com.sazakimaeda.patterns.factory.second.fabric.fSubjects;

import com.sazakimaeda.patterns.factory.second.fabric.CarsFabricAbstract;
import com.sazakimaeda.patterns.factory.second.i.Cars;
import com.sazakimaeda.patterns.factory.second.i.subjects.Porshe;

public class fPorshe extends CarsFabricAbstract {

    @Override
    public Cars createCars() {
        return new Porshe();
    }
}
