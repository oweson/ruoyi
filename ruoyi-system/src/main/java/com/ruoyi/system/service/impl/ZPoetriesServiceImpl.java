package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ZPoetriesMapper;
import com.ruoyi.system.domain.ZPoetries;
import com.ruoyi.system.service.IZPoetriesService;
import com.ruoyi.common.core.text.Convert;

/**
 * 诗歌数据库Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-08-28
 */
@Service
public class ZPoetriesServiceImpl implements IZPoetriesService 
{
    @Autowired
    private ZPoetriesMapper zPoetriesMapper;

    /**
     * 查询诗歌数据库
     * 
     * @param id 诗歌数据库ID
     * @return 诗歌数据库
     */
    @Override
    public ZPoetries selectZPoetriesById(Long id)
    {
        return zPoetriesMapper.selectZPoetriesById(id);
    }

    /**
     * 查询诗歌数据库列表
     * 
     * @param zPoetries 诗歌数据库
     * @return 诗歌数据库
     */
    @Override
    public List<ZPoetries> selectZPoetriesList(ZPoetries zPoetries)
    {
        return zPoetriesMapper.selectZPoetriesList(zPoetries);
    }

    /**
     * 新增诗歌数据库
     * 
     * @param zPoetries 诗歌数据库
     * @return 结果
     */
    @Override
    public int insertZPoetries(ZPoetries zPoetries)
    {
        return zPoetriesMapper.insertZPoetries(zPoetries);
    }

    /**
     * 修改诗歌数据库
     * 
     * @param zPoetries 诗歌数据库
     * @return 结果
     */
    @Override
    public int updateZPoetries(ZPoetries zPoetries)
    {
        return zPoetriesMapper.updateZPoetries(zPoetries);
    }

    /**
     * 删除诗歌数据库对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteZPoetriesByIds(String ids)
    {
        return zPoetriesMapper.deleteZPoetriesByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除诗歌数据库信息
     * 
     * @param id 诗歌数据库ID
     * @return 结果
     */
    @Override
    public int deleteZPoetriesById(Long id)
    {
        return zPoetriesMapper.deleteZPoetriesById(id);
    }
}
