package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.MobileManagephone;

/**
 * 通讯录管理Service接口
 * 
 * @author ruoyi
 * @date 2021-02-28
 */
public interface IMobileManagephoneService 
{
    /**
     * 查询通讯录管理
     * 
     * @param id 通讯录管理ID
     * @return 通讯录管理
     */
    public MobileManagephone selectMobileManagephoneById(Integer id);

    /**
     * 查询通讯录管理列表
     * 
     * @param mobileManagephone 通讯录管理
     * @return 通讯录管理集合
     */
    public List<MobileManagephone> selectMobileManagephoneList(MobileManagephone mobileManagephone);

    /**
     * 新增通讯录管理
     * 
     * @param mobileManagephone 通讯录管理
     * @return 结果
     */
    public int insertMobileManagephone(MobileManagephone mobileManagephone);

    /**
     * 修改通讯录管理
     * 
     * @param mobileManagephone 通讯录管理
     * @return 结果
     */
    public int updateMobileManagephone(MobileManagephone mobileManagephone);

    /**
     * 批量删除通讯录管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteMobileManagephoneByIds(String ids);

    /**
     * 删除通讯录管理信息
     * 
     * @param id 通讯录管理ID
     * @return 结果
     */
    public int deleteMobileManagephoneById(Integer id);
}
