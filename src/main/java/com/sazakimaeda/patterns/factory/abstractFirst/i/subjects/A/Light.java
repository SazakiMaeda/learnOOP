package com.sazakimaeda.patterns.factory.abstractFirst.i.subjects.A;

import com.sazakimaeda.patterns.factory.abstractFirst.i.SubjectA;

public class Light implements SubjectA {
    @Override
    public String tema() {
        return "Светлая тема";
    }
}
