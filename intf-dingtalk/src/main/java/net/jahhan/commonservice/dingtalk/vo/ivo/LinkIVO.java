package net.jahhan.commonservice.dingtalk.vo.ivo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "link消息")
public class LinkIVO implements Serializable {

	private static final long serialVersionUID = 10000000L;

	@ApiModelProperty(value = "消息标题")
	private String title;

	@ApiModelProperty(value = "消息描述")
	private String text;

	@ApiModelProperty(value = "图片媒体文件id，可以调用上传媒体文件接口获取")
	private String pic_url;

	@ApiModelProperty(value = "消息点击链接地址")
	private String message_url;
}