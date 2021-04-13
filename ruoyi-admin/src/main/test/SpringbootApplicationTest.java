import com.google.common.collect.Maps;
import com.ruoyi.RuoYiApplication;
import com.ruoyi.system.domain.Card02;
import com.ruoyi.system.mapper.Card02Mapper;
import com.ruoyi.system.service.ICard02Service;
import com.ruoyi.web.controller.demo.Cat;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

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


}
