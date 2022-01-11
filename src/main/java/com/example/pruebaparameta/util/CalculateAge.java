package com.example.pruebaparameta.util;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalculateAge {
    public int CalculateAgeMax(int year, int month, int day) {
        Calendar birthdate = new GregorianCalendar(year,month,day);
        Calendar dateNow = Calendar.getInstance();
        int birthdateYear = birthdate.get(Calendar.YEAR);
        int yearNow = dateNow.get(Calendar.YEAR);
        int edad = yearNow - birthdateYear;
        int result = edad - 1;
        return result;
    }

    public String CalculateAgeComplete(int year, int month, int day) {
        Period age = Period.between(LocalDate.of(year, month, day), LocalDate.now());
        return "Age: " + age.getYears() + " years, " + age.getMonths() + " months and " + age.getDays() + " days";
    }
}
