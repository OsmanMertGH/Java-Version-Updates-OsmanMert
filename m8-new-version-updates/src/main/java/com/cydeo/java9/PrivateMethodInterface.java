package com.cydeo.java9;

import java.time.LocalDate;

public interface PrivateMethodInterface {

    boolean isHoliday(LocalDate date);

    default boolean isBusinessDay(LocalDate date){
        if (date.isBefore(LocalDate.of(2001,1,1))){
            throw new IllegalArgumentException();
        }
        return !isHoliday(date);
    }


}
