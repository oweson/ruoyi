package dao;

import com.google.common.collect.Lists;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.file.FileUtils;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;

/**
 * @author chengwanli
 * @date 2020/10/1 21:47
 */


public class SthTest {
    public static void main(String[] args) {
        String s = "abcd";
        s = s.concat("ef");
        System.out.println(s);
        Optional<ArrayList<Object>> integers = Optional.ofNullable(Lists.newArrayList());
        ArrayList<Object> objects = integers.get();
        String json = "hello,123" +
                "hahah" +
                "";
        System.out.println(json);
        String html="";


        System.out.println(StringUtils.join(Lists.newArrayList(1, 2, 3).toArray(), ","));


        System.out.println(FileUtils.deleteFile("D:\\Coding\\A_other_version\\testonly\\youknow\\aaa.txt"));

    }
}
