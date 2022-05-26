package com.mrazi.ratemytrack.client

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@FeignClient(name = "items-service", url = "http://localhost:8090/")
interface AuthClient {



}