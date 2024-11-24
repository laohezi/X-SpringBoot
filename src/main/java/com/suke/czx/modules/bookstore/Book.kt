package com.suke.czx.modules.bookstore

import com.baomidou.mybatisplus.annotation.TableName
import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.baomidou.mybatisplus.extension.service.IService
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import org.apache.ibatis.annotations.Mapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.*

@TableName("book")
data class BookEntity(
    val id: Long,
    val name: String,
    val author: String,
    val cover: String,
    val rating: Float,
)

@Mapper
interface BookDao : BaseMapper<BookEntity>

interface BookService : IService<BookEntity>

@Service
class BookServiceImpl : ServiceImpl<BookDao, BookEntity>(), BookService

@RestController
@RequestMapping("/books")
class BookController {

    @Autowired
    private lateinit var bookService: BookService

    @GetMapping
    fun list(): List<BookEntity> {
        return bookService.list()
    }

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): BookEntity? {
        return bookService.getById(id)
    }

    @PostMapping
    fun save(@RequestBody book: BookEntity): Boolean {
        return bookService.save(book)
    }

    @PutMapping
    fun update(@RequestBody book: BookEntity): Boolean {
        return bookService.updateById(book)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): Boolean {
        return bookService.removeById(id)
    }
}
