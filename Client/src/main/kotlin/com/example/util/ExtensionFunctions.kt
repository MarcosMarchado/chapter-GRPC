package com.example.util

import com.example.HelloReply
import com.example.dto.HelloDto

fun HelloReply.converteParaDto(): HelloDto {
    return HelloDto(this.message)
}