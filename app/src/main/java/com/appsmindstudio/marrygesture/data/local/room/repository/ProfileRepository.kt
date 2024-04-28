package com.appsmindstudio.marrygesture.data.local.room.repository

import com.appsmindstudio.marrygesture.data.local.room.dao.ProfileListDao
import com.appsmindstudio.marrygesture.data.local.room.entity.ProfileList
import javax.inject.Inject

class ProfileRepository @Inject constructor(private val profileListDao: ProfileListDao) {

    suspend fun insertProfile(profileList: List<ProfileList>) {
        profileListDao.insertProfile(profileList)
    }

    fun getAllProfile(): List<ProfileList> {
        return profileListDao.getAllProfile()
    }

    suspend fun deleteProfile(profileList: ProfileList) {
        profileListDao.deleteProfile(profileList)
    }
}