package com.sazakimaeda.patterns.factory.second;

import com.sazakimaeda.patterns.factory.second.fabric.CarsFabricAbstract;
import com.sazakimaeda.patterns.factory.second.fabric.fSubjects.fPorshe;
import com.sazakimaeda.patterns.factory.second.i.Cars;

public class Start {
    public static void main(String[] args) {
        CarsFabricAbstract fabric = new fPorshe();
        Cars test = fabric.createCars();
        test.info();
    }
}
