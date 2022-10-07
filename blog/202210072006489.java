package com.botao.platform.service;

import com.botao.platform.domain.TbRecruitSign;
import com.botao.platform.domain.vo.TbRecruitSignVo;
import com.botao.platform.domain.bo.TbRecruitSignBo;
import com.botao.common.core.page.TableDataInfo;
import com.botao.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * 招聘标签管理Service接口
 *
 *
 * @date 2022-09-11
 */
public interface ITbRecruitSignService {

    /**
     * 查询招聘标签管理
     */
    TbRecruitSignVo queryById(Long tbRecruitId);

    /**
     * 查询招聘标签管理列表
     */
    TableDataInfo<TbRecruitSignVo> queryPageList(TbRecruitSignBo bo, PageQuery pageQuery);

    /**
     * 查询招聘标签管理列表
     */
    List<TbRecruitSignVo> queryList(TbRecruitSignBo bo);

    /**
     * 修改招聘标签管理
     */
    Boolean insertByBo(TbRecruitSignBo bo);

    /**
     * 修改招聘标签管理
     */
    Boolean updateByBo(TbRecruitSignBo bo);

    /**
     * 校验并批量删除招聘标签管理信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
