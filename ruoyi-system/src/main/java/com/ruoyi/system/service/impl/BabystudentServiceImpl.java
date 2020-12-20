package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.uuid.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BabystudentMapper;
import com.ruoyi.system.domain.Babystudent;
import com.ruoyi.system.service.IBabystudentService;
import com.ruoyi.common.core.text.Convert;

/**
 * babynameService业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-18
 */
@Service
public class BabystudentServiceImpl implements IBabystudentService 
{
    @Autowired
    private BabystudentMapper babystudentMapper;

    /**
     * 查询babyname
     * 
     * @param id babynameID
     * @return babyname
     */
    @Override
    public Babystudent selectBabystudentById(String id)
    {
        return babystudentMapper.selectBabystudentById(id);
    }

    /**
     * 查询babyname列表
     * 
     * @param babystudent babyname
     * @return babyname
     */
    @Override
    public List<Babystudent> selectBabystudentList(Babystudent babystudent)
    {
        return babystudentMapper.selectBabystudentList(babystudent);
    }

    /**
     * 新增babyname
     * 
     * @param babystudent babyname
     * @return 结果
     */
    @Override
    public int insertBabystudent(Babystudent babystudent)
    {
        babystudent.setId(UUID.randomUUID().toString().replace("-",""));
        babystudent.setCreateTime(DateUtils.getNowDate());
        return babystudentMapper.insertBabystudent(babystudent);
    }

    /**
     * 修改babyname
     * 
     * @param babystudent babyname
     * @return 结果
     */
    @Override
    public int updateBabystudent(Babystudent babystudent)
    {
        return babystudentMapper.updateBabystudent(babystudent);
    }

    /**
     * 删除babyname对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteBabystudentByIds(String ids)
    {
        return babystudentMapper.deleteBabystudentByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除babyname信息
     * 
     * @param id babynameID
     * @return 结果
     */
    @Override
    public int deleteBabystudentById(String id)
    {
        return babystudentMapper.deleteBabystudentById(id);
    }
}
