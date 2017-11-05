package com.baizhi.mapper;

import com.baizhi.entity.Node;

import java.util.List;

/**1212123123123
 * create by LiangS
 * on 2017/10/18
 */
public interface NodeDao {
    List<Node> getAllNodes(int start,int size);
}
