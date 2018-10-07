package com.zhaolearn.zuul.filter;


import com.netflix.zuul.ZuulFilter;

import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;
import com.netflix.zuul.context.RequestContext;
import javax.servlet.http.HttpServletRequest;

@Component
public class MyFilter extends ZuulFilter {
    /**
     * filterType：返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型，具体如下：
     * pre：路由之前
     * routing：路由之时
     * post： 路由之后
     * error：发送错误调用
     */
    @Override
    public String filterType() {
        return "pre";
    }
    //过滤顺序
    @Override
    public int filterOrder() {
        return 0;
    }
    //这里可以写逻辑判断，是否要过滤，本文true,永远过滤。
    @Override
    public boolean shouldFilter() {
        return false;
    }
    /**
     * 过滤器的具体逻辑。可用很复杂，包括查sql，nosql去判断该请求到底有没有权限访问。
     * 这里是要你传入token，不然没了
     * 导入的包为
     * import com.netflix.zuul.context.RequestContext;
     * import javax.servlet.http.HttpServletRequest;
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        Object accessToken = request.getParameter("token");
        if(accessToken == null) {
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                //让浏览器用utf8来解析返回的数据
                ctx.getResponse().setHeader("Content-type", "text/html;charset=UTF-8");
                //告诉servlet用UTF-8转码，而不是用默认的ISO8859
                ctx.getResponse().setCharacterEncoding("UTF-8");
                ctx.getResponse().getWriter().write("没有传入Token哦");
            }catch (Exception e){}
            return null;
        }
        return null;
    }
}
