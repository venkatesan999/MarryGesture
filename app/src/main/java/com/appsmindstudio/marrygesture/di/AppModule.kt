package com.appsmindstudio.marrygesture.di

import android.app.Application
import androidx.room.Room
import com.appsmindstudio.marrygesture.data.local.room.dao.DailyRecommendationsDao
import com.appsmindstudio.marrygesture.data.local.room.dao.ProfileListDao
import com.appsmindstudio.marrygesture.data.local.room.database.MarryDatabase
import com.appsmindstudio.marrygesture.data.local.room.repository.DailyRecommendationRepository
import com.appsmindstudio.marrygesture.data.local.room.repository.ProfileRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun providesDatabase(app: Application): MarryDatabase =
        Room.databaseBuilder(app, MarryDatabase::class.java, MarryDatabase.DATABASE_NAME)
            .addMigrations(MarryDatabase.MIGRATION_0_1)
            .allowMainThreadQueries()
            .fallbackToDestructiveMigration()
            .build()

    @Provides
    @Singleton
    fun provideProfileDao(database: MarryDatabase): ProfileListDao {
        return database.gestureDao()
    }

    @Provides
    @Singleton
    fun provideDailyRecommendationsDao(database: MarryDatabase): DailyRecommendationsDao {
        return database.dailyRecommendationsDao()
    }

    @Provides
    @Singleton
    fun provideProfileRepository(profileListDao: ProfileListDao): ProfileRepository {
        return ProfileRepository(profileListDao)
    }

    @Provides
    @Singleton
    fun provideDailyRecommendationRepository(dailyRecommendationsDao: DailyRecommendationsDao): DailyRecommendationRepository {
        return DailyRecommendationRepository(dailyRecommendationsDao)
    }
}