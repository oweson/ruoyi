package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ShijingMapper;
import com.ruoyi.system.domain.Shijing;
import com.ruoyi.system.service.IShijingService;
import com.ruoyi.common.core.text.Convert;

/**
 * shijingService业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-27
 */
@Service
public class ShijingServiceImpl implements IShijingService 
{
    @Autowired
    private ShijingMapper shijingMapper;

    /**
     * 查询shijing
     * 
     * @param title shijingID
     * @return shijing
     */
    @Override
    public Shijing selectShijingById(String title)
    {
        return shijingMapper.selectShijingById(title);
    }

    /**
     * 查询shijing列表
     * 
     * @param shijing shijing
     * @return shijing
     */
    @Override
    public List<Shijing> selectShijingList(Shijing shijing)
    {
        return shijingMapper.selectShijingList(shijing);
    }

    /**
     * 新增shijing
     * 
     * @param shijing shijing
     * @return 结果
     */
    @Override
    public int insertShijing(Shijing shijing)
    {
        return shijingMapper.insertShijing(shijing);
    }

    /**
     * 修改shijing
     * 
     * @param shijing shijing
     * @return 结果
     */
    @Override
    public int updateShijing(Shijing shijing)
    {
        return shijingMapper.updateShijing(shijing);
    }

    /**
     * 删除shijing对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteShijingByIds(String ids)
    {
        return shijingMapper.deleteShijingByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除shijing信息
     * 
     * @param title shijingID
     * @return 结果
     */
    @Override
    public int deleteShijingById(String title)
    {
        return shijingMapper.deleteShijingById(title);
    }
}
