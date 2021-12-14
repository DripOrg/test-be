package com.backendtest.dripbackendtest.enums;

public enum Time
{
    TOO_EARLY("08:00"), TOO_LATE("18:00");

    private String action;

    public String getHour()
    {
        return this.action;
    }

    private Time(String action)
    {
        this.action = action;
    }
}