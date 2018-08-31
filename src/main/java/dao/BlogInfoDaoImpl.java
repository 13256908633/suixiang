package dao;

import entity.Blog;

import java.util.List;

public class BlogInfoDaoImpl extends BaseDao<Blog> implements BlogInfoDao{
    @Override
    public List<Blog> getAllBlog() {
        return executeQuery("select * from t_blog");
    }

    @Override
    public int deleteBlog(int blogId) {
        return executeUpdate("delete from t_blog where blogId = ?",new Object[]{blogId});
    }

    @Override
    public List<Blog> getAllBlog(int userId) {
        return executeQuery("select * from t_blog where userId = ?",new Object[]{userId});
    }

    @Override
    public int insertBlog(Blog blog) {
        return executeUpdate("insert into t_blog value(?,?,?,?,?,?,?)",new Object[]{blog.getContext(),blog.getSendDate(),blog.getSendAddr(),blog.getUserId(),blog.getTrId(),blog.getIp(),blog.getTsNum()});
    }

    @Override
    public List<Blog> getFollowBlogById(int userId) {
        return executeQuery("select * from t_blog where  userId in (select fansId from t_fansuser where userId=?) ",new Object[]{userId}
);
    }

    @Override
    public List<Blog> getBlogByKey(String key) {
        return executeQuery("select * from t_blog where context like ?",new Object[]{"%" + key + "%"});
    }

    @Override
    public List<Blog> getBlogByKey(int userId, String key) {
        return executeQuery("select * from t_blog where userId = ? and context like ?",new Object[]{userId,"%" + key + "%"});
    }

    @Override
    public List<Blog> getTransCount(int blogId) {
        return executeQuery("select tsNum from t_blog where blogId = ?",new Object[]{blogId});
    }
}
