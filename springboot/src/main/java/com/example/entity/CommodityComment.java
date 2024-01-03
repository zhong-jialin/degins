package com.example.entity;

import java.util.List;

public class CommodityComment {
//    表内数据
    private Integer id;
    /** ID */
    /** 内容 */
    private String content;
    /** 评论人 */
    private Integer userId;
    /** 父级ID */
    private Integer pid;
    /** 根节点ID */
    private Integer rootId;
    /** 评论时间 */
    private String ctime;
    private String utime;

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }

    public String getUtime() {
        return utime;
    }

    public void setUtime(String utime) {
        this.utime = utime;
    }

    //    表外数据
//    被评论游戏id
    private Integer fid;

    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private String avatar;

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    private String replyUser;
//    回复的人的名字

    private List<CommodityComment> children;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getRootId() {
        return rootId;
    }

    public void setRootId(Integer rootId) {
        this.rootId = rootId;
    }



    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }






    public String getReplyUser() {
        return replyUser;
    }

    public void setReplyUser(String replyUser) {
        this.replyUser = replyUser;
    }

    public List<CommodityComment> getChildren() {
        return children;
    }

    public void setChildren(List<CommodityComment> children) {
        this.children = children;
    }
}
