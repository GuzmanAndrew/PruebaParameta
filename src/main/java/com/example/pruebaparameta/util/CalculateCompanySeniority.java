package com.example.pruebaparameta.util;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalculateCompanySeniority {
    public String CompanySeniorityAge(int year, int month, int day) {
        Period companySeniorityAge = Period.between(LocalDate.of(year, month, day), LocalDate.now());
        return "Age: " + companySeniorityAge.getYears() + " years and " + companySeniorityAge.getMonths() + " months";
    }
}
