package servlet;

import dao.UserInfoDao;
import dao.UserInfoDaoImpl;
import entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/addUserServlet")
public class addUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        HttpSession session = request.getSession();
        //1.获得表单数据
        String userName=request.getParameter("userName");
        String telNum=request.getParameter("telNum");
        String password=request.getParameter("password");
        //2. 封装对象
        User user=new User(userName,telNum,password);
        //3.dao
        UserInfoDao userInfoDao=new UserInfoDaoImpl();
        int ret =userInfoDao.insertUser(user);
        //将user_new封装到session中
        session.setAttribute("user",(User)userInfoDao.getUser(telNum).get(0));
        //4.out
        PrintWriter out=response.getWriter();
        out.print(ret);
        out.flush();
        out.close();

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
