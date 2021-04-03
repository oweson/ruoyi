
import java.util.Date;
import java.util.Random;
import java.util.UUID;

import com.google.common.collect.Maps;
import com.ruoyi.RuoYiApplication;
import com.ruoyi.system.domain.Card02;
import com.ruoyi.system.domain.LoverDesc;
import com.ruoyi.system.mapper.Card02Mapper;
import com.ruoyi.system.mapper.LoverDescMapper;
import com.ruoyi.system.service.ICard02Service;
import com.ruoyi.web.controller.demo.Cat;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2020/2/5 17:13
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RuoYiApplication.class)
@Rollback
public class SpringbootApplicationTest {
    @Autowired
    private ICard02Service card02Service;
    @Autowired
    private Card02Mapper card02Mapper;
    @Autowired
    LoverDescMapper loverDescMapper;
    @Autowired
    Cat cat;

    @Test
    public void demo1() {
        System.out.println(cat.toString());
    }

    @Test
    public void insert() {
        Card02 card02 = new Card02();
        card02.setId(100000L);
        card02.setCode("2020");
        card02.setCountry("china rpa");
        card02.setSearchValue("");
        card02.setCreateBy("");
        card02.setCreateTime(new Date());
        card02.setUpdateBy("");
        card02.setUpdateTime(new Date());
        card02.setRemark("");
        card02.setParams(Maps.newHashMap());
        int insertCard02 = card02Service.insertCard02(card02);
        Assert.assertEquals(1L, insertCard02);

    }

    @Test
    public void insert02() {
        Card02 card02 = new Card02();
        card02.setId(100000L);
        card02.setCode("2020");
        card02.setCountry("china rpa");
        card02.setSearchValue("");
        card02.setCreateBy("");
        card02.setCreateTime(new Date());
        card02.setUpdateBy("");
        card02.setUpdateTime(new Date());
        card02.setRemark("");
        card02.setParams(Maps.newHashMap());
        int insertCard02 = card02Mapper.insertCard02(card02);
        Assert.assertEquals(1L, insertCard02);

    }

    @Test
    public void save() {
        for (int i = 0; i < 1000000; i++) {

            LoverDesc loverDesc = new LoverDesc();
            //loverDesc.setId(0L);
            String substring = UUID.randomUUID().toString().substring(0, 9);
            loverDesc.setLoverName("善良" + i);
            loverDesc.setLoverAge(25L);
            loverDesc.setLoveWeight(50L);
            loverDesc.setLoverHair("黑色");
            loverDesc.setLoverDesc("可爱的，善良的");
            loverDesc.setLastUpdateTime(new Date());
            loverDesc.setSearchValue("");
            loverDesc.setCreateBy("");
            loverDesc.setCreateTime(new Date());
            loverDesc.setUpdateBy("");
            loverDesc.setUpdateTime(new Date());
            loverDesc.setRemark("");
            loverDesc.setParams(Maps.newHashMap());
            loverDescMapper.insertLoverDesc(loverDesc);


        }
    }

    @Test
    public void save02() {
        for (int i = 0; i < 1000000; i++) {

            LoverDesc loverDesc = new LoverDesc();
            //loverDesc.setId(0L);
            String substring = UUID.randomUUID().toString().substring(0, 9);
            loverDesc.setLoverName("善良" + i);
            loverDesc.setLoverAge(25L);
            loverDesc.setLoveWeight(50L);
            loverDesc.setLoverHair("黑色");
            loverDesc.setLoverDesc("可爱的，善良的");
            loverDesc.setLastUpdateTime(new Date());
            loverDesc.setSearchValue("");
            loverDesc.setCreateBy("");
            loverDesc.setCreateTime(new Date());
            loverDesc.setUpdateBy("");
            loverDesc.setUpdateTime(new Date());
            loverDesc.setRemark("");
            loverDesc.setParams(Maps.newHashMap());
            loverDescMapper.insertLoverDesc(loverDesc);


        }
    }
}
