package com.business.demo.demoone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>Title: Test</p>
 * <p>Description: </p>
 *
 * @Author yangtao
 * @Date 2018/8/27 14:06
 */
@Controller
public class Test {

    @RequestMapping(value="/index")
    public String indexHtml(){
        return "/index";
    }
    @RequestMapping(value="/about")
    public String aboutHtml(){
        return "/about";
    }
    @RequestMapping(value="/abCulture")
    public String abCultureHtml(){
        return "/ab-culture";
    }
    @RequestMapping(value="/abHonor")
    public String abHonorHtml(){
        return "/ab-honor";
    }
    @RequestMapping(value="/contact")
    public String contactHtml(){
        return "/contact";
    }
    @RequestMapping(value="/news")
    public String newsHtml(){
        return "/news";
    }
    @RequestMapping(value="/newsDetail")
    public String newsDetailHtml(){
        return "/news-detail";
    }
    @RequestMapping(value="/partner")
    public String partnerHtml(){
        return "/partner";
    }

    @RequestMapping(value="/products")
    public String productsHtml(){
        return "/products";
    }

    @RequestMapping(value="/productsDetail")
    public String productsDetailHtml(){
        return "/products-detail";
    }
}
