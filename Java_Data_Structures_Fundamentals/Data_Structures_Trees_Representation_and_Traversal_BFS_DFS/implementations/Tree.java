package implementations;

import interfaces.AbstractTree;

import java.security.Key;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Tree<E> implements AbstractTree<E> {
    private E value;
    private Tree<E> parent;
    private List<Tree<E>> children;


    public Tree(E value, Tree<E>... children) {
        this.value = value;
        this.parent = null;
        this.children = new ArrayList<>();
        for (Tree<E> child : children) {
            this.children.add(child);
            child.parent = this;
        }
    }

    @Override
    public List<E> orderBfs() {
        List<E> resultOfTraversing = new ArrayList<>();
        if (this.value == null) return resultOfTraversing;
        ArrayDeque<Tree<E>> childrenQueue = new ArrayDeque<>();
        childrenQueue.offer(this);

        while (!childrenQueue.isEmpty()) {
            Tree<E> currentTree = childrenQueue.poll();
            for (Tree<E> child : currentTree.children) {
                childrenQueue.offer(child);
            }
            resultOfTraversing.add(currentTree.value);
        }
        return resultOfTraversing;
    }

    @Override
    public List<E> orderDfs() {
        List<E> resultOfTraversing = new ArrayList<>();
        if (this.value == null) return resultOfTraversing;
        doDfs(this, resultOfTraversing);
        return resultOfTraversing;
    }

    private void doDfs(Tree<E> tree, List<E> result) {
        for (Tree<E> child : tree.children) {
            child.doDfs(child, result);
        }
        result.add(tree.value);
    }

    @Override
    public void addChild(E parentKey, Tree<E> child) {
        Tree<E> foundNode = this.findNodeBfs(parentKey);
        if (foundNode == null) {
            throw new IllegalArgumentException("KEY not found");
        }
        foundNode.children.add(child);
        child.parent = foundNode;
    }

    private Tree<E> findNodeBfs(E key) {
        ArrayDeque<Tree<E>> childrenQueue = new ArrayDeque<>();
        childrenQueue.offer(this);
        Tree<E> currentTree = null;

        while (!childrenQueue.isEmpty()) {
            currentTree = childrenQueue.poll();
            if (currentTree.value.equals(key)) {
                break;
            }
            for (Tree<E> child : currentTree.children) {
                childrenQueue.offer(child);
            }
        }
        return (Tree<E>) currentTree;
    }

    @Override
    public void removeNode(E nodeKey) {
        Tree<E> foundNode = findNodeBfs(nodeKey);
        if (foundNode == null) {
            throw new IllegalArgumentException("KEY not found");
        }

        for (Tree<E> child : foundNode.children) {
            child.parent = null;
        }
        foundNode.children.clear();
        if (foundNode.parent != null) {
            foundNode.parent.children.remove(foundNode);
            foundNode.parent = null;
        } else {
            foundNode.value = null;

        }
    }




    @Override
    public void swap(E firstKey, E secondKey) {

        Tree<E> firstNode = findNodeBfs(firstKey);
        Tree<E> secondNode = findNodeBfs(secondKey);
        if(firstNode==null||secondNode==null) {
            throw new IllegalArgumentException("KEY not found");
        }

        Tree<E> firstParent=firstNode.parent;
        if(firstParent==null){
            this.value=secondNode.value;
            this.children=secondNode.children;
            this.children.forEach(child->child.parent=firstNode);
            return;
        }

        Tree<E> secondParent=secondNode.parent;
        if(secondParent==null){
            this.value=firstNode.value;
            this.children=firstNode.children;
            this.children.forEach(child->child.parent=secondNode);
            return;
        }

        int firstIndex=firstParent.children.indexOf(firstNode);
        int secondIndex=secondParent.children.indexOf(secondNode);
        firstParent.children.set(firstIndex,secondNode);
        secondParent.children.set(secondIndex,firstNode);

        secondNode.parent=firstParent;
        firstNode.parent=secondParent;

    }
}



