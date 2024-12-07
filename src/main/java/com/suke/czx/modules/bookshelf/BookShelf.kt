package com.suke.czx.modules.bookshelf


import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.baomidou.mybatisplus.extension.service.IService
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.suke.czx.common.annotation.AuthIgnore
import com.suke.czx.modules.bookshelf.mapper.BookShelfMapper
import com.suke.czx.modules.bookstore.entity.BookEntity
import org.apache.ibatis.annotations.Mapper

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/booksShelf")
class BookShelfController {

    @Autowired
    private lateinit var bookShelfService: BookShelfService
    @AuthIgnore
    @GetMapping("/list")
    fun list(): List<BookEntity> {
        return bookShelfService.list()
    }

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): BookEntity? {
        return bookShelfService.getById(id)
    }

    @PostMapping
    fun save(@RequestBody book: BookEntity): Boolean {
        return bookShelfService.save(book)
    }

    @PutMapping
    fun update(@RequestBody book: BookEntity): Boolean {
        return bookShelfService.updateById(book)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): Boolean {
        return bookShelfService.removeById(id)
    }
}

interface BookShelfService : IService<BookEntity>

@Service
class BookShelfServiceImpl : ServiceImpl<BookShelfMapper, BookEntity>(), BookShelfService{




}
