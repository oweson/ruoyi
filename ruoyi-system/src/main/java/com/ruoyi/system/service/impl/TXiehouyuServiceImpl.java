package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TXiehouyuMapper;
import com.ruoyi.system.domain.TXiehouyu;
import com.ruoyi.system.service.ITXiehouyuService;
import com.ruoyi.common.core.text.Convert;

/**
 * 歇后语Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-05-16
 */
@Service
public class TXiehouyuServiceImpl implements ITXiehouyuService 
{
    @Autowired
    private TXiehouyuMapper tXiehouyuMapper;

    /**
     * 查询歇后语
     * 
     * @param id 歇后语ID
     * @return 歇后语
     */
    @Override
    public TXiehouyu selectTXiehouyuById(Long id)
    {
        return tXiehouyuMapper.selectTXiehouyuById(id);
    }

    /**
     * 查询歇后语列表
     * 
     * @param tXiehouyu 歇后语
     * @return 歇后语
     */
    @Override
    public List<TXiehouyu> selectTXiehouyuList(TXiehouyu tXiehouyu)
    {
        return tXiehouyuMapper.selectTXiehouyuList(tXiehouyu);
    }

    /**
     * 新增歇后语
     * 
     * @param tXiehouyu 歇后语
     * @return 结果
     */
    @Override
    public int insertTXiehouyu(TXiehouyu tXiehouyu)
    {
        tXiehouyu.setCreateTime(DateUtils.getNowDate());
        return tXiehouyuMapper.insertTXiehouyu(tXiehouyu);
    }

    /**
     * 修改歇后语
     * 
     * @param tXiehouyu 歇后语
     * @return 结果
     */
    @Override
    public int updateTXiehouyu(TXiehouyu tXiehouyu)
    {
        tXiehouyu.setUpdateTime(DateUtils.getNowDate());
        return tXiehouyuMapper.updateTXiehouyu(tXiehouyu);
    }

    /**
     * 删除歇后语对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTXiehouyuByIds(String ids)
    {
        return tXiehouyuMapper.deleteTXiehouyuByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除歇后语信息
     * 
     * @param id 歇后语ID
     * @return 结果
     */
    @Override
    public int deleteTXiehouyuById(Long id)
    {
        return tXiehouyuMapper.deleteTXiehouyuById(id);
    }
}
