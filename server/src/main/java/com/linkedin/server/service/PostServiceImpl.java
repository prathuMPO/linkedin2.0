package com.linkedin.server.service;

import com.linkedin.server.dao.PostDao;
import com.linkedin.server.dto.PostDTO;
import com.linkedin.server.model.PostModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    PostDao postDao;
    @Override
    public PostModel savePost(PostDTO postDTO) {
        PostModel postModel = new PostModel();

        postModel.setProfile(postDTO.getProfile());
        postModel.setDescription(postDTO.getDescription());
        postModel.setType(postDTO.getType());
        postModel.setSalary(postDTO.getSalary());
        postModel.setExperience(postDTO.getExperience());
        postModel.setTechnology(postDTO.getTechnology());

        return postDao.save(postModel);
    }

    @Override
    public List<PostModel> getAllPosts() {
      return postDao.findAll();
    }


}
