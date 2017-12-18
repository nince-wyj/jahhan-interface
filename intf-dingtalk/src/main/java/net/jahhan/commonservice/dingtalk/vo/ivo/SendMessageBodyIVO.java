package net.jahhan.commonservice.dingtalk.vo.ivo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@ApiModel(value = "企业发送消息")
public class SendMessageBodyIVO implements Serializable {

	private static final long serialVersionUID = 10000000L;

	@ApiModelProperty(value = "消息类型。目前支持text、image、voice、file、link、OA、markdown消息类型")
	@NotNull(message = "msgtype不能为空")
	private String msgtype;

	@ApiModelProperty(value = "消息内容")
	@NotNull(message = "text不能为空")
	private MessageContentIVO text;
}