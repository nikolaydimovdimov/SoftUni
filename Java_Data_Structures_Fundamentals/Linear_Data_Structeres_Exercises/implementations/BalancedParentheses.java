package implementations;

import interfaces.Solvable;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BalancedParentheses implements Solvable {
    private String parentheses;

    private static class Stack<E> {

        private Node<E> top;
        private int size;

        public Stack() {
            this.top = null;
            this.size = 0;
        }


        private static class Node<E> {
            private E value;
            private Node<E> next;

            private Node(E element) {
                this.value = element;
                this.next = null;
            }
        }

        private void push(E element) {
            Node<E> newElement = new Node<>(element);
            if (this.size == 0) {
                this.top = newElement;
            } else {
                newElement.next = this.top;
                this.top = newElement;
            }
            this.size++;
        }

        private E pop() {
            Node<E> tmpElement = this.top;
            this.top = tmpElement.next;
            this.size--;
            return tmpElement.value;
        }

        private E peek() {
            return this.top.value;
        }

        private boolean isEmpty() {
            return this.size == 0;
        }

    }


    public BalancedParentheses(String parentheses) {
        this.parentheses = parentheses;
    }


    @Override
    public Boolean solve() {
        Queue<String> parenthesesQueue = new Queue<String>();
        Arrays.stream(this.parentheses.split("")).forEach(parenthesesQueue::offer);
        String leftParentheses = "{[( ";
        String rightParentheses = "}]) ";
        Stack<String> expressionStack = new Stack<>();
        Boolean startExpression=false;
        while (!parenthesesQueue.isEmpty()) {
            String next = parenthesesQueue.poll();
            if (leftParentheses.contains(next)) {
                startExpression=true;

                expressionStack.push(next);
            }
            if (rightParentheses.contains(next)) {
                String leftPar="";
                switch (next) {
                    case ")":
                        leftPar = "(";
                        break;
                    case "]":
                        leftPar = "[";
                        break;
                    case "}":
                        leftPar = "{";
                        break;
                }
                if (!expressionStack.isEmpty() &&
                        leftPar.equals(expressionStack.peek())) {
                    expressionStack.pop();
                } else {
                    break;
                }
            }
        }
        return parenthesesQueue.isEmpty() && expressionStack.isEmpty()&&startExpression;

    }

}
