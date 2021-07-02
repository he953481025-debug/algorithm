import com.hejincai.entity.TreeNode;
import com.hejincai.tree.BinaryTree;
import org.junit.Before;
import org.junit.Test;

import java.util.Comparator;

/**
 * @description:
 * @author: brandon
 * @date: 2021/7/2 11:23
 */
public class BinaryTreeTest {


    private BinaryTree<Integer> binaryTree;


    @Before
    public void init() {
        TreeNode<Integer> root = new TreeNode<>();
        root.setData(0);
        binaryTree=new BinaryTree<>(root, Comparator.comparing(Integer::intValue));
    }

    @Test
    public void testInsert(){
        binaryTree.insert(1);
        binaryTree.insert(-1);
        System.out.println(binaryTree.getRoot());
    }

    @Test
    public void testfind(){
        binaryTree.insert(1);
        binaryTree.insert(-1);
        TreeNode<Integer> integerTreeNode = binaryTree.find(0);
        System.out.println(integerTreeNode);
    }

    @Test
    public void testfindMax(){
        binaryTree.insert(1);
        binaryTree.insert(-1);
        binaryTree.insert(3);
        TreeNode<Integer> integerTreeNode = binaryTree.findMax();
        System.out.println(integerTreeNode);
    }

    @Test
    public void testfindMin(){
        binaryTree.insert(1);
        binaryTree.insert(-1);
        binaryTree.insert(3);
        TreeNode<Integer> integerTreeNode = binaryTree.findMin();
        System.out.println(integerTreeNode);
    }
}
