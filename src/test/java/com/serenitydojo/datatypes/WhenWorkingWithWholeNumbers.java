package com.serenitydojo.datatypes;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithWholeNumbers {
    @Test
    public void addingNumbersTogether() {
        int initialYear = 1985;
        int targetYear = 0;

        // TODO: create a new int variable called timeJump and assign it a value

        int timeJump = 30;

        //  Next, add this variable to initialYear and assign the result to targetYear, so that targetYear is equal to 2015

        targetYear = initialYear + timeJump;

        assertThat(targetYear, equalTo(2015));
    }
}
