package com.suke.czx.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

/**
 * 用户与角色对应关系
 */
@Data
@Schema(name = "用户与角色对应关系")
public class SysUserRole implements Serializable {

    @TableId
    @Schema(name = "ID", description = "ID")
    public Long id;

    @Schema(name = "用户ID", description = "用户ID")
    public String userId;

    @Schema(name = "角色ID", description = "角色ID")
    public Long roleId;
}