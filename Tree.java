
/**
* The Tree class.
*
* @author  Keiden B
* @version 1.0
* @since   2023-06-06
*/

public class Tree {
    // Parameters for the tree.
    int height = 0;
    int leafCount = 0;

    /**
    * The tree constructor.
    *
    * @param initHeight The initial height of the tree
    * @param initLeaves The initial amount of leaves
    */
    public Tree(int initHeight, int initLeaves) {
        height = initHeight;
        leafCount = initLeaves;
    }

    /**
    * The function to grow the tree by a small amount.
    *
    */
    public void grow() {
        height += 5;
        leafCount += 2500;
    }

    /**
    * The function to remove all the leaves from the tree.
    *
    */
    public void loseLeaves() {
        leafCount = 0;
    }

    /**
    * The function to grow the tree by a set amount.
    * Method Overloading.
    *
    */
    public void grow(int extraHeight, int extraLeaves) {
        height += extraHeight;
        leafCount += extraLeaves;
    }

    /**
    * The function to check the height and leaf amount on the tree.
    * 
    */
    public void checkGrowth() {
        System.out.println("The tree is currently " + height
            + "m tall and averages " + leafCount + " leaves.");
    }
}
