package net.jahhan.commonservice.datacollector.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;


@Data
@ApiModel(value = "事件信息")
public class EventVO implements Serializable {

    private static final long serialVersionUID = 10000000L;

    @NotNull(message = "app不能为空")
    @ApiModelProperty(value = "应用名称")
    private String app;

    @NotNull(message = "xwho不能为空")
    @ApiModelProperty(value = "xwho")
    private String xwho;

    @NotNull(message = "xwhen不能为空")
    @ApiModelProperty(value = "xwhen 发生时间")
    private Date xwhen;

    @NotNull(message = "事件名称不能为空")
    @ApiModelProperty(value = "事件名称")
    @Length(min = 0, max = 128, message = "xwhat字符串长度需小于128")
    private String xwhat;

    @NotNull(message = "xwhere不能为空")
    @ApiModelProperty(value = "ip")
    @Length(min = 0, max = 64, message = "xwhat字符串长度需小于64")
    private String xwhere;

    @NotNull(message = "xcontext不能为空")
    @ApiModelProperty(value = "上下文信息")
    private Map<String,String> xcontext;
}