package com.syntax.branch;

public class Main {
    //write your code
    public static void main(String[] args) {
        SolarSystem FactorX = new SolarSystem();
        FactorX.Sun="1";
        FactorX.Moon="4";
        FactorX.Planet="2";
        FactorX.Stars="1000";

        // adding features to our sun
        FeatureSun Xfact = new FeatureSun();
        Xfact.color = "green";
        Xfact.heat="303049949494";
        Xfact.radius="1000000000km";

    }
}
