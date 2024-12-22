package com.ServletContextListener;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.entity.DictionaryEntity;
import com.service.DictionaryService;
import com.thread.MyThreadMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContextListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.annotation.WebListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 字典初始化监视器  用的是服务器监听,每次项目启动,都会调用这个类
 */
//@WebListener
public class DictionaryServletContextListener implements ServletContextListener {



}
