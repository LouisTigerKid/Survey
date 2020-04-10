package com.louis.survey.pojo;

import com.louis.vo.QuizList;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName User
 * @Description
 * @Author WangJunxuan
 * @Date
 **/

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collation = "user")
public class User implements Serializable {

    @Id
    private Long id;

    private String staffId;

    private String username;

    private String department;

    private QuizList quizList;

    private String email;

    private String phone;

    private Date createTime;

    private Date updateTime;

    public User(Long id){
        this.id = id;
    }


}
