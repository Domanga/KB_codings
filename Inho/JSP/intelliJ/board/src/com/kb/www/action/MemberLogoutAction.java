package com.kb.www.action;

import com.kb.www.common.*;
import com.kb.www.service.BoardService;
import com.kb.www.vo.MemberHistoryVo;
import com.kb.www.vo.MemberVo;
import com.sun.net.httpserver.HttpExchange;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

import static com.kb.www.common.RegExp.MEMBER_ID;
import static com.kb.www.common.RegExp.MEMBER_PW;
import static com.kb.www.contants.Constants.MEMBER_HISTORY_EVENT_LOGIN;
import static com.kb.www.contants.Constants.MEMBER_HISTORY_EVENT_LOGOUT;

public class MemberLogoutAction implements Action {
    @Override
    public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HttpSession session = request.getSession();
        LoginManager lm = LoginManager.getInstance();
        String id = lm.getMemberId(session);

        ActionForward forward = new ActionForward();

        if(id != null) {
            lm.removeSession(id);
        }

        forward.setPath("/");
        forward.setRedirect(true);

        return forward;
    }

    public void logoutProc(String id) {
        MemberVo memberVo = new MemberVo();
        memberVo.setId(id);
        memberVo.setLgn_fl(false);

        MemberHistoryVo memberHistoryVo = new MemberHistoryVo();
        memberHistoryVo.setExt_type(MEMBER_HISTORY_EVENT_LOGOUT);

        BoardService service = new BoardService();
        if(!service.logoutMember(memberVo, memberHistoryVo)) {
            System.out.println("로그아웃 실패");
        }
    }
}
