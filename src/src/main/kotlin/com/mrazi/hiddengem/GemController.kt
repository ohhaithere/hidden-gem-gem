package com.mrazi.hiddengem

import com.mrazi.hiddengem.dto.GemDto
import com.mrazi.hiddengem.service.GemService
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin
@RequestMapping("/gem")
class GemController(val gemService: GemService) {

    @PostMapping
    fun save(@RequestBody dto: GemDto): GemDto {
        return gemService.save(dto);
    }

}