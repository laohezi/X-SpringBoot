package com.suke.czx.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import java.util.Date;

/**
 * 系统日志
 *
 * @date 2017-03-08 10:40:56
 */
@Data
@Schema(name = "系统日志")
public class SysLog {

    @TableId(type = IdType.AUTO)
    public Long id;

    @Schema(name = "用户名", description = "用户名")
    public String username;

    @Schema(name = "用户操作", description = "用户操作")
    public String operation;

    @Schema(name = "请求方法", description = "请求方法")
    public String method;

    @Schema(name = "请求参数", description = "请求参数")
    public String params;

    @Schema(name = "执行时长(毫秒)", description = "执行时长(毫秒)")
    public Long time;

    @Schema(name = "IP地址", description = "IP地址")
    public String ip;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Schema(name = "创建时间", description = "创建时间")
    public Date createDate;
}