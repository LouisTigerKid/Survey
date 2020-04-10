package com.louis.survey.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Single
 * @Description
 * @Author WangJunxuan
 * @Date
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Single {

    private Integer id;

    private String description;

    private Integer score;

}
