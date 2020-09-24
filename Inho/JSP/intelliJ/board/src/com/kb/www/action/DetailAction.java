package com.kb.www.action;

import com.kb.www.common.Action;
import com.kb.www.common.ActionForward;
import com.kb.www.service.BoardService;
import com.kb.www.vo.ArticleVo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DetailAction implements Action {

    public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {

        String number = request.getParameter("num");
        BoardService svc = new BoardService();
        ArticleVo article = svc.getArticle(number);

        ActionForward forward = new ActionForward();
        request.setAttribute("article", article);
        forward.setPath("/views/detail.jsp");

        return forward;
    }
}
