package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Mobile;

/**
 * 全国手机号码段归属地Service接口
 * 
 * @author ruoyi
 * @date 2020-08-06
 */
public interface IMobileService 
{
    /**
     * 查询全国手机号码段归属地
     * 
     * @param id 全国手机号码段归属地ID
     * @return 全国手机号码段归属地
     */
    public Mobile selectMobileById(Integer id);

    /**
     * 查询全国手机号码段归属地列表
     * 
     * @param mobile 全国手机号码段归属地
     * @return 全国手机号码段归属地集合
     */
    public List<Mobile> selectMobileList(Mobile mobile);

    /**
     * 新增全国手机号码段归属地
     * 
     * @param mobile 全国手机号码段归属地
     * @return 结果
     */
    public int insertMobile(Mobile mobile);

    /**
     * 修改全国手机号码段归属地
     * 
     * @param mobile 全国手机号码段归属地
     * @return 结果
     */
    public int updateMobile(Mobile mobile);

    /**
     * 批量删除全国手机号码段归属地
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteMobileByIds(String ids);

    /**
     * 删除全国手机号码段归属地信息
     * 
     * @param id 全国手机号码段归属地ID
     * @return 结果
     */
    public int deleteMobileById(Integer id);
}
