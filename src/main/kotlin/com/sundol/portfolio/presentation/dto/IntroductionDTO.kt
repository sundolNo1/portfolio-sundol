package com.sundol.portfolio.presentation.dto

import com.sundol.portfolio.domain.entity.Introduction

data class IntroductionDTO(
    val content: String
) {
    constructor(introduction: Introduction) : this(
        content = introduction.content
    )
}