package com.louis.survey.controller;

import com.louis.survey.common.ServerResponse;
import com.louis.survey.pojo.User;
import com.louis.survey.service.ISurveyService;
import com.louis.vo.QuizList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @ClassName SurveyController
 * @Description
 * @Author WangJunxuan
 * @Date
 **/

@RestController
@RequestMapping("/survey/")
public class SurveyController {

    @Autowired
    private ISurveyService iSurveyService;

    @RequestMapping("store_score.do")
    public ServerResponse storeScore(@RequestParam(value = "userId") String userId,
                                              @RequestBody QuizList quizList,
                                              HttpSession session,
                                              HttpServletResponse httpServletResponse){

//        User user = iSurveyService.getUserFromPoddy(userId);
        User user = new User(new Long(1));
        ServerResponse<Integer> serverResponse = iSurveyService.getScore(userId, quizList);
        ServerResponse<String>  isSuccessful = iSurveyService.saveUserProfile(user);
//        return isSuccessful;
        return serverResponse;
    }
}
