package com.thesis.trialnavdrawer.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DiseaseList(
    var name_disease: String,
    var desc_disease: String,
    var image: Int
): Parcelable
