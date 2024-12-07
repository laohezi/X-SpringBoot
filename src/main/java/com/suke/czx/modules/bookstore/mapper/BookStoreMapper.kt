package com.suke.czx.modules.bookstore.mapper

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.suke.czx.modules.bookstore.entity.BookEntity
import org.apache.ibatis.annotations.Mapper

@Mapper
interface BookStoreMapper : BaseMapper<BookEntity>