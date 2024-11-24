package com.suke.czx.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;

/**
 * 登录日志
 *
 * @author czx
 * @email object_czx@163.com
 */
@Data
@Schema(name = "登录日志", description = "登录日志实体")
@TableName("tb_login_log")
public class SysLoginLog {

    @TableId(value = "log_id", type = IdType.ASSIGN_UUID)
    @Schema(name = "日志ID", description = "日志ID", required = true)
    public String logId;

    @Schema(name = "用户名", description = "用户名", required = true)
    public String username;

    @Schema(name = "用户操作", description = "用户操作", required = true)
    public String optionName;

    @Schema(name = "操作终端", description = "操作终端", required = true)
    public String optionTerminal;

    @Schema(name = "IP地址", description = "IP地址", required = true)
    public String optionIp;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Schema(name = "创建时间", description = "创建时间", required = true)
    public Date optionTime;
}