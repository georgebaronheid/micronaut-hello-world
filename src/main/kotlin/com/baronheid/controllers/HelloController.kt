package com.baronheid.controllers

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

//Controller definition
@Controller("/hello")
class HelloController {

//    HTTP mapping through @Get
    @Get("/")
//    Micronaut's default response is application/json as content-type
    @Produces(MediaType.TEXT_PLAIN)
    fun index(): String = "Hello world"
}