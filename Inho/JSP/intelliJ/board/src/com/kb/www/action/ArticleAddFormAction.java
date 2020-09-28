package com.kb.www.action;

import com.kb.www.common.Action;
import com.kb.www.common.ActionForward;
import com.kb.www.common.LoginManager;
import com.kb.www.common.RegExp;
import com.kb.www.service.BoardService;
import com.kb.www.vo.ArticleVo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

import static com.kb.www.common.RegExp.ARTICLE_CONTENT;
import static com.kb.www.common.RegExp.ARTICLE_SUBJECT;

public class ArticleAddFormAction implements Action {
    @Override
    public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ArticleVo insert = new ArticleVo();

        LoginManager lm = LoginManager.getInstance();
        if(lm.getMemberId(request.getSession()) == null) {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('로그인이 필요한 서비스 입니다.'); location.href='/login.do'; </script>");
            out.close();
            return null;
        }

        ActionForward forward = new ActionForward();

        forward.setPath("/views/writeForm.jsp");
        forward.setRedirect(true);
        return forward;
    }
}
