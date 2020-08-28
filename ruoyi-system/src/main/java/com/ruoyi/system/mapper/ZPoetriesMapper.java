package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.ZPoetries;

/**
 * 诗歌数据库Mapper接口
 * 
 * @author ruoyi
 * @date 2020-08-28
 */
public interface ZPoetriesMapper 
{
    /**
     * 查询诗歌数据库
     * 
     * @param id 诗歌数据库ID
     * @return 诗歌数据库
     */
    public ZPoetries selectZPoetriesById(Long id);

    /**
     * 查询诗歌数据库列表
     * 
     * @param zPoetries 诗歌数据库
     * @return 诗歌数据库集合
     */
    public List<ZPoetries> selectZPoetriesList(ZPoetries zPoetries);

    /**
     * 新增诗歌数据库
     * 
     * @param zPoetries 诗歌数据库
     * @return 结果
     */
    public int insertZPoetries(ZPoetries zPoetries);

    /**
     * 修改诗歌数据库
     * 
     * @param zPoetries 诗歌数据库
     * @return 结果
     */
    public int updateZPoetries(ZPoetries zPoetries);

    /**
     * 删除诗歌数据库
     * 
     * @param id 诗歌数据库ID
     * @return 结果
     */
    public int deleteZPoetriesById(Long id);

    /**
     * 批量删除诗歌数据库
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteZPoetriesByIds(String[] ids);
}
