package com.louis.survey.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ClassName Quiz
 * @Description
 * @Author WangJunxuan
 * @Date
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Quiz {

    private Integer id;

    private String description;

    private List<Single> singles;

    private List<Multiple> multiples;
}
