package com.sazakimaeda.patterns.factory.abstractFirst.i.subjects.B;

import com.sazakimaeda.patterns.factory.abstractFirst.i.SubjectB;

public class DarkText implements SubjectB {
    @Override
    public String text() {
        return "Чёрный текст";
    }
}
