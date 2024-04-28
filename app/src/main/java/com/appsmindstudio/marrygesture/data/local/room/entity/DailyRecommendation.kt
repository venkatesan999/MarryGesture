package com.appsmindstudio.marrygesture.data.local.room.entity

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.appsmindstudio.marrygesture.data.model.MarryDetails

@Entity("DailyRecommendations_Table")
data class DailyRecommendation(
    @PrimaryKey(autoGenerate = true)
    val recommendId: Long = 0L,
    @Embedded
    val marryDetails: MarryDetails
)