package com.wym.community.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode{
    QUESTION_NOT_FOUND(2001,"你找的问题不在了，要不换个试试?"),
    TARGET_PARAM_FOUND(2002,"未选中任何问题或评论进行回复"),
    NO_LOGIN(2003,"未登录不能进行评论，请先登录"),
    SERVER_ERROR(2004,"服务器扛不住啦，过会再来试试"),
    TYPE_PARAM_WRONG(2005,"评论类型错误或不存在"),
    COMMENT_NOT_FOUND(2006,"你要回复的评论不存在，要不换个试试"),
    CONTENT_IS_EMPTY(2007,"输入内容不能为空"),
    READ_NOTIFICATION_FAIL(2008,"兄弟你这是读别人的信息呢?"),
    NOTIFICATION_NOT_FOUNT(2009,"消息不翼而飞了"),
    INVALID_INPUT(2009,"输入了非法内容");

    private Integer code;
    private String message;


    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }


    CustomizeErrorCode(Integer code,String message){
        this.message = message;
        this.code = code;
    }
}
