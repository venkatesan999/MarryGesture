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
    abstract fun profileListDao(): ProfileListDao
    abstract fun dailyRecommendationsDao(): DailyRecommendationsDao

    companion object {
        const val DATABASE_NAME = "MarryGesture"

        val MIGRATION_0_1 = object : Migration(0, 1) {
            override fun migrate(db: SupportSQLiteDatabase) {
                // No need to create tables explicitly, Room handles this based on entity classes
            }
        }
    }
}