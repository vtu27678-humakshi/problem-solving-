import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String hashtag = sc.next();

            map.put(hashtag, map.getOrDefault(hashtag, 0) + 1);
        }

        for (String hashtag : map.keySet()) {
            System.out.println(hashtag + " " + map.get(hashtag));
        }

        sc.close();
    }
}

INPUT
8
#java
#coding
#java
#python
#coding
#java
#programming
#python

OUTPUT
#java 3
#coding 2
#python 2
#programming 1

CONCEPT
Read hashtag
     ↓
Already present?
  ↙       ↘
YES       NO
 ↓         ↓
+1        1
     ↓
 HashMap
