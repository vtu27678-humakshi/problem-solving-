CODE
class MyHashSet {

    boolean[] set = new boolean[1000001];

    public MyHashSet() {
    }

    public void add(int key) {
        set[key] = true;
    }

    public void remove(int key) {
        set[key] = false;
    }

    public boolean contains(int key) {
        return set[key];
    }
}

### How it works

We create:


boolean[] set = new boolean[1000001];

Every index represents a key.

Initially:

set[5] = false

So 5 is not present.

If we do:

add(5);

then:

set[5] = true

So:

contains(5)

returns:

true

If we do:

remove(5);

then:

set[5] = false

Therefore:

contains(5)

returns:

false


INPUT
["MyHashSet", "add", "add", "contains", "contains", "remove", "contains"]

Arguments:
[[], [1], [2], [1], [3], [2], [2]]

OUTPUT

[null, null, null, true, false, null, false]
Complexity
add()      → O(1)
remove()   → O(1)
contains() → O(1)

Space → O(1)  (fixed-size array)