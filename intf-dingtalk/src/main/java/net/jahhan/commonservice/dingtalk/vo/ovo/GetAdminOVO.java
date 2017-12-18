package net.jahhan.commonservice.dingtalk.vo.ovo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "管理员基础信息")
public class GetAdminOVO implements Serializable {
    private static final long serialVersionUID = 10000000L;

    @ApiModelProperty(value = "管理员角色 1:主管理员,2:子管理员")
    private Integer sys_level;

    @ApiModelProperty(value = "用户ID")
    private String userid;
}
