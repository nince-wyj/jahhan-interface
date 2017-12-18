package net.jahhan.commonservice.dingtalk.vo.ovo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "返回部门列表中的详情")
public class GetDepartmentOVO extends DepartmentOVO implements Serializable {
    private static final long serialVersionUID = 10000000L;

    @ApiModelProperty(value = "在父部门中的次序值")
    private Long order;

    @ApiModelProperty(value = "是否隐藏部门, true表示隐藏, false表示显示")
    private Boolean deptHiding;

    @ApiModelProperty(value = "可以查看指定隐藏部门的其他部门列表，如果部门隐藏，则此值生效，取值为其他的部门id组成的的字符串，使用|符号进行分割")
    private String deptPerimits;

    @ApiModelProperty(value = "可以查看指定隐藏部门的其他人员列表，如果部门隐藏，则此值生效，取值为其他的人员userid组成的的字符串，使用|符号进行分割")
    private String userPerimits;

    @ApiModelProperty(value = "是否本部门的员工仅可见员工自己, 为true时，本部门员工默认只能看到员工自己")
    private Boolean outerDept;

    @ApiModelProperty(value = "本部门的员工仅可见员工自己为true时，可以配置额外可见部门，值为部门id组成的的字符串，使用|符号进行分割")
    private String outerPermitDepts;

    @ApiModelProperty(value = "本部门的员工仅可见员工自己为true时，可以配置额外可见人员，值为userid组成的的字符串，使用| 符号进行分割")
    private String outerPermitUsers;

    @ApiModelProperty(value = "企业群群主")
    private String orgDeptOwner;

    @ApiModelProperty(value = "部门的主管列表,取值为由主管的userid组成的字符串，不同的userid使用|符号进行分割")
    private String deptManagerUseridList;
}
