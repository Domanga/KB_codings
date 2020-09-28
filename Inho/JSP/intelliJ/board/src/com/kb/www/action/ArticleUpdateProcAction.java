package com.kb.www.action;

import com.kb.www.common.Action;
import com.kb.www.common.ActionForward;
import com.kb.www.common.RegExp;
import com.kb.www.service.BoardService;
import com.kb.www.vo.ArticleVo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

import static com.kb.www.common.RegExp.ARTICLE_SUBJECT;
import static com.kb.www.common.RegExp.ARTICLE_CONTENT;

public class ArticleUpdateProcAction implements Action {
    @Override
    public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

        String number = request.getParameter("number");
        String title = request.getParameter("subject");
        String content = request.getParameter("content");

        if (title == null || title.equals("")
                || !RegExp.checkString(ARTICLE_SUBJECT, title)
                || content == null || content.equals("")
                || !RegExp.checkString(ARTICLE_CONTENT, content)) {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('잘못된 접근입니다.');location.href='/';</script>");
            out.close();
            return null;
        }

        int buff = Integer.parseInt(number);
        if (buff <= 0) {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('잘못된 접근입니다.');location.href='/';</script>");
            out.close();
            return null;
        }

        ArticleVo update = new ArticleVo();
        update.setArticleNumber(buff);
        update.setArticleTitle(title);
        update.setArticleContents(content);

        BoardService bsv = new BoardService();
        if(!bsv.updateArticle(update)) {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('글 수정 실패'); location.href='/list.do'; </script>");
            out.close();
            return null;
        }

        ActionForward forward = new ActionForward();

        forward.setPath("/list.do");
        forward.setRedirect(true);

        return forward;
    }
}
