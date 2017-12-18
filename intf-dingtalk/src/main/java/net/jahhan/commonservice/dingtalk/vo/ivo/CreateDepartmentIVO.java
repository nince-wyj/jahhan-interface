package net.jahhan.commonservice.dingtalk.vo.ivo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import javax.ws.rs.DefaultValue;
import java.io.Serializable;

@Data
@ApiModel(value = "创建部门")
public class CreateDepartmentIVO implements Serializable {
    private static final long serialVersionUID = 10000000L;

    @ApiModelProperty(value = "部门名称")
    @NotNull(message = "name不能为空")
    @Length(min = 1, max = 64, message = "name长度为1~64个字符")
    private String name;

    @ApiModelProperty(value = "父部门id")
    @NotNull(message = "parentid不能为空")
    private String parentid;

    @ApiModelProperty(value = "在父部门中的次序值。order值小的排序靠前")
    private String order;

    @ApiModelProperty(value = "是否创建一个关联此部门的企业群，默认为false")
    @DefaultValue(value = "false")
    private Boolean createDeptGroup = false;

    @ApiModelProperty(value = "是否隐藏部门, true表示隐藏, false表示显示")
    private Boolean deptHiding;

    @ApiModelProperty(value = "可以查看指定隐藏部门的其他人员列表，如果部门隐藏，则此值生效，取值为其他的人员userid组成的的字符串，使用| 符号进行分割")
    private String deptPerimits;

    @ApiModelProperty(value = "可以查看指定隐藏部门的其他人员列表，如果部门隐藏，则此值生效，取值为其他的人员userid组成的的字符串，使用| 符号进行分割")
    private String userPerimits;

    @ApiModelProperty(value = "是否本部门的员工仅可见员工自己, 为true时，本部门员工默认只能看到员工自己")
    private Boolean outerDept;

    @ApiModelProperty(value = "本部门的员工仅可见员工自己为true时，可以配置额外可见部门，值为部门id组成的的字符串，使用|符号进行分割")
    private String outerPermitDepts;

    @ApiModelProperty(value = "本部门的员工仅可见员工自己为true时，可以配置额外可见人员，值为userid组成的的字符串，使用|符号进行分割")
    private String outerPermitUsers;
}
