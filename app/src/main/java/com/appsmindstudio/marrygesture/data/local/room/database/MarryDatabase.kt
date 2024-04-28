package com.appsmindstudio.marrygesture.data.local.room.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.appsmindstudio.marrygesture.data.local.room.dao.DailyRecommendationsDao
import com.appsmindstudio.marrygesture.data.local.room.dao.ProfileListDao
import com.appsmindstudio.marrygesture.data.local.room.entity.DailyRecommendation
import com.appsmindstudio.marrygesture.data.local.room.entity.ProfileList

@Database(entities = [ProfileList::class, DailyRecommendation::class], version = 1)
abstract class MarryDatabase : RoomDatabase() {
    abstract fun gestureDao(): ProfileListDao
    abstract fun dailyRecommendationsDao(): DailyRecommendationsDao

    companion object {
        const val DATABASE_NAME = "MarryGesture"

        val MIGRATION_0_1 = object : Migration(0, 1) {
            override fun migrate(db: SupportSQLiteDatabase) {

                db.execSQL(
                    "CREATE TABLE IF NOT EXISTS Profile_Table " +
                            "(profileId INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
                            "profile INTEGER NOT NULL, " +
                            "name TEXT NOT NULL, " +
                            "age TEXT NOT NULL, " +
                            "height TEXT NOT NULL, " +
                            "language TEXT NOT NULL, " +
                            "caste TEXT NOT NULL, " +
                            "education TEXT NOT NULL, " +
                            "profession TEXT NOT NULL, " +
                            "city TEXT NOT NULL, " +
                            "state TEXT NOT NULL, " +
                            "country TEXT NOT NULL)"
                )

                db.execSQL(
                    "CREATE TABLE IF NOT EXISTS DailyRecommendations_Table " +
                            "(recommendId INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
                            "profile INTEGER NOT NULL, " +
                            "name TEXT NOT NULL, " +
                            "age TEXT NOT NULL, " +
                            "height TEXT NOT NULL, " +
                            "language TEXT NOT NULL, " +
                            "caste TEXT NOT NULL, " +
                            "education TEXT NOT NULL, " +
                            "profession TEXT NOT NULL, " +
                            "city TEXT NOT NULL, " +
                            "state TEXT NOT NULL, " +
                            "country TEXT NOT NULL)"
                )
            }
        }
    }
}