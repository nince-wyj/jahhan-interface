package net.jahhan.commonservice.dingtalk.vo.ivo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "卡片信息")
public class BtnJsonListIVO implements Serializable {

	private static final long serialVersionUID = 10000000L;

	@ApiModelProperty(value = "使用多Action样式时的按钮的标题")
	private String title;

	@ApiModelProperty(value = "使用多Action样式时的按钮的链接url")
	private String action_url;
}