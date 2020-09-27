package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.InterviewQuestionsMapper;
import com.ruoyi.system.domain.InterviewQuestions;
import com.ruoyi.system.service.IInterviewQuestionsService;
import com.ruoyi.common.core.text.Convert;

/**
 * 面试问题Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-26
 */
@Service
public class InterviewQuestionsServiceImpl implements IInterviewQuestionsService 
{
    @Autowired
    private InterviewQuestionsMapper interviewQuestionsMapper;

    /**
     * 查询面试问题
     * 
     * @param id 面试问题ID
     * @return 面试问题
     */
    @Override
    public InterviewQuestions selectInterviewQuestionsById(Long id)
    {
        return interviewQuestionsMapper.selectInterviewQuestionsById(id);
    }

    /**
     * 查询面试问题列表
     * 
     * @param interviewQuestions 面试问题
     * @return 面试问题
     */
    @Override
    public List<InterviewQuestions> selectInterviewQuestionsList(InterviewQuestions interviewQuestions)
    {
        return interviewQuestionsMapper.selectInterviewQuestionsList(interviewQuestions);
    }

    /**
     * 新增面试问题
     * 
     * @param interviewQuestions 面试问题
     * @return 结果
     */
    @Override
    public int insertInterviewQuestions(InterviewQuestions interviewQuestions)
    {
        interviewQuestions.setCreateTime(DateUtils.getNowDate());
        return interviewQuestionsMapper.insertInterviewQuestions(interviewQuestions);
    }

    /**
     * 修改面试问题
     * 
     * @param interviewQuestions 面试问题
     * @return 结果
     */
    @Override
    public int updateInterviewQuestions(InterviewQuestions interviewQuestions)
    {
        interviewQuestions.setUpdateTime(DateUtils.getNowDate());
        return interviewQuestionsMapper.updateInterviewQuestions(interviewQuestions);
    }

    /**
     * 删除面试问题对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteInterviewQuestionsByIds(String ids)
    {
        return interviewQuestionsMapper.deleteInterviewQuestionsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除面试问题信息
     * 
     * @param id 面试问题ID
     * @return 结果
     */
    @Override
    public int deleteInterviewQuestionsById(Long id)
    {
        return interviewQuestionsMapper.deleteInterviewQuestionsById(id);
    }
}
