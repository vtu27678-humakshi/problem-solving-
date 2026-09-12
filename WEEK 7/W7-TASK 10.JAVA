import java.util.*;

class ThroneInheritance {

    class Person {
        String name;
        List<Person> children = new ArrayList<>();
        boolean alive = true;

        Person(String name) {
            this.name = name;
        }
    }

    Person king;
    Map<String, Person> people = new HashMap<>();

    public ThroneInheritance(String kingName) {
        king = new Person(kingName);
        people.put(kingName, king);
    }

    public void birth(String parentName, String childName) {
        Person parent = people.get(parentName);
        Person child = new Person(childName);

        parent.children.add(child);
        people.put(childName, child);
    }

    public void death(String name) {
        people.get(name).alive = false;
    }

    public List<String> getInheritanceOrder() {
        List<String> result = new ArrayList<>();
        dfs(king, result);
        return result;
    }

    void dfs(Person person, List<String> result) {

        if (person.alive) {
            result.add(person.name);
        }

        for (Person child : person.children) {
            dfs(child, result);
        }
    }
}

INPUT
["ThroneInheritance", "birth", "birth", "getInheritanceOrder", "death", "getInheritanceOrder"]
[["king"], ["king","andy"], ["king","bob"], [], ["andy"], []]

OUTPUT
[null, null, null, ["king","andy","bob"], null, ["king","bob"]]