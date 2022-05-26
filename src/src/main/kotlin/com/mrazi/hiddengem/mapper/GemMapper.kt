package com.mrazi.hiddengem.mapper

import com.mrazi.hiddengem.dto.GemDto
import com.mrazi.hiddengem.model.Gem
import org.mapstruct.InheritInverseConfiguration
import org.mapstruct.InjectionStrategy
import org.mapstruct.Mapper

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
interface GemMapper {

    fun toDto(user: Gem): GemDto
    @InheritInverseConfiguration
    fun toModel(user: GemDto): Gem

    fun toDtos(gems: List<Gem>): List<GemDto> {
        return gems.map { t -> toDto(t) }
    }

}