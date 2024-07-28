package com.lingyi.common.web.exception;

import com.lingyi.common.result.IResultCode;
import lombok.Getter;

/**
 * 自定义业务异常
 *
 * @author Yixiaoyi03
 * @date 2022/7/31
 */
@Getter
public class BizException extends RuntimeException {

    public IResultCode resultCode;

    public BizException(IResultCode errorCode) {
        super(errorCode.getMsg());
        this.resultCode = errorCode;
    }

    public BizException(String message){
        super(message);
    }

    public BizException(String message, Throwable cause){
        super(message, cause);
    }

    public BizException(Throwable cause){
        super(cause);
    }


}
