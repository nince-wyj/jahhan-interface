package net.jahhan.commonservice.dingtalk.intf;

import com.frameworkx.common.extension.constant.ContentType;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import net.jahhan.commonservice.dingtalk.vo.ovo.GetTokenOVO;

import javax.validation.constraints.NotNull;
import javax.ws.rs.*;

@Path("/")
@Consumes({ ContentType.APPLICATION_JSON_UTF_8 })
@Produces({ ContentType.APPLICATION_JSON_UTF_8 })
@Api("token接口")
public interface TokenIntf {
    @GET
    @Path("gettoken")
    @ApiOperation(value = "获取AccessToken")
    public GetTokenOVO getToken(
        @QueryParam(value = "corpid") @NotNull(message = "corpid不能为空") @ApiParam(value = "企业Id") String corpId,
        @QueryParam(value = "corpsecret") @NotNull(message = "corpsecret不能为空") @ApiParam(value = "企业应用的凭证密钥") String corpSecret
    );
}
