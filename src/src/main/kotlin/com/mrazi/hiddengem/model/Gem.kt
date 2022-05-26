package com.mrazi.hiddengem.model

import java.time.LocalDateTime
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "gem", schema = "public")
class Gem(
    @Id
    var id: UUID? = null,
    val name: String,
    val location: String,
    val description: String,
    var joined: LocalDateTime? = null
)