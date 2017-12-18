package net.jahhan.commonservice.dingtalk.vo.ivo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@ApiModel(value = "OA消息体")
public class OABodyIVO implements Serializable {

	private static final long serialVersionUID = 10000000L;

	@ApiModelProperty(value = "消息体的标题")
	private String title;

	@ApiModelProperty(value = "消息体的表单，最多显示6个")
	private List<OABodyFormIVO> form;

	@ApiModelProperty(value = "单行富文本信息")
	private OABodyRichIVO rich;

	@ApiModelProperty(value = "消息体的内容，最多显示3行")
	private String content;

	@ApiModelProperty(value = "消息体中的图片media_id")
	private String image;

	@ApiModelProperty(value = "自定义的附件数目。")
	private String file_count;

	@ApiModelProperty(value = "自定义的作者名字")
	private String author;
}