package com.kb.www.dao;

import com.kb.www.vo.ArticleVo;
import com.kb.www.vo.MemberHistoryVo;
import com.kb.www.vo.MemberVo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import static com.kb.www.common.JdbcUtil.close;

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
            pstmt = con.prepareStatement("select b.num" +
                                                ", m.id" +
                                                ", b.subject" +
                                                ", b.content" +
                                                ", b.hit" +
                                                ", b.wdate" +
                                                ", b.udate" +
                                                ", b.ddate" +
                                                " from board b" +
                                                " inner join member m on b.mb_sq = m.sq");
            rs = pstmt.executeQuery();

            while (rs.next()) {
                ArticleVo bo = new ArticleVo();
                bo.setArticleNumber(rs.getInt("num"));
                bo.setId(rs.getString("id"));
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

    public int addArticle(ArticleVo insert) {
        PreparedStatement pstmt = null;
        int count = 0;
        try {
            pstmt = con.prepareStatement("insert into kb.board(mb_sq, subject, content) values (?,?,?)");
            pstmt.setInt(1, insert.getMb_sq());
            pstmt.setString(2, insert.getArticleTitle());
            pstmt.setString(3, insert.getArticleContents());
            count = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return count;
    }

    public ArticleVo getArticle(String num) {
        String number = num;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArticleVo bo = null;
        try {
            pstmt = con.prepareStatement("select b.num" +
                                                ", m.id" +
                                                ", b.subject" +
                                                ", b.content" +
                                                ", b.hit" +
                                                ", b.wdate" +
                                                ", b.udate" +
                                                ", b.ddate" +
                                                " from board b" +
                                                " inner join member m on b.mb_sq = m.sq");
            rs = pstmt.executeQuery();

            while (rs.next()) {
                bo = new ArticleVo();
                bo.setArticleNumber(rs.getInt("num"));
                bo.setId(rs.getString("id"));
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

    public int updateArticle(ArticleVo update) {
        PreparedStatement pstmt = null;
        String NowDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        int count = 0;
        try {
            pstmt = con.prepareStatement("update kb.board set subject = ?, content = ?, udate = ? where num = ?");
            pstmt.setString(1, update.getArticleTitle());
            pstmt.setString(2, update.getArticleContents());
            pstmt.setString(3, NowDate);
            pstmt.setInt(4, update.getArticleNumber());
            count = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return count;
    }

    public int deleteArticle(ArticleVo delete) {
        PreparedStatement pstmt = null;
        int count = 0;
        try {
            pstmt = con.prepareStatement("delete from kb.board where num = ?");
            pstmt.setInt(1, delete.getArticleNumber());
            count = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return count;
    }

    public int updateHitCount(String number) {
        PreparedStatement pstmt = null;
        int num = Integer.parseInt(number);
        int count = 0;
        try {
            pstmt = con.prepareStatement("update kb.board set hit = hit+1 where num = ?");
            pstmt.setInt(1, num);

            count = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return count;
    }

    public int insertMember(MemberVo vo) {
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        int count = 0;
        try {
            pstmt = con.prepareStatement("insert into member(id,pw) values (?,?)");
            pstmt.setString(1, vo.getId());
            pstmt.setString(2, vo.getPw());
            count = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return count;
    }

    public int getMemberSequence(String id) {
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        int sq = 0;
        try {
            pstmt = con.prepareStatement("select sq from member where id = ?");
            pstmt.setString(1, id);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                sq = rs.getInt("sq");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(rs);
            close(pstmt);
        }
        return sq;
    }

    public int insertMemberHistory(MemberHistoryVo vo) {
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        int count = 0;
        try {
            pstmt = con.prepareStatement("insert into member_history (mb_sq, evt_type) values (?, ?)");
            pstmt.setInt(1, vo.getMb_sq());
            pstmt.setInt(2, vo.getExt_type());
            count = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return count;
    }

    public MemberVo getMember(String id) {
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        MemberVo vo = null;
        try {
            pstmt = con.prepareStatement("select sq, id, pw from member where binary(id) = ?");
            pstmt.setString(1, id);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                vo = new MemberVo();
                vo.setSq(rs.getInt("sq"));
                vo.setId(rs.getString("id"));
                vo.setPw(rs.getString("pw"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return vo;
    }

    public int updateLoginState(MemberVo memberVo) {
        PreparedStatement pstmt = null;
        int count = 0;
        try {
            pstmt = con.prepareStatement("update member set lgn_st = ? where sq = ?");
            pstmt.setBoolean(1, memberVo.isLgn_fl());
            pstmt.setInt(2, memberVo.getSq());
            count = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return count;
    }
}
