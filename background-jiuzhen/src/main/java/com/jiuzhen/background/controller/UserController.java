package com.jiuzhen.background.controller;
import com.jiuzhen.background.entity.User;
import com.jiuzhen.background.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

/**
 * @author ：李永成
 * @date ：Created in 2019/3/5 11:22
 * @description：登陆用户的看病流程
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
    * @Author: 李永成
    * @Date: 2019/3/5
    * @Description:  用户住院之后修改user表的状态，包括住院，买药，挂号就诊流程，
    * 用户状态 0预约未缴费, 1预约成功, 2住院申请, 3申请通过但未交住院费, 4看病完成)
     *  前台 ：0 , 1 ，2，4。后台: 3
    * @Param:  User user
    * @return:  String 1 or 2
    */
    @ResponseBody
    @RequestMapping("/inhospital")
    public String inHospital(User user) throws IOException {
        System.out.println("=============");
        System.out.println(user.getOpenid());
        System.out.println(user.getStatus());
        System.out.println("=============");
        User user1 = userService.selectByopenId(user.getOpenid());
        String message = user1.getMessageid();
        if(user.getStatus()==0){
            user.setMessageid(message == null ? "" : (message +',') +1);
        }
        else if(user.getStatus()==1){
            user.setMessageid(message == null ? "" :(message +',')+2);
        }
        else if(user.getStatus()==2){
            user.setMessageid(message == null ? "" :(message +',')+3);
        }
        else if(user.getStatus()==4){
            user.setMessageid(message == null ? "": (message +',')+6);
        }
        try {
            userService.updateByopenIdSelective(user);
            return "1";
        }
        catch (Exception e){
            return "2";
        }
    }
}
