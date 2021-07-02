package com.hejincai.tree;

import com.hejincai.entity.TreeNode;

import java.util.Comparator;

/**
 * @description:
 * @author: brandon
 * @date: 2021/7/2 11:00
 */
public class BinaryTree<T> {

    private TreeNode<T> root;

    private Comparator<T> comparator;

    public BinaryTree(TreeNode<T> root, Comparator<T> comparator) {
        this.root = root;
        this.comparator = comparator;
    }


    public TreeNode<T> getRoot() {
        return root;
    }

    public void setRoot(TreeNode<T> root) {
        this.root = root;
    }

    public void insert(T target){
        TreeNode<T> p=root;
        TreeNode<T> leaf = new TreeNode<>();
        leaf.setData(target);
        while (p!=null){
            int compare = comparator.compare(target,p.getData());
            if (compare>=0){
                if (p.getRight()==null){
                    p.setRight(leaf);
                    return;
                }
                p=p.getRight();
            }else {
                if (p.getLeft()==null){
                    p.setLeft(leaf);
                    return;
                }
                p=p.getLeft();
            }
        }
    }

    public TreeNode<T> find(T target){
        TreeNode<T> p=root;
        while (p!=null){
            int compare = comparator.compare(target,p.getData());
            if (compare==0){
                return p;
            }else if (compare<0){
                p=p.getLeft();
            }else {
                p=p.getRight();
            }
        }
        return null;
    }

    public TreeNode<T> findMax(){
        TreeNode<T> p=root;
        while (p!=null){
            if (p.getRight()==null){
                return p;
            }
            p=p.getRight();
        }
        return null;
    }



    public TreeNode<T> findMin(){
        TreeNode<T> p=root;
        while (p!=null){
            if (p.getLeft()==null){
                return p;
            }
            p=p.getLeft();
        }
        return null;
    }

    public TreeNode<T> findPre(TreeNode<T> currentNode){
        TreeNode<T> p=currentNode;
        while (p!=null){
            if (p.getRight()==null){
                return p;
            }
            p=p.getRight();
        }
        return null;
    }

    public TreeNode<T> findPost(TreeNode<T> currentNode){
        if (currentNode==null){
            return null;
        }
        TreeNode<T> right=currentNode.getRight();

        if (right!=null){
            right=right.getRight();
        }
        return null;
    }

    public void delete(T target){

    }
}
