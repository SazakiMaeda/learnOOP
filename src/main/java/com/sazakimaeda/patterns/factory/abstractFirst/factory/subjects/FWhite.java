package com.sazakimaeda.patterns.factory.abstractFirst.factory.subjects;

import com.sazakimaeda.patterns.factory.abstractFirst.factory.Factory;
import com.sazakimaeda.patterns.factory.abstractFirst.i.SubjectA;
import com.sazakimaeda.patterns.factory.abstractFirst.i.SubjectB;
import com.sazakimaeda.patterns.factory.abstractFirst.i.subjects.A.Light;
import com.sazakimaeda.patterns.factory.abstractFirst.i.subjects.B.DarkText;

public class FWhite extends Factory {
    @Override
    public SubjectA createSubjectA() {
        return new Light();
    }

    @Override
    public SubjectB createSubjectB() {
        return new DarkText();
    }
}
