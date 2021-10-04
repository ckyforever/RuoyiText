package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Student;

/**
 * 学生基本信息Service接口
 * 
 * @author chenkaiyu
 * @date 2021-09-28
 */
public interface IStudentService 
{
    /**
     * 查询学生基本信息
     * 
     * @param id 学生基本信息ID
     * @return 学生基本信息
     */
    public Student selectStudentById(Long id);

    /**
     * 查询学生基本信息列表
     * 
     * @param student 学生基本信息
     * @return 学生基本信息集合
     */
    public List<Student> selectStudentList(Student student);

    /**
     * 新增学生基本信息
     * 
     * @param student 学生基本信息
     * @return 结果
     */
    public int insertStudent(Student student);

    /**
     * 修改学生基本信息
     * 
     * @param student 学生基本信息
     * @return 结果
     */
    public int updateStudent(Student student);

    /**
     * 批量删除学生基本信息
     * 
     * @param ids 需要删除的学生基本信息ID
     * @return 结果
     */
    public int deleteStudentByIds(Long[] ids);

    /**
     * 删除学生基本信息信息
     * 
     * @param id 学生基本信息ID
     * @return 结果
     */
    public int deleteStudentById(Long id);
}
