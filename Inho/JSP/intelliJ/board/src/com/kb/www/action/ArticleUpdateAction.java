package com.kb.www.action;

import com.kb.www.common.Action;
import com.kb.www.common.ActionForward;
import com.kb.www.common.LoginManager;
import com.kb.www.common.RegExp;
import com.kb.www.service.BoardService;
import com.kb.www.vo.ArticleVo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

import static com.kb.www.common.RegExp.PAGE_NUM;

public class ArticleUpdateAction implements Action {
    @Override
    public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

        LoginManager lm = LoginManager.getInstance();
        String id = lm.getMemberId(request.getSession());

        if(id == null) {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('로그인이 필요한 서비스 입니다.'); location.href='/login.do'; </script>");
            out.close();
            return null;
        }

        String number = request.getParameter("number");

        if (number == null || number.equals("") || !RegExp.checkString(PAGE_NUM, number)) {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('잘못된 접근입니다.'); location.href='/list.do'; </script>");
            out.close();
            return null;
        }

        int buff = Integer.parseInt(number);
        if (buff <= 0) {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('잘못된 접근입니다.'); location.href='/list.do'; </script>");
            out.close();
            return null;
        }

        BoardService svc = new BoardService();
        ArticleVo article = svc.getArticle(buff);

        if( article == null ) {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('잘못된 접근입니다.'); location.href='/list.do'; </script>");
            out.close();
            return null;
        }

        if(!article.getId().equals(id) ) {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('잘못된 접근입니다.'); location.href='/login.do'; </script>");
            out.close();
            return null;
        }
        ActionForward forward = new ActionForward();
        request.setAttribute("article", article);
        forward.setPath("/views/updateForm.jsp");

        return forward;
    }
}
