package com.wym.community.mapper;

import com.wym.community.model.Question;


public interface QuestionExtMapper {
    int incView(Question record);
    int incCommentCount(Question record);
}