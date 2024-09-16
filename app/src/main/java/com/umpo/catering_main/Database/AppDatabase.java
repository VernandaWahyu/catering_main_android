package com.umpo.catering_main.Database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.umpo.catering_main.Database.DatabaseDao;


//untuk entitas model database
@Database(entities = {DatabaseModel.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract DatabaseDao databaseDao();
}