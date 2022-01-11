package com.example.pruebaparameta.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDateSplit {

    public int getYear(Date inputDate) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String fechaTexto = formatter.format(inputDate);
        String[] date = fechaTexto.split("-");
        String year = date[2];
        return Integer.parseInt(year);
    }

    public int getDay(Date inputDate) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String fechaTexto = formatter.format(inputDate);
        String[] date = fechaTexto.split("-");
        String day = date[0];
        return Integer.parseInt(day);
    }

    public int getMonth(Date inputDate) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String fechaTexto = formatter.format(inputDate);
        String[] date = fechaTexto.split("-");
        String month = date[1];
        return Integer.parseInt(month);
    }
}
