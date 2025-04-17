package com.example.artgallery.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.artgallery.R

data class ArtGalleryData(
    @DrawableRes val artImage: Int,
    @StringRes val artName: Int,
    @StringRes val authorName: Int,
    val year: String
)

val listArtData = listOf(
    ArtGalleryData(R.drawable.mona_lisa, R.string.mona_lisa, R.string.leonardo_da_vinci, "1504"),
    ArtGalleryData(R.drawable.guernica, R.string.guernica,R.string.pablo_picasso, "1937"),
    ArtGalleryData(R.drawable.criacao_adao, R.string.criacao_adao,R.string.michelangelo_buonarroti, "1511"),
    ArtGalleryData(R.drawable.a_ultima_ceia,R.string.a_ultima_ceia, R.string.leonardo_da_vinci, "1498"),
    ArtGalleryData(R.drawable.a_noite_estrelada, R.string.a_noite_estrelada,R.string.vincent_van_gogh, "1889"),
)