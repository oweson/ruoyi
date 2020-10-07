package com.ruoyi.system.service.impl;

import java.util.List;
import java.util.concurrent.TimeUnit;

import com.alibaba.fastjson.JSON;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.uuid.UUID;
import com.ruoyi.system.domain.GzLessonTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cache.CacheProperties;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.GzLessonMapper;
import com.ruoyi.system.domain.GzLesson;
import com.ruoyi.system.service.IGzLessonService;
import com.ruoyi.common.core.text.Convert;

/**
 * 经验教训Service业务层处理
 *
 * @author ruoyi
 * @date 2020-07-31
 */
@Service
@CacheConfig(cacheNames = "lessons")
public class GzLessonServiceImpl implements IGzLessonService {
    @Autowired

    RedisTemplate redisTemplate;


    @Autowired
    private GzLessonMapper gzLessonMapper;

    @Override
    public GzLesson selectGzLessonByName(String name) {
        return gzLessonMapper.selectGzLessonByName(name);
    }

    /**
     * 查询经验教训
     *
     * @param id 经验教训ID
     * @return 经验教训
     */
    @Override
    @Cacheable(key = "'lessons-one-'+ #p0")
    public GzLesson selectGzLessonById(Long id) {
        GzLesson gzLesson = gzLessonMapper.selectGzLessonById(id);
        String toString = gzLesson.getLessonName()+": "+UUID.randomUUID().toString().replace("-","");
        redisTemplate.opsForValue().set(toString, JSON.toJSONString(gzLesson),300, TimeUnit.SECONDS);
        return gzLesson;
    }

    /**
     * 查询经验教训列表
     *
     * @param gzLesson 经验教训
     * @return 经验教训
     */
    // todo 有问题
    @Override
    @Cacheable(key = "'lessons-page-'+ #p0")
    public List<GzLesson> selectGzLessonList(GzLesson gzLesson) {
        return gzLessonMapper.selectGzLessonList(gzLesson);
    }

    /**
     * 新增经验教训
     *
     * @param gzLesson 经验教训
     * @return 结果
     */
    @Override
    @CacheEvict(allEntries = true)
    public int insertGzLesson(GzLesson gzLesson) {
        gzLesson.setCreateTime(DateUtils.getNowDate());
        return gzLessonMapper.insertGzLesson(gzLesson);
    }

    /**
     * 修改经验教训
     *
     * @param gzLesson 经验教训
     * @return 结果
     */
    @Override
    @CacheEvict(allEntries = true)
    public int updateGzLesson(GzLesson gzLesson) {
        return gzLessonMapper.updateGzLesson(gzLesson);
    }

    /**
     * 删除经验教训对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    @CacheEvict(allEntries = true)
    public int deleteGzLessonByIds(String ids) {
        return gzLessonMapper.deleteGzLessonByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除经验教训信息
     *
     * @param id 经验教训ID
     * @return 结果
     */
    @Override
    @CacheEvict(allEntries = true)
    public int deleteGzLessonById(Long id) {
        return gzLessonMapper.deleteGzLessonById(id);
    }
}
