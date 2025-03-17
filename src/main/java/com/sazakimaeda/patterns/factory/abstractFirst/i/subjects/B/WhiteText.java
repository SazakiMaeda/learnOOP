package com.sazakimaeda.patterns.factory.abstractFirst.i.subjects.B;

import com.sazakimaeda.patterns.factory.abstractFirst.i.SubjectB;

public class WhiteText implements SubjectB {
    @Override
    public String text() {
        return "Белый текст";
    }
}
