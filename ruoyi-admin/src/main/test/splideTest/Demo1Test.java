package splideTest;

import me.zhyd.hunter.entity.VirtualArticle;
import me.zhyd.hunter.processor.BlogHunterProcessor;
import me.zhyd.hunter.processor.HunterProcessor;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author oweson
 * @date 2020/11/15 11:01
 */


public class Demo1Test {
    public static void main(String[] args) {
        String url = "https://www.cnblogs.com/zhangyadong/p/oneblog.html";
        boolean convertImage = true;
        HunterProcessor hunter = new BlogHunterProcessor(url, convertImage);
        CopyOnWriteArrayList<VirtualArticle> list = hunter.execute();
        System.out.println(list);
    }
}
