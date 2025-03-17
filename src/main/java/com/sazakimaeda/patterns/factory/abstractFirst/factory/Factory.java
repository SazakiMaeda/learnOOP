package com.sazakimaeda.patterns.factory.abstractFirst.factory;

import com.sazakimaeda.patterns.factory.abstractFirst.i.SubjectA;
import com.sazakimaeda.patterns.factory.abstractFirst.i.SubjectB;

public abstract class Factory {
    private SubjectA subjectA;
    private SubjectB subjectB;

    public abstract SubjectA createSubjectA();

    public abstract SubjectB createSubjectB();
}
