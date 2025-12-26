package org.junle.x5.system.service;

import java.util.Set;

import org.junle.x5.system.api.domain.SysUser;

/**
 * 权限信息 服务层
 * 
 * @author elnujuw
 */
public interface ISysPermissionService
{
    /**
     * 获取角色数据权限
     * 
     * @param userId 用户Id
     * @return 角色权限信息
     */
    public Set<String> getRolePermission(SysUser user);

    /**
     * 获取菜单数据权限
     * 
     * @param userId 用户Id
     * @return 菜单权限信息
     */
    public Set<String> getMenuPermission(SysUser user);
}
