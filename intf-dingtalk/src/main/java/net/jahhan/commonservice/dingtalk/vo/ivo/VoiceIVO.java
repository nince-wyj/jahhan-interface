package net.jahhan.commonservice.dingtalk.vo.ivo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "voice消息")
public class VoiceIVO implements Serializable {

	private static final long serialVersionUID = 10000000L;

	@ApiModelProperty(value = "语音媒体文件id。2MB，播放长度不超过60s，AMR格式")
	private String media_id;

	@ApiModelProperty(value = "正整数，小于60，表示音频时长")
	private String duration;
}