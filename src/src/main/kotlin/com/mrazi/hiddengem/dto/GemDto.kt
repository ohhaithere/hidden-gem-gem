package com.mrazi.hiddengem.dto

import java.time.LocalDateTime
import java.util.*

data class GemDto(
    var id: UUID? = null,
    val name: String,
    val location: String,
    val description: String,
    var joined: LocalDateTime? = null
)
