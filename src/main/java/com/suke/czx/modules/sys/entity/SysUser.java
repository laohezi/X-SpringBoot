package com.suke.czx.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.suke.zhjg.common.autofull.annotation.AutoFullEmpty;
import com.suke.zhjg.common.autofull.annotation.AutoFullListSQL;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import jakarta.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 系统用户
 */
@Data
@TableName("sys_user")
@Schema(name = "系统用户")
public class SysUser implements Serializable {

    public static final long serialVersionUID = 1L;

    @TableId(value = "user_id", type = IdType.ASSIGN_UUID)
    public String userId;

    @Schema(name = "用户名", description = "用户名")
    @NotBlank(message = "用户名不能为空")
    public String username;

    @Schema(name = "姓名", description = "姓名")
    public String name;

    @AutoFullEmpty
    @Schema(name = "密码", description = "密码")
    public String password;

    @Schema(name = "邮箱", description = "邮箱")
    @NotBlank(message = "邮箱不能为空")
    public String email;

    @Schema(name = "手机号", description = "手机号")
    public String mobile;

    @Schema(name = "头像", description = "头像")
    public String photo;

    @Schema(name = "状态", description = "状态  0：禁用   1：正常")
    public Integer status;

    @Schema(name = "创建者ID", description = "创建者ID")
    public String createUserId;

    @Schema(name = "创建时间", description = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date createTime;

    @TableField(exist = false)
    @Schema(name = "角色ID", description = "角色ID")
    @AutoFullListSQL(sql = "select role_id as roleIdList from sys_user_role where user_id = {userId}")
    public List<Long> roleIdList;
}