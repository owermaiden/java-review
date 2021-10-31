package com.cybertek.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Status {
    OPEN("Open"),IN_PROGRESS("In Progress"),UAT_TEST("UAT Testing"),COMPLETED("Completed");

    private final String value;

    /*

    Status(String value) {
        this.value = value;
    }

    */

    // final constant variables can be made in 3 ways...What are they?...learn...
    // Because these enums are final, we need to insert constructor in order to instantiate them...
}
