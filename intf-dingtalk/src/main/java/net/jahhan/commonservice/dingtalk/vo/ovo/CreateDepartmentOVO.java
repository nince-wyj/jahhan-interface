package net.jahhan.commonservice.dingtalk.vo.ovo;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 返回创建部门信息结果
 */
public class CreateDepartmentOVO extends ResponseOVO implements Serializable {
    private static final long serialVersionUID = 10000000L;

    @ApiModelProperty(value = "创建的部门id")
    private Long id;
}
