package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BorrowMoneyMapper;
import com.ruoyi.system.domain.BorrowMoney;
import com.ruoyi.system.service.IBorrowMoneyService;
import com.ruoyi.common.core.text.Convert;

/**
 * borrow_moneyService业务层处理
 * 
 * @author ruoyi
 * @date 2020-11-23
 */
@Service
public class BorrowMoneyServiceImpl implements IBorrowMoneyService 
{
    @Autowired
    private BorrowMoneyMapper borrowMoneyMapper;

    /**
     * 查询borrow_money
     * 
     * @param id borrow_moneyID
     * @return borrow_money
     */
    @Override
    public BorrowMoney selectBorrowMoneyById(Long id)
    {
        return borrowMoneyMapper.selectBorrowMoneyById(id);
    }

    /**
     * 查询borrow_money列表
     * 
     * @param borrowMoney borrow_money
     * @return borrow_money
     */
    @Override
    public List<BorrowMoney> selectBorrowMoneyList(BorrowMoney borrowMoney)
    {
        return borrowMoneyMapper.selectBorrowMoneyList(borrowMoney);
    }

    /**
     * 新增borrow_money
     * 
     * @param borrowMoney borrow_money
     * @return 结果
     */
    @Override
    public int insertBorrowMoney(BorrowMoney borrowMoney)
    {
        borrowMoney.setCreateTime(DateUtils.getNowDate());
        return borrowMoneyMapper.insertBorrowMoney(borrowMoney);
    }

    /**
     * 修改borrow_money
     * 
     * @param borrowMoney borrow_money
     * @return 结果
     */
    @Override
    public int updateBorrowMoney(BorrowMoney borrowMoney)
    {
        borrowMoney.setUpdateTime(DateUtils.getNowDate());
        return borrowMoneyMapper.updateBorrowMoney(borrowMoney);
    }

    /**
     * 删除borrow_money对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteBorrowMoneyByIds(String ids)
    {
        return borrowMoneyMapper.deleteBorrowMoneyByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除borrow_money信息
     * 
     * @param id borrow_moneyID
     * @return 结果
     */
    @Override
    public int deleteBorrowMoneyById(Long id)
    {
        return borrowMoneyMapper.deleteBorrowMoneyById(id);
    }
}
