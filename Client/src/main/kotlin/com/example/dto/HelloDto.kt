package com.example.dto

import com.fasterxml.jackson.annotation.JsonProperty

class HelloDto(
  @field:JsonProperty("nome_pessoa")
  val message: String
) {}