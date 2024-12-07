package com.suke.czx.modules.bookstore.controller

import com.suke.czx.common.annotation.AuthIgnore
import com.suke.czx.modules.bookstore.entity.BookEntity
import com.suke.czx.modules.bookstore.sevice.impl.BookStoreService

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/booksStore")
class BookStoreController {

    @Autowired
    private lateinit var bookStoreService: BookStoreService
    @AuthIgnore
    @GetMapping("/list")
    fun list(): List<BookEntity> {
        return bookStoreService.list()
    }

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): BookEntity? {
        return bookStoreService.getById(id)
    }

    @PostMapping
    fun save(@RequestBody book: BookEntity): Boolean {
        return bookStoreService.save(book)
    }

    @PutMapping
    fun update(@RequestBody book: BookEntity): Boolean {
        return bookStoreService.updateById(book)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): Boolean {
        return bookStoreService.removeById(id)
    }
}