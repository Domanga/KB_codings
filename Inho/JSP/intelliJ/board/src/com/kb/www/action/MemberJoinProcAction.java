package com.kb.www.action;

import com.kb.www.common.Action;
import com.kb.www.common.ActionForward;
import com.kb.www.common.BCrypt;
import com.kb.www.common.RegExp;
import com.kb.www.service.BoardService;
import com.kb.www.vo.MemberHistoryVo;
import com.kb.www.vo.MemberVo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

import static com.kb.www.contants.Constants.MEMBER_HISTORY_EVENT_JOIN;
import static com.kb.www.common.RegExp.MEMBER_ID;
import static com.kb.www.common.RegExp.MEMBER_PW;

public class MemberJoinProcAction implements Action {
    @Override
    public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

        String id = request.getParameter("id");
        String pw = request.getParameter("pw");
        String pw_confirm = request.getParameter("pw_confirm");

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

        if(!pw_confirm.equals(pw)) {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('잘못된 접근입니다.');location.href='/';</script>");
            out.close();
        }

        MemberVo memberVo = new MemberVo();
        memberVo.setId(id);
        memberVo.setPw(BCrypt.hashpw(pw, BCrypt.gensalt(12)));

        MemberHistoryVo memberHistoryVo = new MemberHistoryVo();
        memberHistoryVo.setExt_type(MEMBER_HISTORY_EVENT_JOIN);

        BoardService bsv = new BoardService();
        if(!bsv.joinMember(memberVo, memberHistoryVo)) {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('회원 가입 실패'); location.href='/'; </script>");
            out.close();
            return null;
        }

        ActionForward forward = new ActionForward();

        forward.setPath("/");
        forward.setRedirect(true);

        return forward;
    }
}
