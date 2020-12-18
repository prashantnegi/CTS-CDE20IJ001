package com.cts.training.voter;

public class Voter {

    public boolean isEligibleToVote(int age) throws InvalidVoterException {

        if (age >= 18)
            return true;
        else
            throw new InvalidVoterException("Cannot vote");

    }
}


