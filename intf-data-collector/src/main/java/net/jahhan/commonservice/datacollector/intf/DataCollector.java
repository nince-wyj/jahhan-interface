package net.jahhan.commonservice.datacollector.intf;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.jahhan.common.extension.constant.ContentType;
import net.jahhan.commonservice.datacollector.vo.EventVO;

import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("data/collector")
@Consumes({ContentType.APPLICATION_JSON_UTF_8})
@Produces({ContentType.APPLICATION_JSON_UTF_8})
@Api("数据采集接口")
public interface DataCollector {

    @POST
    @Path("event")
    @ApiOperation(value = "添加事件")
    void addEvent(@NotNull(message = "事件信息不能为空") EventVO event);

}
