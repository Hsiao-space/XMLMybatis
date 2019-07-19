package com.hsiao.dao.impl;

import com.hsiao.dao.TeacherDao;
import com.hsiao.entiy.Teacher;
import com.hsiao.factory.MybatisSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class TeacherDaoImpl implements TeacherDao {

    private static Logger log= LogManager.getLogger();

    @Override
    public List<Teacher> selectAllTeacher() {
        SqlSession session= MybatisSessionFactory.getSession();
        List<Teacher> list=  session.selectList("selectAllTeacher");
        session.close();
        return list;
    }

    public static void main(String[] args) {
        TeacherDaoImpl dao=new TeacherDaoImpl();
        List<Teacher> list=dao.selectAllTeacher();
        list.forEach((m)->log.debug(m));
    }
}
