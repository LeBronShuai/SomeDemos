package com.baizhi.dao;

import com.baizhi.entity.Node;

import java.util.List;

/**
 * create by LiangS
 * on 2017/10/18
 */
public interface NodeDao {
    List<Node> getAllNodes(int start,int size);
}
