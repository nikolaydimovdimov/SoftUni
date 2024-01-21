package implementations;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class TreeFactory {
    private Map<Integer, Tree<Integer>> nodesByKeys;

    public TreeFactory() {
        this.nodesByKeys = new LinkedHashMap<>();
    }

    public Tree<Integer> createTreeFromStrings(String[] input) {

        for (String nodeString : input) {
            int[] nodeInteger= Arrays.stream(nodeString.split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            int parentKey=nodeInteger[0];
            int childKey=nodeInteger[1];

            this.addEdge(parentKey,childKey);

        }
        return getRoot();
    }

    private Tree<Integer> getRoot() {
        Tree<Integer> root=null;
        for (Map.Entry<Integer, Tree<Integer>> node : nodesByKeys.entrySet()) {
            if (node.getValue().getParent()==null){
                root=  node.getValue();
                break;
            }
        }
        return root;
    }

    public Tree<Integer> createNodeByKey(int key) {
        this.nodesByKeys.putIfAbsent(key,new Tree<Integer>(key));
        return this.nodesByKeys.get(key);
    }

    public void addEdge(int parent, int child) {
        Tree<Integer> parentNode=this.createNodeByKey(parent);
        Tree<Integer> childNode=this.createNodeByKey(child);

        parentNode.addChild(childNode);
        childNode.setParent(parentNode);
    }
}



