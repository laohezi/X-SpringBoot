package com.suke.czx.modules.bookstore.sevice.impl

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.suke.czx.modules.bookstore.entity.BookEntity
import com.suke.czx.modules.bookstore.mapper.BookStoreMapper
import org.springframework.stereotype.Service

@Service
class BookStoreShelfServiceImpl : ServiceImpl<BookStoreMapper, BookEntity>(), BookStoreService{




}