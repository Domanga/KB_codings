package com.kb.www.vo;

public class ArticleVo {
    private int articleNumber;
    private int mb_sq;
    private String articleTitle;
    private String articleContents;
    private String hit;
    private String writeDatetime;
    private String modifyDatetime;
    private String deleteDatetime;

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMb_sq() {
        return mb_sq;
    }

    public void setMb_sq(int mb_sq) {
        this.mb_sq = mb_sq;
    }

    public int getArticleNumber() {
        return articleNumber;
    }

    public void setArticleNumber(int articleNumber) {
        this.articleNumber = articleNumber;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleContents() {
        return articleContents;
    }

    public void setArticleContents(String articleContents) {
        this.articleContents = articleContents;
    }

    public String getHit() {
        return hit;
    }

    public void setHit(String hit) {
        this.hit = hit;
    }

    public String getWriteDatetime() {
        return writeDatetime;
    }

    public void setWriteDatetime(String writeDatetime) {
        this.writeDatetime = writeDatetime;
    }

    public String getModifyDatetime() {
        return modifyDatetime;
    }

    public void setModifyDatetime(String modifyDatetime) {
        this.modifyDatetime = modifyDatetime;
    }

    public String getDeleteDatetime() {
        return deleteDatetime;
    }

    public void setDeleteDatetime(String deleteDatetime) {
        this.deleteDatetime = deleteDatetime;
    }
}
