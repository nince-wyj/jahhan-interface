package net.jahhan.commonservice.dingtalk.vo.ovo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "返回部门信息")
public class DepartmentOVO implements Serializable {
    private static final long serialVersionUID = 10000000L;

    @ApiModelProperty(value = "部门id")
    private Long id;

    @ApiModelProperty(value = "部门名称")
    private String name;

    @ApiModelProperty(value = "父部门id，根部门为1")
    private Long parentid;

    @ApiModelProperty(value = "是否同步创建一个关联此部门的企业群, true表示是, false表示不是")
    private Boolean createDeptGroup;

    @ApiModelProperty(value = "当群已经创建后，是否有新人加入部门会自动加入该群, true表示是, false表示不是")
    private Boolean autoAddUser;
}
