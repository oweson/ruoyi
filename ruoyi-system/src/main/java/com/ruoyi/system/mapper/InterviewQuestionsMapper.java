package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.InterviewQuestions;

/**
 * 面试问题Mapper接口
 * 
 * @author ruoyi
 * @date 2020-09-26
 */
public interface InterviewQuestionsMapper 
{
    /**
     * 查询面试问题
     * 
     * @param id 面试问题ID
     * @return 面试问题
     */
    public InterviewQuestions selectInterviewQuestionsById(Long id);

    /**
     * 查询面试问题列表
     * 
     * @param interviewQuestions 面试问题
     * @return 面试问题集合
     */
    public List<InterviewQuestions> selectInterviewQuestionsList(InterviewQuestions interviewQuestions);

    /**
     * 新增面试问题
     * 
     * @param interviewQuestions 面试问题
     * @return 结果
     */
    public int insertInterviewQuestions(InterviewQuestions interviewQuestions);

    /**
     * 修改面试问题
     * 
     * @param interviewQuestions 面试问题
     * @return 结果
     */
    public int updateInterviewQuestions(InterviewQuestions interviewQuestions);

    /**
     * 删除面试问题
     * 
     * @param id 面试问题ID
     * @return 结果
     */
    public int deleteInterviewQuestionsById(Long id);

    /**
     * 批量删除面试问题
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteInterviewQuestionsByIds(String[] ids);
}
