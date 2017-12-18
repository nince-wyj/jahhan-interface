package net.jahhan.commonservice.dingtalk.vo.ovo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "返回成员基本信息")
public class UserOVO implements Serializable {
    private static final long serialVersionUID = 10000000L;

    @ApiModelProperty(value = "员工唯一标识ID")
    private String userid;

    @ApiModelProperty(value = "成员名称")
    private String name;
}
