package com.ruoyi.web.controller.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 报表
 *
 * @author ruoyi
 */
@Controller
@RequestMapping("/demo/report")
public class DemoReportController {
    private String prefix = "demo/report";

    /**
     * 1 百度ECharts
     */
    @GetMapping("/echarts")
    public String echarts() {
        return prefix + "/echarts";
    }

    /**
     * 2 图表插件
     */
    @GetMapping("/peity")
    public String peity() {
        return prefix + "/peity";
    }

    /**
     * 3 线状图插件
     */
    @GetMapping("/sparkline")
    public String sparkline() {
        return prefix + "/sparkline";
    }

    /**
     * 4 图表组合
     */
    @GetMapping("/metrics")
    public String metrics() {
        return prefix + "/metrics";
    }
}
