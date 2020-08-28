package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.MobileMapper;
import com.ruoyi.system.domain.Mobile;
import com.ruoyi.system.service.IMobileService;
import com.ruoyi.common.core.text.Convert;

/**
 * 全国手机号码段归属地Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-08-28
 */
@Service
public class MobileServiceImpl implements IMobileService 
{
    @Autowired
    private MobileMapper mobileMapper;

    /**
     * 查询全国手机号码段归属地
     * 
     * @param id 全国手机号码段归属地ID
     * @return 全国手机号码段归属地
     */
    @Override
    public Mobile selectMobileById(Integer id)
    {
        return mobileMapper.selectMobileById(id);
    }

    /**
     * 查询全国手机号码段归属地列表
     * 
     * @param mobile 全国手机号码段归属地
     * @return 全国手机号码段归属地
     */
    @Override
    public List<Mobile> selectMobileList(Mobile mobile)
    {
        return mobileMapper.selectMobileList(mobile);
    }

    /**
     * 新增全国手机号码段归属地
     * 
     * @param mobile 全国手机号码段归属地
     * @return 结果
     */
    @Override
    public int insertMobile(Mobile mobile)
    {
        return mobileMapper.insertMobile(mobile);
    }

    /**
     * 修改全国手机号码段归属地
     * 
     * @param mobile 全国手机号码段归属地
     * @return 结果
     */
    @Override
    public int updateMobile(Mobile mobile)
    {
        return mobileMapper.updateMobile(mobile);
    }

    /**
     * 删除全国手机号码段归属地对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteMobileByIds(String ids)
    {
        return mobileMapper.deleteMobileByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除全国手机号码段归属地信息
     * 
     * @param id 全国手机号码段归属地ID
     * @return 结果
     */
    @Override
    public int deleteMobileById(Integer id)
    {
        return mobileMapper.deleteMobileById(id);
    }
}
