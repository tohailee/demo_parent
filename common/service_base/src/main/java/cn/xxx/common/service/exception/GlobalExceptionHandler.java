package cn.xxx.common.service.exception;

import cn.xxx.common.utils.ResultData;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author hailee
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultData error(){
        return ResultData.error().message("执行了全局的异常处理、、、");
    }
}
