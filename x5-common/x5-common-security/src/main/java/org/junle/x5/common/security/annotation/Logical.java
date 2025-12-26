package org.junle.x5.common.security.annotation;

/**
 * 权限注解的验证模式
 * 
 * @author elnujuw
 *
 */
public enum Logical
{
    /**
     * 必须具有所有的元素
     */
    AND,

    /**
     * 只需具有其中一个元素
     */
    OR
}
