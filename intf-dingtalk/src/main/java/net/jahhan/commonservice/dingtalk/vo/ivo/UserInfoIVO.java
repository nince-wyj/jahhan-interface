package net.jahhan.commonservice.dingtalk.vo.ivo;

import com.alibaba.dubbo.common.json.JSONObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Data
@ApiModel(value = "创建成员")
public class UserInfoIVO extends RequestIVO implements Serializable {
    private static final long serialVersionUID = 10000000L;

    @ApiModelProperty(value = "员工唯一标识ID。如果不传，服务器将自动生成一个userid")
    @Length(min = 1, max = 64, message = "长度为1~64个字符")
    private String userid;

    @ApiModelProperty(value = "成员名称。长度为1~64个字符")
    @NotNull(message = "name不能为空")
    @Length(min = 1, max = 64, message = "长度为1~64个字符")
    private String name;

    @ApiModelProperty(value = "在对应的部门中的排序, Map结构的json字符串, key是部门的Id, value是人员在这个部门的排序值")
    private JSONObject orderInDepts;

    @ApiModelProperty(value = "数组类型，数组里面值为整型，成员所属部门id列表")
    @NotNull(message = "department不能为空")
    private List<Long> department;

    @ApiModelProperty(value = "职位信息。长度为0~64个字符")
    @Length(min = 0, max = 64, message = "长度为0~64个字符")
    private String position;

    @ApiModelProperty(value = "手机号码。企业内必须唯一")
    @NotNull(message = "mobile不能为空")
    private String mobile;

    @ApiModelProperty(value = "分机号，长度为0~50个字符")
    @Length(min = 0, max = 50, message = "长度为0~50个字符")
    private String tel;

    @ApiModelProperty(value = "办公地点，长度为0~50个字符")
    @Length(min = 0, max = 50, message = "长度为0~50个字符")
    private String workPlace;

    @ApiModelProperty(value = "备注，长度为0~1000个字符")
    @Length(min = 0, max = 1000, message = "长度为0~1000个字符")
    private String remark;

    @ApiModelProperty(value = "邮箱。长度为0~64个字符。企业内必须唯一")
    @Email(message = "email格式不正确")
    @Length(min = 0, max = 64, message = "长度为0~64个字符")
    private String email;

    @ApiModelProperty(value = "员工工号。长度为0~64个字符")
    @Length(min = 0, max = 64, message = "长度为0~64个字符")
    private String jobnumber;

    @ApiModelProperty(value = "是否号码隐藏, true表示隐藏, false表示不隐藏。")
    private boolean isHide;

    @ApiModelProperty(value = "是否高管模式，true表示是，false表示不是。")
    private boolean isSenior;

    @ApiModelProperty(value = "扩展属性，可以设置多种属性")
    private Map<String, Object> extattr;
}
