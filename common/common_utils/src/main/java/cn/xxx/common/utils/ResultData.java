package cn.xxx.common.utils;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Collections;
import java.util.Map;

/**
 * 统一结果返回类---链式编程
 *
 * @author hailee
 */
@Data
public class ResultData {

    @ApiModelProperty(value = "是否成功")
    private Boolean success;

    @ApiModelProperty(value = "返回码")
    private Integer code;

    @ApiModelProperty(value = "返回信息")
    private String message;

    @ApiModelProperty(value = "返回数据")
    private Map<String,Object> data = Collections.emptyMap();

    private ResultData(){}

    public static ResultData ok(){
        ResultData result = new ResultData();
        result.setSuccess(Boolean.TRUE);
        result.setCode(ResultCode.SUCCESS);
        result.setMessage(Code.SUCCESS.name());
        return result;
    }

    public static ResultData error(){
        ResultData result = new ResultData();
        result.setSuccess(Boolean.FALSE);
        result.setCode(ResultCode.ERROR);
        result.setMessage(Code.ERROR.name());
        return result;
    }

    public ResultData code(int code){
        this.setCode(code);
        return this;
    }

    public ResultData message(String message){
        this.setMessage(message);
        return this;
    }

    public ResultData data(Map<String,Object> data){
        this.setData(data);
        return this;
    }
}
