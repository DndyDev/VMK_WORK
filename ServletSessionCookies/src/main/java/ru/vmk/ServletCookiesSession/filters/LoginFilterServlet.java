package ru.vmk.ServletCookiesSession.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;

@WebFilter
public class LoginFilterServlet implements Filter {
    private FilterConfig filterConfig;
    private static ArrayList<String> pages;

    public LoginFilterServlet() {
        if (pages == null){
            pages = new ArrayList<String>();
        }
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        if(filterConfig.getInitParameter("active").equals("true")){
            HttpServletRequest req = (HttpServletRequest) servletRequest;
            String[] address = req.getRequestURI().split("/");
            String page = null;
            if(address[address.length - 1].indexOf(".jsp") > 0){
                page = address[address.length - 1];
            }
            if ((page != null) && page.equalsIgnoreCase("loginSuccess.jsp")) {
                if (page.contains("login.jsp")){
                    filterChain.doFilter(servletRequest,servletResponse);
                }else{
                    ServletContext context = filterConfig.getServletContext();
                    RequestDispatcher dispatcher = context.getRequestDispatcher("/login.jsp");
                    dispatcher.forward(servletRequest,servletResponse);

                }
            }else if(page != null){
                if (!pages.contains(page)){
                    pages.add(page);
                }
            }
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        filterConfig = null;
    }
}
