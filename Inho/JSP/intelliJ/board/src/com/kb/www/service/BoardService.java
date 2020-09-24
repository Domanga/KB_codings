package com.kb.www.service;

import com.kb.www.dao.BoardDao;
import com.kb.www.vo.ArticleVo;

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

    public void addArticle(ArticleVo insert) {
        BoardDao dao = BoardDao.getInstance();
        Connection con = getConnection();
        dao.setConnection(con);
        dao.addArticle(insert);
        close(con);
    }

    public ArticleVo getArticle(String num) {
        String number = num;
        BoardDao dao = BoardDao.getInstance();
        Connection con = getConnection();
        dao.setConnection(con);
        ArticleVo bo = dao.getArticle(number);
        close(con);
        return bo;
    }
}
