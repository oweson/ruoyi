package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ThreadTrainTicketMapper;
import com.ruoyi.system.domain.ThreadTrainTicket;
import com.ruoyi.system.service.IThreadTrainTicketService;
import com.ruoyi.common.core.text.Convert;

/**
 * 并发测试线程安全火车票测试Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-04-17
 */
@Service
public class ThreadTrainTicketServiceImpl implements IThreadTrainTicketService 
{
    @Autowired
    private ThreadTrainTicketMapper threadTrainTicketMapper;

    /**
     * 查询并发测试线程安全火车票测试
     * 
     * @param id 并发测试线程安全火车票测试ID
     * @return 并发测试线程安全火车票测试
     */
    @Override
    public ThreadTrainTicket selectThreadTrainTicketById(Long id)
    {
        return threadTrainTicketMapper.selectThreadTrainTicketById(id);
    }

    /**
     * 查询并发测试线程安全火车票测试列表
     * 
     * @param threadTrainTicket 并发测试线程安全火车票测试
     * @return 并发测试线程安全火车票测试
     */
    @Override
    public List<ThreadTrainTicket> selectThreadTrainTicketList(ThreadTrainTicket threadTrainTicket)
    {
        return threadTrainTicketMapper.selectThreadTrainTicketList(threadTrainTicket);
    }

    /**
     * 新增并发测试线程安全火车票测试
     * 
     * @param threadTrainTicket 并发测试线程安全火车票测试
     * @return 结果
     */
    @Override
    public int insertThreadTrainTicket(ThreadTrainTicket threadTrainTicket)
    {
        return threadTrainTicketMapper.insertThreadTrainTicket(threadTrainTicket);
    }

    /**
     * 修改并发测试线程安全火车票测试
     * 
     * @param threadTrainTicket 并发测试线程安全火车票测试
     * @return 结果
     */
    @Override
    public int updateThreadTrainTicket(ThreadTrainTicket threadTrainTicket)
    {
        return threadTrainTicketMapper.updateThreadTrainTicket(threadTrainTicket);
    }

    /**
     * 删除并发测试线程安全火车票测试对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteThreadTrainTicketByIds(String ids)
    {
        return threadTrainTicketMapper.deleteThreadTrainTicketByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除并发测试线程安全火车票测试信息
     * 
     * @param id 并发测试线程安全火车票测试ID
     * @return 结果
     */
    @Override
    public int deleteThreadTrainTicketById(Long id)
    {
        return threadTrainTicketMapper.deleteThreadTrainTicketById(id);
    }
}
