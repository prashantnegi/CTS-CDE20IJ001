package com.cts.training.voter;

import org.junit.Test;

import static org.junit.Assert.*;

public class VoterTest {

    @Test
    public void test_isEligibleToVote_valid_voter() throws InvalidVoterException {
        Voter v = new Voter();
        assertTrue("Can vote", v.isEligibleToVote(18));
    }

    @Test(expected = InvalidVoterException.class)
    public void test_isEligibleToVote_invalid_voter() throws InvalidVoterException{
        Voter v = new Voter();
        assertFalse("Cannot vote",v.isEligibleToVote(17));
    }
}
