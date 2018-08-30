package entity;

import java.util.Date;

public class Blog {
    private int blogId;
    private String context;
    private Date sendDate;
    private String sendAddr;
    private int userId;
    private int trId;
    private String ip;
    private int tsNum;

    public Blog() {
    }

    public Blog(int blogId, String context, Date sendDate, String sendAddr, int userId, int trId, String ip, int tsNum) {
        this.blogId = blogId;
        this.context = context;
        this.sendDate = sendDate;
        this.sendAddr = sendAddr;
        this.userId = userId;
        this.trId = trId;
        this.ip = ip;
        this.tsNum = tsNum;
    }

    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public String getSendAddr() {
        return sendAddr;
    }

    public void setSendAddr(String sendAddr) {
        this.sendAddr = sendAddr;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getTrId() {
        return trId;
    }

    public void setTrId(int trId) {
        this.trId = trId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        ip = ip;
    }

    public int getTsNum() {
        return tsNum;
    }

    public void setTsNum(int tsNum) {
        this.tsNum = tsNum;
    }
}
