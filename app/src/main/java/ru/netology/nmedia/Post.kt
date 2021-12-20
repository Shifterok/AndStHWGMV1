package ru.netology.nmedia

data class Post(
    val id: Int,
    val author: String,
    val content: String,
    val publishedDate: String,
    val likeByMe: Boolean,
    var countLikes: Int,
    var countShare: Int,
    val countVisibility: Int,
)