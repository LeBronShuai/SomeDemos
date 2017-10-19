package com.baizhi.entity;



import java.io.Serializable;

/**
 * create by LiangS
 * on 2017/10/18
 */
public class Node implements Serializable {
    private String id;
    private String name;
    private String whyUseIt;
    private String whereUseIt;
    private String howUseIt;
    private String supplement;

    public Node(String id, String name, String whyUseIt, String whereUseIt, String howUseIt, String supplement) {
        this.id = id;
        this.name = name;
        this.whyUseIt = whyUseIt;
        this.whereUseIt = whereUseIt;
        this.howUseIt = howUseIt;
        this.supplement = supplement;
    }

    public Node(String name, String whyUseIt, String whereUseIt, String howUseIt, String supplement) {

        this.name = name;
        this.whyUseIt = whyUseIt;
        this.whereUseIt = whereUseIt;
        this.howUseIt = howUseIt;
        this.supplement = supplement;
    }

    public Node() {

    }

    @Override
    public String toString() {

        return "Node{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", whyUseIt='" + whyUseIt + '\'' +
                ", whereUseIt='" + whereUseIt + '\'' +
                ", howUseIt='" + howUseIt + '\'' +
                ", supplement='" + supplement + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWhyUseIt() {
        return whyUseIt;
    }

    public void setWhyUseIt(String whyUseIt) {
        this.whyUseIt = whyUseIt;
    }

    public String getWhereUseIt() {
        return whereUseIt;
    }

    public void setWhereUseIt(String whereUseIt) {
        this.whereUseIt = whereUseIt;
    }

    public String getHowUseIt() {
        return howUseIt;
    }

    public void setHowUseIt(String howUseIt) {
        this.howUseIt = howUseIt;
    }

    public String getSupplement() {
        return supplement;
    }

    public void setSupplement(String supplement) {
        this.supplement = supplement;
    }
}
