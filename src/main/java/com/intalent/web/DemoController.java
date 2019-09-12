package com.intalent.web;

import com.intalent.entity.Demo;
import com.intalent.service.impl.DemoServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private DemoServiceImpl demoServiceImpl;

    /**
     * 根据id删除
     * 要求转入 id
     */
    @RequestMapping(value="/deleteByPrimaryKey/{id}", method=RequestMethod.GET)
    public ModelAndView deleteByPrimaryKey(@PathVariable("id") int id) {
        int i =demoServiceImpl.deleteByPrimaryKey(id) ;
        if(i>0){
            logger.info("DELETE SUCCESS");
            return new ModelAndView("redirect:/demo/selectAll");
        }else{
            return new ModelAndView("error","msg","delete failure");
        }
    }

    /**
     * 添加对象demo
     */
    @RequestMapping(value="/insert", method=RequestMethod.POST)
    public ModelAndView insert(HttpServletRequest request) {
        Integer id=Integer.parseInt(request.getParameter("id"));
        Integer age=Integer.parseInt(request.getParameter("age"));
        String name = request.getParameter("name");
        String sex = request.getParameter("sex");
        Demo demo = new Demo();
        demo.setId(id);
        demo.setAge(age);
        demo.setName(name);
        demo.setSex(sex);
        int i = demoServiceImpl.insert(demo);
        if(i>0){
            logger.info("INSERT SUCCESS");
            return new ModelAndView("redirect:/demo/selectAll");
        }else{
            return new ModelAndView("error","msg","insert failure");
        }
    }

    /**
     * 根据id修改全部字段
     */
    @RequestMapping(value="/update", method=RequestMethod.POST)
    public ModelAndView update(HttpServletRequest request) {
        Integer id = Integer.parseInt(request.getParameter("id"));
        Integer age = Integer.parseInt(request.getParameter("age"));
        String name = request.getParameter("name");
        String sex = request.getParameter("sex");
        Demo demo = new Demo();
        demo.setId(id);
        demo.setAge(age);
        demo.setName(name);
        demo.setSex(sex);
        int i = demoServiceImpl.updateByPrimaryKey(demo);
        if (i > 0) {
            logger.info("UPDATE SUCCESS");
            return new ModelAndView("redirect:/demo/selectAll");
        } else {
            return new ModelAndView("error", "msg", "insert failure");
        }
    }


    /**
     * 根据id查找对象  最多只能返回一个对象
     *
     */
    @RequestMapping(value="/selectById/{id}", method=RequestMethod.GET)
    public ModelAndView selectById(@PathVariable("id") Integer id){
        Demo demo = this.demoServiceImpl.selectByPrimaryKey(id);
        logger.info("Demo:",demo);
        return new ModelAndView("update","demo", demo);
    }
    /**
     * 查询所有数据
     *
     * @return
     */
    @GetMapping("/selectAll")
    @RequestMapping(value="/selectAll", method=RequestMethod.GET)
    public ModelAndView selectAll() {
        List<Demo> list = demoServiceImpl.selectAll();
        if (list.isEmpty()||list==null){
            logger.info("select nothing");
        }

        return new ModelAndView("demoList","list", list);
    }

}
