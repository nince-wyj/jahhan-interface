package net.jahhan.commonservice.dingtalk.vo.ivo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@ApiModel(value = "获取部门列表")
public class GetDepartmentIVO extends RequestIVO implements Serializable {
    private static final long serialVersionUID = 10000000L;

    @ApiModelProperty(value = "通讯录语言(默认zh_CN另外支持en_US)")
    private String lang;

    @ApiModelProperty(value = "父部门id")
    @NotNull(message = "id不能为空")
    private String id;
}
