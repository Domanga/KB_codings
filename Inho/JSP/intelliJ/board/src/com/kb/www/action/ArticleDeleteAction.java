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

public class ArticleDeleteAction implements Action {
    @Override
    public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

        ArticleVo delete = new ArticleVo();
        String number = request.getParameter("number");
        if (number == null || number.equals("") || !RegExp.checkString(PAGE_NUM, number)) {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('잘못된 접근입니다.'); location.href='/list.do'; </script>");
            out.close();
            return null;
        }

        delete.setArticleNumber(Integer.parseInt(number));

        int buff = Integer.parseInt(number);
        if (buff <= 0) {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('잘못된 접근입니다.'); location.href='/list.do'; </script>");
            out.close();
            return null;
        }

        BoardService bsv = new BoardService();
        if(!bsv.deleteArticle(delete)) {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('글 삭제 실패'); location.href='/list.do'; </script>");
            out.close();
            return null;
        }

        ActionForward forward = new ActionForward();

        forward.setPath("/list.do");
        return forward;
    }
}
