package com.sazakimaeda.patterns.observ.second;

import com.sazakimaeda.patterns.observ.second.i.Observed;
import com.sazakimaeda.patterns.observ.second.i.Observer;

public class Start {
    public static void main(String[] args) {
        Observed obs = new MeteoStation();
        Observer sub1 = new Display("Anton");
        Observer sub2 = new Display("Bob");

        obs.add(sub1);
        obs.add(sub2);
        obs.remove(sub1);
    }
}
