package com.mrazi.hiddengem.repository

import com.mrazi.hiddengem.model.Gem
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface GemRepository: JpaRepository<Gem, UUID> {
}