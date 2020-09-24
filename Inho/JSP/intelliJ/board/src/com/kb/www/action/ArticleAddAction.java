package com.kb.www.action;

import com.kb.www.common.Action;
import com.kb.www.common.ActionForward;
import com.kb.www.service.BoardService;
import com.kb.www.vo.ArticleVo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

public class ArticleAddAction implements Action {
    @Override
    public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ArticleVo insert = new ArticleVo();
        String title = request.getParameter("subject");
        String content = request.getParameter("content");

        insert.setArticleTitle(title);
        insert.setArticleContents(content);

        BoardService bsv = new BoardService();

        bsv.addArticle(insert);

        ActionForward forward = new ActionForward();

        forward.setPath("/list");
        forward.setRedirect(true);
        return forward;
    }
}
