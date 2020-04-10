package com.louis.vo;

import com.louis.survey.pojo.Quiz;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ClassName Quizzes
 * @Description
 * @Author WangJunxuan
 * @Date
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuizList {

    private List<Quiz> quizzes;

}
