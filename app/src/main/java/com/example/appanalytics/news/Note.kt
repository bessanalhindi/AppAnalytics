package com.example.appanalytics.news

data class Note(
    val id: String?,
    val title: String?,
    val description: String?,
    val url: String?,
    val category: String?
) : java.io.Serializable
