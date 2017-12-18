package net.jahhan.commonservice.dingtalk.vo.ovo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@ApiModel(value = "授权人员信息")
public class AuthOrgScopesOVO extends ResponseOVO implements Serializable {
    private static final long serialVersionUID = 10000000L;

    @ApiModelProperty(value = "企业授权的部门id列表")
    private List<Long> authed_dept;

    @ApiModelProperty(value = "企业授权的员工userid列表")
    private List<String> authed_user;
}
