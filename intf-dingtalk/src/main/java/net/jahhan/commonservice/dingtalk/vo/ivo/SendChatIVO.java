package net.jahhan.commonservice.dingtalk.vo.ivo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "消息体")
public class SendChatIVO implements Serializable {

	private static final long serialVersionUID = 10000000L;

	@ApiModelProperty(value = "群会话的id")
	private String chatid;

	@ApiModelProperty(value = "消息类型")
	private String msgtype;

	@ApiModelProperty(value = "卡片消息")
	private ActionCardIVO action_card;

	@ApiModelProperty(value = "text消息")
	private MessageContentIVO text;

	@ApiModelProperty(value = "image消息")
	private MediaIdIVO image;

	@ApiModelProperty(value = "voice消息")
	private VoiceIVO voice;

	@ApiModelProperty(value = "file消息")
	private MediaIdIVO file;

	@ApiModelProperty(value = "link消息")
	private LinkIVO link;

	@ApiModelProperty(value = "oa消息")
	private OAIVO oa;

	@ApiModelProperty(value = "markdown消息")
	private MarkDownIVO markdown;
}