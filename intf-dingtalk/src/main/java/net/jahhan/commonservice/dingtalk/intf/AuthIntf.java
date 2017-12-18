package net.jahhan.commonservice.dingtalk.intf;

import com.frameworkx.common.extension.constant.ContentType;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import net.jahhan.commonservice.dingtalk.vo.ovo.AuthScopesOVO;

import javax.validation.constraints.NotNull;
import javax.ws.rs.*;

@Path("/auth")
@Consumes({ ContentType.APPLICATION_JSON_UTF_8 })
@Produces({ ContentType.APPLICATION_JSON_UTF_8 })
@Api("权限接口")
public interface AuthIntf {
    @GET
    @Path("scopes")
    @ApiOperation(value = "获取通讯录权限")
    public AuthScopesOVO addressBookAuthScopes(
            @QueryParam(value = "access_token") @NotNull(message = "access_token不能为空") @ApiParam(value = "接口凭证") String accessToken
    );
}
