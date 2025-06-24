package Test.infoedge;

import java.util.HashMap;
import java.util.Map;

/*
@Author :vishnu
@Date :2025-06-23 10:41

Problem Understanding:
Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.
An LRU cache is a data structure that stores a limited number of items and evicts the least recently used item when the cache reaches its limit. It supports two main operations:
1. get(key): Returns the value of the key if the key exists in the cache, otherwise returns -1.
2. put(key, value): If the key already exists, update the value. If the key does not exist, add the key-value pair to the cache. If the cache is at its limit, remove the least recently used item before adding the new key-value pair.
Example:
Input:
["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get"]
[2, 1, 2, 1, 3, 2, 4, 1, 3]
Output:
[null, null, null, 1, null, 2, null, -1, 3]

 */
public class LRUCache {
    public void main(String[] args) {
        LRUCacheImplementation lruCache = new LRUCacheImplementation(2);
        lruCache.put(1, 1); // cache is {1=1}
        lruCache.put(2, 2); // cache is {1=1, 2=2}
        System.out.println(lruCache.get(1)); // returns 1
        lruCache.put(3, 3); // evicts key 2, cache is {1=1, 3=3}
        System.out.println(lruCache.get(2)); // returns -1 (not found)
        lruCache.put(4, 4); // evicts key 1, cache is {3=3, 4=4}
        System.out.println(lruCache.get(1)); // returns -1 (not found)
        System.out.println(lruCache.get(3)); // returns 3
        System.out.println(lruCache.get(4)); // returns 4
    }
}

    class LRUCacheImplementation {

        class Node {
            int key, value;
            Node prev, next;

            Node(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        int capacity;
        Map<Integer, Node> map;
        Node head, tail;

        public LRUCacheImplementation(int capacity) {
            this.capacity = capacity;
            map = new HashMap<>();

            head = new Node(0, 0); // dummy head
            tail = new Node(0, 0); // dummy tail
            head.next = tail;
            tail.prev = head;
        }

        public int get(int key) {
            if (!map.containsKey(key)) return -1;

            Node node = map.get(key);
            remove(node);           // remove from current spot
            insertToHead(node);     // move to head (MRU)
            return node.value;
        }

        public void put(int key, int value) {
            if (map.containsKey(key)) {
                remove(map.get(key)); // remove old
            }

            if (map.size() == capacity) {
                remove(tail.prev); // LRU = node before tail
            }

            Node node = new Node(key, value);
            insertToHead(node);
        }

        private void remove(Node node) {
            map.remove(node.key);

            node.prev.next = node.next;
            node.next.prev = node.prev;
        }

        private void insertToHead(Node node) {
            map.put(node.key, node);

            node.next = head.next;
            node.prev = head;

            head.next.prev = node;
            head.next = node;
        }
    }

