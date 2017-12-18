package net.jahhan.commonservice.dingtalk.vo.ivo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "卡片信息多action")
public class ActionCardBtnListIVO implements Serializable {

	private static final long serialVersionUID = 10000000L;

	@ApiModelProperty(value = "按钮标题")
	private String title;

	@ApiModelProperty(value = "按钮链接url")
	private String action_url;
}