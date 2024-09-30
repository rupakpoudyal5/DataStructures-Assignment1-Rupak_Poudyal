package com.assignment1.java;
public class Main {
    public static void main(String[] args) {
        // Test for ArtifactVault (Array Challenge)
        System.out.println("==== The Array Artifact ====");
        ArtifactVault artifactVault = new ArtifactVault(5);
        System.out.println(artifactVault.addArtifact("Sword"));
        System.out.println(artifactVault.addArtifact("Shield"));
        System.out.println(artifactVault.addArtifact("Helmet"));
        System.out.println(artifactVault.findArtifactLinear("Shield"));
        System.out.println(artifactVault.removeArtifact("Shield"));
        System.out.println(artifactVault.findArtifactLinear("Shield"));
        System.out.println(artifactVault.addArtifact("Armor"));
        System.out.println(artifactVault.findArtifactBinary("Helmet"));
        
        // Test for LabyrinthPath (Linked List Challenge)
        System.out.println("\n==== The Linked List Labyrinth ====");
        LabyrinthPath labyrinth = new LabyrinthPath();
        labyrinth.addLocation("Entrance");
        labyrinth.addLocation("Corridor");
        labyrinth.addLocation("Chamber");
        labyrinth.addLocation("Exit");
        labyrinth.printPath();
        System.out.println("Has loop? " + labyrinth.hasLoop());
        labyrinth.removeLastLocation();
        labyrinth.printPath();

        // Test for ScrollStack (Stack Challenge)
        System.out.println("\n==== The Stack of Ancient Texts ====");
        ScrollStack scrollStack = new ScrollStack();
        scrollStack.pushScroll("Scroll of Fire");
        scrollStack.pushScroll("Scroll of Water");
        System.out.println("Peek: " + scrollStack.peekScroll());
        System.out.println(scrollStack.popScroll());
        System.out.println("Contains 'Scroll of Water'? " + scrollStack.containsScroll("Scroll of Water"));
        System.out.println("Contains 'Scroll of Fire'? " + scrollStack.containsScroll("Scroll of Fire"));

        // Test for ExplorerQueue (Queue Challenge)
        System.out.println("\n==== The Queue of Explorers ====");
        ExprorerQueue explorerQueue = new ExprorerQueue(3);
        explorerQueue.enqueue("Explorer A");
        explorerQueue.enqueue("Explorer B");
        explorerQueue.enqueue("Explorer C");
        System.out.println(explorerQueue.nextExplorer());
        System.out.println(explorerQueue.dequeue());
        System.out.println(explorerQueue.nextExplorer());
        explorerQueue.enqueue("Explorer D");
        System.out.println("Queue is full? " + explorerQueue.isFull());

        // Test for ClueTree (Binary Tree Challenge)
        System.out.println("\n==== The Binary Tree of Clues ====");
        ClueTree clueTree = new ClueTree();
        clueTree.insertClue("Clue 5");
        clueTree.insertClue("Clue 3");
        clueTree.insertClue("Clue 7");
        clueTree.insertClue("Clue 1");
        clueTree.insertClue("Clue 4");

        System.out.println("In-Order Traversal:");
        clueTree.inOrderTraversal();
        System.out.println("\nPre-Order Traversal:");
        clueTree.preOrderTraversal();
        System.out.println("\nPost-Order Traversal:");
        clueTree.postOrderTraversal();

        System.out.println("\nFind Clue 'Clue 4': " + clueTree.findClue("Clue 4"));
        System.out.println("Total Clues: " + clueTree.countClues());
    }
}
