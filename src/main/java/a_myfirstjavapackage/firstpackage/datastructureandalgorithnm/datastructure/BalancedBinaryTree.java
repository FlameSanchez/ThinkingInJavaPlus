package a_myfirstjavapackage.firstpackage.datastructureandalgorithnm.datastructure;

/*平衡二叉树 任意节点左右子树高度差<=1
   平衡二叉树实现方式：四种旋转
    确定支点：从添加的节点开始，不断的往父节点找不平衡的节点

    左旋：原先的右子节点变成新的父节点，并把多余的左子节点出让，给已经降级的根节点当右子节点

    平衡二叉树旋转四种情况：
    左左 一次右旋
    左右 先局部左旋，再整体右旋
    右右 一次左旋
    右左 先局部右旋，再整体左旋*/
public class BalancedBinaryTree {
}
