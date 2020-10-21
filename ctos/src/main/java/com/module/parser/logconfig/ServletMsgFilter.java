package com.module.parser.logconfig;

import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 为http request请求打上唯一标识
 * MDC中的方法是静态的，但是是以每个线程为基础来进行管理的，允许每个服务线程都打上一个MDC标记。
 * MDC中的put()与get()操作仅仅只影响当前线程中的MDC，其它线程中的MDC不受影响。
 */
@Component
public class ServletMsgFilter implements Filter {

    private static final String SERVLET_MSG_ID = "servlet-message-id";

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;

        String servletMsgId = request.getHeader(SERVLET_MSG_ID);
        if(StringUtils.isEmpty(servletMsgId)){
            servletMsgId = UUIDUtil.generate();
        }

        MDC.put(SERVLET_MSG_ID, servletMsgId);

        try{
            filterChain.doFilter(servletRequest, servletResponse);
        } finally {
            MDC.remove(SERVLET_MSG_ID);
        }
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }

}
