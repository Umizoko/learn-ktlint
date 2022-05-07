package com.example.demo.domain.article

class Article private constructor(
    val id: String,
    var title: String,
    val description: String
) {

    fun changeTitle(title: String) {
        this.title = title
    }
}
