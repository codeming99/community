package com.wym.community.mapper;

import com.wym.community.model.Comment;

public interface CommentExtMapper {
    int incCommentCount(Comment record);
}