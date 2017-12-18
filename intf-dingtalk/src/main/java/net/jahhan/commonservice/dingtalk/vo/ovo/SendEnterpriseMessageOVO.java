package net.jahhan.commonservice.dingtalk.vo.ovo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "返回企业发送消息结果")
public class SendEnterpriseMessageOVO extends ResponseOVO implements Serializable {
    private static final long serialVersionUID = 10000000L;

    @ApiModelProperty(value = "无效的userid，多个用|分隔")
    private String invaliduser;

    @ApiModelProperty(value = "无效的部门id，多个用|分隔")
    private String invalidparty;

    @ApiModelProperty(value = "因发送消息过于频繁或超量而被流控过滤后实际未发送的userid，多个用|分隔")
    private String forbiddenUserId;

    @ApiModelProperty(value = "标识企业消息的id，字符串，最长128个字符")
    private String messageId;
}
