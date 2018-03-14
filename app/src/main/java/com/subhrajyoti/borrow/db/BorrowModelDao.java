package com.subhrajyoti.borrow.db;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.TypeConverters;

import java.util.List;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;
//@Dao Tell room to create a DAO – Data Access Object class,
//used to define all the queries we will perform on our database.
@Dao
@TypeConverters(DateConverter.class)
public interface BorrowModelDao {

    // Each @Query annotation is paired with a method.
    // When the paired method is called, the query gets executed.
    @Query("select * from BorrowModel")
    LiveData<List<BorrowModel>> getAllBorrowedItems();

    @Query("select * from BorrowModel where id = :id")
    BorrowModel getItembyId(String id);


    @Insert(onConflict = REPLACE)
    void addBorrow(BorrowModel borrowModel);

    @Delete
    void deleteBorrow(BorrowModel borrowModel);

}
