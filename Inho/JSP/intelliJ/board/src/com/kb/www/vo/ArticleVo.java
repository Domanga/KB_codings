package com.kb.www.vo;

public class ArticleVo {
    private int articleNumber;
    private String articleTitle;
    private String articleContents;
    private String hit;
    private String writeDatetime;
    private String modifyDatetime;
    private String deleteDatetime;

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
