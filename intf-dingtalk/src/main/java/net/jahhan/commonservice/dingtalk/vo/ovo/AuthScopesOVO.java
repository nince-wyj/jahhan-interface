package net.jahhan.commonservice.dingtalk.vo.ovo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@ApiModel(value = "返回通讯录权限")
public class AuthScopesOVO extends ResponseOVO implements Serializable {
    private static final long serialVersionUID = 10000000L;

    @ApiModelProperty(value = "企业用户字段。name:员工名称,email员工邮箱")
    private List<String> auth_user_field;

    @ApiModelProperty(value = "可以直接使用企业的功能字段")
    private List<String> condition_field;

    @ApiModelProperty(value = "授权人员信息")
    private AuthOrgScopesOVO auth_org_scopes;
}
