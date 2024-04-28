package com.appsmindstudio.marrygesture.data.local.room.repository

import com.appsmindstudio.marrygesture.data.local.room.dao.DailyRecommendationsDao
import com.appsmindstudio.marrygesture.data.local.room.entity.DailyRecommendation
import javax.inject.Inject

class DailyRecommendationRepository @Inject constructor(private val dailyRecommendationsDao: DailyRecommendationsDao) {

    suspend fun insertDailyRecommendation(dailyRecommendations: List<DailyRecommendation>) {
        dailyRecommendationsDao.insertDailyRecommendations(dailyRecommendations)
    }

    fun getAllDailyRecommendation(): List<DailyRecommendation> {
        return dailyRecommendationsDao.getAllDailyRecommendations()
    }

    suspend fun deleteDailyRecommendation(dailyRecommendation: DailyRecommendation) {
        dailyRecommendationsDao.deleteDailyRecommendationsDao(dailyRecommendation)
    }
}