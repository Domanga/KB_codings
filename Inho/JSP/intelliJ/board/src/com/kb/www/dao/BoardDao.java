package com.kb.www.dao;

import com.kb.www.vo.ArticleVo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import static com.kb.www.common.JdbcUtil.close;
import static com.kb.www.common.JdbcUtil.commit;

public class BoardDao {
    private Connection con;

    private BoardDao() {

    }

    public static BoardDao getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        private static final BoardDao INSTANCE = new BoardDao();
    }

    public void setConnection(Connection con) {
        this.con = con;
    }

    public ArrayList<ArticleVo> getArticleList() {
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<ArticleVo> list = new ArrayList<ArticleVo>();
        try {
            pstmt = con.prepareStatement("select * from kb.board");
            rs = pstmt.executeQuery();

            while (rs.next()) {
                ArticleVo bo = new ArticleVo();
                bo.setArticleNumber(rs.getInt("num"));
                bo.setArticleTitle(rs.getString("subject"));
                bo.setArticleContents(rs.getString("content"));
                bo.setHit(rs.getString("hit"));
                bo.setWriteDatetime(rs.getString("wdate"));
                bo.setModifyDatetime(rs.getString("udate"));
                bo.setDeleteDatetime(rs.getString("ddate"));
                list.add(bo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(rs);
            close(pstmt);
        }
        return list;
    }

    public void addArticle(ArticleVo insert) {
        PreparedStatement pstmt = null;

        try {
            pstmt = con.prepareStatement("insert into kb.board(subject, content) values (?,?)");
            pstmt.setString(1, insert.getArticleTitle());
            pstmt.setString(2, insert.getArticleContents());

            pstmt.executeUpdate();
            commit(con);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
    }

    public ArticleVo getArticle(String num) {
        String number = num;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArticleVo bo = new ArticleVo();
        try {
            pstmt = con.prepareStatement("select * from board where num = " + number);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                bo.setArticleNumber(rs.getInt("num"));
                bo.setArticleTitle(rs.getString("subject"));
                bo.setArticleContents(rs.getString("content"));
                bo.setHit(rs.getString("hit"));
                bo.setWriteDatetime(rs.getString("wdate"));
                bo.setModifyDatetime(rs.getString("udate"));
                bo.setDeleteDatetime(rs.getString("ddate"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(rs);
            close(pstmt);
        }
        return bo;
    }
}
