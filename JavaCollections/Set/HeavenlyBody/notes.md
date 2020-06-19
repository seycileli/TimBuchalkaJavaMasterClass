
Difference between HashSet and HashMap?

1) HashMap is an implementation of Map interface;
2) HashSet is an implementation of Set Interface;
3) HashMap stores data in form of key value pair;
4) HashSet stores only objects;

Put method is used to add an element in Map;

Add method is used to add an element is Set;

In HashMap<>(); hashCode value is calculated using key object.

Here member object is used for calculating hashcode value which can be same for two objects. 
So equal() method is used to check for equality: if it returns false, that means two objects are different.

src: https://javarevisited.blogspot.com/2011/09/difference-hashmap-vs-hashset-java.html

HashSet - equals() and hashCode();
If you're using your own objects, as either a key or value in a Map
or as an Element in the set (setters)

You should @Override the equals and hash code methods
if we don't, we will then get duplicate(s)

That's because the two (or multiple) objects don't compare
equal, therefore the Set is happy to accept.

Same thing will happen whether we use them as Key in a Map
or as an Element. This is why we need to use the @Override annotation,
equals(), or hashCode() methods.

If two Objects have the same equals(), then they must share the same hashCode();

equals();
Indicates whether some other object is "equal to" this one.
The equals' method implements an equivalence relation on non-null object references:

1) It is reflexive: for any non-null reference value x, x.equals(x) should return true.

2) It is symmetric: for any non-null reference values x and y, x.equals(y) 
should return true if and only if y.equals(x) returns true.

3) It is transitive: for any non-null reference values x, y, and z, if x.equals(y) 
returns true and y.equals(z) returns true, then x.equals(z) should return true.

4) It is consistent: for any non-null reference values x and y, 
multiple invocations of x.equals(y) consistently return true or consistently return false, 
provided no information used in equals comparisons on the objects is modified.
For any non-null reference value x, x.equals(null) should return false.

src: https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html
