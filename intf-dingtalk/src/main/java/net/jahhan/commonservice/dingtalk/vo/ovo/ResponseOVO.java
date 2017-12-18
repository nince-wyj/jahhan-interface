package net.jahhan.commonservice.dingtalk.vo.ovo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "基础应答信息")
public class ResponseOVO implements Serializable {
    private static final long serialVersionUID = 10000000L;

    @ApiModelProperty(value = "错误码")
    private Integer errcode;

    @ApiModelProperty(value = "错误信息")
    private String errmsg;
}
