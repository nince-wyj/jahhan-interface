package net.jahhan.commonservice.dingtalk.vo.ovo;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 返回token信息
 */
public class GetTokenOVO extends ResponseOVO implements Serializable {
    private static final long serialVersionUID = 10000000L;

    @ApiModelProperty(value = "获取到的凭证")
    private String access_token;
}
