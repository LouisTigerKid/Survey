package com.louis.survey.service.impl;

import com.louis.survey.common.ServerResponse;
import com.louis.survey.pojo.Multiple;
import com.louis.survey.pojo.Quiz;
import com.louis.survey.pojo.Single;
import com.louis.survey.pojo.User;
import com.louis.survey.service.ISurveyService;
import com.louis.vo.QuizList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.Iterator;

/**
 * @ClassName SurveyServiceImpl
 * @Description
 * @Author WangJunxuan
 * @Date
 **/

@Service("ISurveyService")
public class SurveyServiceImpl implements ISurveyService {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public ServerResponse<Integer> getScore(String userId, QuizList quizList) {

        Integer totalScore = 0;
        Iterator<Quiz> quizIterator = quizList.getQuizzes().iterator();

        while (quizIterator.hasNext()){
            Quiz nextQuiz = quizIterator.next();
            if (nextQuiz.getSingles() != null && !nextQuiz.getSingles().isEmpty()){
                Iterator<Single> singleIterator = nextQuiz.getSingles().iterator();
                while (singleIterator.hasNext()){
                    totalScore = singleIterator.next().getScore() + totalScore;
                }
            }else if (nextQuiz.getMultiples() != null && !nextQuiz.getMultiples().isEmpty()){
                Iterator<Multiple> multipleIterator = nextQuiz.getMultiples().iterator();
                while (multipleIterator.hasNext()){
                    totalScore = multipleIterator.next().getScore() + totalScore;
                }
            }else {
                return ServerResponse.createByErrorMessage("no multiples or singles");
            }
        }

        return ServerResponse.createBySuccess("total score", totalScore);
    }

    @Override
    public ServerResponse<String> saveUserProfile(User user) {

        mongoTemplate.insert(user);
        return null;
    }

    @Override
    public User getUserFromPoddy(String staffId) {
        return null;
    }
}
