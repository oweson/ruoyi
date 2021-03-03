package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.MobileManagephoneMapper;
import com.ruoyi.system.domain.MobileManagephone;
import com.ruoyi.system.service.IMobileManagephoneService;
import com.ruoyi.common.core.text.Convert;

/**
 * 通讯录管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-02-28
 */
@Service
public class MobileManagephoneServiceImpl implements IMobileManagephoneService 
{
    @Autowired
    private MobileManagephoneMapper mobileManagephoneMapper;

    /**
     * 查询通讯录管理
     * 
     * @param id 通讯录管理ID
     * @return 通讯录管理
     */
    @Override
    public MobileManagephone selectMobileManagephoneById(Integer id)
    {
        return mobileManagephoneMapper.selectMobileManagephoneById(id);
    }

    /**
     * 查询通讯录管理列表
     * 
     * @param mobileManagephone 通讯录管理
     * @return 通讯录管理
     */
    @Override
    public List<MobileManagephone> selectMobileManagephoneList(MobileManagephone mobileManagephone)
    {
        return mobileManagephoneMapper.selectMobileManagephoneList(mobileManagephone);
    }

    /**
     * 新增通讯录管理
     * 
     * @param mobileManagephone 通讯录管理
     * @return 结果
     */
    @Override
    public int insertMobileManagephone(MobileManagephone mobileManagephone)
    {
        mobileManagephone.setCreateTime(DateUtils.getNowDate());
        return mobileManagephoneMapper.insertMobileManagephone(mobileManagephone);
    }

    /**
     * 修改通讯录管理
     * 
     * @param mobileManagephone 通讯录管理
     * @return 结果
     */
    @Override
    public int updateMobileManagephone(MobileManagephone mobileManagephone)
    {
        mobileManagephone.setUpdateTime(DateUtils.getNowDate());
        return mobileManagephoneMapper.updateMobileManagephone(mobileManagephone);
    }

    /**
     * 删除通讯录管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteMobileManagephoneByIds(String ids)
    {
        return mobileManagephoneMapper.deleteMobileManagephoneByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除通讯录管理信息
     * 
     * @param id 通讯录管理ID
     * @return 结果
     */
    @Override
    public int deleteMobileManagephoneById(Integer id)
    {
        return mobileManagephoneMapper.deleteMobileManagephoneById(id);
    }
}
