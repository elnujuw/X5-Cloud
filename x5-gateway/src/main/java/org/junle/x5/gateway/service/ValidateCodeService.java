package org.junle.x5.gateway.service;

import java.io.IOException;
import org.junle.x5.common.core.exception.CaptchaException;
import org.junle.x5.common.core.web.domain.AjaxResult;

/**
 * 验证码处理
 *
 * @author elnujuw
 */
public interface ValidateCodeService
{
    /**
     * 生成验证码
     */
    public AjaxResult createCaptcha() throws IOException, CaptchaException;

    /**
     * 校验验证码
     */
    public void checkCaptcha(String key, String value) throws CaptchaException;
}
