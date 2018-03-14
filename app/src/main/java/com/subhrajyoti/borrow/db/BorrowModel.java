package com.subhrajyoti.borrow.db;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;

import java.util.Date;

@Entity //Annotation to tell Room to use the current class as a database table.
public class BorrowModel {

    //@PrimaryKey serve as a primary key for the table gets incremented with every new entry
    @PrimaryKey(autoGenerate = true)
    public int id;
    private String itemName;
    private String personName;
    @TypeConverters(DateConverter.class)
    private Date borrowDate;

    public BorrowModel(String itemName, String personName, Date borrowDate) {
        this.itemName = itemName;
        this.personName = personName;
        this.borrowDate = borrowDate;
    }

    public String getItemName() {
        return itemName;
    }

    public String getPersonName() {
        return personName;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }
}
