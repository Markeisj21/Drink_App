package com.markeisj21.beerapp.data.mappers

import com.markeisj21.beerapp.data.local.BeerEntity
import com.markeisj21.beerapp.data.remote.BeerDto
import com.markeisj21.beerapp.domain.Beer

fun BeerDto.toBeerEntity(): BeerEntity {
    return BeerEntity(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = first_brewed,
        imageUrl = image_url
    )
}

fun BeerEntity.toBeer(): Beer {
    return Beer(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = firstBrewed,
        imageUrl = imageUrl
    )
}