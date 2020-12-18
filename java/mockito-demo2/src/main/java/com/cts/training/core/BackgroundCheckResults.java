package com.cts.training.core;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BackgroundCheckResults {

    private String riskProfile;
    private long upperAccountLimit;
}