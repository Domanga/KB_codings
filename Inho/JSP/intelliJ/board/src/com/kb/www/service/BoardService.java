package com.kb.www.service;

import com.kb.www.dao.BoardDao;
import com.kb.www.vo.ArticleVo;
import com.kb.www.vo.MemberHistoryVo;
import com.kb.www.vo.MemberVo;

import java.sql.Connection;
import java.util.ArrayList;

import static com.kb.www.common.JdbcUtil.*;

public class BoardService {
    public ArrayList<ArticleVo> getArticleList() {
        BoardDao dao = BoardDao.getInstance();
        Connection con = getConnection();
        dao.setConnection(con);
        ArrayList<ArticleVo> list = dao.getArticleList();
        close(con);
        return list;
    }

    public boolean addArticle(ArticleVo insert) {
        BoardDao dao = BoardDao.getInstance();
        Connection con = getConnection();
        dao.setConnection(con);
        boolean isSuccess = false;

        int count = dao.addArticle(insert);

        if (count > 0) {
            commit(con);
            isSuccess = true;
        } else {
            rollback(con);
        }
        close(con);
        return isSuccess;
    }

    public ArticleVo getArticle(int num) {
        BoardDao dao = BoardDao.getInstance();
        Connection con = getConnection();
        dao.setConnection(con);
        ArticleVo bo = null;
        int count = dao.updateHitCount(num);
        if (count > 0) {
            commit(con);
            bo = dao.getArticle(num);
        } else {
            rollback(con);
        }
        close(con);
        return bo;
    }

    public boolean updateArticle(ArticleVo update) {
        BoardDao dao = BoardDao.getInstance();
        Connection con = getConnection();
        boolean isSuccess = false;
        dao.setConnection(con);
        int count = dao.updateArticle(update);
        if (count > 0) {
            commit(con);
            isSuccess = true;
        } else {
            rollback(con);
        }
        close(con);
        return isSuccess;
    }

    public boolean deleteArticle(int num) {
        BoardDao dao = BoardDao.getInstance();
        Connection con = getConnection();
        boolean isSuccess = false;
        dao.setConnection(con);
        int count = dao.deleteArticle(num);
        if (count > 0) {
            commit(con);
            isSuccess = true;
        } else {
            rollback(con);
        }
        close(con);
        return isSuccess;
    }

    public boolean joinMember(MemberVo memberVo, MemberHistoryVo memberHistoryVo) {
        BoardDao dao = BoardDao.getInstance();
        Connection con = getConnection();
        dao.setConnection(con);
        boolean isSuccess = false;
        int count_1 = dao.insertMember(memberVo);
        memberHistoryVo.setMb_sq(dao.getMemberSequence(memberVo.getId()));
        int count_2 = dao.insertMemberHistory(memberHistoryVo);

        if (count_1 > 0 && count_2 > 0) {
            commit(con);
            isSuccess = true;
        } else {
            rollback(con);
        }
        close(con);
        return isSuccess;
    }

    public MemberVo getMember(String id) {
        BoardDao dao = BoardDao.getInstance();
        Connection con = getConnection();
        dao.setConnection(con);
        MemberVo vo = dao.getMember(id);
        close(con);
        return vo;
    }

    public boolean loginMember(MemberVo memberVo, MemberHistoryVo memberHistoryVo) {
        BoardDao dao = BoardDao.getInstance();
        Connection con = getConnection();
        dao.setConnection(con);
        boolean isSuccess = false;
        int count_1 = dao.updateLoginState(memberVo);
        int count_2 = dao.insertMemberHistory(memberHistoryVo);

        if (count_1 > 0 && count_2 > 0) {
            commit(con);
            isSuccess = true;
        } else {
            rollback(con);
        }
        close(con);
        return isSuccess;
    }

    public boolean logoutMember(MemberVo memberVo, MemberHistoryVo memberHistoryVo) {
        BoardDao dao = BoardDao.getInstance();
        Connection con = getConnection();
        dao.setConnection(con);
        boolean isSuccess = false;
        memberVo.setSq(dao.getMemberSequence(memberVo.getId()));
        memberHistoryVo.setMb_sq((memberVo.getSq()));
        int count_1 = dao.updateLoginState(memberVo);
        int count_2 = dao.insertMemberHistory(memberHistoryVo);

        if (count_1 > 0 && count_2 > 0) {
            commit(con);
            isSuccess = true;
        } else {
            rollback(con);
        }
        close(con);
        return isSuccess;
    }

    public int getMemberSequence(String id) {
        BoardDao dao = BoardDao.getInstance();
        Connection con = getConnection();
        dao.setConnection(con);
        ArticleVo vo = null;
        int sq = dao.getMemberSequence(id);
        close(con);
        return sq;
    }

    public String getWriterId(int num) {
        BoardDao dao = BoardDao.getInstance();
        Connection con = getConnection();
        dao.setConnection(con);
        String id = dao.getWriterId(num);
        close(con);
        return id;
    }

    public ArrayList<MemberHistoryVo> getMemberHistory(String id) {
        BoardDao dao = BoardDao.getInstance();
        Connection con = getConnection();
        dao.setConnection(con);
        ArrayList<MemberHistoryVo> list = dao.getMemberHistory(id);
        close(con);
        return list;
    }

    public boolean leaveMember(MemberVo memberVo, MemberHistoryVo memberHistoryVo) {
        BoardDao dao = BoardDao.getInstance();
        Connection con = getConnection();
        dao.setConnection(con);
        boolean isSuccess = false;
        int count_1 = dao.leaveMember(memberVo);
        memberHistoryVo.setMb_sq(dao.getMemberSequence(memberVo.getId()));
        int count_2 = dao.insertMemberHistory(memberHistoryVo);

        if (count_1 > 0 && count_2 > 0) {
            commit(con);
            isSuccess = true;
        } else {
            rollback(con);
        }
        close(con);
        return isSuccess;
    }
}
