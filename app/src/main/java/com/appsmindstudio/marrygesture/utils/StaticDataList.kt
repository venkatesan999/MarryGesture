package com.appsmindstudio.marrygesture.utils

import com.appsmindstudio.marrygesture.R
import com.appsmindstudio.marrygesture.data.local.room.entity.DailyRecommendation
import com.appsmindstudio.marrygesture.data.local.room.entity.ProfileList
import com.appsmindstudio.marrygesture.data.model.MarryDetails
import com.appsmindstudio.marrygesture.data.model.ProfileDetails

object StaticDataList {

    val staticProfileList = listOf(
        ProfileList(
            marryDetails = MarryDetails(
                profile = R.drawable.keerthi1,
                name = "Keerthi",
                age = "1996",
                height = "5 ft 5 in",
                language = "Tamil",
                caste = "Vanniyar",
                education = "BE",
                profession = "Actor",
                city = "Chennai",
                state = "Tamil Nadu",
                country = "India"
            )
        ),
        ProfileList(
            marryDetails = MarryDetails(
                profile = R.drawable.vijay1,
                name = "Vijay",
                age = "1980",
                height = "6 ft 5 in",
                language = "Tamil",
                caste = "Cristian",
                education = "CA",
                profession = "Actor",
                city = "Chennai",
                state = "Tamil Nadu",
                country = "India"
            )
        ),
        ProfileList(
            marryDetails = MarryDetails(
                profile = R.drawable.atharva1,
                name = "Atharva",
                age = "1992",
                height = "6 ft 2 in",
                language = "Tamil",
                caste = "Vanniyar",
                education = "MBBS",
                profession = "Actor",
                city = "Chennai",
                state = "Tamil Nadu",
                country = "India"
            )
        ),
        ProfileList(
            marryDetails = MarryDetails(
                profile = R.drawable.ivana1,
                name = "Ivana",
                age = "1999",
                height = "5 ft 3 in",
                language = "Tamil",
                caste = "Poosam",
                education = "Bachelor's Degree",
                profession = "Actor",
                city = "Chennai",
                state = "Tamil Nadu",
                country = "India"
            )
        ),
        ProfileList(
            marryDetails = MarryDetails(
                profile = R.drawable.rithik1,
                name = "Rithik",
                age = "1985",
                height = "6 ft 6 in",
                language = "Hindi",
                caste = "Maratti",
                education = "MBBS",
                profession = "Actor",
                city = "Delhi",
                state = "Delhi",
                country = "India"
            )
        ),
    )

    val staticDailyRecList = listOf(
        DailyRecommendation(
            marryDetails = MarryDetails(
                profile = R.drawable.suriya,
                name = "Suriya",
                age = "1996",
                height = "5 ft 5 in",
                language = "Tamil",
                caste = "Vanniyar",
                education = "MBBS",
                profession = "Actor",
                city = "Chennai",
                state = "Tamil Nadu",
                country = "India"
            )
        ),
        DailyRecommendation(
            marryDetails = MarryDetails(
                profile = R.drawable.trisha,
                name = "Trisha",
                age = "1980",
                height = "6 ft 5 in",
                language = "Tamil",
                caste = "Cristian",
                education = "BE",
                profession = "Actor",
                city = "Chennai",
                state = "Tamil Nadu",
                country = "India"
            )
        ),
        DailyRecommendation(
            marryDetails = MarryDetails(
                profile = R.drawable.dhanush,
                name = "Dhanush",
                age = "1992",
                height = "6 ft 2 in",
                language = "Tamil",
                caste = "Vanniyar",
                education = "MBBS",
                profession = "Actor",
                city = "Chennai",
                state = "Tamil Nadu",
                country = "India"
            )
        ),
        DailyRecommendation(
            marryDetails = MarryDetails(
                profile = R.drawable.samantha,
                name = "Samantha",
                age = "1999",
                height = "5 ft 3 in",
                language = "Tamil",
                caste = "Poosam",
                education = "Bachelor's Degree",
                profession = "Actor",
                city = "Chennai",
                state = "Tamil Nadu",
                country = "India"
            )
        ),
        DailyRecommendation(
            marryDetails = MarryDetails(
                profile = R.drawable.bolly,
                name = "Bolly",
                age = "1985",
                height = "6 ft 6 in",
                language = "Hindi",
                caste = "Maratti",
                education = "M.SC",
                profession = "Actor",
                city = "Delhi",
                state = "Delhi",
                country = "India"
            )
        ),
    )

    val staticProfileDetailList = listOf(
        ProfileDetails(
            profile = R.drawable.vijay1,
        ),
        ProfileDetails(
            profile = R.drawable.vijay2,
        ),
        ProfileDetails(
            profile = R.drawable.vijay3,
        ),
        ProfileDetails(
            profile = R.drawable.vijay4,
        ),
        ProfileDetails(
            profile = R.drawable.vijay5,
        ),
    )

}