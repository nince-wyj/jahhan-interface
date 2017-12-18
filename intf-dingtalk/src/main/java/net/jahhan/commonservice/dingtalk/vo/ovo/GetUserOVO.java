package net.jahhan.commonservice.dingtalk.vo.ovo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Data
@ApiModel(value = "返回成员信息")
public class GetUserOVO extends ResponseOVO implements Serializable {
    private static final long serialVersionUID = 10000000L;

    @ApiModelProperty(value = "员工唯一标识ID")
    private String userid;

    @ApiModelProperty(value = "成员名称")
    private String name;

    @ApiModelProperty(value = "分机号（ISV不可见）")
    private String tel;

    @ApiModelProperty(value = "办公地点（ISV不可见）")
    private String workPlace;

    @ApiModelProperty(value = "备注（ISV不可见）")
    private String remark;

    @ApiModelProperty(value = "手机号码（ISV不可见）")
    private String mobile;

    @ApiModelProperty(value = "员工的电子邮箱（ISV不可见）")
    private String email;

    @ApiModelProperty(value = "员工的企业邮箱（ISV不可见）")
    private String orgEmail;

    @ApiModelProperty(value = "是否已经激活, true表示已激活, false表示未激活")
    private boolean active;

    @ApiModelProperty(value = "在对应的部门中的排序, Map结构的json字符串, key是部门的Id, value是人员在这个部门的排序值")
    private String orderInDepts;

    @ApiModelProperty(value = "是否为企业的管理员, true表示是, false表示不是")
    private boolean isAdmin;

    @ApiModelProperty(value = "是否为企业的老板, true表示是, false表示不是")
    private boolean isBoss;

    @ApiModelProperty(value = "钉钉Id,在钉钉全局范围内标识用户的身份,但用户可以自行修改一次")
    private String dingId;

    @ApiModelProperty(value = "在当前isv全局范围内唯一标识一个用户的身份")
    private String unionid;

    @ApiModelProperty(value = "在对应的部门中是否为主管, Map结构的json字符串, key是部门的Id, value是人员在这个部门中是否为主管, true表示是, false表示不是")
    private String isLeaderInDepts;

    @ApiModelProperty(value = "是否号码隐藏, true表示隐藏, false表示不隐藏")
    private boolean isHide;

    @ApiModelProperty(value = "成员所属部门id列表")
    private List<Long> department;

    @ApiModelProperty(value = "职位信息")
    private String position;

    @ApiModelProperty(value = "头像url")
    private String avatar;

    @ApiModelProperty(value = "员工工号")
    private String jobnumber;

    @ApiModelProperty(value = "扩展属性，可以设置多种属性(但手机上最多只能显示10个扩展属性)")
    private Map<String, Object> extattr;
}
