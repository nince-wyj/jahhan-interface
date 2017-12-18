package net.jahhan.commonservice.dingtalk.intf;

import com.frameworkx.common.extension.constant.ContentType;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import net.jahhan.commonservice.dingtalk.vo.ivo.CreateDepartmentIVO;
import net.jahhan.commonservice.dingtalk.vo.ivo.UpdateDepartmentIVO;
import net.jahhan.commonservice.dingtalk.vo.ovo.CreateDepartmentOVO;
import net.jahhan.commonservice.dingtalk.vo.ovo.DepartmentListOVO;
import net.jahhan.commonservice.dingtalk.vo.ovo.GetDepartmentOVO;
import net.jahhan.commonservice.dingtalk.vo.ovo.ResponseOVO;

import javax.validation.constraints.NotNull;
import javax.ws.rs.*;

@Path("department")
@Consumes({ ContentType.APPLICATION_JSON_UTF_8 })
@Produces({ ContentType.APPLICATION_JSON_UTF_8 })
@Api("部门接口")
public interface DepartmentIntf {
    @GET
    @Path("list")
    @ApiOperation(value = "获取部门列表")
    public DepartmentListOVO listDepartmentInfo(
            @QueryParam(value = "access_token") @NotNull(message = "access_token不能为空") @ApiParam(value = "接口凭证") String accessToken,
            @QueryParam(value = "lang") @ApiParam(value = "通讯录语言(默认zh_CN另外支持en_US)") String lang,
            @QueryParam(value = "id") @NotNull(message = "父部门id不能为空") @ApiParam(value = "父部门id") Long id
    );

    @GET
    @Path("get")
    @ApiOperation(value = "获取部门详情")
    public GetDepartmentOVO getDepartmentDetailInfo(
            @QueryParam(value = "access_token") @NotNull(message = "access_token不能为空") @ApiParam(value = "接口凭证") String accessToken,
            @QueryParam(value = "lang") @ApiParam(value = "通讯录语言(默认zh_CN另外支持en_US)") String lang,
            @QueryParam(value = "id") @NotNull(message = "父部门id不能为空") @ApiParam(value = "父部门id") Long id
    );

    @POST
    @Path("create")
    @ApiOperation(value = "创建部门")
    public CreateDepartmentOVO createDepartmentInfo(
            @QueryParam(value = "access_token") @NotNull(message = "access_token不能为空") @ApiParam(value = "接口凭证") String accessToken,
            @NotNull(message = "部门信息不能为空") CreateDepartmentIVO createDepartmentIVO
    );

    @POST
    @Path("update")
    @ApiOperation(value = "修改部门")
    public ResponseOVO updateDepartmentInfo(
            @QueryParam(value = "access_token") @NotNull(message = "access_token不能为空") @ApiParam(value = "接口凭证") String accessToken,
            @QueryParam(value = "lang") @ApiParam(value = "通讯录语言(默认zh_CN另外支持en_US)") String lang,
            @NotNull(message = "部门信息不能为空") UpdateDepartmentIVO updateDepartmentIVO
    );

    @GET
    @Path("delete")
    @ApiOperation(value = "删除部门")
    public ResponseOVO deleteDepartentInfo(
        @QueryParam(value = "access_token") @NotNull(message = "access_token不能为空") @ApiParam(value = "接口凭证") String accessToken,
        @QueryParam(value = "id") @NotNull(message = "id不能为空") @ApiParam(value = "部门id。（注：不能删除根部门；不能删除含有子部门、成员的部门）") Long userid
    );
}
