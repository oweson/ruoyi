package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.ThreadTrainTicket;

/**
 * 并发测试线程安全火车票测试Service接口
 * 
 * @author ruoyi
 * @date 2020-04-17
 */
public interface IThreadTrainTicketService 
{
    /**
     * 查询并发测试线程安全火车票测试
     * 
     * @param id 并发测试线程安全火车票测试ID
     * @return 并发测试线程安全火车票测试
     */
    public ThreadTrainTicket selectThreadTrainTicketById(Long id);

    /**
     * 查询并发测试线程安全火车票测试列表
     * 
     * @param threadTrainTicket 并发测试线程安全火车票测试
     * @return 并发测试线程安全火车票测试集合
     */
    public List<ThreadTrainTicket> selectThreadTrainTicketList(ThreadTrainTicket threadTrainTicket);

    /**
     * 新增并发测试线程安全火车票测试
     * 
     * @param threadTrainTicket 并发测试线程安全火车票测试
     * @return 结果
     */
    public int insertThreadTrainTicket(ThreadTrainTicket threadTrainTicket);

    /**
     * 修改并发测试线程安全火车票测试
     * 
     * @param threadTrainTicket 并发测试线程安全火车票测试
     * @return 结果
     */
    public int updateThreadTrainTicket(ThreadTrainTicket threadTrainTicket);

    /**
     * 批量删除并发测试线程安全火车票测试
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteThreadTrainTicketByIds(String ids);

    /**
     * 删除并发测试线程安全火车票测试信息
     * 
     * @param id 并发测试线程安全火车票测试ID
     * @return 结果
     */
    public int deleteThreadTrainTicketById(Long id);
}
