package com.mrazi.hiddengem.service

import com.mrazi.hiddengem.dto.GemDto
import com.mrazi.hiddengem.mapper.GemMapper
import com.mrazi.hiddengem.repository.GemRepository
import org.springframework.stereotype.Component
import java.time.LocalDateTime
import java.util.*

@Component
class GemService(private var gemRepository: GemRepository,
                private var mapper: GemMapper) {

    fun save (dto: GemDto): GemDto {
        val gem = mapper.toModel(dto)
        gem.id = UUID.randomUUID()
        gem.joined = LocalDateTime.now()
        gemRepository.save(gem)
        return mapper.toDto(gem)
    }

    fun update (dto: GemDto): GemDto {
        val gem = mapper.toModel(dto)
        gemRepository.save(gem)
        return mapper.toDto(gem)
    }

    fun get(id: UUID): GemDto {
        return mapper.toDto(gemRepository.getById(id));
    }

    fun get(): List<GemDto> {
        return mapper.toDtos(gemRepository.findAll());
    }

}