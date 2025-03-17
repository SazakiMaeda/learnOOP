package com.sazakimaeda.patterns.factory.abstractFirst.factory.subjects;

import com.sazakimaeda.patterns.factory.abstractFirst.factory.Factory;
import com.sazakimaeda.patterns.factory.abstractFirst.i.SubjectA;
import com.sazakimaeda.patterns.factory.abstractFirst.i.SubjectB;
import com.sazakimaeda.patterns.factory.abstractFirst.i.subjects.A.Dark;
import com.sazakimaeda.patterns.factory.abstractFirst.i.subjects.B.DarkText;
import com.sazakimaeda.patterns.factory.abstractFirst.i.subjects.B.WhiteText;

public class FDark extends Factory {
    @Override
    public SubjectA createSubjectA() {
        return new Dark();
    }

    @Override
    public SubjectB createSubjectB() {
        return new WhiteText();
    }
}
