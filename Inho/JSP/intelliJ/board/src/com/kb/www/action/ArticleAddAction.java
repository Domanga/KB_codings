package com.kb.www.action;

import com.kb.www.common.Action;
import com.kb.www.common.ActionForward;
import com.kb.www.common.LoginManager;
import com.kb.www.common.RegExp;
import com.kb.www.service.BoardService;
import com.kb.www.vo.ArticleVo;
import com.kb.www.vo.MemberVo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

import static com.kb.www.common.RegExp.ARTICLE_CONTENT;
import static com.kb.www.common.RegExp.ARTICLE_SUBJECT;

public class ArticleAddAction implements Action {
    @Override
    public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ArticleVo insert = new ArticleVo();

        String title = request.getParameter("subject");
        String content = request.getParameter("content");

        HttpSession session = request.getSession();
        LoginManager lm = LoginManager.getInstance();

        String id = lm.getMemberId(session);
        MemberVo memberVo = new MemberVo();
        memberVo.setId(lm.getMemberId(session));

        if ((title == null || title.equals("") || !RegExp.checkString(ARTICLE_SUBJECT, title))
                && (content == null || content.equals("") || !RegExp.checkString(ARTICLE_CONTENT, content))) {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('잘못된 접근입니다1.'); location.href='/list.do'; </script>");
            out.close();
            return null;
        }

        BoardService bsv = new BoardService();

        insert.setArticleTitle(title);
        insert.setArticleContents(content);
        insert.setMb_sq(bsv.getMemberSequence(id));

        if(!bsv.addArticle(insert)) {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('글 저장 실패'); location.href='/list.do'; </script>");
            out.close();
            return null;
        }

        ActionForward forward = new ActionForward();

        forward.setPath("/list.do");
        forward.setRedirect(true);
        return forward;
    }
}
