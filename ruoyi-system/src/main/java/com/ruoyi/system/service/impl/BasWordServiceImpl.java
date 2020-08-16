package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BasWordMapper;
import com.ruoyi.system.domain.BasWord;
import com.ruoyi.system.service.IBasWordService;
import com.ruoyi.common.core.text.Convert;

/**
 * wordService业务层处理
 * 
 * @author ruoyi
 * @date 2020-08-06
 */
@Service
public class BasWordServiceImpl implements IBasWordService 
{
    @Autowired
    private BasWordMapper basWordMapper;

    /**
     * 查询word
     * 
     * @param id wordID
     * @return word
     */
    @Override
    public BasWord selectBasWordById(Long id)
    {
        return basWordMapper.selectBasWordById(id);
    }

    /**
     * 查询word列表
     * 
     * @param basWord word
     * @return word
     */
    @Override
    public List<BasWord> selectBasWordList(BasWord basWord)
    {
        return basWordMapper.selectBasWordList(basWord);
    }

    /**
     * 新增word
     * 
     * @param basWord word
     * @return 结果
     */
    @Override
    public int insertBasWord(BasWord basWord)
    {
        return basWordMapper.insertBasWord(basWord);
    }

    /**
     * 修改word
     * 
     * @param basWord word
     * @return 结果
     */
    @Override
    public int updateBasWord(BasWord basWord)
    {
        return basWordMapper.updateBasWord(basWord);
    }

    /**
     * 删除word对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteBasWordByIds(String ids)
    {
        return basWordMapper.deleteBasWordByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除word信息
     * 
     * @param id wordID
     * @return 结果
     */
    @Override
    public int deleteBasWordById(Long id)
    {
        return basWordMapper.deleteBasWordById(id);
    }
}
