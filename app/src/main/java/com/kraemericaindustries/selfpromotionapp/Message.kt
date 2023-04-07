package com.kraemericaindustries.selfpromotionapp

import java.io.Serializable

data class Message(
    val contactName: String,
    val contactNumber: String,
    val myDisplayName: String,
    val includeAspiring: Boolean,
    val jobTitle: String?,
    val immediateStart: Boolean,
    val startDate: String?
) : Serializable {

    fun getFullJobDescr() = if(includeAspiring) "an aspiring $jobTitle" else "a $jobTitle"
    fun getAvailability() = if(immediateStart) "immediately" else "from $startDate"
}