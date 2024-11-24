package com.suke.czx.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 角色与菜单对应关系
 */
@Data
@TableName("sys_role_menu")
@Schema(name = "角色与菜单对应关系")
public class SysRoleMenu implements Serializable {

	@TableId(type = IdType.AUTO)
	public Long id;

	@Schema(name = "角色ID", description = "角色ID")
	public Long roleId;

	@Schema(name = "菜单ID", description = "菜单ID")
	public Long menuId;
}