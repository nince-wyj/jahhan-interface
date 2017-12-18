package net.jahhan.commonservice.dingtalk.vo.ovo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Data
@ApiModel(value = "返回成员详细信息")
public class UserListOVO implements Serializable {
    private static final long serialVersionUID = 10000000L;

    @ApiModelProperty(value = "员工唯一标识ID")
    private String userid;

    @ApiModelProperty(value = "部门中的排序")
    private String order;

    @ApiModelProperty(value = "钉钉ID")
    private String dingId;

    @ApiModelProperty(value = "手机号")
    private String mobile;

    @ApiModelProperty(value = "分机号")
    private String tel;

    @ApiModelProperty(value = "办公地点")
    private String workPlace;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "是否是企业的管理员")
    private boolean isAdmin;

    @ApiModelProperty(value = "是否为企业的老板")
    private boolean isBoss;

    @ApiModelProperty(value = "是否隐藏号码")
    private boolean isHide;

    @ApiModelProperty(value = "是否是部门的主管")
    private boolean isLeader;

    @ApiModelProperty(value = "成员名称")
    private String name;

    @ApiModelProperty(value = "是否激活了钉钉")
    private boolean active;

    @ApiModelProperty(value = "成员所属部门id列表")
    private List<Long> department;

    @ApiModelProperty(value = "职位信息")
    private String position;

    @ApiModelProperty(value = "员工的邮箱")
    private String email;

    @ApiModelProperty(value = "员工的企业邮箱")
    private String orgEmail;

    @ApiModelProperty(value = "头像url")
    private String avatar;

    @ApiModelProperty(value = "员工工号")
    private String jobnumber;

    @ApiModelProperty(value = "扩展属性")
    private Map<String, Object> extattr;
}
