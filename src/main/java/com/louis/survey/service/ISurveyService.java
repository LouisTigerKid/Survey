package com.louis.survey.service;

import com.louis.survey.common.ServerResponse;
import com.louis.survey.pojo.User;
import com.louis.vo.QuizList;

/**
 * @ClassName ISurveyService
 * @Description
 * @Author WangJunxuan
 * @Date
 **/

public interface ISurveyService {

    ServerResponse<Integer> getScore(String userId, QuizList quizList);

    ServerResponse<String>  saveUserProfile(User user);

    User getUserFromPoddy(String staffId);
}
