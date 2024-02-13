package org.zerock.w1.filter;

import lombok.extern.log4j.Log4j2;
import org.zerock.w1.dto.MemberDTO;
import org.zerock.w1.service.MemberService;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Arrays;
import java.util.Optional;

@WebFilter(urlPatterns = {"/todo/*"})
@Log4j2
public class LoginCheckFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("Login check filter....");

        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;

        HttpSession session = req.getSession();

        if (session.getAttribute("loginInfo") == null) {
            resp.sendRedirect("/login");

            return;
        }

        Cookie cookie = findCookie(req.getCookies(), "remember-me");

        if (cookie == null) {
            resp.sendRedirect("/login");
            return;
        }

        log.info("cookie는 존재하는 상황");
        String  uuid = cookie.getValue();

        try {
            MemberDTO memberDTO = MemberService.INSTANCE.getByUUID(uuid);
            log.info("쿠키의 값으로 조회한 사용자 정보: " + memberDTO);

            if (memberDTO == null) {
                throw new Exception("Cookie value is not valied");
            }

            session.setAttribute("loginInfo", memberDTO);
            filterChain.doFilter(servletRequest, servletResponse);
        }catch (Exception e) {
            e.printStackTrace();
            resp.sendRedirect("/login");
        }
    }

    private Cookie findCookie(Cookie[] cookies, String name){

        if (cookies == null || cookies.length == 0){
            return null;
        }

        Optional<Cookie> result = Arrays.stream(cookies)
                .filter(ck -> ck.getName().equals(name))
                .findFirst();

        return result.isPresent()?result.get():null;

    }
}