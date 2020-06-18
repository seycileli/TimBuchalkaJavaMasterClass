Immutable Class,
Once an Instance is created, it cannot be changed.

A strategy for defining Immutable Objects.
1) Don't provide "setter" methods.
2) Make all fields `final` and `private`.
3) Don't allow subclasses to override methods. The simplest way to do this, is to declare the class
as `final`. A more sophisticated approach is to make the constructor private and construct instances
in factory methods.

src: https://docs.oracle.com/javase/tutorial/essential/concurrency/imstrat.html
