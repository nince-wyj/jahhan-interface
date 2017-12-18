package net.jahhan.commonservice.dingtalk.vo.ivo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@ApiModel(value = "卡片信息")
public class ActionCardIVO implements Serializable {

	private static final long serialVersionUID = 10000000L;

	@ApiModelProperty(value = "透出到会话列表和通知的文案")
	private String title;

	@ApiModelProperty(value = "消息内容")
	private String markdown;

	@ApiModelProperty(value = "使用单一Action样式时的标题，必须与single_url同时设置")
	private String single_title;

	@ApiModelProperty(value = "使用单一Action样式时的链接url，必须与single_title同时设置")
	private String single_url;

	@ApiModelProperty(value = "使用多Action样式时的按钮排列方式，竖直排列(0)，横向排列(1)；必须与btn_json_list同时设置")
	private String btn_orientation;

	@ApiModelProperty(value = "使用多Action样式时的按钮列表；必须与btn_orientation同时设置")
	private List<ActionCardBtnListIVO> btn_json_list;

	@ApiModelProperty(value = "微应用agentid")
	private String agentid;
}