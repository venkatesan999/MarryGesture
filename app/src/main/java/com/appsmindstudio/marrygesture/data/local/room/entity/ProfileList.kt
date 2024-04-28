package com.appsmindstudio.marrygesture.data.local.room.entity

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.appsmindstudio.marrygesture.data.model.MarryDetails

@Entity("Profile_Table")
data class ProfileList(
    @PrimaryKey(autoGenerate = true)
    val profileId: Long = 0L,
    @Embedded
    val marryDetails: MarryDetails
)
