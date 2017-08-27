package com.kodilla.testing.forum;

import com.kodilla.testing.ForumPost;

public class ForumComment {
    ForumPost forumpost;
    String commentBody;
    String author;

    public ForumComment(ForumPost forumpost, String commentBody, String author) {
        this.forumpost = forumpost;
        this.commentBody = commentBody;
        this.author = author;
    }

    public ForumPost getForumpost() {
        return forumpost;
    }

    public String getCommentBody() {
        return commentBody;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumComment that = (ForumComment) o;

        if (!forumpost.equals(that.forumpost)) return false;
        if (!commentBody.equals(that.commentBody)) return false;
        return author.equals(that.author);
    }

    @Override
    public int hashCode() {
        int result = forumpost.hashCode();
        result = 31 * result + commentBody.hashCode();
        result = 31 * result + author.hashCode();
        return result;
    }
}
