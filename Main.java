
import java.awt.*;

/**
* Creating a tree that can grow.
*
* @author  Keiden B
* @version 1.0
* @since   2023-06-06
*/

public class Main {
    /**
    * Necessary to prevent HideUtilityClass Error.
    *
    * @exception IllegalStateException Utility class
    * @see IllegalStateException
    */
    private Main() {
        throw new IllegalStateException("Utility class");
    }

    /**
    * Main lines of code.
    *
    * @param args placeholder
    */
    public static void main(String[] args) {
        // Creating the Tree
        Tree sapling = new Tree(20, 10000);

        // Printing the tree's current dimension
        sapling.checkGrowth();

        // Growing the tree by a small amount
        sapling.grow();
        sapling.checkGrowth();

        // Growing the tree with specifications
        sapling.grow(5, 16000);
        sapling.checkGrowth();

        // Remove all the leaves from the tree
        sapling.loseLeaves();
        sapling.checkGrowth();
    }
}