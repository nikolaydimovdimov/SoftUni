package implementations;

import interfaces.AbstractTree;

import java.util.*;

public class Tree<E> implements AbstractTree<E> {

    private E key;
    private Tree<E> parent;
    private List<Tree<E>> children;


    public Tree(Object key) {
        this.key = (E) key;
        this.setParent(null);
        this.children = new ArrayList<>();
    }

    @Override
    public void setParent(Tree<E> parent) {
        this.parent = parent;
    }

    @Override
    public void addChild(Tree<E> child) {
        this.children.add(child);
    }

    @Override
    public Tree<E> getParent() {
        return this.parent;
    }

    @Override
    public E getKey() {
        return this.key;
    }

    @Override
    public String getAsString() {
        StringBuilder treeString = new StringBuilder();

        traverseTreeRec(treeString, 0, this);

        return treeString.toString().trim();
    }

    private void traverseTreeRec(StringBuilder treeString, int spaces, Tree<E> eTree) {

        treeString.append(makeSpaces(spaces));
        treeString.append(eTree.getKey());
        treeString.append(System.lineSeparator());
        spaces += 2;
        for (Tree<E> child : eTree.children) {
            traverseTreeRec(treeString, spaces, child);
        }
    }

    private StringBuilder makeSpaces(int spaces) {
        StringBuilder spacesString = new StringBuilder();
        for (int i = 0; i < spaces; i++) {
            spacesString.append(" ");
        }
        return spacesString;
    }

    @Override
    public List<E> getLeafKeys() {
        List<E> leafs = new ArrayList<>();
        getLeafsRec(leafs, this);
        return leafs;
    }

    private void getLeafsRec(List<E> leafs, Tree<E> eTree) {
        if (eTree.children.isEmpty()) {
            leafs.add(eTree.getKey());
        }
        for (Tree<E> child : eTree.children) {
            getLeafsRec(leafs, child);
        }
    }

    @Override
    public List<E> getMiddleKeys() {
        List<E> middleKeys = new ArrayList<>();
        getMiddleKeysRec(middleKeys, this);
        return middleKeys;
    }

    private void getMiddleKeysRec(List<E> middleKeys, Tree<E> eTree) {
        if (!eTree.children.isEmpty() && eTree.getParent() != null) {
            middleKeys.add(eTree.getKey());
        }
        for (Tree<E> child : eTree.children) {
            getMiddleKeysRec(middleKeys, child);
        }
    }


    @Override
    public Tree<E> getDeepestLeftmostNode() {
        int level = 0;

        Map<Tree<E>, Integer> leafNodes = new LinkedHashMap<>();

        getMapOfAllLeafsAndDeeps(leafNodes, level, this);

        return getDeepestNodeFromMap(leafNodes);
    }

    private  Tree<E> getDeepestNodeFromMap(Map<Tree<E>, Integer> leafNodes) {
        Tree<E> deepestNode = null;
        int maxLevel = 0;
        for (Map.Entry<Tree<E>, Integer> nd : leafNodes.entrySet()) {
            if (nd.getValue() > maxLevel) {
                maxLevel = nd.getValue();
                deepestNode = nd.getKey();
            }
        }
        return deepestNode;
    }

    private void getMapOfAllLeafsAndDeeps(Map<Tree<E>, Integer> deepestNodes, int level, Tree<E> eTree) {

        if (eTree.children.isEmpty()) {
            deepestNodes.put(eTree, level);
        }
        level++;
        for (Tree<E> child : eTree.children) {
            getMapOfAllLeafsAndDeeps(deepestNodes, level, child);
        }
    }

    @Override
    public List<E> getLongestPath() {
        List<E> keysOfPath = new ArrayList<>();
        List<E> keysOfMaxPath = new ArrayList<>();

        getPathRec(keysOfPath, keysOfMaxPath, this);

        return keysOfMaxPath;
    }


    private void getPathRec(List<E> keys, List<E> maxPath, Tree<E> eTree) {

        keys.add(eTree.getKey());

        for (Tree<E> child : eTree.children) {
            getPathRec(keys, maxPath, child);
        }

        if (keys.size() > maxPath.size()) {
            maxPath.clear();
            keys.forEach(maxPath::add);
        }
        keys.remove(eTree.getKey());
    }

    @Override
    public List<List<E>> pathsWithGivenSum(int sum) {
        List<E> keysOfPath = new ArrayList<>();
        List<List<E>> allPaths = new ArrayList<>();
        getAllPathsWithGivenSumOfKeysRec(keysOfPath, allPaths, sum, this);
        return allPaths;
    }

    private void getAllPathsWithGivenSumOfKeysRec(List<E> currentPathKeys, List<List<E>> allPaths, int sum, Tree<E> eTree) {
        currentPathKeys.add(eTree.getKey());

        for (Tree<E> child : eTree.children) {
            getAllPathsWithGivenSumOfKeysRec(currentPathKeys, allPaths, sum, child);
        }

        if (currentPathKeys.stream().mapToInt(e -> (int) e).sum() == sum) {
            addCurrentPathToList(currentPathKeys, allPaths);
        }
        currentPathKeys.remove(eTree.getKey());
    }

    private  void addCurrentPathToList(List<E> currentPath, List<List<E>> allPaths) {
        List<E> newPath = new ArrayList<>();
        currentPath.forEach(newPath::add);
        allPaths.add(newPath);
    }

    @Override
    public List<Tree<E>> subTreesWithGivenSum(int sum) {
        List<Tree<E>> subTreesList = new ArrayList<>();
        List<E> currentTreeKeys = new ArrayList<>();
        traverseTreeRec(currentTreeKeys, subTreesList, sum, this);
        return subTreesList;
    }

    private void traverseTreeRec(List<E> currentTreeKeys, List<Tree<E>> subTreesList, int sum, Tree<E> eTree) {
        getSubTreesListOfKeysRec(currentTreeKeys, subTreesList, sum, eTree);
        if (currentTreeKeys.stream().mapToInt(key -> (int) key).sum() == sum) {
            addCurrentTreeToList(subTreesList, eTree);
        }
        currentTreeKeys.clear();
        for (Tree<E> child : eTree.children) {
            traverseTreeRec(currentTreeKeys, subTreesList, sum, child);
        }
    }

    private void addCurrentTreeToList(List<Tree<E>> subTreesList, Tree<E> eTree) {
        Tree<E> newTree = new Tree<>(eTree.getKey());
        for (Tree<E> child : eTree.children) {
            newTree.addChild(child);
        }
        subTreesList.add(newTree);
    }

    private void getSubTreesListOfKeysRec(List<E> currentTreeKeys, List<Tree<E>> subTreesList, int sum, Tree<E> eTree) {
        currentTreeKeys.add(eTree.getKey());

        for (Tree<E> child : eTree.children) {
            getSubTreesListOfKeysRec(currentTreeKeys, subTreesList, sum, child);
        }
    }
}



