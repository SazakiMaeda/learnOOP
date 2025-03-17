package com.sazakimaeda.patterns.factory.abstractFirst;

import com.sazakimaeda.patterns.factory.abstractFirst.factory.Factory;
import com.sazakimaeda.patterns.factory.abstractFirst.factory.subjects.FDark;
import com.sazakimaeda.patterns.factory.abstractFirst.factory.subjects.FWhite;

public class Start {
    public static void main(String[] args) {
        Factory f1 = new FDark();

        System.out.println(
                f1.createSubjectA().tema() + " " +
                f1.createSubjectB().text());

        Factory f2 = new FWhite();

        System.out.println(
                f2.createSubjectA().tema() + " " +
                f2.createSubjectB().text());
    }
}
