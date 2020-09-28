package com.kb.www.action;

import com.kb.www.common.Action;
import com.kb.www.common.ActionForward;
import com.kb.www.common.RegExp;
import com.kb.www.service.BoardService;
import com.kb.www.vo.ArticleVo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

import static com.kb.www.common.RegExp.PAGE_NUM;

public class ArticleUpdateAction implements Action {
    @Override
    public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

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
        ArticleVo article = svc.getArticle(number);

        if( article == null ) {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('잘못된 접근입니다.'); location.href='/list.do'; </script>");
            out.close();
            return null;
        }

        ActionForward forward = new ActionForward();
        request.setAttribute("article", article);
        forward.setPath("/views/updateForm.jsp");

        return forward;
    }
}
