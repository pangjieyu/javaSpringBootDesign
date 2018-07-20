package com.exercise.mysys.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.reflect.GenericArrayType;

/**
 * @author 庞界宇
 * @ProjectName 食品企业订货销售系统
 * @date 2018/7/20
 */
@Controller
@RequestMapping(value = "/cangku")
public class CangkuController {
    @RequestMapping(value = "/ruku", method = RequestMethod.GET)
    public String ruku() {

        return "ruku";
    }

    @RequestMapping(value = "/chuku", method = RequestMethod.GET)
    public String chuku() {
        return "chuku";
    }

    @RequestMapping(value = "/xiaohui", method = RequestMethod.GET)
    public String xiaohui() {
        return "xiaohui";
    }
}
