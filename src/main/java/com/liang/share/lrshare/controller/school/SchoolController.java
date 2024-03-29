package com.liang.share.lrshare.controller.school;

import com.liang.share.lrshare.model.school.School;
import com.liang.share.lrshare.service.school.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/school")
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    /**
     * 得到所有的学校名称显示
     */
    @GetMapping("/getAll")
    public List<School> getAll(){
        return schoolService.getAll();
    }
    /**
     * 添加密码
     */
    @ResponseBody
    @PostMapping("/addPassword")
    public boolean addPassword(@RequestParam("schoolNumber")String typeNumber,@RequestParam("pass") String password){
        return schoolService.addPassword(Integer.parseInt(typeNumber),password);
    }


}
