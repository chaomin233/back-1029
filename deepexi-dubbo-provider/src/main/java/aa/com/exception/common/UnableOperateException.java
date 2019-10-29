package aa.com.exception.common;

import aa.com.constant.BizCode;
import aa.com.exception.BizErrorResponseStatus;

@BizErrorResponseStatus(BizCode.UNABLE_OPERATE_ERROR)
public class UnableOperateException extends RuntimeException {

    public UnableOperateException(String message) {
        super(message);
    }

}
