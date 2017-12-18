package net.jahhan.commonservice.dingtalk.vo.ovo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "返回个人发送普通消息结果")
public class SendPersonalMessageOVO extends ResponseOVO implements Serializable {
    private static final long serialVersionUID = 10000000L;

    @ApiModelProperty(value = "工号")
    private String receiver;
}
