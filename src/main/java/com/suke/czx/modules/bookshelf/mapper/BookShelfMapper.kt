package com.suke.czx.modules.bookshelf.mapper

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.suke.czx.modules.bookstore.entity.BookEntity
import org.apache.ibatis.annotations.Mapper

@Mapper
interface BookShelfMapper : BaseMapper<BookEntity>