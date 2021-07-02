package com.hejincai.entity;

/**
 * @description:
 * @author: brandon
 * @date: 2021/7/2 11:00
 */
public class TreeNode<T> {

    private T data;

    private TreeNode<T> left;

    private TreeNode<T> right;

    private TreeNode<T> parent;

    public TreeNode<T> getParent() {
        return parent;
    }

    public void setParent(TreeNode<T> parent) {
        this.parent = parent;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public TreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    public TreeNode<T> getRight() {
        return right;
    }

    public void setRight(TreeNode<T> right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                ", parent=" +(parent==null?"null":parent.getData()+"")+
                '}';
    }
}
