package com.kb.www.action;

import com.kb.www.common.*;
import com.kb.www.service.BoardService;
import com.kb.www.vo.MemberHistoryVo;
import com.kb.www.vo.MemberVo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

import static com.kb.www.common.RegExp.MEMBER_ID;
import static com.kb.www.common.RegExp.MEMBER_PW;
import static com.kb.www.contants.Constants.MEMBER_HISTORY_EVENT_LOGIN;

public class MemberLoginProcAction implements Action {
    @Override
    public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

        String id = request.getParameter("id");
        String pw = request.getParameter("pw");

        if (id == null || id.equals("")
                || !RegExp.checkString(MEMBER_ID, id)
                || pw == null || pw.equals("")
                || !RegExp.checkString(MEMBER_PW, pw)) {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('잘못된 접근입니다.');location.href='/';</script>");
            out.close();
            return null;
        }

        BoardService bsv = new BoardService();
        MemberVo memberVo = bsv.getMember(id);

        if(memberVo == null || !BCrypt.checkpw(pw, memberVo.getPw())) {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('ID 혹은 PW를 확인하세요.'); location.href='/'; </script>");
            out.close();
            return null;
        }

        if(memberVo.isLeave_fl()) {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('회원정보가 삭제되어 로그인할 수 없습니다.'); location.href='/'; </script>");
            out.close();
            return null;
        }

        memberVo.setLgn_fl(true);
        MemberHistoryVo memberHistoryVo = new MemberHistoryVo();
        memberHistoryVo.setMb_sq(memberVo.getSq());
        memberHistoryVo.setExt_type(MEMBER_HISTORY_EVENT_LOGIN);

        if(!bsv.loginMember(memberVo, memberHistoryVo)) {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('로그인에 실패하였습니다.'); location.href='/'; </script>");
            out.close();
            return null;
        }

        LoginManager lm = LoginManager.getInstance();
        lm.setSession(request.getSession(), memberVo.getId());

        ActionForward forward = new ActionForward();

        forward.setPath("/");
        forward.setRedirect(true);

        return forward;
    }
}
