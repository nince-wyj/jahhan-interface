package net.jahhan.commonservice.dingtalk.vo.ivo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@ApiModel(value = "基础请求信息")
public class RequestIVO implements Serializable {
    private static final long serialVersionUID = 10000000L;

    @ApiModelProperty(value = "调用接口凭证")
    @NotNull(message = "access_token不能为空")
    private String access_token;
}
