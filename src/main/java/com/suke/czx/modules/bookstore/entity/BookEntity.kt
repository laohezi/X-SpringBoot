package com.suke.czx.modules.bookstore.entity

import com.baomidou.mybatisplus.annotation.TableName

@TableName("book")
data class BookEntity(
    val id: Long,
    val name: String,
    val author: String,
    val cover: String,
    val rating: Float,
)
