package com.subhrajyoti.borrow.db;

import android.arch.persistence.room.TypeConverter;

import java.util.Date;

class DateConverter {

    //Take timestamp and return date
    @TypeConverter
    public static Date toDate(Long timestamp) {
        return timestamp == null ? null : new Date(timestamp);
    }

    //Take data and return timestamp
    @TypeConverter
    public static Long toTimestamp(Date date) {
        return date == null ? null : date.getTime();
    }
}
