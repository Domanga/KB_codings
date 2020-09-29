package com.kb.www.action;

import com.kb.www.common.Action;
import com.kb.www.common.ActionForward;
import com.kb.www.common.LoginManager;
import com.kb.www.common.RegExp;
import com.kb.www.service.BoardService;
import com.kb.www.vo.ArticleVo;
import com.kb.www.vo.MemberHistoryVo;
import com.kb.www.vo.MemberVo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

import static com.kb.www.common.RegExp.PAGE_NUM;
import static com.kb.www.contants.Constants.MEMBER_HISTORY_EVENT_LEAVE;

public class MemberLeaveAction implements Action {
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

        BoardService bsv = new BoardService();
        MemberVo memberVo = bsv.getMember(id);
        memberVo.setLgn_fl(false);
        memberVo.setLeave_fl(true);

        MemberHistoryVo memberHistoryVo = new MemberHistoryVo();
        memberHistoryVo.setMb_sq(memberVo.getSq());
        memberHistoryVo.setExt_type(MEMBER_HISTORY_EVENT_LEAVE);

        bsv.leaveMember(memberVo, memberHistoryVo);

        ActionForward forward = new ActionForward();

        forward.setPath("/logout.do");
        return forward;
    }
}
