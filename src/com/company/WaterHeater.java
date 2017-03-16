package com.company;

import java.util.Date;

/**
 * This Class is a subclass of the ServiceCall Class for a
 * water heater.
 */
public class WaterHeater extends ServiceCall{
    // Defines unique variables.
    protected int age;
    protected static final double extraFee = 20;

    // Constructor.
    public WaterHeater(String serviceAddress, String problemDescription, Date date, int age) {
        super(serviceAddress, problemDescription, date);
        this.age = age;
    }

    // Custom print method.
    @Override
    public String toString() {
        String resolvedDateString = ( resolvedDate == null) ? "Unresolved" : this.resolvedDate.toString();
        String resolutionString = ( this.resolution == null) ? "Unresolved" : this.resolution;
        String feeString = (fee == UNRESOLVED) ? "Unresolved" : "$" + Double.toString(fee + extraFee);

        return "Furnace Service Call " + "\n" +
                "Service Address= " + serviceAddress + "\n" +
                "Problem Description = " + problemDescription  + "\n" +
                "Reported Date = " + reportedDate + "\n" +
                "Resolved Date = " + resolvedDateString + "\n" +
                "Resolution = " + resolutionString + "\n" +
                "Fee = " + feeString ;
    }
}
