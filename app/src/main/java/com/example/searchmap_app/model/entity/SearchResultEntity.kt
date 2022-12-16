package com.example.searchmap_app.model.entity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SearchResultEntity(
    val fullAddress: String,
    val buildingName: String,
    val locationLatLng: LocationLatLngEntity
): Parcelable
