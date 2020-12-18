package com.cts.training;

import com.cts.training.voter.VoterTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        VoterTest.class,
        MathTest.class
})
public class MainTestSuite {
}
