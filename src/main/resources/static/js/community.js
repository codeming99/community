/**
 * 提交回复
 */
function post() {
    const questionId = $("#question_id").val();
    const content = $("#comment_content").val();
    comment2Target(questionId,1,content);
}

function comment2Target(targetId,type,content) {
    if(!content){
        alert("不能回复空的内容~~");
        return;
    }

    $.ajax({
        type:"POST",
        url:"/comment",
        contentType:"application/json",
        data:JSON.stringify({
            "parentId":targetId,
            "content":content,
            "type":type
        }),
        success:function (response) {
            if(response.code == 200){
                window.location.reload();
            }else {
                if(response.code == 2003){
                    const isAccepted = confirm(response.message);
                    if(isAccepted){
                        window.open("https://github.com/login/oauth/authorize?client_id=3933880e5f676dd99bc1&redirect_uri=http://localhost:8887/callback&scope=user&state=1");
                        window.localStorage.setItem("closable",true);
                    }
                }else {
                    alert(response.message);
                }

            }
            console.log(response);
        },
        dataType:"json"
    });
}

/**
 * 二级评论
 * @param e
 */
function comment(e) {
    const commentId = e.getAttribute("data-id");
    const content = $("#input-" + commentId).val();
    comment2Target(commentId,2,content);
}

/*
    展开二级评论
 */
function collapseComments(e) {
    const id = e.getAttribute("data-id");
    const comments = $("#comment-" + id);

    // 获取二级评论展开状态
    const collapse = e.getAttribute("data-collapse");
    if(collapse){
        //折叠二级评论
        comments.removeClass("in");
        e.removeAttribute("data-collapse");
        e.classList.remove("active");
    }else {
        $.getJSON("/comment/" + id,function (data) {
           console.log(data);
           const commentBody = $("#comment-body-" + id);
           const items = [];

           $.each(data.data,function (comment) {
               const c = $("<div/>",{
                   "class":"col-lg-12 col-md-12 col-sm-12 col-xs-12 comments",
                   html:comment.content
               });
                items.push(c);
           });

           commentBody.append($("<div/>",{
               "class":"col-lg-12 col-md-12 col-sm-12 col-xs-12 collapse sub-comments",
               "id":"comment-" + id,
               html:items.join("")
           }));

            //展开二级评论
            comments.addClass("in");
            //标记二级评论展开状态
            e.setAttribute("data-collapse","in");
            e.classList.add("active");
        });

    }

}