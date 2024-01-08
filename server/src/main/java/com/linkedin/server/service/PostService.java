package com.linkedin.server.service;

import com.linkedin.server.dto.PostDTO;
import com.linkedin.server.model.PostModel;

import java.util.List;

public interface PostService {


    public PostModel savePost(PostDTO postDTO);

    public List<PostModel> getAllPosts();

}
