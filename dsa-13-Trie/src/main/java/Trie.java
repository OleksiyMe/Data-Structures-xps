import java.util.ArrayList;
import java.util.Map;

public class Trie {
   TrieNode root;

   // Construct an empty Trie Object
    public Trie() {
        root= new TrieNode();
    }

   // Insert a new word into trie
    public void insert(String word) {
        TrieNode curNode=root;
        char[] arr=word.toCharArray();
        for (char c : arr) {
            if(!curNode.children.containsKey(c)){
                curNode.children.put(c, new TrieNode());
            }
            curNode=curNode.children.get(c);// Move to next node
        }
        curNode.isWord=true;
    }


    public boolean search(String word) {
        TrieNode curNode=root;
        char[] arr=word.toCharArray();
        for (char c : arr) {
            if(!curNode.children.containsKey(c)) return false;

            curNode=curNode.children.get(c); // Move to next node
        }
        return curNode.isWord;
    }


    public boolean startsWith(String prefix) {
        TrieNode curNode=root;
        char[] arr=prefix.toCharArray();
        for (char c : arr) {
            if(!curNode.children.containsKey(c)) return false;

            curNode=curNode.children.get(c); // Move to next node/child
        }
        return true;
    }

    public int countUniqueWords(TrieNode current) {
        int count = 0;
        if (current == null) return 0;
        for (Map.Entry<Character, TrieNode> entry : current.children.entrySet()) {
            if (entry.getValue().isWord) count++;
            count += countUniqueWords(current.children.get(entry.getKey()));
        }
        return count;
    }

    public ArrayList<String> getAllWords() {
        ArrayList<String> result = new ArrayList<>();
        getAllWords(root, "", result);

        return result;
    }

    private void getAllWords(TrieNode currentNode, String prefix, ArrayList<String> result) {
        if (currentNode.isWord) result.add(prefix);

        for (Map.Entry<Character, TrieNode> eachEntry : currentNode.children.entrySet()) {
            char ch = eachEntry.getKey();
            TrieNode deeperNode = eachEntry.getValue();
            getAllWords(deeperNode, prefix + ch, result);
        }
    }

}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */


