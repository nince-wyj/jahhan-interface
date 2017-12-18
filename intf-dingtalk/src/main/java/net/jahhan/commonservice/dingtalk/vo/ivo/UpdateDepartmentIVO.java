package net.jahhan.commonservice.dingtalk.vo.ivo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@ApiModel(value = "更新部门")
public class UpdateDepartmentIVO implements Serializable {
    private static final long serialVersionUID = 10000000L;

    @ApiModelProperty(value = "部门名称")
    @Length(min = 1, max = 64, message = "name长度为1~64个字符")
    private String name;

    @ApiModelProperty(value = "父部门id。根部门id为1")
    private String parentid;

    @ApiModelProperty(value = "在父部门中的次序值。order值小的排序靠前")
    private String order;

    @ApiModelProperty(value = "部门id")
    @NotNull(message = "id不能为空")
    private Long id;

    @ApiModelProperty(value = "是否创建一个关联此部门的企业群")
    private boolean createDeptGroup;

    @ApiModelProperty(value = "如果有新人加入部门是否会自动加入部门群")
    private boolean autoAddUser;

    @ApiModelProperty(value = "部门的主管列表,取值为由主管的userid组成的字符串，不同的userid使用’| 符号进行分割")
    private boolean deptManagerUseridList;

    @ApiModelProperty(value = "是否隐藏部门, true表示隐藏, false表示显示")
    private boolean deptHiding;

    @ApiModelProperty(value = "可以查看指定隐藏部门的其他部门列表，如果部门隐藏，则此值生效，取值为其他的部门id组成的的字符串，使用 | 符号进行分割")
    private String deptPerimits;

    @ApiModelProperty(value = "可以查看指定隐藏部门的其他人员列表，如果部门隐藏，则此值生效，取值为其他的人员userid组成的的字符串，使用| 符号进行分割")
    private String userPerimits;

    @ApiModelProperty(value = "是否本部门的员工仅可见员工自己, 为true时，本部门员工默认只能看到员工自己")
    private boolean outerDept;

    @ApiModelProperty(value = "本部门的员工仅可见员工自己为true时，可以配置额外可见部门，值为部门id组成的的字符串，使用|符号进行分割")
    private String outerPermitDepts;

    @ApiModelProperty(value = "本部门的员工仅可见员工自己为true时，可以配置额外可见人员，值为userid组成的的字符串，使用|符号进行分割")
    private String outerPermitUsers;

    @ApiModelProperty(value = "企业群群主")
    private String orgDeptOwner;
}
